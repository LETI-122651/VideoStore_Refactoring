package v8;

public class NewReleasePrice extends Price
{
    @Override
    public double getRentalAmount(int duration)
    {
        double result = 0;

        result += duration * 3;

        return result;
    }

    @Override
    public int getFrequentRentalPoints(int duration)
    {
        return duration > 1 ? 2 : 1;
    }
}