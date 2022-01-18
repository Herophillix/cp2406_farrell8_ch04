public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling fillingOne = new SandwichFilling("Egg Salad", 400);
        SandwichFilling fillingTwo = new SandwichFilling("Chicken", 744);
        SandwichFilling fillingThree = new SandwichFilling("Beans", 335);

        PrintSandwichFilling(fillingOne);
        PrintSandwichFilling(fillingTwo);
        PrintSandwichFilling(fillingThree);
    }

    public static void PrintSandwichFilling(SandwichFilling bread)
    {
        System.out.println("Sandwich Filling Information");
        System.out.println("Type: " + bread.GetType());
        System.out.println("Calories Per Serving: " + bread.GetCalPerServing() + " cal");
        System.out.println();
    }
}