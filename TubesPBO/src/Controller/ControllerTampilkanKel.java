/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.ShowKel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Aplikasi;
import tubespbo.Dosen;
import tubespbo.KelompokTA;

/**
 *
 * @author Dian Dwi Arini
 */
public class ControllerTampilkanKel implements ActionListener {
    Aplikasi aplikasi;
    ShowKel view;
    Dosen d;
    public ControllerTampilkanKel(Aplikasi aplikasi){
        this.aplikasi=aplikasi;
        view = new ShowKel();
        view.setVisible(true);
        view.addListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         Object source = e.getSource();
         if(source.equals(view.getBtnIndex())){
            d.getKelompok(view.)   //parameternya apa
         }else if (source.equals(view.getBtnNoKel())){
             k.getAnggota(nim)
         }
             
         }
         
    }
    