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

    public Mahasiswa(String nama, String gender) {
        super(nama, gender);
    }
     
    public void setNim(String nim){
        this.nim=nim;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void createTA(String judul){
        tugasAkhir = new TugasAkhir(judul);
    }

    public TugasAkhir getTugasAkhir() {
        return tugasAkhir;
    }
}
