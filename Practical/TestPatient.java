public class TestPatient {
    public static void main(String[] args) {
        Patient currentPatient = new Patient(new BloodData("A", "+"), 0,23);
        BloodData currentBloodData = currentPatient.GetBloodData();

        System.out.println("Blood Data: " + currentBloodData.GetBloodType() + currentBloodData.GetRhFactor());
        System.out.println("ID: " + currentPatient.GetID());
        System.out.println("Age: " + currentPatient.GetAge());
    }
}