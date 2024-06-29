import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o Saque:");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;
        double diferenca = saque - saldo;
        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) 
            System.out.print("Transacao realizada com sucesso.");// TODO: Imprimir "Transação realizada com sucesso."
        else if (diferenca <= limiteChequeEspecial) 
            System.out.print("Transacao realizada com sucesso utilizando o cheque especial.");
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
        else
          System.out.print("Transacao nao realizada. Limite do cheque especial excedido.");

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}