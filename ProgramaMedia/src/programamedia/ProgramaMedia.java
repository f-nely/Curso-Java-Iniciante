
package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
        
        System.out.print("Informe a primeira nota: ");
        float n1 = scan.nextFloat();
        
        System.out.print("Informe a segunda nota: ");
        float n2 = scan.nextFloat();
        
        float media = (n1 + n2) / 2;
        
        System.out.println("Sua média foi: " + media);
        
        if(media > 9) {
            System.out.println("Parabéns");
        }
        
        
        scan.close();
    }
    
}
