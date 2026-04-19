package Loops;

import java.util.Scanner;

public class Ex05Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------GERADOR DE TABUADA DE MULTIPLICAÇÃO-----");
        System.out.print("De 0 a 10 quer qual?: ");
        int tabuada = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(tabuada + "x" + (i) + "= " + (tabuada * i));
        }

    }
}
