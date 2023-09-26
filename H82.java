import java.util.Scanner;

class Ese {
    private String nimi, omadus1, omadus2, omadus3, tegevus1, tegevus2, tegevus3;

    public Ese(String nimi, String omadus1, String omadus2, String omadus3, String tegevus1, String tegevus2, String tegevus3) {
        this.nimi = nimi;
        this.omadus1 = omadus1;
        this.omadus2 = omadus2;
        this.omadus3 = omadus3;
        this.tegevus1 = tegevus1;
        this.tegevus2 = tegevus2;
        this.tegevus3 = tegevus3;
    }

    public void kirjelda() {
        System.out.println("See " + nimi + " omab omadusi: " + omadus1 + ", " + omadus2 + ", " + omadus3 + ".");
        System.out.println("Saab teha tegevusi: " + tegevus1 + ", " + tegevus2 + ", " + tegevus3 + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta eseme nimi: ");
        String nimi = scanner.nextLine();
        System.out.print("Sisesta " + nimi + " omadus 1: ");
        String omadus1 = scanner.nextLine();
        System.out.print("Sisesta " + nimi + " omadus 2: ");
        String omadus2 = scanner.nextLine();
        System.out.print("Sisesta " + nimi + " omadus 3: ");
        String omadus3 = scanner.nextLine();
        System.out.print("Sisesta " + nimi + " tegevus 1: ");
        String tegevus1 = scanner.nextLine();
        System.out.print("Sisesta " + nimi + " tegevus 2: ");
        String tegevus2 = scanner.nextLine();
        System.out.print("Sisesta " + nimi + " tegevus 3: ");
        String tegevus3 = scanner.nextLine();

        Ese ese = new Ese(nimi, omadus1, omadus2, omadus3, tegevus1, tegevus2, tegevus3);
        ese.kirjelda();

        scanner.close();
    }
}
