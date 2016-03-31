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
import java.util.*;
public class Aplikasi {
    //private Orang daftarOrang[];
    List Orang = new ArrayList();
    Scanner scan = new Scanner(System.in);
    //private int jumlah;

    public Aplikasi() {
    }
    
    public void addDosen(Dosen d){
        //daftarOrang[jumlah] = d;
        Orang.add(d);
//        jumlah++;
    }
    
    public void addMahasiswa(Mahasiswa m){
        //daftarOrang[jumlah] = m;
        Orang.add(m);
//        jumlah++;
    }
    
    public Mahasiswa getMahasiswa(String nim){
        int i = 0;
        boolean found = false;
        while ( (i < Orang.size()) && (! found) ){
            if( (Orang.get(i) instanceof Mahasiswa) && (((Mahasiswa)Orang.get(i)).getNim() == nim) ){
               found = true;
            } else {
                i++;
            }
        }
        if(found){
            return (Mahasiswa)Orang.get(i);
        } else{
            return null;
        }
    }
    
    public Dosen getDosen(String kodeDosen){
        int i = 0;
        boolean found = false;
        while ( (i < Orang.size()) && (! found)){
            if( (Orang.get(i) instanceof Dosen) && (((Dosen)Orang.get(i)).getkodeDosen() == kodeDosen) ){
               found = true;
            } else {
                i++;
            }
        }
        if (found){
            return (Dosen)Orang.get(i);
        } else{
            return null;
        }
    }
    
    public void deleteMahasiswa(String nim){
        int i = 0;
        boolean found = false;
        while ( (i < Orang.size()) && (! found) ){
            if( (Orang.get(i) instanceof Mahasiswa) && (((Mahasiswa)Orang.get(i)).getNim() == nim) ){
               found = true;
            } else {
                i++;
            }
        }
        if(found){
            Orang.remove(i);
        } 
    }
    
    public void deleteDosen(String kodeDosen){
        int i = 0;
        boolean found = false;
        while ( (i < Orang.size()) && (! found)){
            if( (Orang.get(i) instanceof Dosen) && (((Dosen)Orang.get(i)).getkodeDosen() == kodeDosen) ){
               found = true;
            } else {
                i++;
            }
        }
        if (found){
            Orang.remove(i);
        }
    }
    
    public void menuMain(){
        System.out.println("Pilih Menu");
        System.out.println("1. Menu Dosen");
        System.out.println("2. Menu Mahasiswa");
        int pil = scan.nextInt();
        switch(pil){
            case 1: this.menuDosen();
                    break;
            case 2: this.menuMahasiswa();
                    break;
            default: this.menuMain();
                     break;
        }
    }
    
    public void menuDosen(){
        System.out.println("Pilih Menu");
        System.out.println("1. Tambah Dosen");
        System.out.println("2. Login Dosen");
        System.out.println("3. Kembali ke menu utama");
        int pil = scan.nextInt();
        switch(pil){
            case 1: break;
            case 2: menuLogin(1);
                    break;
            case 3: this.menuMain();
                    break;
            default: this.menuDosen();
                     break;
        }
    }
    
    public void menuMahasiswa(){
        System.out.println("Pilih Menu");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Login Mahasiswa");
        System.out.println("3. Kembali ke menu utama");
        int pil = scan.nextInt();
        switch(pil){
            case 1: break;
            case 2: menuLogin(2);
                    break;
            case 3: this.menuMain();
                    break;
            default: this.menuMahasiswa();
                     break;
        }
    }
    
    public void menuLogin(int mode){
        if(mode == 1){
            System.out.println("Masukkan Kode Dosen anda : ");
        } else{
            System.out.println("Masukkan NIM anda");
        }
        String identitas = scan.nextLine();
        if(mode == 1){
            if( this.getDosen(identitas) != null){
                this.panelDosen(this.getDosen(identitas));
            } else{
                this.menuLogin(1);
            }
        } else{
            if( this.getMahasiswa(identitas) != null){
                this.panelMahasiswa(this.getMahasiswa(identitas));
            } else{
                this.menuLogin(2);
            }
        }
    }
    
