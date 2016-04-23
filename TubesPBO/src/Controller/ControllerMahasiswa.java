/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import View.EditTA;
import View.createTA;
import View.mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.TugasAkhir;

/**
 *
 * @author Rachmi
 */
public class ControllerMahasiswa {
    Database model;
    mahasiswa view;
    //TugasAkhir ta;
    
    public ControllerMahasiswa(Database model){
        this.model=model;
        view = new mahasiswa();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        
        if(source.equals(view.getBtnCreate())){
            new createTA();
        }else if(source.equals(view.getBtnEdit())){
            new EditTA();
        }
    }
    
}
