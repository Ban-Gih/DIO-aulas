package anatomiaclasses;

public class BoletimEstudantil {
    public static void boletin(String[] args) {

        int mediaFinal = 7;

        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA DE MINERVA");
        else
            System.out.println("APROVADO");
    }
}
