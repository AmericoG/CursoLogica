package logicadeprogramacao.src.Exercicios.LacosDeRepeticao;
/* Elaborar um programa que calcule e apresente a tabuada de um número qualquer.
 */

import java.util.Scanner;

public class TabuadaNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        System.out.println("Digite um número inteiro qualquer");
        for (long numero = teclado.nextLong(); i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
}
