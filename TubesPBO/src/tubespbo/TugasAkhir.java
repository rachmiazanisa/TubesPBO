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
public class TugasAkhir {
    private Dosen pembimbing[]=new Dosen[2];
    private String judulTA;
    
    public void setPembimbing(Dosen d, int i){
        if (i==1){
            pembimbing[0]=d;
        }else if(i==2){
            pembimbing[1]=d;
        }
    }
    
    public void revisiTA(String judul){
        this.judulTA=judul;
    }
    
    public Dosen getPembimbing(int index){
        return pembimbing[index];
    }
    
    public Dosen getPembimbing(String kodeDosen){
        if(pembimbing[0].kodeDosen==kodeDosen){
            return pembimbing[0];
        }else if(pembimbing[1].kodeDosen==kodeDosen){
            return pembimbing[0];
        }else{
            return null;
        }
    }
}
