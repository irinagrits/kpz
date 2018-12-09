public class Task extends Building{
    private StringBuilder manager;
    private StringBuilder Constructor;
    private StringBuilder Client;
    private StringBuilder builder;

    Task(){
        super();
        manager = Constructor = Client = builder = new StringBuilder("no name");
    }
    Task(int floor, StringBuilder address, int flat, float cost, StringBuilder manager,
         StringBuilder Constructor, StringBuilder Client, StringBuilder builder){
        super(floor, address, flat, cost);
        this.manager = manager;
        this.Constructor = Constructor;
        this.Client = Client;
        this.builder = builder;
    }
    public StringBuilder getManager(){return manager;}
    public StringBuilder getConstructor(){return Constructor;}
    public StringBuilder getClient(){return Client;}
    public StringBuilder getBuilder(){return builder;}

    public void setManager(StringBuilder manager){this.manager=manager;}
    public void setConstructor(StringBuilder Constructor){this.Constructor=Constructor;}
    public void setClient(StringBuilder Client){this.Client=Client;}
    public void setBuilder(StringBuilder builder){this.builder=builder;}

    @Override
    public String toString(){
        return "Num of floors\t"+floor
                +"\nNum of flats\t"+flat
                +"\nCost\t"+cost
                +"\nAddress\t"+address
                +"\nManager\t"+manager
                +"\nConstructor\t"+Constructor
                +"\nClient\t"+Client
                +"\nBuilder\t"+builder;
    }
}
/*Замовник надає Технічне завдання (ТЗ) на
    проектування багатоповерхового Дому. Менеджер
    реєструє ТЗ, Конструктор визначає вартість
    проектування і побудови, виставляє Замовнику
    рахунок та створює Бригаду Конструкторів для
    виконання проекту*/

