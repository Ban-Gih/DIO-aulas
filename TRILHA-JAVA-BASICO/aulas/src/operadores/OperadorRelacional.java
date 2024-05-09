package operadores;

public class OperadorRelacional {
    public static void main(String[] args) {
        String nomeUm = "Jeovane";
        String nomeDois = new String("Jeovane");

        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("NumeroUm è igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm è diferente de numeroDois?" + simNao);
    }
}
