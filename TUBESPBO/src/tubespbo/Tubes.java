/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author chigin
 */
public class Tubes {
    private Dokumentasi[] dokumentasi;
    private int idtubes;
    private String judul;
    private Mahasiswa[] member;
    private int numm=0;
    private int num=0;
    
    public Tubes(int idtubes, String judul,int maksmember,int maksdok){
        this.idtubes=idtubes;
        this.judul=judul;
        Dokumentasi[] dokumentasi= new Dokumentasi[maksdok];
        Mahasiswa[] member = new Mahasiswa[maksmember];
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
    public void createMember(Mahasiswa m){
        if (numm<member.length){
            member[numm]=m;
            numm++;
        }
        else{
            System.out.println("data penuh");
        }
    }
    public Mahasiswa getMemberById(int id){
        Mahasiswa a=member[0];
        for(int i=0;i<member.length;i++){
            if(member[i].getId()==id){
                a=member[i];
            }
        }
        return a;
    }
    public Mahasiswa getMemberByIndex(int ind){
        return member[ind];
    }
    public void deleteMember(int ind){
           member[ind]=null;
            int c=ind+1;
            for(int i=c;i<=member.length;i++){
                member[i]=member[i-1];
            }
    }
    public void createDok(String deskripsi,int waktu,String status){
            Dokumentasi d =new Dokumentasi(deskripsi,waktu,status);
            if(num<dokumentasi.length){
            dokumentasi[num]=d;
            num++;
        }
            else{
                System.out.println("Data penuh");
            }
    }
    public Dokumentasi getDok(int ind){
        return dokumentasi[ind];
    }
    public void deleteDok(int ind){
           dokumentasi[ind]=null;
            int c=ind+1;
            for(int i=c;i<=dokumentasi.length;i++){
                dokumentasi[i]=dokumentasi[i-1];
            }
    }
    
}
            

