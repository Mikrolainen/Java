import java.util.Scanner;

class Ruumalad {
    // Klassimeetod, mis arvutab kuubi ruumala
    public static double arvutaKuubiRuumala(double kylg) {
        return Math.pow(kylg, 3);
    }

    // Klassimeetod, mis arvutab risttahuka ruumala
    public static double arvutaRisttahukaRuumala(double pikkus, double laius, double korgus) {
        return pikkus * laius * korgus;
    }

    // Klassimeetod, mis arvutab silindri ruumala
    public static double arvutaSilindriRuumala(double raadius, double korgus) {
        return Math.PI * Math.pow(raadius, 2) * korgus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vali, millist ruumala soovid arvutada:");  //kusib inimeselt millist ruumala soovib arvutada
        System.out.println("1. Kuup");
        System.out.println("2. Risttahukas");
        System.out.println("3. Silinder");
        int valik = scanner.nextInt();

        switch (valik) {
            case 1: //kusib vajaliku info kuubi arvutamiseks
                System.out.print("Sisesta kuubi kulje pikkus: ");
                double kylg = scanner.nextDouble();
                double kuubiRuumala = arvutaKuubiRuumala(kylg);
                System.out.println("Kuubi ruumala on: " + kuubiRuumala);
                break;
            case 2:        //kusib vajaliku info risttahuka arvutamiseks
                System.out.print("Sisesta risttahuka pikkus: ");
                double pikkus = scanner.nextDouble();
                System.out.print("Sisesta risttahuka laius: ");
                double laius = scanner.nextDouble();
                System.out.print("Sisesta risttahuka korgus: ");
                double korgus = scanner.nextDouble();
                double risttahukaRuumala = arvutaRisttahukaRuumala(pikkus, laius, korgus);
                System.out.println("Risttahuka ruumala on: " + risttahukaRuumala);
                break;
            case 3: //kusib vajaliku info silindri arvutamiseks
                System.out.print("Sisesta silindri raadius: ");
                double raadius = scanner.nextDouble();
                System.out.print("Sisesta silindri korgus: ");
                double silindriKorgus = scanner.nextDouble();
                double silindriRuumala = arvutaSilindriRuumala(raadius, silindriKorgus);
                System.out.println("Silindri ruumala on: " + silindriRuumala);
                break;
            default: // saadab inimese metsa kui valik ei ole 1,2 voi 3
                System.out.println("Vale valik. Vali 1, 2 voi 3.");
                break;
        }

        scanner.close();
    }
}
