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
    public String[] getlistid(){
        String[] ar= new String[listT.size()];
        return ar=listT.toArray(ar);
    }
    public void searchtubes(int idts){
       for(Tubes tus:listT){
             if(tus.getId()==idts){
                             tus.display();
                         }
                     }  
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
       public void assignTubes(int ad,long a){
           for(Tubes tis:listT){
               if(tis.getId()==ad)
                   
           
           for(Asisten tus : listAsisten ){
               if(tus.getId()==a)
                   tus.addtubes(tis);
           }
       }
       }
       public void viewtubes(){
           if(listT.isEmpty()==true){
               System.out.println("List Tubes Kosong");
           }
           else{
           for(Tubes tus:listT){
                        tus.display();
                    }
       }
       }
       public void setviewtubes(){
           for(Tubes tus:listT){
               tus.toString();
           }
       }
       public ArrayList<Asisten> getlistasisten(){
           return listAsisten;
       }
       public void deletemember(int ids, long id){
           Tubes b=getTubes(ids);
              b.deleteMember(id);
       }
       public void addas(String a,String b,int c, long d){
           listAsisten.add(new Asisten(a,c,b,d));
       }
      
       public void viewlistas(){
           for(Asisten asis:listAsisten){
                        asis.display();
                    }
       }
       public String serachmhs(long a){
           for(Tubes tus:listT){
               Mahasiswa mas;
               mas = tus.getidmember(a);
               if(mas.getNim()==a){
                   return mas.toString();
               }
       }
           return "";
       }
       public ArrayList<Tubes> getlisttubes(){
           return listT;
       }
       
      
      
      
    
}
