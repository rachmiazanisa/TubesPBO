package tubespbo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rachmi
 */
public class Mahasiswa extends Orang{
    private TugasAkhir tugasAkhir;
    private String statusMahasiswa;
    private String nim;
    private String password;

    public Mahasiswa(String nama, String gender) {
        super(nama, gender);
    }
     
    public void setNim(String nim){
        this.nim=nim;
    }
    
    public String getNim(){
        return nim;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void createTA(String judul){
        tugasAkhir = new TugasAkhir(judul);
    }

    public TugasAkhir getTugasAkhir() {
        return tugasAkhir;
    }

    public void setStatusMahasiswa(String statusMahasiswa) {
        this.statusMahasiswa = statusMahasiswa;
    }

    public String getStatusMahasiswa() {
        return statusMahasiswa;
    }
}