    public void panelDosen(Dosen d){
        System.out.println("Pilih Menu");
        System.out.println("1. Ganti kode dosen");
        System.out.println("2. Buat kelompok TA");
        System.out.println("3. Kelola kelompok TA");
        System.out.println("4. Set pembimbing");
        System.out.println("5. Kembali ke menu utama");
        int pil = scan.nextInt();
        switch(pil){
            case 1: System.out.println("Masukkan kode dosen baru");
                    String kodeTmp = scan.nextLine();
                    d.setkodeDosen(kodeTmp);
                    break;
            case 2: System.out.println("Masukkan topik TA");
                    String topikTmp = scan.nextLine();
                    System.out.println("Masukkan kode kelompok");
                    String kelompokTmp = scan.nextLine();
                    d.CreateKelompokTA(topikTmp, kelompokTmp);
                    break;
            case 3: System.out.println("Masukan kode kelompok");
                    kelompokTmp = scan.nextLine();
                    if(d.getKelompokbynum(kelompokTmp) != null){
                        this.panelKelompokTA(d.getKelompokbynum(kelompokTmp));
                    } else{
                        this.panelDosen(d);
                    }
                    break;
            case 4: System.out.println("Masukkan NIM mahasiswa");
                    String tmpNim = scan.nextLine();
                    if(this.getMahasiswa(tmpNim) != null){
                        System.out.println("Masukkan jenis pembimbing (1/2)");
                        int tmpPembimbing = scan.nextInt();
                        if( (tmpPembimbing == 1) && (tmpPembimbing == 2) ){
                            this.getMahasiswa(tmpNim).getTugasAkhir().setPembimbing(d, tmpPembimbing);
                        }
                    }
                    break;         
            case 5: this.menuMain();
                    break;
            default: this.panelDosen(d);
                     break;
        }
    }
    
    public void panelMahasiswa(Mahasiswa m){
        System.out.println("Pilih Menu");
        System.out.println("1. Buat TA");
        System.out.println("2. Revisi judul TA");
        System.out.println("3. Kembali ke menu utama");
        int pil = scan.nextInt();
        switch(pil){
            case 1: System.out.println("Masukkan judul TA");
                    String tmpJudul = scan.nextLine();
                    m.createTA(tmpJudul);
                    break;
            case 2: System.out.println("Masukkan judul TA yang baru");
                    tmpJudul = scan.nextLine();
                    m.getTugasAkhir().revisiTA(tmpJudul);
                    break;
            case 3: this.menuMain();
                    break;
            default: this.panelMahasiswa(m);
                     break;
        }
    }
        
    public void panelKelompokTA(KelompokTA kTA){
        System.out.println("Pilih Menu");
        System.out.println("1. Tambah anggota");
        System.out.println("2. Hapus anggota");
        System.out.println("3. Kembali ke menu utama");
        int pil = scan.nextInt();
        switch(pil){
            case 1: System.out.println("Masukkan nim mahasiswa yang akan ditambahkan");
                    String tmpNim = scan.nextLine();
                    if(this.getMahasiswa(tmpNim) != null){
                        kTA.addAnggota(this.getMahasiswa(tmpNim));
                    } else{
                        this.panelKelompokTA(kTA);
                    }
                    break;         
            case 2: System.out.println("Masukkan nim mahasiswa yang akan dihapus");
                    tmpNim = scan.nextLine();
                    if(kTA.getAnggota(tmpNim) != null){
                        kTA.removeAnggota(kTA.getAnggota(tmpNim));
                    } else{
                        this.panelKelompokTA(kTA);
                    }
                    break;
            case 3: this.menuMain();
                    break;
            default: this.panelKelompokTA(kTA);
                     break;
        }
    }
//    public static void main(String[] args){
//        Dosen d = new Dosen(1, "123", "mat", "laki");
//        Mahasiswa m = new Mahasiswa("mit", "laki");
//        m.setNim("12345");
//        Aplikasi a = new Aplikasi();
//        a.addDosen(d);
//        a.addMahasiswa(m);
//        System.out.println(a.getMahasiswa("12345").getNim());
//    }    
}
