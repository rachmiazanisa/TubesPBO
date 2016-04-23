/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import tubespbo.Dosen;
import tubespbo.KelompokTA;
import tubespbo.Mahasiswa;
import tubespbo.TugasAkhir;

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
    
    public boolean insertDosen(Dosen d){
        String query = "insert into Dosen(nama, kodeDosen, alamat, ttl, gender, password) values ('" + d.getNama() + "', '" + d.getkodeDosen() + "', '" + d.getAlamat() + "', '" + d.getTtl() + "'. '" + d.getGender() + "', '" + d.getPassword() + "');";
        try{
            stmt.executeQuery(query);
            return true;
        } catch (SQLException e){
            return false;
        }
    }
    
    public boolean insertMahasiswa(Mahasiswa m){
        String query = "insert into Mahasiswa(nim, statusMahasiswa, password, nama, alamat, ttl, gender) values ('" + m.getNim() + "', '" + m.getStatusMahasiswa() + "', " + m.getPassword() + "', '" + m.getNama() + "', '" + m.getAlamat() + "', '" + m.getTtl() + "', '" + m.getGender() + "');";
        try{
            stmt.executeQuery(query);
            return true;
        } catch (SQLException e){
            return false;
        }
    }
    
    public boolean insertKelompokTA(KelompokTA kel, String kodeDosen){
        String query = "insert into KelompokTA(nomorKelompok, topik, kodeDosen) values ('" + kel.getNomor() + "', '" + kel.getTopik() + "', '" + kodeDosen + "');";
        try{
            stmt.executeQuery(query);
            return true;
        } catch (SQLException e){
            return false;
        }
    }
    
    public boolean insertTugasAkhir(TugasAkhir ta, String nim){
        String query = "insert into TugasAkhir(judulTA, nim) values ('" + ta.getJudulTA() + "', '" + nim + "');";
        try{
            stmt.executeQuery(query);
            return true;
        } catch (SQLException e){
            return false;
        }
    }
    
    public void editAnggota(String nim, String nomor) throws SQLException{
        String query = "update mahasiswa set nomorKelompok = '" + nomor + "' where nim = '" + nim + "';";
        stmt.executeQuery(query);
    }
    
    public void editTugasAkhir(String judulTA, String nim) throws SQLException{
        String query = "update TugasAkhir set judulTA = '" + judulTA + "' where nim = " + nim + "';";
        stmt.executeQuery(query);
    }
    
    public void assignPembimbing(String judulTA, String kodePembimbing, String tipe) throws SQLException{
        String query = "update TugasAkhir set kodePembimbing" + tipe + " = '" + kodePembimbing + "' where judulTA = '" + judulTA + "';";
        stmt.executeQuery(query);
    }
    
    public Mahasiswa cariMahasiswa(String NIM) throws SQLException{
        String query = "select * from Mahasiswa where nim = '" + NIM + "';";
        ResultSet rs = stmt.executeQuery(query);
        if(! rs.next()){
            return null;
        } else{
            Mahasiswa m = new Mahasiswa(rs.getString("NAMA"), rs.getString("GENDER"));
            m.setAlamat(rs.getString("ALAMAT"));
            m.setNim(rs.getString("NIM"));
            m.setStatusMahasiswa(rs.getString("STATUSMAHASISWA"));
            m.setPassword(rs.getString("PASSWORD"));
            m.setTtl(rs.getString("TTL"));
            return m;
        }
    }
    
    public boolean selectMahasiswa(String NIM) throws SQLException{
        String query = "select * from Mahasiswa where nim = '" + NIM + "';";
        ResultSet rs = stmt.executeQuery(query);
        if(! rs.next()){
            return false;
        } else{
            return true;
        }
    }
}
