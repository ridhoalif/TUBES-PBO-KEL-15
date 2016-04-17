/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 *
 * @author cadas
 */

public class Controler implements ActionListener{
    Mainmenu view; 
    Aplikasi model=new Aplikasi();
    public Controler(Aplikasi a) {
        
         view = new Mainmenu();
        view.setVisible(true);
        view.addListener(this);
        this.model=a;
     }
        
        
         @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

       
        if(source.equals(view.getBtnAs())){
            controleras cs=new controleras(model);
            view.dispose();
        }
        else if(source.equals(view.getBtnMhs())){
            controlermhs cm= new controlermhs(model);
           view.dispose(); 
        }

    }

    }

