/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Dian Dwi Arini
 */
public class Dosen extends Orang{
    private KelompokTA[] topikTA;
    private int statusPembimbing;
    private String kodeDosen;
    private int jumlahKelompok;

    public int getStatusPembimbing() {
        return statusPembimbing;
    }
    
    public Dosen(int statusPembimbing, String kodeDosen, String nama, String gender){
        super(nama, gender);
        topikTA = new KelompokTA[3];
        this.statusPembimbing=statusPembimbing;
        this.kodeDosen=kodeDosen;
    }
    public void setkodeDosen(String kodeDosen){
        this.kodeDosen=kodeDosen;
    }
    
    public String getkodeDosen(){
        return kodeDosen;
    }
    
    public void CreateKelompokTA(String topik, String nomor){
        topikTA[jumlahKelompok]=new KelompokTA(topik,nomor);
        
    }
    
    public KelompokTA getKelompok(int index){
        int i=0;
        while((topikTA[i]!=null)&&(i!=index)){
                i++;
        }
        if(topikTA[i]!=null){
            return topikTA[i];
        } else {
            return null;
        }
    }
    
    public KelompokTA getKelompokbynum(String nomor){
        int i=0;
        while((topikTA[i]!=null) && (topikTA[i].getNomor() != nomor) ){
                i++;
        }
        if(topikTA[i]!=null){
            return topikTA[i];
        } else {
            return null;
        }
    }
    
    public KelompokTA getKelompok(String topik){
        int i=0;
        while((topikTA[i]!= null)&&(topikTA[i].getTopik()!=topik)){
              i++;
        }
        if (topikTA[i]!= null){
            return topikTA[i];
        }
        else {
            return null;
        }
        
    }
    
    public void deleteKelompok(KelompokTA k){
        int i=0;
        while((topikTA[i]!=null)&&(topikTA[i].getNomor()!=k.getNomor())){
            i++;
        }
        if(topikTA[i]!=null){
            topikTA[i]=null;
        }
    }
}
