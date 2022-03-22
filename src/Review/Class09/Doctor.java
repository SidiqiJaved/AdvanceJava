package Review.Class09;

public class Doctor {

    // instance variable


    String firstName, lastName, speciality;

    static String hospital = "George Washington";

    //static methods can access only static variables
    static void work() {
        System.out.println("All doctors work at " + hospital);
    }

    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;
    }


    void work1() {
        System.out.println("All doctors work at " + hospital);
    }

    //static methods can be created with static keyword
    //we cannot call instance variables with a static methods

    //    static void printInfo(){
//        System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality);
//    }
    //instance methods can access non-static and static variables
    void printInfo() {
        System.out.println("Doctor " + firstName + " " + lastName + " is a " + speciality);
    }
}