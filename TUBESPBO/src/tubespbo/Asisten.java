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
public class Asisten extends Orang {
    private String nama;
	private long id;
	public Tubes[] tubes;
	private int numtubes=0;
       

	public Asisten(String jenisKelamin,int umur,String nama,long id,int index){
		super(jenisKelamin,umur,nama);
		this.id = id;
		tubes = new Tubes[index];
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
	public void setId(long id){
		this.id = id;
	}
	
	public long getId(){
		return id;
	}
        public void Display(){
            System.out.println(getNama());
        for (int i=0;i<numtubes;i++){
        System.out.println(getTubes(i).getJudul());
           for(int j=0;j<getTubes(i).getNumm();j++){
               System.out.println(getTubes(i).getMemberByIndex(j).getNama());
               System.out.println(getTubes(i).getMemberByIndex(j).getUmur());
           }
           for(int f=0;f<getTubes(i).getNum();f++){
              System.out.println(getTubes(i).getDok(f).getDes());
              System.out.println(getTubes(i).getDok(f).getStatus());
           }
        }
        }

}
