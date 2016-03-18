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
    private String nomor;

    public KelompokTA(String topik, String nomor) {
        this.nomor = nomor;
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
        while((anggota[i] != null) && (anggota[i].getNim() != m.getNim())){
            i++;
        }   
        if(anggota[i] != null){
            anggota[i] = null;
        }
    }
    
    public Mahasiswa getAnggota(String nim){
        int i = 0;
        while((anggota[i] != null) && (anggota[i].getNim() != nim)){
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
    
    public String getTopik(){
        return this.topik;
    }
    
    public String getNomor(){
        return this.nomor;
    }
}
