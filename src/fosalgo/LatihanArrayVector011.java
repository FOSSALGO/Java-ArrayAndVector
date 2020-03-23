package fosalgo;

public class LatihanArrayVector011 {
    public static void main(String[] args) {
        int[][] arr2D1;
        arr2D1 = new int[4][7];//4 baris, 7 kolom
        
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
        
        for(int i=0; i<arr2D1.length;i++){
            for(int j=0;j<arr2D1[i].length;j++){
                System.out.print(arr2D1[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
