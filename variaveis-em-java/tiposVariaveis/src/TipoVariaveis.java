public class TipoVariaveis {
    public static void main(String[] args) {
        byte idade = 23;
        short ano = 2021;
        int cep = 31980520; //se começar com zero, pode ser que tenha que ser de outro tipo (string)
        long cpf = 02145879632L //se começar com zero, pode ser que tenha que ser de outro tipo (string). Precisa ter o L no final
        float pi = 3.14F; //tem que ter o F no final
        double salario = 1841.25;

    }
    
    public static void main(String[] args) {
        String meuNome = "Laura"; 
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //função cast  converte um tipo mais abrangente de variável para um tipo mais específico 

        final double VALOR_DE_PI = 3.14; //essa é uma Constante, que diferente da varíavel não pode ter seu valor alterado


    }

}