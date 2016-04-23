/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import View.SetPembimbing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Rachmi
 */
public class ControllerSetPembimbing {
    Database model;
    SetPembimbing view;
    
    public ControllerSetPembimbing(Database model){
        this.model=model;
        view = new SetPembimbing();
        view.setVisible(true);
        view.addListener((ActionListener) this);
        
        this.view.getTfNIM().addFocusListener((FocusListener) this);
    }
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        
        if(source.equals(view.getTfNIM())){
            String nim = view.getNIM();
            if(this.view.getTfNIM().getText().equals("")){
                JOptionPane.showMessageDialog(null,"Harus Diinput!!");
            } else {
                view.setNIM(nim);
            }
        }
        if(source.equals(view.getBtnEnter())){
            
        }
    }
    
}
