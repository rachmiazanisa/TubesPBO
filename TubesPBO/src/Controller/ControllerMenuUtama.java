/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.NewJFrame1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Aplikasi;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerMenuUtama implements ActionListener{
    Aplikasi aplikasi;
    NewJFrame1 view;
    public ControllerMenuUtama(Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        NewJFrame1 view = new NewJFrame1();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnDosen())){
            new ControllerLoginDosen(aplikasi);
            view.dispose();
        }else if (source.equals(view.getBtnMahasiswa())){
            new ControllerLoginMahasiswa(aplikasi);
            view.dispose();
        }
        
//To change body of generated methods, choose Tools | Templates.
    }
}
