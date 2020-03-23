package fosalgo;

public class LatihanArrayVector007 {
    public static void main(String[] args) {
        Titik[]arr4 = new Titik[4];
        
        arr4[0] = new Titik(2,5);
        arr4[1] = new Titik(7,8.653);
        arr4[2] = new Titik(9,3);
        arr4[3] = new Titik(12,17);
        
        for(Titik t:arr4){
            System.out.println("("+t.x+","+t.y+")");
        }    
        
        for(int i=0;i<arr4.length;i++){
            Titik t = arr4[i];
            System.out.println("("+t.x+","+t.y+")");
        }
    }
}
