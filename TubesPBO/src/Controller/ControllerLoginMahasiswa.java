/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.NewJFrame4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Aplikasi;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerLoginMahasiswa implements ActionListener{
    Aplikasi aplikasi;
    NewJFrame4 view;
    
    public ControllerLoginMahasiswa(Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        NewJFrame4 view = new NewJFrame4();
        view = new NewJFrame4();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
