public class Sandwich {
    private Bread bread = new Bread();
    private SandwichFilling filling = new SandwichFilling();

    public Sandwich()
    {

    }

    public Sandwich(Bread bread, SandwichFilling filling)
    {
        this.bread = bread;
        this.filling = filling;
    }

    public Bread GetBread()
    {
        return this.bread;
    }

    public SandwichFilling GetFilling()
    {
        return this.filling;
    }

    public int GetCalories()
    {
        return this.bread.GetCalPerSlice() * 2 + this.filling.GetCalPerServing();
    }
}
