package HTML82;

import java.util.Scanner;

public class HTML82 {
    
    public static void main(String[] args) {
        String nimi, toug;
        int vanus, input;
        Scanner scan = new Scanner(System.in);
        kuss kass2 = new kuss();

        System.out.println("tutvustus 1");
        System.out.println("enda lakkumine 2");
        System.out.println("magamine 3");
        System.out.println("soomine 4");
        System.out.print("mida soovite et kass teeks? ");

        input = scan.nextInt();
        switch(input){
            case 1:
                System.out.print("sisesta nimi: ");
                nimi = scan.next();

                System.out.print("sisesta vanus: ");
                vanus = scan.nextInt();

                System.out.print("sisesta toug: ");
                toug = scan.next();

                kiss kass = new kiss(nimi, vanus, toug);
                kass.meetod();
                scan.close();
                break;
            case 2:
                kass2.lakub();
                break;
            case 3:
                kass2.magab();
                break;
            case 4:
                kass2.soob();
                break;
            default:
                System.out.println("vale sisend, headaega");
                break;
        }
    }

}
