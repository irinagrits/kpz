import java.util.Scanner;
public class design_department {
    /*Замовник надає Технічне завдання (ТЗ) на
    проектування багатоповерхового Дому. Менеджер
    реєструє ТЗ, Конструктор визначає вартість
    проектування і побудови, виставляє Замовнику
    рахунок та створює Бригаду Конструкторів для
    виконання проекту*/
    public static void Main(String[] Args){
        var task = new Task();
        var out = System.out;
        var scan = new Scanner(System.in);

        out.print("Enter builder\t");
        task.setBuilder(new StringBuilder(scan.next()));

        out.print("Name of the builder\t");
        task.setClient(new StringBuilder(scan.next()));

        out.print("Name of the constructor\t");
        task.setConstructor(new StringBuilder(scan.next()));

        out.print("Name of the manager\t");
        task.setManager(new StringBuilder(scan.next()));

        out.print("Task");
        out.println();
        out.print("Address\t");
        task.setAddress(new StringBuilder(scan.next()));

        out.print("Floors\t");
        task.setFloor(scan.nextInt());

        out.print("Flats\t");
        task.setFlat(scan.nextInt());

        out.print("Cost\t");
        task.setCost(scan.nextFloat());

        task.toString();
    }
}
