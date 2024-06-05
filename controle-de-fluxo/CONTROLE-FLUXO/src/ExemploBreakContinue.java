public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero=1; numero<=5; numero++) {
            if(numero==3)
                continue;

            System.out.println(numero);
        }

        for(int numero2=1; numero2<=10; numero2++) {
            if(numero2==6)
                break;
    
                System.out.println(numero2);
        }
    }
}
