public class iseseisev10 {
    public static void main(String[] args) {

        int arvv = 1; 
        int ridaArv = 66 / 5; // Arv ridu

        for (int i = 0; i < ridaArv; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arvv + j);
            }
            arvv += 5; // Suurenda arvu viie võrra

            System.out.println(); //valjastab arvud
        }
    }
}
