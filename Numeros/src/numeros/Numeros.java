package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = scan.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resp = scan.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
    }

}
