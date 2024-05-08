public class Ternarios {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        //pode-se usar também o operador Ternário:

        int c, d;

        c = 8;
        d = 8;

        String resultado2 = c==d ?"verdadeiro" : "falso";

        System.out.println(resultado2);

    }
}
