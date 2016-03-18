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
public class KelompokTA {
    private String topik;
    private Mahasiswa[] anggota;
    private int jumlahAnggota;

    public KelompokTA(String topik) {
        this.topik = topik; 
        anggota = new Mahasiswa[3];
        jumlahAnggota = 0;
    }
    
    public void addAnggota(Mahasiswa m){
        if(jumlahAnggota < 3){
            anggota[jumlahAnggota] = m;
            jumlahAnggota++;
        }
    }
    
    public void removeAnggota(Mahasiswa m){
        int i = 0;
        while((anggota[i] != null) && (anggota[i].getNIM() == m.getNIM())){
            i++;
        }
        if(anggota[i] != null){
            anggota[i] = null;
        }
    }
    
    public Mahasiswa getAnggota(String NIM){
        int i = 0;
        while((anggota[i] != null) && (anggota[i].getNIM() == NIM)){
            i++;
        }
        if(anggota[i] != null){
            return anggota[i];
        } else {
            return null;
        }
    }
    
    public Mahasiswa getAnggota(int index){
        return anggota[index];
    }
}