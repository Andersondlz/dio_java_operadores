public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B";
        switch (plano) {
            case "T" :{
                System.out.println("5G Youtube");
            }
            case "M" :{
                System.out.println("Whats e Instagram ilimitado");
            }
            case "B" :{
                System.out.println("100 minutos de Ligação");
            }        
            default:
                break;
        }
    }
}
