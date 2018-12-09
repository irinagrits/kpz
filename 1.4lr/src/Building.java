public class Building {
    protected int floor;
    protected StringBuilder address;
    protected int flat;
    protected float cost;

    Building(){
        floor = flat = 0;
        cost = 0;
        address = new StringBuilder("no name");
    }
    Building(int floor, StringBuilder address, int flat, float cost){
        this.floor = floor;
        this.address = address;
        this.flat = flat;
        this.cost = cost;
    }
    public int getFloor(){return floor;}
    public StringBuilder getAddress(){return address;}
    public int getFlat(){return flat;}
    public float getCost(){return cost;}

    public void setFloor(int floor){this.floor=floor;}
    public void setAddress(StringBuilder address){this.address=address;}
    public void setFlat(int flat){this.flat=flat;}
    public void setCost(float cost){this.cost=cost;}
}
