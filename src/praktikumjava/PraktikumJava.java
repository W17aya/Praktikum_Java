package praktikumjava;

import Model.Mahasiswa;

public class PraktikumJava {

   
    public static void main(String[] args) {
        Mahasiswa mahasiswa= new Mahasiswa();
       
        mahasiswa.setId(1);
        mahasiswa.setNPM("17990001");
        mahasiswa.setNama("Abu Bakar Ash-Shiddiq");
        mahasiswa.setIPK(3.9);
        mahasiswa.viewData();
        
     Mahasiswa m1 = new Mahasiswa(
                 2,
                 "17990001",
                 "Umar ibn Khattab",
                         3.9);

         m1.viewData();  
    }
    
    
             
    
}
