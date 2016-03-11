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
	public TugasBesar[] tugasBesar;
	private int index;

	public Asisten(String nama,long id,TugasBesar tugasBesar,int index){
		this.nama = nama;
		this.id = id;
		this.tugasBesar = tugasBesar;
		this.index = index;
	}
	public void createTugasBesar(TugasBesar tb){
		tugasBesar = tb;
	}
	public TugasBesar getTugasBesar(TugasBesar tugasBesar,int index){
		this.tugasBesar[index] = tugasBesar[index]; //aing sok tau yang ini kwkwkkwk
	}
	public void deleteTugasBesar(TugasBesar tugasBesar,int index){
		tugasBesar.remove(index); // benerin lipp kwkwk
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public void setId(long id){
		this.id = id;
	}
	public void setIndex(int index){
		this,index = index;
	}
	public String getNama(){
		return nama;
	}
	public long getId(){
		return id;
	}
	public int getIndex(){
		return index;
	
        }
}
