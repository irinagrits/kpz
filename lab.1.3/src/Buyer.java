public class Buyer {
        private StringBuilder firstName;
        private StringBuilder lastName;
        private StringBuilder midName;
        private StringBuilder address;
        private long CardNum;
        private long AccNum;

        Buyer(){
            firstName = lastName = midName = address = new StringBuilder("none");
            CardNum = AccNum = 0;
        }

    Buyer(StringBuilder firstName, StringBuilder lastName, StringBuilder midName, StringBuilder address, long CardNum, long AccNum){
            this.firstName = firstName;
            this.lastName = lastName;
            this.midName = midName;
            this.address = address;
            this.CardNum = CardNum;
            this.AccNum = AccNum;
        }

        StringBuilder getFirstName(){return firstName;}
        StringBuilder getLastName(){return lastName;}
        StringBuilder getMidName(){return midName;}
        StringBuilder getAddress(){return address;}
        long getPhoneNum(){return CardNum;}
        long getNumCard(){return AccNum;}

        void setFirstName(StringBuilder firstName){this.firstName = firstName;}
        void setLastName(StringBuilder lastName){this.lastName = lastName;}
        void setMidName(StringBuilder midName){this.midName = midName;}
        void setAddress(StringBuilder address){this.address = address;}
        void setPhoneNum(long phoneNum){this.CardNum = CardNum;}
        void setNumCard(long numCard){this.AccNum = AccNum;}

        @Override
        public String toString() {
            return
                    "Ім'я\t" + firstName.toString() + "\n" +
                    "По-батькові\t" + midName.toString() + "\n" +
                    "Прізвище\t" + lastName.toString() + "\n" +
                    "Адреса\t" + address.toString() + "\n" +
                    "Номер кредитної картки\t" + CardNum + "\n" +
                    "Номер банківського рахунку\t" + AccNum + "\n";
        }
    }