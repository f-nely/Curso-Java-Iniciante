
package programavotacao;

import java.util.Scanner;

public class ProgramaVotacao {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o ano de nascimento: ");
        int anoNascimento = scan.nextInt();
        int idade = 2020 - anoNascimento;
        System.out.println(idade);
        
        if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("Voto facultativo: ");
        } else if (idade < 16) {
            System.out.println("Não pode votar: ");
        } else {
            System.out.println("Voto obrigatório: ");
        }
    }
    
}
