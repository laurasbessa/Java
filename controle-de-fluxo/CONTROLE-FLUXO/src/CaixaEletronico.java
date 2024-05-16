public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 17.0;
        double valorSolicitado = 17.0;

//estrutura condicional simples
        if (valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
//se a estrutura if tiver mais de uma linha, ela precisa virar um bloco usando { }

        }else
            System.out.println("Saldo insuficiente");

        System.out.println(saldo);

    }
}
