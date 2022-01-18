public class FitnessTracker {
    public String activity = "running";
    public int minuteParticipated = 0;
    public String date = "January 1";

    public FitnessTracker() {

    }

    public FitnessTracker(String activity, int minuteParticipated, String date) {
        this.activity = activity;
        this.minuteParticipated = minuteParticipated;
        this.date = date;
    }

    public String GetActivity() {
        return activity;
    }

    public int GetMinuteParticipated() {
        return minuteParticipated;
    }

    public String GetDate() {
        return date;
    }
}