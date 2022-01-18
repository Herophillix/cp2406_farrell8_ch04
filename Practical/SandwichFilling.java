public class SandwichFilling {
    private String type = "Egg Salad";
    private int calPerServing = 0;

    public SandwichFilling()
    {

    }

    public SandwichFilling(String type, int calPerSlice)
    {
        this.type = type;
        this.calPerServing = calPerSlice;
    }

    public String GetType()
    {
        return this.type;
    }

    public int GetCalPerServing()
    {
        return this.calPerServing;
    }
}
