/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author itegarb
 */
public class Mahasiswa extends Orang{
	private long nim;
	private String kelas;
	
	public Mahasiswa(String nama, int umur, String jenisKelamin, long nim, String kelas){
		super(nama, umur, jenisKelamin);
		this.nim = nim;
		this.kelas = kelas;
	}
	
	public void setNama(String nama){
		super(nama);
	}
	
	public String getNama(){
		return super.nama;
	}
	
	public void setUmur(int umur){
		super(umur);
	}
	
	public int getUmur(){
		return super.umur;
	}
	
	public void setJenisKelamin(String jenisKelamin){
		super(jenisKelamin);
	}
	
	public String getJenisKelamin(){
		return super.jenisKelamin;
	}
	
	public void setKelas(String kelas){
		this.kelas = kelas;
	}
	
	public String getKelas(){
		return kelas;
	}
	
	public void setNim(long nim){
		this.nim = nim;
	}
	
	public long getNim(){
		return nim;
	}
}