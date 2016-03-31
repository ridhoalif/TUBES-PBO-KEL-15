/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;
import java.util.*;
import java.io.*;

/**
 *
 * @author cadas
 */
public class Aplikasi {
    private ArrayList<Asisten> listAsisten;
    private ArrayList<Tubes> listT;
    Scanner sc= new Scanner(System.in);
    

    public Aplikasi(){
	listAsisten = new ArrayList<>();
        listT = new ArrayList<>();
    }
    public void addTubes(int idtubes, String judul){
        listT.add(new Tubes(idtubes, judul));
    }
    public void addAsisten(String jenisKelamin,int umur,String nama,long id){
        listAsisten.add(new Asisten(jenisKelamin,umur,nama,id));
    }
    public Tubes getTubes(int idt){
        for (Tubes tubesd: listT){
            if (tubesd.getId()==idt)
		return tubesd;
	}
	return null;
    }
     public Asisten getAsisten(long idt){
        for (Asisten ass: listAsisten){
            if (ass.getId()==idt)
		return ass;
	}
	return null;
    }
     public void assignM(Mahasiswa m,int id){
         for(Tubes tus: listT){
             if(tus.getId()==id)
             tus.addMember(m);
         }
     }
     public void assignD(String deskripsi,String waktu,String status,int id){
         for(Tubes tus : listT){
             if(tus.getId()==id)
                 tus.addDok(deskripsi, waktu, status);
         }
     }
      public void removetubes(int a){
          if(getTubes(a)!=null)
          listT.remove(getTubes(a));
      }
       public void removeasisten(int a){
          
          listAsisten.remove(a);
      }
       public void assignTubes(Tubes t,long a){
           for(Asisten tus : listAsisten ){
               if(tus.getId()==a)
                   tus.addtubes(t);
           }
       }
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
                    for(Tubes tus:listT){
                        tus.display();
                    }
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
                     assignM(mhs, idts);
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
                    addTubes(ids, jd);
                    mainmenu();
                    
                case 2 :
                    for(Tubes tus:listT){
                        tus.display();
                    }
                    mainmenu();
                    
                case 3:
                    System.out.print("Masukkan Id Tubes : ");
                    int id=sc.nextInt();
                    removetubes(id);
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
                     assignD(des, wak, st, idts);
                     mainmenu();
                case 5:
                    System.out.print("Masukkan ID Tubes :");
                      idt=sc.nextInt();
                     System.out.print("Masukkan Nim :");
                      ni=sc.nextInt();
                     for(Tubes tus:listT){
                         if(tus.getId()==idt){
                             tus.deleteMember(ni);
                         }
                             
                     }
                     mainmenu();
                case 6:
                    System.out.print("Masukkan ID Tubes :");
                     idt=sc.nextInt();
                     System.out.print("Masukkan Nim :");
                     ni=sc.nextInt();
                     for(Tubes tus:listT){
                         if(tus.getId()==idt){
                             System.out.println(tus.getMemberById(ni).toString());
                         }
                             
                     }
                     mainmenu();
                case 7:
                    
                    System.out.print("Masukkan ID Tubes :");
                     idt=sc.nextInt();
                     for(Tubes tus:listT){
                         if(tus.getId()==idt){
                             tus.display();
                         }
                     }
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
                      ni=sc.nextLong();
                      listAsisten.add(new Asisten(jk,um,na,ni));
                      mainmenu();
                case 9:
                    System.out.print("Masukkan ID Tubes :");
                     idt=sc.nextInt();
                     System.out.print("Masukkan Nim :");
                     ni=sc.nextInt();
                     for(Asisten Asis:listAsisten){
                         if(Asis.getId()==ni){
                     
                     for(Tubes tus:listT){
                         if(tus.getId()==idt){
                             assignTubes(tus, ni);
                         }
                             
                     }
                         }
                     }
                     mainmenu();
                             
                    
                case 10:
                    for(Asisten asis:listAsisten){
                        asis.display();
                    }
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
