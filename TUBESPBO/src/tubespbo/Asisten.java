/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.*;

/**
 *
 * @author Rashief
 */
public class Asisten extends Orang {
    private String nama;
	private long id;
	private ArrayList<Tubes> listTubes;
	private int numtubes=0;
       

	public Asisten(String jenisKelamin,int umur,String nama,long id){
		super(jenisKelamin,umur,nama);
		this.id = id;
                listTubes = new ArrayList<>();
	}

   
	public Tubes getTubes(int idt){
        for (Tubes tu: listTubes){
            if (tu.getId()==idt)
		return tu;
	}
	return null;
    }
        public void addtubes(Tubes t){
            listTubes.add(t);
        }
	public void deleteTubes(int a){
            listTubes.remove(a);
            
		
	}
	public void setId(long id){
		this.id = id;
	}
	
	public long getId(){
		return id;
	}
      

}
