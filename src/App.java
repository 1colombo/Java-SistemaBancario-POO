
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner =  new Scanner(System.in);

        System.out.print("\nInsira o valor inicial: ");
        double valorInicial = scanner.nextDouble();
        var account = new ContaBancaria(valorInicial);
        
        System.out.println("\n=====Menu da Conta Bancária=====");
            System.out.println("0. Mostrar o Menu Novamente");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consultar Limite");
            System.out.println("3. Depositar Dinheiro");
            System.out.println("4. Sacar Dinheiro");
            System.out.println("5. Pagar Boleto");
            System.out.println("6. Verificar se está usando cheque especial");
            System.out.println("7. Sair");
        System.out.println("===============================");

        for(;;){
            System.out.print("-> Escolha uma opção: ");
            int op = scanner.nextInt();

            switch(op){
                case 0 -> {
                    System.out.println("\n=====Menu da Conta Bancária=====");
                        System.out.println("0. Mostrar o Menu Novamente");
                        System.out.println("1. Consultar Saldo");
                        System.out.println("2. Consultar Limite");
                        System.out.println("3. Depositar Dinheiro");
                        System.out.println("4. Sacar Dinheiro");
                        System.out.println("5. Pagar Boleto");
                        System.out.println("6. Verificar se está usando cheque especial");
                        System.out.println("7. Sair");
                    System.out.println("===============================");
                }
                case 1 -> System.out.println("Saldo da conta: R$" + account.getSaldo() + "\n");
                case 2 -> System.out.println("Limite da conta: R$" + account.getLimitCheque() + "\n");
                case 3 -> {
                    System.out.print("Insira um valor para depositar: ");
                    double deposito = scanner.nextDouble();
                    account.depositarDinheiro(deposito);
                }
                case 4 -> {
                    System.out.print("Insira o valor um valor para sacar: ");
                    double sacar = scanner.nextDouble();
                    account.sacarDinheiro(sacar);
                }
                case 5 -> {
                    System.out.print("Insira o valor do pagamento: ");
                    double boleto = scanner.nextDouble();
                    account.pagarBoleto(boleto);
                }
                case 6 -> System.out.println("Está usando o cheque especial? " + account.isChequeEspecialAtivado() + "\n");
                case 7 -> {
                    break;
                }
                default -> {
                    System.out.println("Operação Invalida"); 
                }
            }
        if(op == 7){
            System.out.println("Saindo...");
            break;
        }
        }
        scanner.close();
    }
}
