/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

<<<<<<< HEAD
import View.NewJFrame2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Aplikasi;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerLoginDosen implements ActionListener{
    Aplikasi aplikasi;
    NewJFrame2 view;
    
    public ControllerLoginDosen(Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        NewJFrame2 view = new NewJFrame2();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
=======
import View.LoginDosen;
import View.NewJFrame2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Aplikasi;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerLoginDosen implements ActionListener{
    Aplikasi aplikasi;
    LoginDosen view;
    
    public ControllerLoginDosen(Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        LoginDosen view = new LoginDosen();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
>>>>>>> origin/master
        


//To change body of generated methods, choose Tools | Templates.
    }
}
