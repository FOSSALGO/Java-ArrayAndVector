package fosalgo;
import java.util.Vector;

public class LatihanArrayVector019 {
    static Vector<Integer> vec = new Vector<>();
    
    static void tambahData(int value){
        vec.add(value);
    }
    
    static void cetak(){
        System.out.print("[");
        for(int i=0;i<vec.size();i++){
            System.out.print(" "+vec.get(i));
        }
        System.out.println(" ]");
    }
    
    static int jumlahkan(){
        int jum = 0;
        for(int i=0;i<vec.size();i++){
            jum = jum + vec.get(i);
            //jum += vec.get(i);
        }
        return jum;
    }
    
//    static void tukarNilai(int indexA, int indexB){
//        int C = vec.get(indexA);
//        vec.set(indexA, vec.get(indexB));
//        vec.set(indexB, C);
//    }
    
    static void tukarNilai(int indexA, int indexB){
        int A = vec.get(indexA);
        int B = vec.get(indexB);
        int C = A;
        A = B;
        B = C;
        vec.set(indexA, A);
        vec.set(indexB, B);
    }
    
    public static void main(String[] args) {
        cetak();
        
        tambahData(3);
        tambahData(8);
        tambahData(12);
        tambahData(7);
        tambahData(9);
        tambahData(5);
        tambahData(32);
        tambahData(18);
        
        cetak();
        
        int hasilJumlah = jumlahkan();
        System.out.println("hasil jumlah = "+hasilJumlah);
        
        cetak();
        tukarNilai(1, 6);
        cetak();       

    }
    
    
}
