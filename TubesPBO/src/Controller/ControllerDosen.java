/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Dosen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Aplikasi;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerDosen implements ActionListener {
    Aplikasi aplikasi;
    Dosen view;
    
    public ControllerDosen (Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        view = new Dosen();
        view.setVisible(true);
        view.addListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnBuat())){
            new ControllerBuatTA(aplikasi);
            view.dispose();
        }else if (source.equals(view.getBtnTampil())){
            new ControllerTampilkanKel(aplikasi);
            view.dispose();
        }else if (source.equals(view.getBtnEdit())){
            new ControllerEditKel(aplikasi);
            view.dispose();
        }
    }
    
    
   
    
}
