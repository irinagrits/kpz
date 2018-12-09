import java.util.HashSet;

public class Coordinates{
    private HashSet x = new HashSet<>(32);
    private HashSet y = new HashSet<>(32);
    public Coordinates(){x=y=new HashSet(); x.add(0);y.add(0);x.clear();y.clear();}
    public void Add(Integer x, Integer y){
        this.x.add(x);
        this.y.add(y);
    }
    void setX(int x){
        this.x.add(x);
    }
    void setY(int y){
        this.y.add(y);
    }
    public double distance(int index1, int index2){
        var a = this.x.toArray();
        var b = this.x.toArray();
        var c = this.y.toArray();
        var d = this.y.toArray();
        return Math.sqrt(Math.pow((int)a[index1]-(int)b[index2], 2)+
                        Math.pow((int)c[index1]-(int)c[index2], 2));
    }
}