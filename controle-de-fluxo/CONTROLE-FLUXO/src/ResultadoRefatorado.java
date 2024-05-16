public class ResultadoRefatorado {
    public static void main(String[] args) throws Exception {

        int nota = 5;

    //expressão ternária:
        String resultado = nota >=7 ? 
        "Aprovado" :  nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
        

    
}

}
