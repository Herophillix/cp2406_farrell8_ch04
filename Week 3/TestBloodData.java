public class TestBloodData {
    public static void main(String[] args) {
        BloodData test = new BloodData("A", "+");
        System.out.println(test.GetBloodType());
        System.out.println(test.GetRhFactor());
    }
}