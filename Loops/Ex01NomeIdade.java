package Loops;

import java.util.Scanner;

public class Ex01NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nome e depois idade:");
        System.out.println("OBS: para parar o laço digite 0 no nome");


        while (true) {
            System.out.print("Digite nome: ");
            String nome = sc.next();

            if(nome.equals("0")) break;

            System.out.print("Digite idade: ");
            int idade = sc.nextInt();
            System.out.println("");
        }
        System.out.println("Sistema finalizado!");

    }
}
