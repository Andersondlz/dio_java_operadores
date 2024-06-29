public class MSNMensseger {
 public void enviarMensagem(){
    validarConectadoInterner();
    System.out.println("Enviando Mensagem");
    salvarHistoricoMensagem();
 }
 public void receberMensagem(){
    System.out.println("Recebendo Mensagem");
 }
 private void validarConectadoInterner(){
    System.out.println("Validando se esta conectado a internet");
 }
 private void salvarHistoricoMensagem(){
    System.out.println("Salvando o histórico da mensagem enviada");
 }
}
