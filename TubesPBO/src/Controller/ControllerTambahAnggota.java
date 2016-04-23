/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import View.NewJFrame5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import tubespbo.Aplikasi;
import tubespbo.KelompokTA;
import tubespbo.Mahasiswa;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerTambahAnggota implements ActionListener, FocusListener {
    Aplikasi aplikasi;
    NewJFrame5 view;
    KelompokTA k;
    Mahasiswa m;
    public ControllerTambahAnggota(Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        view = new NewJFrame5();
        view.setVisible(true);
        view.addListener(this);
        this.k=null;
        
        this.view.getTfNIM().addFocusListener(this);
    }
    public ControllerTambahAnggota(Aplikasi aplikasi, KelompokTA k){
        this.aplikasi=aplikasi;
        view = new NewJFrame5();
        view.setVisible(true);
        view.addListener(this);
        this.k=null;
        view.setNIM(m.getNim());
        view.getBtnSimpan().setText("Simpan");
        view.setTitle("Tambah Anggota");
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
//`        Database db = new Database();
        if(source.equals(view.getBtnSimpan())){
//            if(view.getNIM()==k.getAnggota(view.getNIM())){
//                view.showMessage(view, "NIM "+view.getNIM()+" sudah ada");
//            }else {
//                k.addAnggota(view.getNIM());//method di database
//            }
            
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        
    }

    @Override
    public void focusLost(FocusEvent e) {
        Object o = e.getSource();
        if (o.equals(this.view.getTfNIM())){
            if(this.view.getTfNIM().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
            }
        }
    }
}
