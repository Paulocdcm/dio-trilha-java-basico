import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]args)throws Exception{
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Ok "+ nome + " vamos cadastrar sua conta!");

        System.out.println("Por favor, digite o numero da conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.next();
        
        System.out.println("Saldo atual: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, "+ nome + " agradecemos por criar uma conta em nosso banco!");
        System.out.println("Aqui estão seus dados já cadastrados: ");
        System.out.println("Agencia: "+ agencia);
        System.out.println("Numero da conta: "+ numero);
        System.out.println("Saldo disponível para saque: "+ saldo);



    }   
    
}
