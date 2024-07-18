import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o valor número 1: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o valor número 2: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println("O primero parâmetro deverá ser menor que o segundo parâmetro");
        }
        
        terminal.close();
    }
    
    static void contar(int parametroUm, int parametroDis) throws ParametrosInvalidosExceptions {

        int contagem = parametroDis - parametroUm;

        if (contagem <= 0) 
            throw new ParametrosInvalidosExceptions();

        for(int i = contagem; i < parametroDis; i++ ){
            System.out.println("A contagem entre os paramentros um e dois: " + i);
        }     
    
    }
}
