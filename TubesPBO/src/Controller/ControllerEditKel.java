/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.EditKel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import tubespbo.Aplikasi;
import tubespbo.KelompokTA;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerEditKel implements ActionListener, FocusListener {
    Aplikasi aplikasi;
    EditKel view;
    KelompokTA k;

    public ControllerEditKel(Aplikasi aplikasi) {
         this.aplikasi=aplikasi;
         view = new EditKel();
         view.setVisible(true);
         view.addListener(this);
         this.k=null;
         this.view.getTfNoKel().addFocusListener(this);
    }
    public ControllerEditKel(Aplikasi aplikasi, KelompokTA k){
        this.aplikasi=aplikasi;
        view = new EditKel();
        view.setVisible(true);
        view.addListener(this);
        this.k=k;
        view.setNoKel(k.getNomor());
        view.getBtnCari().setText("Cari");
        view.setTitle("Edit Kelompok TA");
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source  = e.getSource();
        if(source.equals(view.getBtnCari())){
//            String nomor = view.getNoKel();
            if (k.getNomor()!=view.getNoKel()){
                view.showMessage(view,"Tidak ada");
            } else {
                new ControllerAnggota(aplikasi);
                view.dispose();
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
         Object o = e.getSource();
         if(o.equals(this.view.getTfNoKel())){
             if(this.view.getTfNoKel().getText().equals("")){
                 JOptionPane.showMessageDialog(null, "tidak boleh kosong");
             }
         }
    }
    
}
