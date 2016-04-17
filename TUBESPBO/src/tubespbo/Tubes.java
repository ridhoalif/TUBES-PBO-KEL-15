/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;
import java.util.*;
/**
 *
 * @author chigin
 */
public class Tubes {
    private ArrayList<Dokumentasi> listDo;
    private int idtubes;
    private String judul;
    private ArrayList<Mahasiswa> listMa;
   
    
    public Tubes(int idtubes, String judul){
        this.idtubes=idtubes;
        this.judul=judul;
        listDo = new ArrayList<>();
        listMa = new ArrayList<>();
    }
    
    
    public void setJudul(String a){
     judul=a;
    }
  
    
    public String getJudul(){
        return judul;
    }
    public void setId(int a){
        idtubes=a;
    }
    public int getId(){
        return idtubes;
    }
    public void addMember(Mahasiswa m){
       listMa.add(m);
    }
    public Mahasiswa getMemberById(long id){
       for(Mahasiswa ma : listMa){
           if(ma.getNim()==id)
               return ma;
           }
       return null;
       }
    
    
    public Mahasiswa getMemberByIndex(int ind){
        return listMa.get(ind);
    }
    public ArrayList<Mahasiswa> getlistmahasiswa(){
        return listMa;
    }
   
    public void deleteMember(long ind){
        
        Mahasiswa mhs=getMemberById(ind);
                listMa.remove(mhs);
        
       
    }
    
    public Mahasiswa getidmember(long id){
        Mahasiswa asa = null;
        for(Mahasiswa mhs:listMa){
            if(mhs.getNim()==id)
                asa=mhs;
    }
        return asa;
    }
   
    
    
    public void addDok(String deskripsi,String waktu,String status){
            Dokumentasi d =new Dokumentasi(deskripsi,waktu,status);
          listDo.add(d);
    }
    public Dokumentasi getDok(int ind){
        return listDo.get(ind);
    }
    public void deleteDok(int ind){
         listDo.remove(ind);
    }
     
    public void display(){
     
        System.out.println("ID Tubes : "+getId());
        System.out.println("Judul Tubes :"+getJudul());
        System.out.println("Mahasiswa : ");
        for(Mahasiswa m : listMa){
                System.out.println(m.toString());
        }
        System.out.println("Dokumentasi : ");
        for (Dokumentasi d:listDo){
            System.out.println(d.toString());
        }
       
		
    }
    public ArrayList<Dokumentasi> getlistdok(){
        return listDo;
    }
    @Override
    public String toString(){
        return "\nID Tubes : "+getId()+
                "\nJudul Tubes : "+getJudul();
    }
    
}
            

