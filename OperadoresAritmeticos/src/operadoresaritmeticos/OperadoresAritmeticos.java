
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author f-nely
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        double n1 = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        double n2 = scan.nextDouble();
        
        double divisao = n1 / n2;
        double restoDivisao = n1 % n2;
        double n3 = 64;
        double raizQuadrada = Math.sqrt(n3);
        double potencia = Math.pow(n1, 2);
        
        double valorAbsoluto = Math.abs(-10);
        double arredondaParaBaixo = Math.floor(3.9);
        double arredondaParaCima = Math.ceil(4.2);
        
        System.out.println("Divisão: " + Math.round(divisao));
        System.out.println("Resto da divisão: " + restoDivisao);
        System.out.println("Raiz quadrada de " + n3 + " é " + raizQuadrada);
        System.out.println("A potência: " + potencia);
        System.out.println("Valor absoluto: " + valorAbsoluto);
        System.out.println("Arredondamento para baixo: " + arredondaParaBaixo);
        System.out.println("Arredondamento para cima: " + arredondaParaCima);
    }
    
}
