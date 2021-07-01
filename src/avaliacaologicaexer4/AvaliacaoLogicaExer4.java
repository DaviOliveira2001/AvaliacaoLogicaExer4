
package avaliacaologicaexer4;

/**
 * @author odavi
 */
public class AvaliacaoLogicaExer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, anos;
        anos = 0;
        a = 5000000;
        b = 7000000;
        while(b >= a){
            a = a * 3;
            b = b * 2;
            anos++;
        }//fim do loop
        System.out.println("O país A levou "+anos+" anos "
                + "para ultrapassar o país B.");
        
        System.out.println("O país A tem "+a+" habitantes.");
        System.out.println("O país B tem "+b+" habitantes.");
    }
    
}
