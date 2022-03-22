package Review.Class09;

public class MedicalSchool {
    public static void main(String[] args) {


        // I want to test accessiblity


     Doctor doc =   new Doctor("Asel", "Toba", "Surgen");

        doc.printInfo(); // public method
        doc.work();    // protected method


        System.out.println();
    }
}
