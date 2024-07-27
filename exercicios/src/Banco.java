import java.util.Scanner;
import java.util.Random;

public class Banco {
    String nome;
    String cpf;
    int idade;
    String numero_conta;
    float saldo;

    Scanner leitor = new Scanner(System.in);
    Random random = new Random();

    Banco(float saldo){
        this.saldo = saldo;
    }

    void CriarConta(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Insira o seu cpf: ");
        cpf = leitor.nextLine();
        System.out.println("Insira sua idade: ");
        idade = leitor.nextInt();
        GerarConta();
        System.out.println("Conta criada com sucesso!!!");
    }

    void VerDados(){
        System.out.println("Nome: "+nome+"\nCPF: "+cpf+"\nIdade: "+idade+"\nConta: "+numero_conta+"\nSaldo: "+saldo);
    }

    void Depositar(){
        System.out.println("Insira o valor do deposito: ");
        float deposito = leitor.nextFloat();
        saldo = saldo + deposito;
        System.out.println("Valor depositado!!!");
        System.out.println("Saldo atual: "+saldo);
    }

    void Sacar(){
        System.out.println("Insira o valor a sacar: ");
        float saque = leitor.nextFloat();
        if (saque <= saldo && saque > 0){
            saldo -= saque;
            System.out.println("Valor sacado!");
            System.out.println("Saldo atual: "+saldo);
        } else if (saque > saldo){
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    void GerarConta(){
        int comprimento = 10;

        //criar o numero da conta de forma eficiente
        StringBuilder criarstring = new StringBuilder(comprimento);

        for (int i = 0; i < comprimento; i++){

            // Gera um número aleatório entre 0 e 9
            int numeroAleatorio = random.nextInt(10);
            // Adiciona o número aleatório à string
            criarstring.append(numeroAleatorio);
        }
        numero_conta = criarstring.toString();
    }
}
