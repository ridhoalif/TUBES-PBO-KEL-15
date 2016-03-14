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
public class TUBESPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa n = new Mahasiswa("laki-laki",20,"Ridho",1301144076,"if-38-06");
        Mahasiswa n1 = new Mahasiswa("laki-laki",20,"Keren",1301144076,"if-38-06");
        
        Asisten a = new Asisten("laki-laki",20,"rahmat",1301144076,5);
        Tubes t = new Tubes(01,"Program ukur cinta",4,4);
        Tubes t1 = new Tubes(01,"Program ukur cinta",4,4);
        t.createMember(n);
        t.createMember(n1);
        t.createDok("tubes tentang cinta","11 maret 2016","selesai");
        t.createDok("tubes lalalal","11 maret 2016","selesai");
        Dokumentasi d = new Dokumentasi("tubes tentang cinta","11 maret 2016","selesai");
        a.createTubes(t);
        a.Display();
        
        
        t.deleteMember(1);
        t.deleteDok(1);
        a.Display();
        
        
    }
    
}
