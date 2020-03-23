package fosalgo;

import java.util.Vector;

public class LatihanArrayVector009 {
    public static void main(String[] args) {
        Vector<Integer> vec1 = new Vector<>(); 
                
        vec1.add(6);
        vec1.add(13);
        vec1.add(97);
        vec1.add(1, 22);
        vec1.set(3, 26);
        
        int pos2 = vec1.get(2);
        System.out.println("vec1.get(2)="+pos2);
        
        //vec1.remove(1);
        
        System.out.println("size: "+vec1.size());
        
        System.out.print("[ ");
        for(Integer v:vec1){
            System.out.print(v+" ");
        }
        System.out.println("]");
    }
}
