import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.AccessException;
import java.util.Properties;
class Patient_test {
    private final StringBuilder firstName;
    private final StringBuilder lastName;
    private final StringBuilder midName;
    private final StringBuilder address;//
    private final long CardNum;
    private final long AccNum;

    Patient_test(StringBuilder firstName,StringBuilder lastName, StringBuilder midName, StringBuilder address,
                 long CardNum, long AccNum){
        this.firstName=firstName;this.lastName=lastName;
        this.midName=midName; this.address=address;
        this.CardNum=CardNum; this.AccNum=AccNum;
    }

    StringBuilder getFirstName(){return firstName;}
    StringBuilder getLastName(){return lastName;}
    StringBuilder getMidName(){return  midName;}
    StringBuilder getAddress(){return address;}
    long getCardNum(){return CardNum;}
    long getAccNum(){return AccNum;}

    @Override
    public String toString() {
        return  "Ім'я\t" + firstName.toString() + "\n" +
                "По-батькові\t" + midName.toString() + "\n" +
                "Прізвище\t" + lastName.toString() + "\n" +
                "Адреса\t" + address.toString() + "\n" +
                "Номер телефону\t" + CardNum + "\n" +
                "Номер картки\t" + AccNum + "\n";
    }

    public static class Builder{

        Properties properties = new Properties();
        {
            try {
                properties.load(new FileInputStream(new File("main.properties")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private StringBuilder firstName = new StringBuilder(properties.getProperty("none.str"));
        private StringBuilder lastName = new StringBuilder(properties.getProperty("none.str"));
        private StringBuilder midName = new StringBuilder(properties.getProperty("none.str"));
        private StringBuilder address = new StringBuilder(properties.getProperty("none.str"));
        private long CardNum = Long.parseLong(properties.getProperty("none.num"));
        private long AccNum = Long.parseLong(properties.getProperty("none.num"));


        Builder setFirstName(StringBuilder firstName){
            this.firstName = firstName;
            return this;
        }
        Builder setLastName(StringBuilder lastName){
            this.lastName = lastName;
            return this;
        }
        Builder setMidName(StringBuilder midName){
            this.midName = midName;
            return this;
        }
        Builder setAddress(StringBuilder address){
            this.address = address;
            return this;
        }
        Builder setCardNum(long CardNum){
            this.CardNum = CardNum;
            return this;
        }
        Builder setAccNum(long AccNum){
            this.AccNum = AccNum;
            return this;
        }
        public Patient_test build(){
            return new Patient_test(firstName, lastName, midName, address, CardNum, AccNum);
        }
    }
}
