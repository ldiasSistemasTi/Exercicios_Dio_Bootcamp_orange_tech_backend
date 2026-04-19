package Loops;

import java.util.Scanner;

public class Ex06Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual numero quer fatorar?: ");
        int numeroFatorial = sc.nextInt();
        int fatoracao = 1;
        for (int i = 1; i < numeroFatorial+1; i++) {
            fatoracao *= i;
        }
        System.out.printf("Fatoração de %d é igual a : %d",numeroFatorial ,fatoracao );
    }
}
