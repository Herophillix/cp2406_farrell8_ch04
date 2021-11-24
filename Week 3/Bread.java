public class Bread {
    public static final String MOTTO = "The staff of life";

    private String type = "Rye";
    private int calPerSlice = 0;

    public Bread()
    {

    }

    public Bread(String type, int calPerSlice)
    {
        this.type = type;
        this.calPerSlice = calPerSlice;
    }

    public String GetType()
    {
        return this.type;
    }

    public int GetCalPerSlice()
    {
        return this.calPerSlice;
    }
}
