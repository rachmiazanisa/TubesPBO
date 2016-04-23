/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import View.createTA;
import View.mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import tubespbo.Mahasiswa;
import tubespbo.TugasAkhir;

/**
 *
 * @author Rachmi
 */
public class ControllerCreateTA {
   Database model;
   createTA view;
   TugasAkhir ta;
   
   public ControllerCreateTA(Database model){
       this.model = model;
       view = new createTA();
       view.setVisible(true);
       view.addListener(this);
       this.ta = null;
       
       this.view.getTfJudulTA().addFocusListener((FocusListener) this);
       
   }
   
   public void actionPerformed(ActionEvent e){
       Object source = e.getSource();
       
       if(source.equals(view.getTfJudulTA())){
           String judul = view.getJudulTA();
           if(ta == null){
               TugasAkhir ta = new TugasAkhir(judul);
               Database db = new Database();
               view.setJudulTA("");
           } else{
               ta.setJudulTA(judul);
           }
       }
       if(source.equals(view.getBtnBack())){
           new mahasiswa();
           
       }
   }
}
