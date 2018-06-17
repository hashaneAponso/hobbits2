/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import DatabaseClass.DBConnection;
import static Player.Login.playerName;
import static Player.Login.userId;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hashane
 */
public class CreateGame {

    public static String DBname;

    public String create(String noOfPlayers) {
        int val = 0;
        String result = "false";
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            Date date = new Date();
            String daten = (dateFormat.format(date));
            DBname = noOfPlayers.trim() + "player-" + daten;
            System.out.println(DBname);
            DBConnection db = new DBConnection();
            //Statement statement = null;
            String query = "CREATE TABLE `" + DBname + "` ("
                    + "`playerId` INT(10) NOT NULL,"
                    + "`1stRound` INT(10) NOT NULL, "
                    + "`2ndRound` INT(10) NOT NULL, "
                    + "`3rdRound` INT(10) NOT NULL, "
                    + "`4thRound` INT(10) NOT NULL, "
                    + "`5thRound` INT(10) NOT NULL,"
                    + " PRIMARY KEY (`playerId`),"
                    + " KEY `" + DBname + "` (`playerId`))"
                    + " ENGINE=INNODB DEFAULT CHARSET=latin1";
            PreparedStatement statement = db.InsertUpdate(query);
           // val = statement.executeUpdate();
            statement = null;
            if (val > 0) {
                result = DBname;
                query = "INSERT INTO `logtable` (`tempTable`,`gameStatus`,`noOfPlayersConnecting`,`createTime`)"
                        + "VALUES ('" + DBname + "','waiting',1,"+date+");";
                statement = db.InsertUpdate(query);
                val = statement.executeUpdate();
            }

        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public String avaliableGame() {
        String value = "false";
        try {

            DBConnection db = new DBConnection();
            ResultSet rst = (ResultSet) db.fetch("SELECT * FROM LogTable WHERE  gameStatus ='waiting' AND noOfPlayersConnecting < '4'");
            while (rst.next()) {
                value = rst.getString("tempTable");

            }
            rst.close();
            rst = null;
        } catch (Exception ex) {

            Logger.getLogger(CreateGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

    public int connecting(String dbName, int playerid) {
        String value = "false";
        int id = 0;
        int val = 0;
        int connecting = 0;
        try {

            DBConnection db = new DBConnection();
            ResultSet rst = (ResultSet) db.fetch("SELECT * FROM LogTable WHERE  gameStatus ='waiting' AND noOfPlayersConnecting < '4'");
            while (rst.next()) {
                value = rst.getString("tempTable");
                id = rst.getInt("gameId");
            }
            rst.close();
            rst = null;
            if (dbName.equals(value)) {
                String query = "INSERT INTO `" + dbName.trim() + "` "
                        + "(`playerId`,`1stRound`,`2ndRound`,`3rdRound`,`4thRound`,`5thRound`)"
                        + "values (" + playerid + ",0,0,0,0,0);";
                PreparedStatement statement = db.InsertUpdate(query);
                val = statement.executeUpdate();
                statement = null;
            }

            if (val > 0) {
                String query = "UPDATE  `logtable` SET noOfPlayersConnecting = noOfPlayersConnecting+1 where gameId='" + id + "'";
                PreparedStatement statement = db.InsertUpdate(query);
                statement.executeUpdate();
                val = id;
                statement = null;
            }
        } catch (Exception ex) {

            Logger.getLogger(CreateGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
    }

    public boolean startGame(int id) {
        boolean result = false;
        try {
            DBConnection db = new DBConnection();
            String query = "UPDATE  `logtable` SET gameStatus = 'playing'"
                    + " where gameId='" + id + "'";
            PreparedStatement statement = db.InsertUpdate(query);
            statement.executeUpdate();
            result = true;
        } catch (Exception ex) {
            Logger.getLogger(CreateGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

}
