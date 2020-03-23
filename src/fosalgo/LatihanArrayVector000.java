package fosalgo;

public class LatihanArrayVector000 {

    public static void main(String[] args) {
        int[][] arr2D1 = new int[4][7];

        arr2D1[0][0] = 8;
        arr2D1[0][1] = 5;
        arr2D1[0][2] = 3;
        arr2D1[0][3] = 9;
        arr2D1[0][4] = 4;
        arr2D1[0][5] = 1;
        arr2D1[0][6] = 2;

        arr2D1[1][0] = 15;
        arr2D1[1][1] = 7;
        arr2D1[1][2] = 6;
        arr2D1[1][3] = 8;
        arr2D1[1][4] = 2;
        arr2D1[1][5] = 4;
        arr2D1[1][6] = 3;

        arr2D1[2][0] = 5;
        arr2D1[2][1] = 2;
        arr2D1[2][2] = 8;
        arr2D1[2][3] = 3;
        arr2D1[2][4] = 9;
        arr2D1[2][5] = 17;
        arr2D1[2][6] = 4;

        arr2D1[3][0] = 3;
        arr2D1[3][1] = 15;
        arr2D1[3][2] = 4;
        arr2D1[3][3] = 7;
        arr2D1[3][4] = 10;
        arr2D1[3][5] = 6;
        arr2D1[3][6] = 21;

        //cetak array
        double[][] arr2D2 = {
            {8.2, 5.6, 3.7, 9.13},
            {15.6, 7.8, 6.25, 8.67},
            {5.86, 2.76, 8.4, 3.23},
            {3.8, 15.1, 4.02, 7.62}
        };

        for (int i = 0; i < arr2D2.length; i++) {
            for (int j = 0; j < arr2D2[i].length; j++) {
                System.out.print(arr2D2[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] arr3D1 = {
            {{8, 5, 3}, {15, 7, 6}, {3, 2, 9}},
            {{6, 5, 7}, {1, 8, 25}, {8, 7, 4}},
            {{2, 1, 4}, {7, 3, 2}, {5, 6, 8}}
        };
        System.out.println(arr3D1[1][0][1]);
        //mencetak seluruh elemen array
        for (int layer = 0; layer < arr3D1.length; layer++) {
            for (int baris = 0; baris < arr3D1[layer].length; baris++) {
                for (int kolom = 0; kolom < arr3D1[layer][baris].length; kolom++) {
                    System.out.print(arr3D1[layer][baris][kolom] + " ");
                }
            }
        }

        int[][] arr2D3a = {
            {8, 5, 3, 9, 4, 1, 2},
            {15, 7, 6, 8},
            {5, 2, 8, 3, 9, 17},
            {3, 15, 4}
        };
        
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
        
        
        

    }
}
