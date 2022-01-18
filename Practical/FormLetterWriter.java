public class FormLetterWriter {
    public static void main(String[] args) {
        displaySalutation("Makarios");
        displaySalutation("James", "Makarios");
    }

    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms " + lastName);
        System.out.println("Thank you for your order.");
    }

    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your order.");
    }
}