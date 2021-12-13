/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author maron
 */
public class App {

    private  String USERNAME = "root";
    private  String IP = "localhost";
    private  String PASSWORD = "Password88";
    private  String dbNameArg = "lab6_marcilino";
    private  Connection con = null;
    private  String TABLE_NAME = "president";

    public void run() {
        createDatabase();
    }

    private void createDatabase() {
        try {
            // get connection.  This connection may or may not be connected to a database
            // Depends on if one exists or not
            // If it doesn't exist we get a connection with which we can create a database.
            try {
                con = getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(lab6.q1.Main.class.getName()).log(Level.SEVERE, null, ex);
                System.exit(0);
            }

            // create the database if it doesn't exist
            Statement s = con.createStatement();
            String newDatabaseString = "CREATE DATABASE IF NOT EXISTS " + dbNameArg;
            // String newDatabaseString = "CREATE DATABASE " + dbName;
            try {
                s.executeUpdate(newDatabaseString);
                s.executeUpdate("use " + dbNameArg);
            } catch (Exception e) {
                System.out.println("Error Creating database " + e.getMessage());
                System.exit(0);
            }
            System.out.println("Created database " + dbNameArg);
            
            

            dropTable();

            createTable();
//
//            populateTable();
//
//            viewTable();
        } catch (SQLException ex) {
            Logger.getLogger(lab6.lab5.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void dropTable() throws SQLException {
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            System.out.println("Dropping table " + TABLE_NAME + " from " + dbNameArg);
            stmt.executeUpdate("DROP TABLE IF EXISTS " + TABLE_NAME);
        } finally {
            stmt.close();
        }

    }
    public void createTable() throws SQLException {
        String createString
                = "CREATE TABLE IF NOT EXISTS `"+dbNameArg+"`.`"+TABLE_NAME+"` ("
                + "`id` INT NOT NULL,"
                + "`name` VARCHAR(45) NULL,"
                + "`birthday` VARCHAR(45) NULL,"
                + "`genre` VARCHAR(45) NULL,"
                + "`email` VARCHAR(45) NULL,"
                + "PRIMARY KEY (`id`))";
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
        } finally {
            stmt.close();
        }
    }


    public  Connection getConnection() throws SQLException {
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", USERNAME);
        connectionProps.put("password", PASSWORD);

        try {
            conn = DriverManager.getConnection(""
                    + "jdbc:mysql://"
                    + // protocol for mysql
                    "" + IP
                    + // ip of database server
                    ":3306"
                    + // mysql port number
                    "/" + dbNameArg
                    + "", connectionProps);
        } catch (SQLException e) {
            if (e.getMessage().contains("Unknown database")) {
                conn = DriverManager.getConnection(""
                        + "jdbc:mysql://"
                        + // protocol for mysql
                        "" + IP
                        + // ip of database server
                        ":3306"
                        + // mysql port number
                        //                        "/" + dbNameArg +// we could specify an  existing database here but we dont need to because our app creates a database
                        "", connectionProps);
            } else {
                System.out.println("ERROR-------------------------------------------------");
                System.out.println(e.getMessage());
                System.out.println("------------------------------------------------------");
                System.exit(0);
            }
        }
        System.out.println("Connected to database");
        return conn;
    }

}

