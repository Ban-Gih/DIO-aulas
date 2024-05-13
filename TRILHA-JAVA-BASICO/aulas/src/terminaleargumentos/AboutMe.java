package terminaleargumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void aboutme(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
    
    public static void scanner(String[] args) {

        //criando projeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite seu nome");
        String nome = scanner.next();
        
        System.out.println("digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        scanner.close();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos ");
        System.out.println("minha altura é " + altura + "cm ");
    }
}