import java.util.Scanner;
 
public class H81 {
 
 public static void main(String[] args) {
 
 Scanner scanner = new Scanner (System.in);
 System.out.print("kuubi ruumala (1) \nristtahuka ruumala (2) \nVali tegevus: "); 
 String valik = scanner.next();
 System.out.print("Sisesta a: ");
 String a = scanner.next();
 System.out.print("Sisesta b: ");
 String b = scanner.next();
 System.out.print("Sisesta c: ");
 String c = scanner.next();
 
 double s;
 switch (Integer.parseInt(valik)) {
 case 1:
 s = Pindalad.roopkylikS(alus, korgus);
 System.out.printf("kuubi ruumala on %.2f ",s);
 break;
 case 2:
 s = Pindalad.ristkylikS(alus, korgus);
 System.out.printf("risttahuka ruumala on %.2f ",s);
 break;
 
 default:
 System.out.print("Valikust arusaamine ebaõnnestus!");
 break;
 }
 
 }
 
}