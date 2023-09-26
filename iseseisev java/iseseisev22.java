public class iseseisev22 {
    
    public static void main(String[] args) {
        // Defineerime andmed kolmes eraldi massiivis
        String[] nimed = {"Kalle", "Mario", "Liisu", "Tanel", "Hille", "Imre"};
        int[] vanused = {17,37,20,19,18,22};
        String[] sugud = {"N", "M", "N", "M", "N", "M"};

        // Väljastame veergude nimed
        System.out.println("NIMI        VANUS       SUGU");

        // Väljastame andmed kolmes veerus
        for (int i = 0; i < nimed.length; i++) {
            System.out.printf("%-12s %-10d %-10s%n", nimed[i], vanused[i], sugud[i]);
        }
    }
}
