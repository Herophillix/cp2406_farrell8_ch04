public class TestFitnessTracker {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();
        System.out.println("Activity: " + tracker.GetActivity());
        System.out.println("Minute: " + tracker.GetMinuteParticipated());
        System.out.println("Date: " + tracker.GetDate());

        FitnessTracker trackerTwo = new FitnessTracker("Running", 2, "January 3");
        System.out.println("Activity: " + trackerTwo.GetActivity());
        System.out.println("Minute: " + trackerTwo.GetMinuteParticipated());
        System.out.println("Date: " + trackerTwo.GetDate());

    }
}