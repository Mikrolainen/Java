package HTML81;
public class ruum {

	public static double silinderR(String raadius, String korgus) {
		double r = Double.parseDouble(raadius);
		double h = Double.parseDouble(korgus);
		return Math.PI * r * r * h;
	}

	public static double risttahukasR(String pikkus, String laius, String korgus) {
		double a = Double.parseDouble(pikkus);
		double b = Double.parseDouble(laius);
		double h = Double.parseDouble(korgus);
		return a * b * h;
	}

	public static double koonusR(String raadius, String korgus) {
		double r = Double.parseDouble(raadius);
		double h = Double.parseDouble(korgus);
		return Math.PI * r * r * h / 3;
	}
}