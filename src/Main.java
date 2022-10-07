public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7}, {10, 6, 7}};
        int max = arr[0][0];
        int indexI = 0, indexJ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (findMax(max, arr[i][j])) {
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.printf("Max in array is: %d, position is arr[%d][%d]", max, indexI, indexJ);
    }

    public static boolean findMax(int max, int num) {
        return (num > max);
    }
}