/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cadas
 */
public class controleras implements ActionListener{
    Aplikasi model=new Aplikasi();
    guiAs view;
    

    public controleras(Aplikasi mod){
        
        view = new guiAs();
        view.setVisible(true);
        view.addListener(this);
        model=mod;
        
       
        
    }
     public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source.equals(view.getBtnInput())) {
            String nama = view.getTfnamas();
            int umur= view.getTfumuras();
            Long nim = view.getTfnimas();
            String jk= view.getCmjk();
            
                
                model.addAsisten(jk, umur, nama, nim);
                JOptionPane.showMessageDialog(view, "Data berhasil di input");
              
            
        }
        else if(source.equals(view.getBtnTubes())){
           
            int idtubes=view.getTfidtubes();
            String judul=view.getTfjudultubes();
            model.addTubes(idtubes, judul);
            JOptionPane.showMessageDialog(view, "Data berhasil di input");
            
           
           
           }
        else if(source.equals(view.getBtnAssign())){
            long idassisten=view.getTfassignnim();
            int idtubes=view.getTfidtubes();
            model.assignTubes(idtubes, idassisten);
            JOptionPane.showMessageDialog(view, "Data berhasil di Assign");
        }
        else if(source.equals(view.getBtnCari())) {
            long idas=view.getTfcarias();
            Asisten asi;
            asi=model.getAsisten(idas);
            view.setDetilAssisten(asi.hasil());
            
            }
       
            
        
        else if(source.equals(view.getBtnDok())){
            String des=view.getTfdokumentasi();
            String mulai=view.getTfmulai();
            String status=view.getCmStatus();
            int id=view.getTfidtubesdok();
            model.assignD(des, mulai, status, id);
            JOptionPane.showMessageDialog(view, "Data berhasil di input");
            
        }
        else if(source.equals(view.getBtnRef())){
            ArrayList<Tubes> c=new ArrayList();
            ArrayList<Dokumentasi> d=new ArrayList();
            c=model.getlisttubes();
            view.resetlisttubes();
            for(Tubes a:c){
                view.setViewtubes(a.toString());
                
            }
        }
        else if(source.equals(view.getViewDok())){
            ArrayList<Tubes> c=new ArrayList();
            ArrayList<Dokumentasi> d=new ArrayList();
            c=model.getlisttubes();
            int id=view.getTfidtubdok();
            
            for(Tubes a:c){
                if(a.getId()==id){
                d=a.getlistdok();
                for(Dokumentasi ds:d){
                    view.setTflistdok(d.toString());
                }
            }
        }
        }
        else if(source.equals(view.getBtnDeltub())){
            int id=view.getTfdeleteid();
            model.removetubes(id);
            JOptionPane.showMessageDialog(view, "Data berhasil di hapus");
            
        }
        else if(source.equals(view.getBtnDelmhs())){
            int id=view.getTfdeltubmhs();
            long ids=view.getTfdelnimhs();
            model.deletemember(id, ids);
            JOptionPane.showMessageDialog(view, "Data berhasil di hapus");
       }
        else if(source.equals(view.getBtnrefM())){
            view.resettfviewmhs();
           ArrayList<Tubes> c=new ArrayList();
            ArrayList<Mahasiswa> m=new ArrayList();
            c=model.getlisttubes();
            for(Tubes a:c){
                
                m=a.getlistmahasiswa();
                for(Mahasiswa ms:m){
                    view.setTfviewmhs(ms.toString());
                }
            } 
        }
        
        else if(source.equals(view.getBtnviewtubmhs())){
            long id = view.getTfviewnim();
            ArrayList<Tubes> c=new ArrayList();
            view.resettfmhstub();
            c=model.getlisttubes();
            for(Tubes a:c){
                if(a.getMemberById(id)!=null){
                  view.setTfmhstub(a.toString());  
                }
            }
            
        }
        else if(source.equals(view.getBtnnav())){
            Controler views;
            views = new Controler(model);
            view.dispose();
        }
     }
    
       

    
}
