public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 28.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.err.println("O novo saldo agora é de: "+saldo);
        }
        else
            System.out.println("Saldo Insuficiente");

    }
}
