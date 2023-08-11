import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número!");
        numero = input.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = input.next();

        // método para consumir linha vazia gerada pelo 'next' anterior
        input.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente!");
        nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o saldo!");
        saldo = input.nextDouble();

        System.out
                .println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco sua agência é " + agencia
                        + " conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        input.close();

    }

}
