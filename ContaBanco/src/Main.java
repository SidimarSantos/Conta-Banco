import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Insira o numero da conta: ");
        conta.numero = scan.nextInt();
        System.out.println("Insira a agencia: ");
        conta.agencia = scan.nextLine();
        System.out.println("Insira o nome: ");
        conta.nome = scan.nextLine();
        System.out.println("Insira o saldo: ");
        conta.saldo = scan.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d com saldo %.2f", conta.nome, conta.agencia, conta.numero, conta.saldo);
    }
}