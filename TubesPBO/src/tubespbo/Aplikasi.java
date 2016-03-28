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
public class Aplikasi {
    private Orang daftarOrang[];
    private int jumlah;

    public Aplikasi(int maksimal) {
        daftarOrang = new Orang[maksimal];
        jumlah = 0;
    }
    
    public void addDosen(Dosen d){
        daftarOrang[jumlah] = d;
        jumlah++;
    }
    
    public void addMahasiswa(Mahasiswa m){
        daftarOrang[jumlah] = m;
        jumlah++;
    }
}
