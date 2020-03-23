package fosalgo;

public class LatihanArrayVector016 {
    public static void main(String[] args) {
        //int[][][] arr3D1 = new int[3][3][3];//[layer] [baris] [kolom]
        
        int[][][] arr3D1 = {
            //==================================
            //begin layer-0
            {
                {8, 5, 3},
                {15, 7, 6},
                {3, 2, 9}
            },//end of layer-0
            //==================================
            //begin layer-1
            {
                {6, 5, 7},
                {1, 8, 25},
                {8, 7, 4}
            },//end of layer-1
            //==================================
            //begin layer-2
            {
                {2, 1, 4},
                {7, 3, 2},
                {5, 6, 8}
            },//end of layer-2        
        };
        
        arr3D1[1][0][1] = 27;
        
        for(int layer=0;layer<arr3D1.length;layer++){
            System.out.println("======================");
            System.out.println("Layer-"+layer);
            for(int baris=0; baris<arr3D1[layer].length;baris++){
                for(int kolom=0;kolom<arr3D1[layer][baris].length;kolom++){
                    System.out.print(arr3D1[layer][baris][kolom]+" ");
                }
                System.out.println();
            }
            System.out.println("----------------------");
        }
    }
}
