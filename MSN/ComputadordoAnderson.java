public class ComputadordoAnderson {
    public static void main(String[] args) {

        MSNMensseger msn = new MSNMensseger();
          msn.enviarMensagem();
          msn.receberMensagem();

        FacebookMensseger fcb = new FacebookMensseger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();   
        tlg.receberMensagem();
    }
}
