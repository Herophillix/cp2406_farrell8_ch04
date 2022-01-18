public class TestFitnessTracker2 {
    public static void main(String[] args) {
        FitnessTracker2 trackerTwo = new FitnessTracker2("Running", 2, "January 3");
        System.out.println("Activity: " + trackerTwo.GetActivity());
        System.out.println("Minute: " + trackerTwo.GetMinuteParticipated());
        System.out.println("Date: " + trackerTwo.GetDate());

    }
}