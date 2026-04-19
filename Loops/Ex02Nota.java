package Loops;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex02Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10");
        System.out.print("nota: ");
        double nota = sc.nextDouble();


        while (nota < 0 || nota > 10){
            System.out.println("Nota invalida. Digite novamente!");
            System.out.print("nota: ");
            nota = sc.nextDouble();
        }
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("nota " + df.format(nota) + " lançada com sucesso! ");
    }
}
