import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        var Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu número: ");
        var numero = Scanner.nextInt();
        System.out.print("Digite sua agência: ");
        var agencia = Scanner.next();
        System.out.print("Digite seu nome: ");
        var nomeCliente = Scanner.next();
        System.out.print("Digite seu saldo: ");
        var saldo = Scanner.nextDouble();

        System.out.println("Conta criada, "+ nomeCliente +" segue seus dados abaixo, obrigado");
        System.out.println("=============================================");
        System.out.println("Seus dados: ");
        System.out.println("Número: "+ numero);
        System.out.println("Agência: "+ agencia);
        System.out.println("Nome: "+ nomeCliente.toUpperCase());
        System.out.println("Saldo: "+ saldo);
        System.out.println("=============================================");

        Scanner.close();

    }
}