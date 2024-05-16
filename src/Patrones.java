import java.util.Scanner;
public class Patrones {
    public static void main(String[] args) {

        //Pedir al usuario la cantidad de patrones
        System.out.println("Ingrese la cantidad de patrones que desea mostrar: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Patron 1
        for (int i = 0; i < n; i++ ){
            System.out.printf("*");
            System.out.printf(".");
        }
        System.out.println("");

        //Patron 2
        for (int i = 0; i < n; i++){
            System.out.printf("1234");
        }
        System.out.println("");

        //Patron 3
        for (int i = 0; i < n; i++){
            System.out.printf("||");
            System.out.printf("*");
        }

    }
}
