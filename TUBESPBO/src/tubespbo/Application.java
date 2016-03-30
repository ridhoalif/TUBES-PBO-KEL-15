package tubespbo;

import java.util.ArrayList;


/**
 *
 * @author itegarb
 */
public class Application {
    private ArrayList<Asisten> daftarAsisten = new ArrayList<>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        
    public void addAsisten(Asisten asisten){
        this.daftarAsisten.add(asisten);
    }
    
    public void addMahasiswa(Mahasiswa mahasiswa){
        this.daftarMahasiswa.add(mahasiswa);
    }
    
    public Mahasiswa getMahasiswa(long nim){
        for (Mahasiswa mhs : daftarMahasiswa){
            if (mhs.getNim() == nim){
                return mhs;
            }
        }
        return null;
    }
    
    public void deleteMahasiswa(long nim){
        Mahasiswa mhs = getMahasiswa(nim);
        daftarMahasiswa.remove(mhs);
    }
 
}