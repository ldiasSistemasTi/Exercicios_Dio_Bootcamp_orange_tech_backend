package Loops;

import java.util.Scanner;

public class Ex03MaiorEMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        double media = 0;
        int contador = 0;
        int soma = 0;

        System.out.println("Digite um numero 5 vezes: ");

        do {
            System.out.print("Numero: ");
            numero = sc.nextInt();

            // soma dos numeros
            soma = soma + numero;
            // maior numero
            if (numero > maiorNumero){
                maiorNumero = numero;
            }
            // media dos numeros
            media = media + (double)numero;

            contador ++;
        }while (contador < 5);
        media = media/5;

        System.out.println("maior numero: "+ maiorNumero);
        System.out.println("soma dos numeros: "+ soma);
        System.out.println("media: "+ media);

    }
}
