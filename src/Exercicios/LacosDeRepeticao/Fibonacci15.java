package logicadeprogramacao.src.Exercicios.LacosDeRepeticao;

public class Fibonacci15 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i < 13; i++) { /* o For vai até 13 pois já usamos 2 números para começar a sequência da fibo*/
            num2 = num2 + num1;  // 1=1+1    num1=2
            num1 = num2 - num1;  // 1=2-1    num1=1
            System.out.println(num2);
        }
    }
}