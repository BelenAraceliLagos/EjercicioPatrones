import java.util.Scanner;
public class PatronesAnidados {
    public static void main(String[] args) {


        System.out.println("Ingrese un numero para el tamaño de los patrones: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Patron 1 Cuadrado
        System.out.println("Patron 1");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i==0 || i==n-1){
                    System.out.printf("*");
                }else if(j==0 || j==n-1){
                    System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.println("");
        }

        //Patron 2
        System.out.println("Patron 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.printf("*");
                } else if (j == 0 || j == n - 1) {
                    System.out.printf(" ");
                } else if (i % 2 == 0) {
                        System.out.printf("*");
                        j++;
                    } else if(j % 2 == 0){
                        System.out.printf("*");
                    }else {
                        System.out.printf(" ");
                    }
                }
            System.out.println("");
        }


        //Patron 3
        System.out.println("Patron 3");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i==j || i+j==n-1){
                    System.out.printf("x");
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.print("\n");
        }

        //Patron 4
        System.out.println("Patron 4");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j != 0 && j != n - 1) {
                    System.out.printf("x");
                } else {
                    System.out.printf(" ");
                    }
                }
            System.out.printf("\n");
        }


    }
}






