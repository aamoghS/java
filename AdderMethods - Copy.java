import java.util.ArrayList;

public class AdderMethods {

	private ArrayList<String> list;

	public AdderMethods() {
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void addString(String str) {
        list.add(str);
    }
	 

		public double number;
  
    public void setNumber(double newNumber) {
        number = newNumber;
    }

    public double getNumber() {
        return number;
    }

    public void addToNumber(double valueToAdd) {
        number += valueToAdd;
    }
}
