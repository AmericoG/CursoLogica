package logicadeprogramacao.src.Exercicios.LacosDeRepeticao;
/*Elaborar um programa que apresente o somatório dos números na faixa de 1 até 500.
 */

public class Somatorio1A500 {
    public static void main(String[] args) {
        int o = 0;
        for (int i = 1; i < 501; i++) {
            System.out.println(o += i);
                /* A variavel int o serve apenas para armazenar o valor que o for dá, o += atribui o valor do for a
                variavel int o e soma com o novo valor que o for dá
                 */
        }
    }
}