package anatomiaclasses;

public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Jeovane";
        String segundoNome = "Viana";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "O lindão do " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
