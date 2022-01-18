import java.util.Locale;

public class BloodData {
    private String bloodType = "O";
    private String rhFactor = "+";

    public BloodData()
    {

    }

    public BloodData(String bloodType, String rhFactor)
    {
        SetBloodType(bloodType);
        SetRhFactor(rhFactor);
    }

    public void SetBloodType(String bloodType)
    {
        bloodType = bloodType.toUpperCase();
        switch (bloodType)
        {
            case "O":
            case "A":
            case "B":
            case "AB":
                this.bloodType = bloodType;
                break;
            default:
                break;
        }
    }

    public String GetBloodType()
    {
        return this.bloodType;
    }

    public void SetRhFactor(String rhFactor)
    {
        switch (rhFactor)
        {
            case "+":
            case "-":
                this.rhFactor = rhFactor;
                break;
            default:
                break;
        }
    }

    public String GetRhFactor()
    {
        return this.rhFactor;
    }
}