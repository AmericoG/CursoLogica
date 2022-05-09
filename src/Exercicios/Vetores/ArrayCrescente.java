package logicadeprogramacao.src.Exercicios.Vetores;

import java.util.Arrays;
import java.util.Random;

public class ArrayCrescente {
    public static void main(String[] args) {
        int[] arra = new int[6];
        for (int i = 0; i < 6; i++) {
            arra[i] = new Random().nextInt(60) + 1;
        }
        Arrays.sort(arra);
        System.out.println(Arrays.toString(arra));
    }
}
