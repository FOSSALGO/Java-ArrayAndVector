package fosalgo;

public class LatihanArrayVector013 {
    public static void main(String[]fosalgo){
        int[][]arr2D3 = new int[4][];
        
        arr2D3[0] = new int[7];
        arr2D3[1] = new int[4];
        arr2D3[2] = new int[6];
        arr2D3[3] = new int[3];
        
        arr2D3[0][0] = 8;
        arr2D3[0][1] = 5;
        arr2D3[0][2] = 3;
        arr2D3[0][3] = 9;
        arr2D3[0][4] = 4;
        arr2D3[0][5] = 1;
        arr2D3[0][6] = 2;
        
        arr2D3[1][0] = 15;
        arr2D3[1][1] = 7;
        arr2D3[1][2] = 6;
        arr2D3[1][3] = 8;
        
        arr2D3[2][0] = 5;
        arr2D3[2][1] = 2;
        arr2D3[2][2] = 8;
        arr2D3[2][3] = 3;
        arr2D3[2][4] = 9;
        arr2D3[2][5] = 17;
        
        arr2D3[3][0] = 3;
        arr2D3[3][1] = 15;
        arr2D3[3][2] = 4;    
        
        for(int baris=0;baris<arr2D3.length;baris++){
            for(int kolom=0;kolom<arr2D3[baris].length;kolom++){
                System.out.print(arr2D3[baris][kolom]+" ");
            } 
            System.out.println();
        }

    }
}
