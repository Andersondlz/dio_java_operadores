import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 10.0;
        int quantidadeDoce = 0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
                

            System.out.println("Doce do valor: " + valorDoce + "Adicionando no carrinho");
            mesada = mesada - valorDoce;
            quantidadeDoce++;
            
        }   
        System.out.println("Mesada: " + mesada);
        System.out.println("João comprou a quantidade de: " +quantidadeDoce+ " doces");
        System.out.println("João gastou toda a mesada ele em doces");
    }
    private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
