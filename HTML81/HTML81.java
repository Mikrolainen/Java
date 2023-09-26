package HTML81;
import java.util.Scanner;

public class HTML81{

	public static void main(String[] args) {
        String valik, alus, korgus;
		String laius = "";
		double s;
		Scanner scan = new Scanner(System.in);

		System.out.println("Rööpküliku pindala 1");
		System.out.println("Ristküliku pindala 2");
		System.out.println("Kolmnurga pindala 3");
		System.out.println("Silindri ruumala 4");
		System.out.println("Risttahuka ruumala 5");
		System.out.println("Koonuse ruumala 6");
		System.out.print("Vali tegevus: "); 
		valik = scan.next();
		
		System.out.print("Sisesta alus: ");
		alus = scan.next();

		System.out.print("Sisesta kõrgus: ");
		korgus = scan.next();

        scan.close();
		
		switch (Integer.parseInt(valik)) {
			case 1:
				s = pind.roopkylikS(alus, korgus);
				System.out.printf("Rööpküliku pindala on %.2f ",s);
				break;

			case 2:
				s = pind.ristkylikS(alus, korgus);
				System.out.printf("Ristküliku pindala on %.2f ",s);
				break;

			case 3:
				s = pind.kolmnurkS(alus, korgus);
				System.out.printf("Kolmnurga pindala on %.2f ",s);
				break;

			case 4:
				s = ruum.silinderR(alus, korgus);
				System.out.printf("Silindri ruumala on %.2f ",s);
				break;

			case 5:
				s = ruum.risttahukasR(alus, korgus, laius);
				System.out.print("Sisesta laius: ");
            	laius = scan.next();

				System.out.printf("Risttahuka ruumala on %.2f ",s);
				break;

			case 6: 
				s = ruum.koonusR(alus, korgus);
				System.out.printf("Koonuse ruumala on %.2f ",s);
				break;

			default:
				System.out.print("Valik ei sobi!");
				break;

		}

	}

}
