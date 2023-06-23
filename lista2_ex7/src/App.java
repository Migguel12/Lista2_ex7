import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = ler.nextDouble();
        System.out.println("");

        System.out.print("Digite um numero: ");
        double n2 = ler.nextDouble();
        System.out.println("");

        System.out.print("Digite um numero: ");
        double n3 = ler.nextDouble();
        System.out.println("");

        if(n1>n2 && n1>n3){
            System.out.printf("O maior numero e %2.2f",n1);
        }

        else if(n2>n1 && n2>n3){
            System.out.printf("O maior numero e %2.2f",n2);
        }

        else{
            System.out.printf("O maior numero e %2.2f",n3);
        }

        System.out.println("");

        if(n1<n2 && n1<n3){
            System.out.printf("O menor numero e %2.2f",n1);
        }

        else if(n2<n1 && n2<n3){
            System.out.printf("O menor numero e %2.2f",n2);
        }

        else{
            System.out.printf("O menor numero e %2.2f",n3 );
        }
    }
}
