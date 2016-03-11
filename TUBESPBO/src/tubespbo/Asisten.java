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
public class Asisten {
    private String nama;
	private long id;
	public Tubes[] tubes;
	private int numtubes=0;

	public Asisten(String nama,long id,int index){
		this.nama = nama;
		this.id = id;
		Tubes[] tubes = new Tubes[numtubes];
	}
	public void createTubes(Tubes tb){
		
                if (numtubes<tubes.length){
                    tubes[numtubes]=tb;
                    numtubes++;
                }
                else{
                    System.out.println("data sudah penuh");
                }
	}
	public Tubes getTubes(int a){
		return tubes[a];
	}
	public void deleteTubes(int a){
            tubes[a]=null;
            int c=a+1;
            for(int i=c;i<=tubes.length;i++){
                tubes[i]=tubes[i-1];
            }
		
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public void setId(long id){
		this.id = id;
	}
	
	public String getNama(){
		return nama;
	}
	public long getId(){
		return id;
	}

}
