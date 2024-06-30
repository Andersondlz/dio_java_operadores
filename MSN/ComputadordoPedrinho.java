public class ComputadordoPedrinho {
    public static void main(String[] args) {
        ServicodeMensagemInstantania smi = null;

        String appEscolhido = "fbm";

        if (appEscolhido == "msn"){
            smi = new MSNMensseger();
        } else if (appEscolhido == "fbm"){
            smi = new FacebookMensseger();
        } else if (appEscolhido == "tlg"){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
