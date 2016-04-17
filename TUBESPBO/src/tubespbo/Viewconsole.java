/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.Scanner;

/**
 *
 * @author cadas
 */
public class Viewconsole {
    Aplikasi a=new Aplikasi();
    Scanner sc= new Scanner(System.in);
 public void mainmenu1(){
            System.out.println("MENU MAHASISWA");
            System.out.println("1.Daftarkan diri ke tubes");
            System.out.println("2.View Tubes");
            System.out.println("3.Kembali Ke Menu Utama");
            System.out.print("Masukkan Menu Pilihan");
            Scanner pil=new Scanner(System.in);
            int p=pil.nextInt();
            switch(p){
                case 2:
                    a.viewtubes();
                    mainmenu1();
                case 1:
                    
                     System.out.print("Masukkan Nama : ");
                     String na= sc.nextLine();
                     na= sc.nextLine();
                     System.out.print("Masukkan JenisKelamin : ");
                     String jk = sc.nextLine();
                     System.out.print("Masukkan Umur : ");
                     int um=sc.nextInt();
                     System.out.print("Masukkan Nim : ");
                     long ni=sc.nextLong();
                     System.out.print("Masukkan Kelas : ");
                     String ke=sc.nextLine();
                     ke=sc.nextLine();
                     System.out.print("Masukkan ID Tubes :");
                     int idts=sc.nextInt();
                     
                     Mahasiswa mhs=new Mahasiswa(jk,um,na,ni,ke);
                     a.assignM(mhs, idts);
                     mainmenu1();
                case 3:
                    menutama();
                            
                          
            }
}
       public void mainmenu(){
            System.out.println("MENU ASISTEN");
            
            System.out.println("1.Create Tubes");
            System.out.println("2.View Tubes");
            System.out.println("3.Delete Tubes");
            System.out.println("4.Create Dokumentasi");
            System.out.println("5.Delete Mahasiswa");
            System.out.println("6.Search Mahasiswa");
            System.out.println("7.Search Tubes");
            System.out.println("8.Create Asisten");
            System.out.println("9.Assign Tubes");
            System.out.println("10.View Asisten");
            System.out.println("11.Menu Utama");
            
            System.out.print("Masukkan Menu :");
            int pil=sc.nextInt();
            int idt;
            long ni;
            switch(pil){
                case 1:
                    System.out.print("Masukkan Id Tubes :");
                    int ids=sc.nextInt();
                    System.out.print("Masukkan Judul Tubes : ");
                    String jd=sc.nextLine();
                    jd=sc.nextLine();
                    a.addTubes(ids, jd);
                    mainmenu();
                    
                case 2 :
                    a.viewtubes();
                    mainmenu();
                    
                case 3:
                    System.out.print("Masukkan Id Tubes : ");
                    int id=sc.nextInt();
                    a.removetubes(id);
                    mainmenu();
                case 4:
                    System.out.print("Masukkan Deskripsi Dokumentasi :");
                    String des=sc.nextLine();
                    des=sc.nextLine();
                    System.out.print("Masukkan Tanggal Mulai Pengerjaan :");
                    String wak=sc.nextLine();
                    System.out.print("Masukkan Status(selesai/belum) :");
                    String st=sc.next();
                    
                    System.out.print("Masukkan ID Tubes :");
                     int idts=sc.nextInt();
                     a.assignD(des, wak, st, idts);
                     mainmenu();
                case 5:
                    System.out.print("Masukkan ID Tubes :");
                      idt=sc.nextInt();
                     System.out.print("Masukkan Nim :");
                      ni=sc.nextLong();
                     a.deletemember(idt, ni);
                     mainmenu();
                case 6:
                    
                     System.out.print("Masukkan Nim :");
                     long caas=sc.nextLong();
                     System.out.println(a.serachmhs(caas));
                             
                     
                     mainmenu();
                case 7:
                    
                    System.out.print("Masukkan ID Tubes :");
                     idt=sc.nextInt();
                    a.serachmhs(idt);
                     mainmenu();
                case 8:
                    System.out.print("Masukkan Nama : ");
                     String na= sc.nextLine();
                     na= sc.nextLine();
                     System.out.print("Masukkan JenisKelamin : ");
                     String jk = sc.nextLine();
                     System.out.print("Masukkan Umur : ");
                     int um=sc.nextInt();
                     System.out.print("Masukkan Nim : ");
                      long asc=sc.nextLong();
                      a.addAsisten(jk, um, na, asc);
                      mainmenu();
                case 9:
                    System.out.print("Masukkan ID Tubes :");
                     idt=sc.nextInt();
                     System.out.print("Masukkan Nim :");
                     long ca=sc.nextLong();
                    a.assignTubes(idt, ca);
                     mainmenu();
                             
                    
                case 10:
                    a.viewlistas();
                    mainmenu();
                case 11:
                    menutama();
                            
                    
            }
       }
       public void menutama(){
           System.out.println("Manu Utama");
           System.out.println("1.Menu Mahasiswa");
           System.out.println("2.Menu Asisten");
           int jwb=sc.nextInt();
           switch(jwb){
               case 1:
                   mainmenu1();
                   break;
               case 2:
                   mainmenu();
                   break;
           }
       }   
}
