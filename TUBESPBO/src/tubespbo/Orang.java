/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Rashief
 */
public class Orang {
    private String jenisKelamin;
	private int umur;
	private String nama;
	

	public Orang (String jenisKelamin,int umur,String nama){
		this.jenisKelamin = jenisKelamin;
		this.umur = umur;
		this.nama = nama;
		
	}

	public void setJenisKelamin(String jenisKelamin){
            if(jenisKelamin=="laki-laki"||jenisKelamin=="perempuan"){
		this.jenisKelamin = jenisKelamin;
            }
            else{
                System.out.println("Data jenis kelamin salah");
            }
	}
        
	public void setNama(String n){
		nama= n;
	}
	public void setUmur(int u){
		umur = u;
	}
	
	public String getNama(){
		return nama;
	}
	public int getUmur(){
		return umur;
	}
	public String getJenisKelamin(){
		return jenisKelamin;
	}
	
}
