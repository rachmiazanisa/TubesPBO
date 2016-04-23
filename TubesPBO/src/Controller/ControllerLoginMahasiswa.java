/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.NewJFrame4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.awt.event.FocusListener;
import tubespbo.Aplikasi;
import tubespbo.Mahasiswa;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerLoginMahasiswa implements ActionListener{
    Aplikasi aplikasi;
    NewJFrame4 view;
    Mahasiswa mhs;
    public ControllerLoginMahasiswa(Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        NewJFrame4 view = new NewJFrame4();
        view = new NewJFrame4();
        view.setVisible(true);
        view.addListener(this);
        this.mhs = null;
        
        this.view.getTfNIM().addFocusListener((FocusListener) this);
        this.view.get
=======
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
>>>>>>> origin/master
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
