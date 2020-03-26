package fosalgo;

public class LatihanArrayVector017 {

    public static void main(String[] args) {
        String[]labelKolom = {"MANGGA","PISANG","JAMBU","RAMBUTAN"};
        
        String[]labelBaris = {"AHAD","SENIN","SELASA","RABU","KAMIS","JUMAT","SABTU"};
        
        int[][] dataPenjualanBuah = {
            {112, 95, 8, 17},
            {43, 62, 37, 8},
            {18, 97, 62, 19},
            {54, 215, 19, 45},
            {816, 78, 83, 24},
            {73, 36, 42, 3},
            {65, 59, 76, 20}
        };
        
        int[]arrSum = new int[4];
        double[]arrAverage = new double[4];
        int[]arrMin = new int[4];
        int[]arrMax = new int[4];
        
        for(int kolom =0;kolom<dataPenjualanBuah[0].length;kolom++){
            int jum = 0;
            int MIN = Integer.MAX_VALUE;
            int MAX = Integer.MIN_VALUE;
            for(int baris=0;baris<dataPenjualanBuah.length;baris++){
                int value = dataPenjualanBuah[baris][kolom];
                jum += value;
                if(value<MIN){
                    MIN = value;
                }
                if(value>MAX){
                    MAX = value;
                }
            }
            arrSum[kolom]=jum;
            arrAverage[kolom] = (double)jum / (double)dataPenjualanBuah.length;
            arrMin[kolom]=MIN;
            arrMax[kolom]=MAX;
            //System.out.println(arrMax[kolom]);
        }
        
        System.out.print("AVERAGE: ");
        for(int j=0;j<arrAverage.length;j++){
            System.out.print(arrAverage[j]+" ");
        }
        
        
    }
}
