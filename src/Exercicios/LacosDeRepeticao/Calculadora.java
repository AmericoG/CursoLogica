package logicadeprogramacao.src.Exercicios.LacosDeRepeticao;
/* Crie uma calculadora que seja capaz de realizar as quatro operações básicas.
Para tal cumpra-se os seguintes requisitos:

A calculadora deve apresentar um menu e perguntar qual a operação desejada (+, -, * ou /).
A calculadora deve solicitar os dois valores numéricos, realizar a operação e exibir o resultado.

Melhore a calculadora desenvolvida anteriormente acrescentando as seguintes funcionalidades:

Sempre ao final de um cálculo a calculadora deve mostrar o menu novamente.
Acrescentar uma opção para sair da calculadora, como sugestão, quando o usuário digitar
 0 (zero) por exemplo, a calculadora deve ser encerrada.
*/

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("-----Calculadora-----\n-Qual é a operação desejada?-\nDigite '1' para soma" +
                    "\nDigite '2' para subtração\nDigite '3' para multiplicação\nDigite '4' para " +
                    "divisão\n\nDigite '0' " +
                    "para sair da calculadora");
            int operacao = teclado.nextInt();
            if (operacao == 0) {
                System.out.println("PROGRAMA ENCERRADO");
                break;
            } else if (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4) {
                System.out.println("OPERAÇÃO INVÁLIDA");
                break;
            }
            System.out.println("Digite 2 valores numéricos para realizar a operação\nValor 1:");
            double valor1 = teclado.nextDouble();
            System.out.println("Valor 2:");
            double valor2 = teclado.nextDouble();
            if (operacao == 1) {
                soma = valor1 + valor2;
                System.out.println("SOMA = " + soma);
            } else if (operacao == 2) {
                subtracao = valor1 - valor2;
                System.out.println("SUBTRAÇÃO = " + subtracao);
            } else if (operacao == 3) {
                multiplicacao = valor1 * valor2;
                System.out.println("MULTIPLICAÇÃO = " + multiplicacao);
            } else if (operacao == 4) {
                divisao = valor1 / valor2;
                System.out.println("DIVISÃO = " + divisao);
            }
        }
    }
}
