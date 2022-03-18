package logicadeprogramacao.src.Exercicios.LacosDeRepeticao;
/* Elaborar um programa que calcule o fatorial de um número inteiro
 */

import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1 número inteiro qualquer");
        long numero1 = teclado.nextLong();
        long numero2 = teclado.nextLong();
        long numero3 = teclado.nextLong();
        long numero4 = teclado.nextLong();
        long numero5 = teclado.nextLong(); /* nos fors a parte: long i = num apenas diz que a variavel i vai COMEÇAR com
        o valor de "numero" mas no processo do loop, o valor i e de numero serão diferentes*/

        System.out.println("Fatorial de " + numero1);
        for (long i = numero1; numero1 > 2; numero1--) {
            i = i * (numero1 - 1);
            System.out.println(i);
        }
        System.out.println("Fatorial de " + numero2);
        for (long i = numero2; numero2 > 1; numero2--) {
            i = i * (numero2 - 1);
            System.out.println(i);
        }
        System.out.println("Fatorial de " + numero3);
        for (long i = numero3; numero3 > 1; numero3--) {
            i = i * (numero3 - 1);
            System.out.println(i);
        }
        System.out.println("Fatorial de " + numero4);
        for (long i = numero4; numero4 > 1; numero4--) {
            i = i * (numero4 - 1);
            System.out.println(i);
        }
        System.out.println("Fatorial de " + numero5);
        for (long i = numero5; numero5 > 1; numero5--) {
            i = i * (numero5 - 1);
            System.out.println(i);
        }
    }
}
