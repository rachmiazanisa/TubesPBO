/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.NewJFrame6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Aplikasi;
import tubespbo.KelompokTA;
import tubespbo.Mahasiswa;

/**
 *
 * @author Dian Dwi Arini
 */
class ControllerHapusAnggota implements ActionListener{
    Aplikasi aplikasi;
    NewJFrame6 view;
    KelompokTA k;
    Mahasiswa m;

    public ControllerHapusAnggota(Aplikasi aplikasi) {
        this.aplikasi=aplikasi;
        view = new NewJFrame6();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnEnter())){
            
            if (db.selectNIM()){
                k.removeAnggota(view.getTfNIMHapus());//parameternya gatau
                view.showMessage(view, "NIM "+view.getNIMHapus()+" berhasil dihapus")
            }else{
                view.showMessage(view, "Tidak ada ");
            }
        }
    }
    
}
