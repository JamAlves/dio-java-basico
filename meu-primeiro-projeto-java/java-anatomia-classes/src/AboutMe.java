import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    private static Scanner sc;

    public static void main(String[] args) {
       @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite seu nome");
       String nome = scanner.next();

       System.out.println("Digite seu sobrenome");
       String sobrenome = scanner.next();

       System.out.println("Digite sua idade");
       int idade = scanner.nextInt();

       System.out.println("Digite sua altura");
       int altura = scanner.nextInt();

      

        System.out.println("Ola, me chamo" + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Minha altura é " + altura + "cm ");

        sc.close();

        
    }
    
}
