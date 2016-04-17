/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cadas
 */
public class controlermhs implements ActionListener {
     Aplikasi model=new Aplikasi();
    guiMaha view;
    public controlermhs(Aplikasi mod){
        
        view = new guiMaha();
        view.setVisible(true);
        view.addListener(this);
        model=mod;
        }
     @Override
     public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source.equals(view.getBtnInput())) {
            String nama = view.getTfnamas();
            int umur= view.getTfumuras();
            Long nim = view.getTfnimas();
            String jk= view.getCmjk();
            String kelas= view.getTfkelas();
            int id=view.getTfidtub();
            Mahasiswa m= new Mahasiswa(jk,umur,nama,nim,kelas);
                
                model.assignM(m, id);
                JOptionPane.showMessageDialog(view, "Data berhasil di input");
              
            
        }
         else if(source.equals(view.getBtnref())){
            ArrayList<Tubes> c=new ArrayList();
            ArrayList<Dokumentasi> d=new ArrayList();
            c=model.getlisttubes();
            view.refreshlist();
            for(Tubes a:c){
                view.setTftub(a.toString());
                
            }
        }
         else if(source.equals(view.getBtnNav())){
             Controler c=new Controler(model);
             view.dispose();
         }
}
}
