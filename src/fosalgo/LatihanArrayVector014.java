package fosalgo;

public class LatihanArrayVector014 {

    public static void main(String[] args) {
        int[][] arr2D3 = {
            {8, 5, 3, 9, 4, 1, 2},
            {15, 7, 6, 8},
            {5, 2, 8, 3, 9, 17},
            {3, 15, 4}
        };
        
        for(int baris=0;baris<arr2D3.length;baris++){
            for(int kolom=0;kolom<arr2D3[baris].length;kolom++){
                System.out.print(arr2D3[baris][kolom]+" ");
            } 
            System.out.println();
        }
    }
}
