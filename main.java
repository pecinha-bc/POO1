public class Main {

    public static void main(String[] args) {

        Estudante estudante = new Estudante("Breno");

        estudante.insereNotas();

        System.out.println();
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Notas:");

        for (double nota : estudante.getNotas()) {
            System.out.println(nota);
        }

        System.out.println("Media: " + estudante.calculaMedia());
        System.out.println("Menor nota: " + estudante.menorNota());
    }

}
