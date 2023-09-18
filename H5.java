// mirko kohava

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
    do {
     int etre;
     int jeol;
     int poss = 0;
     int i = 0;
     i++;

     Scanner input = new Scanner (System.in); 
     System.out.print("Sisesta esimene number: ");
     etre = input.nextInt();
     System.out.print("Sisesta teine number: ");
     jeol = input.nextInt();
     input.close();

      if (jeol < poss) 
            {
            System.out.println("Arvud peavad olema positiivsed!"); 
            }
      else 
            {
            float jagam = (float) etre / (float) jeol;
            System.out.println("siin on su vastus: "+jagam);
            }
         }  while (i < 0);

 }
}

