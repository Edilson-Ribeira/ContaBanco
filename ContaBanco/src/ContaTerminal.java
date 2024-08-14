import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // Metodo de interação com o usuario
        Scanner ler = new Scanner(System.in);

        // Variaveis solicitadas pelo desafio
        int numero = 0;
        String agencia;
        String cliente;
        float saldo;

        // Solicitando as informações para o usuario
        System.out.print("Digite o numero da conta do cliente: ");
        cliente = ler.nextLine();
        System.out.print("Digite o numero da conta: ");
        numero = ler.nextInt();
        System.out.print("Digite o numero da agencia: ");
        agencia = ler.next();
        System.out.print("Digite o saldo atual: ");
        saldo = ler.nextFloat();

        // Exibindo as informações solicitada
        System.out.printf(
                "Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s , conta %d e seu saldo %.2f já está disponível para saque!",
                cliente, agencia, numero, saldo);
        ler.close();

    }

}
