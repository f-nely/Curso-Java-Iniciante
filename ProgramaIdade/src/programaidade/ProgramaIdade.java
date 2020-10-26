
package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int dataNascimento = scan.nextInt();
        int idade = 2020 - dataNascimento;
        
        if(idade >= 18) {
            System.out.println("Maior: ");
        } else {
            System.out.println("Meno: ");
        }
    }
    
}
