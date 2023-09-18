// mirko kohava

import java.util.Scanner;
 
public class H4 {
 public static void main(String[] args) {
 
 Scanner scanner = new Scanner (System.in); 
 System.out.print("Sisesta text: ");
 String ete = scanner.nextLine();

 String text = ete;

 // split string from space
 String[] result = text.split(" ");

 int countsonad = ete.split("\\s").length;
 
 String[] tykeldus = ete.split(" ");

 System.out.printf("Siin on sinu text suurtes tahtedes: %s \n",ete.toUpperCase());
 System.out.printf("Siin on kui palju tahti su lauses on: %s \n",ete.length());
 System.out.printf("Siin on kui palju sonu su lauses on: %s \n",countsonad);
 System.out.printf("Lause esimene sõna on: %s",tykeldus[0]);

 }
}