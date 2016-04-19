/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.BuatTA;
import View.KelolaKelompok;
import View.NewJFrame1;
import View.NewJFrame2;
import View.NewJFrame3;
import View.NewJFrame4;
import View.NewJFrame5;
import View.NewJFrame6;
import View.NewJFrame7;
import View.SetPembimbing;
import View.TambahMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import tubespbo.Aplikasi;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerView extends MouseAdapter implements ActionListener{
    Aplikasi aplikasi;
    NewJFrame1 menuutama;
    NewJFrame2 menulogin;
    NewJFrame3 tambahdosen;
    NewJFrame4 loginmhs;
    NewJFrame6 hapusanggota;
    NewJFrame5 tambahanggota;
    NewJFrame7 buatkelompok;
    BuatTA buatta;
    //LoginDosen ga ada
    SetPembimbing setpembimbing;
    TambahMahasiswa tambahmhs;
    KelolaKelompok kelolakelompok;
    
    public ControllerView(Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        menuutama = new NewJFrame1();
        menuutama.setVisible(true);
        menuutama.addListener(this);
        //menuutama.addAdapter(this);
        //menuutama.setListId(aplikasi.)
        menulogin = new NewJFrame2();
        menulogin.setVisible(true);
        menulogin.addListener(this);
        //menulogin.addAdapter(this);
        tambahdosen = new NewJFrame3();
        tambahdosen.setVisible(true);
        tambahdosen.addListener(this);
        //tambahdosen.setListId(aplikasi.getListID());
        loginmhs = new NewJFrame4();
        loginmhs.setVisible(true);
        loginmhs.addListener(this);
        tambahanggota = new NewJFrame5();
        tambahanggota.setVisible(true);
        tambahanggota.addListener(this);
        hapusanggota = new NewJFrame6();
        hapusanggota.setVisible(true);
        hapusanggota.addListener(this);
        buatkelompok = new NewJFrame7();
        buatkelompok.setVisible(true);
        buatkelompok.addListener(this);
        buatta = new BuatTA();
        buatta.setVisible(true);
        buatta.addListener(this);
        setpembimbing = new SetPembimbing();
        setpembimbing.setVisible(true);
        setpembimbing.addListener(this);
        tambahmhs = new TambahMahasiswa();
        tambahmhs.setVisible(true);
        tambahmhs.addListener(this);
        kelolakelompok = new KelolaKelompok();
        kelolakelompok.setVisible(true);
        kelolakelompok.addListener(this);
    } 
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
        Object source = e.getSource();
        if (source.equals(menuutama.getBtnDosen())){
            new Controller
        }
    
    }
    
}
