package HW2;

public class Person {
    private String secondName;
    private String firstName;
    private String thirdName;
    private String birthDate;
    private int phoneNumber;
    private char sex;

    // private Person(String secondName, String firstName, String thirdName, String birthDate, int phoneNumber, char sex){
    //     this.secondName = secondName;
    //     this.firstName = firstName;
    //     this.thirdName = thirdName;
    //     this.birthDate = birthDate;
    //     this.phoneNumber = phoneNumber;
    //     this.sex = sex;
    // }

    public Person (){}

    public void setFirstName(String firstName){
        if (firstName.isEmpty())
            this.firstName = "null";
        else
            this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName){
        if (secondName.isEmpty())
            this.secondName = "null";
        else
            this.secondName = secondName;
    }
    public String getSecondName() {
        return secondName;
    }

    public void setThirdName(String thirdName){
        if (thirdName.isEmpty())
            this.thirdName = "null";
        else
            this.thirdName = thirdName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setBirthDate(String birthDate){
        if (birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            this.birthDate = birthDate;
        }
        else {
            System.out.println("Incorrect format");
            this.birthDate = "null";
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setPhoneNumber(int phoneNumber){
        if (phoneNumber < 100000000 || phoneNumber > 999999999){
            System.out.println("Phone number should have 9 digits in it");
            this.phoneNumber = 0;
        }
        else
            this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setSex(char sex){
        if (sex != 'm' && sex != 'f'){
            System.out.println("There are only 2 genders");
            this.sex = 'n';
        }
        else
            this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public String toString() {
        return this.secondName + " " + this.secondName + " " + this.thirdName + " " + this.birthDate + " +79"+ this.phoneNumber + " " + this.sex + "\n";
    }

}
