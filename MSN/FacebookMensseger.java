public class FacebookMensseger  extends ServicodeMensagemInstantania{
   public void enviarMensagem(){
      validarConectadoInternet();
      System.out.println("Enviando Mensagem pelo Facebook Mensseger");
  }
  public void receberMensagem(){
     System.out.println("Rebebendo mensagem pelo Facebook Menseger");
  }
}
