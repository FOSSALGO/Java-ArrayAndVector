package fosalgo;
import java.awt.Point;

public class LatihanArrayVector006 {
    public static void main(String[] args) {
        Point[] arr4 = new Point[4];
        
        Point p0 = new Point(2,5);
        arr4[0] = p0;
        
        Point p1 = new Point(7,8);
        arr4[1] = p1;
        
        arr4[2] = new Point(9,3);
        
        arr4[3] = new Point(12,17);
        
        for(Point p:arr4){
            System.out.println("("+p.x+","+p.y+")");
        }       
        
        for(int i=0;i<arr4.length;i++){
            Point p = arr4[i];
            System.out.println("("+p.x+","+p.y+")");
        }
    }
}
