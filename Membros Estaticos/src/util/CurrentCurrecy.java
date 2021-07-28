package util;

public class CurrentCurrecy {
	public static double IDF = 0.06;
	
	
	public static double converter (double amount, double dolarPrice) {
		return amount * dolarPrice * (IDF + 1.0);
	}
}
