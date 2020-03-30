package fosalgo;
import java.util.Vector;

public class LatihanArrayVector018 {    
    static Vector <Integer> vec = new Vector<>();    
    
    public static void main(String[] args) {
        tambahData(3);
        tambahData(6);
        tambahData(12);
        tambahData(7);
        tambahData(9);
        tambahData(5);
        tambahData(32);
        tambahData(18);
        
        cetak();
        
        int sum = hitungJumlah();
        System.out.println("Jumlah = "+sum);
        
        
    }
    
    static void tambahData(int value){
        vec.add(value);
    }
    
    static void cetak(){
        System.out.print("[");
        for(int i=0; i<vec.size();i++){
            System.out.print(" "+vec.get(i));
        }        
        System.out.println(" ]");
    }
    
    static int hitungJumlah(){
        int jum = 0;
        for(int i=0; i<vec.size();i++){
            //jum = jum + vec.get(i);
            jum += vec.get(i);
        }  
        return jum;
    }
    
}
