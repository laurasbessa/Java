public class MinhaClasse {
    
public static void main(String[] args) {
//declaração de variáveis:
    String primeiroNome = "Laura";
    String segundoNome = "Bessa";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

}

//métodos:
//TipoRetorno NomeObjetivonoInfinitivo Parametro(s)
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " +   primeiroNome.concat(" ").concat(segundoNome);



}

}
