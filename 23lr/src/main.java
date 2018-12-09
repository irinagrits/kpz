import java.util.Scanner;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class main {
    static Scanner in = new Scanner(System.in);
    private static Logger logger = Logger.getLogger(Patient_test.class);

    static StringBuilder firstName;
    static StringBuilder lastName;
    static StringBuilder midName;
    static StringBuilder address;//
    static long CardNum;
    static long AccNum;

    private static void inputData(){
        var out = System.out;

        out.print("Enter first name\t");
        firstName = new StringBuilder(in.nextLine());

        out.print("Enter middle name\t");
        midName = new StringBuilder(in.nextLine());

        out.print("Enter last name\t");
        lastName = new StringBuilder(in.nextLine());

        out.print("Enter address\t");
        address = new StringBuilder(in.nextLine());
        address.append(in.nextLine());

        out.print("Enter card number\t");
        CardNum = Long.parseLong(in.next());

        out.print("Enter bank account number\t");
        AccNum = Long.parseLong(in.next());

    }
    private static void checkNullData(){
        if(CardNum<=0 || AccNum<=0) {throw new NumberFormatException();}
        if(firstName==null || lastName==null || midName==null || address==null){
            throw new IllegalArgumentException();}
    }
    public static void main(String[] args){
        logger.setPriority(Priority.INFO);
        var out = System.out;
        try{
            inputData();
            checkNullData();
        }catch(NumberFormatException num){
            logger.error(num.getMessage()+"\n"+num.getCause());
            out.print("Fill data one more time? y/n\t");
            if(in.next().charAt(0)=='y') {
                inputData();
                checkNullData();
            }
            else System.exit(0);
        }catch (IllegalArgumentException ex){
            out.println(ex.getMessage());
            out.println(ex.getCause());
            out.print("Fill data one more time? y/n\t");
            if(in.next().charAt(0)=='y') {
                inputData();
                checkNullData();
            }
            else System.exit(0);
        }catch (Exception ex){
            out.println(ex.getMessage());
            out.println(ex.getCause());
            out.print("Fill data one more time? y/n\t");
            if(in.next().charAt(0)=='y') {
                inputData();
                checkNullData();
            }
            else System.exit(0);
        }
        var p1 = new Patient_test(firstName, lastName, midName, address, CardNum, AccNum);
        out.print(p1.toString());
    }
}
