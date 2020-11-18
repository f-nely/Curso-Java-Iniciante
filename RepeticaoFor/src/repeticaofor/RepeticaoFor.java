
package repeticaofor;


public class RepeticaoFor {

    public static void main(String[] args) {
        int number = 5;
        for (int cc = 0; cc <= 10; cc++) {
            int t = number * cc;
            System.out.println(String.format("%d x %d = %d", number, cc, t));
        }
    }
    
}
