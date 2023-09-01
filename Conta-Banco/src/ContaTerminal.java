import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         
        System.out.println("Por favor digite seu número da conta: ");
        int numero = scanner.nextInt();    

        System.out.println("Digite a sua agência");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor do seu saldo: ");
        double saldo = scanner.nextDouble();

         System.out.println("Óla " + nomeCliente + ",obrigado por criar uma conta em nosso banco,\nsua agência é "  + agencia +
",\nconta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }       
}
