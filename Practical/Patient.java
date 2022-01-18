public class Patient {
    private BloodData bloodData = new BloodData();
    private int id = 0;
    private int age = 0;

    public Patient()
    {
    }

    public Patient(BloodData bloodData, int id, int age)
    {
        this.bloodData = bloodData;
        this.id = id;
        this.age = age;
    }

    public BloodData GetBloodData()
    {
        return this.bloodData;
    }

    public int GetID()
    {
        return this.id;
    }

    public int GetAge()
    {
        return this.age;
    }

}
