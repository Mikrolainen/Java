// mirko kohava

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
    int i = 0;
    do {
     int etre;
     int jeol;
     int poss = 0;
     
     i++;

     Scanner input = new Scanner (System.in); 
     System.out.print("Sisesta esimene number: ");
     etre = input.nextInt();
     System.out.print("Sisesta teine number: ");
     jeol = input.nextInt();
     System.out.println(i);

      if (jeol < poss) {
            System.out.println("Arvud peavad olema positiivsed!"); 
      } else {
            float jagam = (float) etre / (float) jeol;
            System.out.println("siin on su vastus: "+jagam);
            }
     }  while (i < 3);

 }
}

