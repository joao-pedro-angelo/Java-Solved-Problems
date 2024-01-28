package arrays.medium;

import java.util.Arrays;

// https://www.geeksforgeeks.org/remove-duplicates-sorted-array/
public class RemoveDuplicatesSortingArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5})));
    }

    private static int[] removeDuplicates(int[] array){
        if (array.length <= 1) return array;

        // Array temporário
        int[] temp = new int[array.length];
        // Length do array temporário
        int j = 0;
        for (int i = 0; i < array.length - 1; i++){
            // Caso o elemento atual seja diferente do posterior, então ele é inserido em temp e o length incrementado
            // em caso de repetições, o loop só insere a última aparição do elemento
            if (array[i] != array[i + 1]) temp[j++] = array[i];
        }

        // O último elemento, sendo repetido ou não, não foi armazenado pelo loop
        // pois a condição de parada é i < array.length
        // caso seja repetido, os anteriores, mesmo que iguais ao último, não serão inseridos
        temp[j++] = array[array.length - 1];

        // retorna uma cópia do array temporário, passando o seu length
        return Arrays.copyOf(temp, j);
    }
}
