import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        final int[] arrayAux = new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.println(binarySearch(number, arrayAux));
    }

    private static boolean binarySearch(int number, int[] arrayAux){
        int left = 0;
        int right = arrayAux.length - 1;

        while (left <= right){
            int middle = (left + right) / 2;

            if (arrayAux[middle] == number) return true;
            else if (arrayAux[middle] > number) right = middle - 1;
            else left = middle + 1;
        } return false;
    }
}
