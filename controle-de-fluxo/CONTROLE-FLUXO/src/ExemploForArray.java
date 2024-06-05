public class ExemploForArray {
    public static void main(String[] args) {
        //em arrays o índice de elementos inicia em zero
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }
           
        String objetos[] = {"FACA", "COPO", "JORNAL", "GARRAFA"};

        for (String objeto : objetos) {
            System.out.println("O objeto é: " + objeto);
        }
    }
}
