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
public class Dokumentasi {
    private String deskripsi;
    private String waktu;
    private String status;
    
    public Dokumentasi(String deskripsi,String waktu,String status){
        this.deskripsi=deskripsi;
        this.waktu=waktu;
        this.status=status;
       
    }
    public String getDes(){
        return deskripsi;
    }
    
    public String getWaktu(){
        return waktu;
    }
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String s){
        if (s=="selesai" || s=="belum"){
            status=s;
        }
        else{
            System.out.println("input status salah");
        }
    }
     @Override
    public String toString(){
        return "\nDeskripsi: "+deskripsi
		+ "\nStatus: "+status
		+ "\nWaktu: "+waktu;
    }
}
