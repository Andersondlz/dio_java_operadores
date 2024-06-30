public class Telegram extends ServicodeMensagemInstantania {
   public void enviarMensagem(){
      validarConectadoInternet();
      System.out.println("Enviando Mensagem pelo Telegram");
  }
  public void receberMensagem(){
     System.out.println("Rebebendo mensagem pelo Telegram");
  }
}
