/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author alvinmatias69
 */
public class Orang {
    private String nama;
    private String alamat;
    private String ttl;
    private String gender;

    public Orang(String nama, String gender) {
        this.nama = nama;
        this.gender = gender;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public String getGender() {
        return gender;
    }
    
    
}
