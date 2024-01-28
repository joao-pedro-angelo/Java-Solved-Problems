package arrays.medium;

import java.util.Arrays;

// https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/description/
public class InsideCircle {
    public static void main(String[] args){
        int[][] points = new int[][] {{1,3}, {3, 3}, {5, 3}, {2, 2}}; //[1][4]
        int[][] queries = new int[][] {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}}; //[1][3]
        System.out.println(Arrays.toString(countPoints(points, queries)));
    }

    private static int[] countPoints(int[][] points, int[][] queries){
        // Para cada consulta, teremos um número de pontos dentro do círculo (ou 0, caso não haja)
        // Logo, inicializa o array de resposta como sendo do tamanho das consultas
        int[] answer = new int[queries.length];

        // Itera pelas consultas
        for (int i = 0; i < queries.length; i++){
            // é necessário passar o índice da consulta, por isso passa o i
            answer[i] = computeQueries(points, queries, i);
        } return answer;
    }

    private static int computeQueries(int[][] points, int[][] queries, int querie){
        // Quantidade de pontos dentro da consulta
        int count = 0;
        // Ponto X da circunferência
        int centerX = queries[querie][0];
        // Ponto Y da circunferência
        int centerY = queries[querie][1];
        // Raio da circunferência
        int radius = queries[querie][2];

        // Itera sobre os pontos, verificando quais estão dentro da circunferência
        for (int[] point : points) {
            // Ponto x
            int X = point[0];
            // Ponto Y
            int Y = point[1];

            // Cálculo da geometria analítica para saber se um ponto está dentro de uma circunferência
            if ((X - centerX) * (X - centerX) + (Y - centerY) * (Y - centerY) <= radius * radius) count++;
        }
        return count;
    }

}
