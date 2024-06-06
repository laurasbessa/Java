public class FormatadorCepExemplo {
    public static void main(String[] args) {
            try {
                String cepFormatado = formatarCep("3105289");
                System.out.println(cepFormatado);
            } catch (CepInvalidoException e) {
                // TODO Auto-generated catch block
                System.out.println("CEP Inválido");
            }
        } 
        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
                throw new CepInvalidoException();

                return"31.052-789";
                
                
        }
}
