package fosalgo;

public class LatihanArrayVector012 {

    public static void main(String[] args) {
        double[][] arr2D2 = {
            {8.2, 5.6, 3.7, 9.13},
            {15.6, 7.8, 6.25, 8.67},
            {5.86, 2.76, 8.4, 3.23},
            {3.8, 15.1, 4.02, 7.62},};
        
        for(int baris=0;baris<arr2D2.length;baris++){
            for(int kolom=0;kolom<arr2D2[baris].length;kolom++){
                System.out.print(arr2D2[baris][kolom]+" ");
            }
            System.out.println();
        }
    }
}
