public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        boolean simNao2 = numero1 != numero2;

        boolean simNao3 = numero1 > numero2;

        
        System.out.println("numero1 é igual a numero2? " + simNao);
        System.out.println("numero1 é igual a numero2? " + simNao2);
        System.out.println("numero1 é maior que numero2? " + simNao3);

        String nome1 = "Ana";
        String nome2 = "Ana";

        System.out.println(nome1 == nome2);

    }
}
