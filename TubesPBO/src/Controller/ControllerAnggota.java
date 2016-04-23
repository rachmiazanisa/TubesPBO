/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.KelolaAnggota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Aplikasi;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerAnggota implements ActionListener {
    Aplikasi aplikasi;
    KelolaAnggota view;
    public ControllerAnggota(Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        view = new KelolaAnggota();
        view.setVisible(true);
        view.addListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnTambah())){
            new ControllerTambahAnggota(aplikasi);
            view.dispose();
        } else if (source.equals(view.getBtnHapus())){
            new ControllerHapusAnggota(aplikasi);
            view.dispose();
        }
    }
    
}
