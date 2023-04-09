import java.text.DecimalFormat;

public class CalcMethod {
	public static double GasGalin (int check, double numbers)
	{
	double newnum1 =0; 
	double newnum = 0; 
	if (check == 1)
	{
	newnum1 = 3.40 * numbers;
	DecimalFormat df = new DecimalFormat("#.##"); 
	String formatted = df.format(newnum1); 
	double newnum11 = Double.parseDouble(formatted); 
	return  newnum11;
	}
	else if (check ==2)
	{
	newnum1 = 3.60 * numbers;
	DecimalFormat df = new DecimalFormat("#.##"); 
	String formatted = df.format(newnum1); 
	double  newnum11 = Double.parseDouble(formatted); 
	return  newnum11;
	}
	else if (check ==3)
	{
	newnum1 = 3.90 * numbers;
	DecimalFormat df = new DecimalFormat("#.##"); 
	String formatted = df.format(newnum1); 
	double  newnum11 = Double.parseDouble(formatted); 
	return  newnum11;
	}
	return  newnum;
	}
	public static double moneygive (double tipin, double moneyin)
	{
	double newmoney = 0;
	newmoney = (tipin * moneyin) +moneyin;
	DecimalFormat df = new DecimalFormat("#.##"); 
	String formatted = df.format(newmoney); 
	double result = Double.parseDouble(formatted); 
	return result;
	}
}
