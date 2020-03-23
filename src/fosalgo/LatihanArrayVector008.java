package fosalgo;

public class LatihanArrayVector008 {
    public static void main(String[] args) {
        
        Orang orang1 = new Orang("Iwan", 25, "Jl. Rambutan");
        Orang orang2 = new Orang("Ani", 17, "Jl. Salak");
        Orang orang3 = new Orang("Herman", 18, "Jl. Angsa");
        Orang orang4 = new Orang("Umria", 15, "Jl. Kelinci");
        Orang orang5 = new Orang("Budi", 12, "Jl. Kucing");
        
        Orang[] arr5 = {orang1, orang2, orang3, orang4, orang5};
        
        for(Orang org:arr5){
            System.out.println("=================================");
            System.out.println("Nama  : "+org.nama);
            System.out.println("Umur  : "+org.umur+" tahun");
            System.out.println("Alamat: "+org.alamat);
        }
        
        System.out.println("=================================");
        System.out.println("=================================");
        
        for(int i=0;i<arr5.length;i++){
            System.out.println("=================================");
            Orang org = arr5[i];
            System.out.println("Orang-"+i);
            System.out.println("Nama  : "+org.nama);
            System.out.println("Umur  : "+org.umur+" tahun");
            System.out.println("Alamat: "+org.alamat);
        }
    }
}
