package Loops;

import java.util.Scanner;

public class Ex04ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DESCUBRA QUAIS SÃO IMPAR E PAR");
        System.out.println("quantos numeros quer digitar?: ");
        int quantidadeDeNumeros = sc.nextInt();
        int numerosPares = 0, numerosImpares = 0;

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.print("Numero: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0){
                numerosPares++;
            }else {
                numerosImpares++;
            }
        }
        System.out.printf("temos %d impar(es) e %d par(es).", numerosImpares, numerosPares);


    }
}
