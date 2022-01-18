public class TestBread {
    public static void main(String[] args) {
        Bread breadOne = new Bread("White", 200);
        Bread breadTwo = new Bread("Sourdough", 144);
        Bread breadThree = new Bread("Rye", 123);

        PrintBread(breadOne);
        PrintBread(breadTwo);
        PrintBread(breadThree);
    }

    public static void PrintBread(Bread bread)
    {
        System.out.println("Bread Information");
        System.out.println("Type: " + bread.GetType());
        System.out.println("Calories Per Slice: " + bread.GetCalPerSlice() + " cal");
        System.out.println("Motto: " + Bread.MOTTO);
        System.out.println();
    }
}