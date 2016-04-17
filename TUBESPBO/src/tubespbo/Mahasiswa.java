package tubespbo;

public class Mahasiswa extends Orang{
	private long nim;
	private String kelas;
	
	public Mahasiswa(String jenisKelamin,int umur,String nama, long nim, String kelas){
		super(jenisKelamin,umur,nama);
		this.nim = nim;
		this.kelas = kelas;
	}
	
	public void setNama(String nama){
		super.setNama(nama);
	}
	
	public String getNama(){
		return super.getNama();
	}
	
	public void setUmur(int umur){
		super.setUmur(umur);
	}
	
	public int getUmur(){
		return super.getUmur();
	}
	
	public void setJenisKelamin(String jenisKelamin){
		super.setJenisKelamin(jenisKelamin);
	}
	
	public String getJenisKelamin(){
		return super.getJenisKelamin();
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
         @Override
    public String toString(){
        return "\nNama: "+getNama()+
                "\nNim Mahasiswa: "+nim
		+ "\nKelas: "+kelas
		+ "\nJenis Kelamin: "+getJenisKelamin()
		+"\nUmur: "+getUmur();
    }
}
