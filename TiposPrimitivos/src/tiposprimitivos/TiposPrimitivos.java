
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Nely
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        String nome = scan.nextLine();
        
        System.out.println("Informe a nota: ");
        float nota = scan.nextFloat();
        
        System.out.format("A nota de %s é %.1f: \n",nome, nota);
    }
    
}
