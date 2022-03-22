package Review.Class09;

import javax.print.Doc;

public class Hospital {
    public static void main(String[] args) {

        Doctor doc = new Doctor("Sophia", "Sidiqi", "Surgen");

        Doctor doc1 = new Doctor("James", "Bond");
        doc1.speciality="Dermitalogist";

        System.out.println(" Changing value");
        // static variables should be access in static way -> by class name where varavle is define

        Doctor.hospital=" Inova ";
        doc.printInfo();
        doc1.printInfo();

        System.out.println(" --------- ");



    }
}

