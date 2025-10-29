package v0;

import java.util.Vector;

public class Customer
{
	private String			_name;
	private Vector<Rental>	_rentals	= new Vector<Rental>();

	public Customer(String _name)
	{
		this._name = _name;
	}

	public void addRental(Rental arg)
	{
		_rentals.addElement(arg);
	}

	public String getName()
	{
		return _name;
	}

	public String statement()
	{
        // header
		String result = "Rental Record for " + getName() + "\n";

		// add footer lines
		result += "Amount owed is " + getTotalAmount() + "\n";
		result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
		return result;
	}
    public int getTotalFrequentRenterPoints()
    {
        int frequentRenterPoints = 0;
        for (Rental each: _rentals)
            frequentRenterPoints += each.getFrequentRentalPoints();
        return frequentRenterPoints;
    }

    public getTotalAmount()
    {
        double totalAmount = 0;
        for (Rental each: _rentals)
            totalAmount += each.getAmount();
        return totalAmount;
    }
}
