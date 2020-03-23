package fosalgo;

public class LatihanArrayVector001 {
    public static void main(String[] args) {
        int[]arr1;
        arr1 = new int[10];
        
        arr1[0] = 3;
        arr1[1] = 24;
        arr1[2] = 7;
        arr1[3] = 9;
        arr1[4] = 8;
        arr1[5] = 215;
        arr1[6] = 2;
        arr1[7] = 512;
        arr1[8] = 6;
        arr1[9] = 72; 
        
        for(int x=0;x<arr1.length;x++){
            System.out.println(arr1[x]);
        }
        
        int ASD = arr1[1] * arr1[8];
        System.out.println("ASD: "+ASD);
        
        arr1[9] = 12;
        for(int x=0;x<arr1.length;x++){
            System.out.println(arr1[x]);
        }
        
    }
}
