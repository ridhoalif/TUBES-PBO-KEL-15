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
	private String tanggalLahir;
	private String tempatLahir;
	private String status;

	public Orang (String jenisKelamin,String tanggalLahir,String tempatLahir,String status){
		this.jenisKelamin = jenisKelamin;
		this.tanggalLahir = tanggalLahir;
		this.tempatLahir = tempatLahir;
		this.status = status;
	}

	public void setJenisKelamin(String jenisKelamin){
		this.jenisKelamin = jenisKelamin;
	}
	public void setTanggalLahir(String tanggalLahir){
		this.tanggalLahir = tanggalLahir;
	}
	public void setTempatLahir(String tempatLahir){
		this.tempatLahir = tempatLahir;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getJenisKelamin(){
		return jenisKelamin;
	}
	public String getTanggalLahir(){
		return tanggalLahir;
	}
	public String getTempatLahir(){
		return tempatLahir;
	}
	public String getStatus(){
		return status;
	}
}
