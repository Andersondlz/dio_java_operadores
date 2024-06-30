public abstract class ServicodeMensagemInstantania {
  public abstract void enviarMensagem();
  public abstract void receberMensagem();

  protected void validarConectadoInternet(){
    System.out.println("Validando se esta conectado a internet");
  }
}
