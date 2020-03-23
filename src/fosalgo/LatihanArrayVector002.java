package fosalgo;

public class LatihanArrayVector002 {
    public static void main(String[] args) {
        int[]arr1 = {3, 24, 7, 9, 8, 215, 2, 512, 6, 72};
        
        arr1[9] = 123;
        
        for(int value:arr1){
            System.out.println(value);
        }
        
        for(int i=0;i<arr1.length;i++){
            System.out.println("elemen-"+(i)+" = "+arr1[i]);
        }
        
        
    }
}
