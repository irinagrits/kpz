import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args){

        var in = new Scanner(System.in);
        var out = System.out;

        try{
            out.print("Enter first name\t");
            StringBuilder firstName = new StringBuilder(in.next());
            out.print("Enter middle name\t");
            StringBuilder midName = new StringBuilder(in.next());
            out.print("Enter last name\t");
            StringBuilder lastName = new StringBuilder(in.next());
            out.print("Enter address\t");
            StringBuilder address = new StringBuilder(in.next());
            out.print("Enter credit card number\t");
            long CardNum = Long.parseLong(in.next());
            out.print("Enter bank account number\t");
            long AccNum = Long.parseLong(in.next());

            Buyer p1 = new Buyer(firstName, lastName, midName, address, CardNum, AccNum);
            out.print(p1.toString());
        }

        catch (Exception ex){
            out.print(ex.toString());
        }

        /*var sb = new StringBuilder();

        try{
            out.print("Enter first name\t");
            p1.setFirstName(sb.append(in.next()));
            out.print("Enter middle name\t");
            p1.setMidName(sb.append(in.next()));
            out.print("Enter last name\t");
            p1.setLastName(sb.append(in.next()));
            out.print("Enter address\t");
            p1.setAddress(sb.append(in.next()));
            out.print("Enter credit card number\t");
            p1.setCardNum(in.nextLong());
            out.print("Enter bank account number\t");
            p1.setAccNum(in.nextLong());
        }

        catch (Exception ex){
            out.print(ex.toString());
            out.print("\n\n");
            out.print(p1.toString());
        }*/
    }
}