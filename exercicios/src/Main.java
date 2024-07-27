
public class Main {
    public static void main(String[] args) {
        Banco conta = new Banco(2000.00f);

        conta.CriarConta();
        int opcao = 0;
        while(opcao != 5){
            System.out.println("1 - Depositar \n2 - Sacar \n3 - Criar nova conta \n4 - Ver dados \n5 - Sair");
            opcao = conta.leitor.nextInt();
            switch (opcao){
                case 1:
                    conta.Depositar();
                    break;
                case 2:
                    conta.Sacar();
                    break;
                case 3:
                    conta.CriarConta();
                    break;
                case 4:
                    conta.VerDados();
                    break;
                case 5:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }
}