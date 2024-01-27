package arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/
public class Array2DConvert {
    public static void main(String[] args){
        System.out.println(findMatrix(new int[] {1, 3, 4, 1, 2, 3, 1}));
    }

    // necessário import List
    public static List<List<Integer>> findMatrix(int[] v) {
        // A chave é o elemento. O valor é a frequência
        Map<Integer, Integer> contador = contaFrequencia(v);

        // Cria a lista que será retornada como resultado final
        List<List<Integer>> result = new ArrayList<>();

        // Iterar pelo mapa contador
        while (!contador.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> toErase = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {

                // chave é o elemento que será adicionado na lista
                int f = entry.getKey();
                // valor é a frequência que o elemento aparece
                int s = entry.getValue();

                // a lista temporária recebe o elemento
                temp.add(f);
                // a frequência é decrementada
                s--;
                // caso a frequência seja 0, então adiciona na lista toErase (paraApagar)
                if (s == 0) {
                    toErase.add(f);
                }
                // atualiza o valor no mapa contador
                contador.put(f, s);
            }

            result.add(temp);

            // apaga os elementos que do mapa que estão com frequência 0
            for (int i : toErase) {
                contador.remove(i);
            }
        }

        return result;
    }

    private static Map<Integer, Integer> contaFrequencia(int[] v){
        Map<Integer, Integer> um = new HashMap<>();
        for (int i : v) {
            um.put(i, um.getOrDefault(i, 0) + 1);
        } return um;
    }
}
