import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Sisesta number, et sisestamise loppetada vajuta [enter] tuhja tekstiga \n");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Sisestatud tekst ei ole number, palun proovi uuesti");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("Sisestus oli tuhi, lopetame numbrite sisestuse");
            return;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Numbrid kokku: " + sum);
        System.out.println("Numbrite keskmine: " + average);

        String desktopPath = System.getProperty("user.home") + "/Desktop/";
        String filePath = desktopPath + "results.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("List of Numbers:\n");
            for (int num : numbers) {
                writer.write(num + "\n");
            }
            writer.write("kokku: " + sum + "\n");
            writer.write("keskmine: " + average + "\n");
            System.out.println("Sisestatud numbrid valjastati '" + filePath + "'");
        } catch (IOException e) {
            System.err.println("Faili valjastamisel tuli error: " + e.getMessage());
        }
    }
}