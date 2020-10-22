
package operadorternario;

/**
 *
 * @author f-nely
 */
public class OperadorTernario {

    public static void main(String[] args) {
       int n1 = 4;
       int n2 = 8;
       int maior = n1>n2 ? n1:n2;
       System.out.println(maior);
       
       int age = 18; 
       String r = age >= 18 ? "Maior de idade" : "Menor de idade";
       System.out.println(r);
        
       String sexo = "F";
       String resultado = "F".equals(sexo) ? "Female" : "Male";
       System.out.println(resultado);
    }
    
}
