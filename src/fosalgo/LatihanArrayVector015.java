package fosalgo;

public class LatihanArrayVector015 {
    public static void main(String[] args) {
        char[][]arr2D4 = new char[4][];
        for(int i=0;i<arr2D4.length;i++){
            int nKolom = 1 + i;
            arr2D4[i] = new char[nKolom];
            for(int k=0;k<nKolom;k++){
                arr2D4[i][k]='#';
            }
        }
        
        for(int i=0;i<arr2D4.length;i++){
            for(int j=0;j<arr2D4[i].length;j++){
                System.out.print(arr2D4[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
