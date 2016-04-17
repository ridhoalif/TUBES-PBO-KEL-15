/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author cadas
 */
public class Driver {
    public static void main(String[] args) {
        Aplikasi a= new Aplikasi();
       Viewconsole c=new Viewconsole();
       
        Controler ca;
        ca=new Controler(a);//tampilan GUI cuk ini
        c.menutama();// buat nampilin pake tampilan konsol
       
    }
}
