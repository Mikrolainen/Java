import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class iseseisev18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arvud = new ArrayList<>();

        System.out.println("Sisesta arvud (tühjendamiseks vajuta Enter):");

        while (true) {
            String sisend = scanner.nextLine();

            if (sisend.isEmpty()) {
                break; // Kasutaja sisestas tühja rea, lõpetame sisestamise
            }

            try {
                int arv = Integer.parseInt(sisend);
                arvud.add(arv);
            } catch (NumberFormatException e) {
                System.out.println("Vigane sisend. Palun sisesta uuesti.");
            }
        }

        List<Integer> paaritudArvud = leiaPaaritudArvud(arvud);

        if (paaritudArvud.isEmpty()) {
            System.out.println("Ühtegi paaritud arvu ei leitud.");
        } else {
            System.out.print("Paaritud arvud: ");
            for (int arv : paaritudArvud) {
                System.out.print(arv + " ");
            }
        }
    }

    public static List<Integer> leiaPaaritudArvud(List<Integer> arvud) {
        List<Integer> paaritud = new ArrayList<>();

        for (int arv : arvud) {
            if (arv % 2 != 0) {
                paaritud.add(arv);
            }
        }

        return paaritud;
    }
}
