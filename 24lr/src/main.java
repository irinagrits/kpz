import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static double distance(int index1, int index2, HashSet<Integer> x, HashSet<Integer> y){
        var a = x.toArray();
        var b = x.toArray();
        var c = y.toArray();
        var d = y.toArray();
        return Math.sqrt(Math.pow((int)a[index1]-(int)b[index2], 2)+
                Math.pow((int)c[index1]-(int)d[index2], 2));
    }
    public static void main(String[] args) {
        var rnd = new Random();
        var sc = new Scanner(System.in);
        var out = System.out;
        var c = sc.nextInt();
        out.println("Coordinates:\n");
        HashSet<Integer> x = new HashSet<>(32);
        HashSet<Integer> y = new HashSet<>(32);
        for (var i = 0; i < c; i++) {
            x.add(rnd.nextInt());
            y.add(rnd.nextInt());
            out.print(x.toArray()[i]+"\t"+y.toArray()[i]+"\n");
        }
        out.print("\n\nDistance:\n");
        var j = 0;
        for (int i = 0; i < c; i++) {
            out.print(distance(i,j,x,y)+"\n");
            j++;
        }
    }
}
