import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, qtde;
        char espec;
        double preco, valorConta;

        cod = teclado.nextInt();
        qtde = teclado.nextInt();

        if(cod == 1){
            valorConta = 4 * qtde;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }
        if(cod == 2){
            valorConta = 4.5 * qtde;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }
        if(cod == 3){
            valorConta = 5 * qtde;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }
        if(cod == 4){
            valorConta = 2 * qtde;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }
        if(cod == 5){
            valorConta = 1.5 * qtde;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }  
    }
}