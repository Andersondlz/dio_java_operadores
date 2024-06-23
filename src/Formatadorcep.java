public class Formatadorcep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376504");
            System.out.println(cepFormatado);
        } catch (CepInvalidExecption e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP não corresponde com as regras");;
        }
    }
    static String formatarCep(String cep) throws CepInvalidExecption{
        if (cep.length() != 8)
            throw new CepInvalidExecption();
        return "23.765-064";
    }
}

