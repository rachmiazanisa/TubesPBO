/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import tubespbo.Dosen;

/**
 *
 * @author alvinmatias69
 */
public class Database {
    private String server = "jdbc:mysql://localhost:3306/pbo", dbuser="root", dbpass="";
    private Statement stmt;
    private Connection conn;
    
    public void connect(){
        try{
            conn = DriverManager.getConnection(server, dbuser, dbpass);
            stmt = conn.createStatement();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public boolean loginDosen(String NIP, String password) throws SQLException{
        String query = "select * from Dosen where NIP = '" + NIP + "' and password = '" + password + "';";
        ResultSet rs = stmt.executeQuery(query);
        if(! rs.next()){
            return false;
        } else{
            return true;
        }
    }
    
    public boolean loginMahasiswa(String NIM, String password) throws SQLException{
        String query = "select * from Dosen where NIM = '" + NIM + "' and password = '" + password + "';";
        ResultSet rs = stmt.executeQuery(query);
        if(! rs.next()){
            return false;
        } else{
            return true;
        }
    }
    
    public void insertDosen(Dosen d) throws SQLException{
        String query = "insert into Dosen(nama, kodeDosen, Alamat, ttl, gender, status) values ('" + d.getNama() + "', '" + d.getkodeDosen() + "', '" + d.getAlamat() + "', '" + d.getTtl() + "'. '" + d.getGender() + "', '" + d.getStatusPembimbing() + "');";
        stmt.executeQuery(query);
    }
}
