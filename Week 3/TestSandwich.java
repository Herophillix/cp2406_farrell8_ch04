public class TestSandwich {
    public static void main(String[] args) {
        Bread breadOne = new Bread("White", 200);
        Bread breadTwo = new Bread("Sourdough", 144);
        Bread breadThree = new Bread("Rye", 123);

        SandwichFilling fillingOne = new SandwichFilling("Egg Salad", 400);
        SandwichFilling fillingTwo = new SandwichFilling("Chicken", 744);
        SandwichFilling fillingThree = new SandwichFilling("Beans", 335);

        Sandwich sandwichOne = new Sandwich(breadOne, fillingOne);
        Sandwich sandwichTwo = new Sandwich(breadTwo, fillingTwo);
        Sandwich sandwichThree = new Sandwich(breadThree, fillingThree);

        PrintSandwich(sandwichOne);
        PrintSandwich(sandwichTwo);
        PrintSandwich(sandwichThree);
    }

    public static void PrintSandwich(Sandwich sandwich)
    {
        System.out.println("Sandwich Information");
        System.out.println("Bread: " + sandwich.GetBread().GetType());
        System.out.println("Filling: " + sandwich.GetFilling().GetType());
        System.out.println("Calories: " + sandwich.GetCalories() + " cal");
        System.out.println();
    }
}