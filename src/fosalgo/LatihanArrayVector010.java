package fosalgo;

import java.util.Vector;

public class LatihanArrayVector010 {
    public static void main(String[] args) {
        Vector<Double> vect2 = new Vector<Double>();
        
        Vector<String> vect3 = new Vector<>();
        
        Vector<Titik> vect4 = new Vector<>();
        
        Vector<Orang> vect5 = new Vector<>();
        
        Orang orang1 = new Orang("Iwan", 25, "Jl. Rambutan");
        Orang orang2 = new Orang("Ani", 17, "Jl. Salak");
        Orang orang3 = new Orang("Herman", 18, "Jl. Angsa");
        Orang orang4 = new Orang("Umria", 15, "Jl. Kelinci");
        Orang orang5 = new Orang("Budi", 12, "Jl. Kucing");
        
        vect5.add(orang1);
        vect5.add(orang2);
        vect5.add(orang3);
        vect5.add(orang4);
        vect5.add(orang5);
        
        for(int i=0;i<vect5.size();i++){
            System.out.println("=================================");
            Orang org = vect5.get(i);
            System.out.println("Orang-"+i);
            System.out.println("Nama  : "+org.nama);
            System.out.println("Umur  : "+org.umur+" tahun");
            System.out.println("Alamat: "+org.alamat);
        }
    }
}
