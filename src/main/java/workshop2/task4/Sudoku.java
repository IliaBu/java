package workshop2.task4;

public class Sudoku {
    /**
     * @param chboard массив целых значений от 1 до 9
     * @return true если значение в строке, колонке массива не повторяется, false если есть повторы
     */
    public static boolean isValidSudoku(char[][] chboard) {
        boolean check;
        char[] temp = new char[9];
        char[] temp2 = new char[9];
        char[] temp3 = new char[9];
        for (int i = 0; i < chboard.length; i++) {
            for (int j = 0; j < chboard.length; j++) {
                temp[j] = chboard[i][j];
                temp2[j] = chboard[j][i];
            }
//            System.out.println(temp);
//            System.out.println(temp2);
            check = isArrUnique(temp);
            if (!check) {
                return false;
            }
        }
        int u = 0;
        int iu = 0;
        int k = 0;
        for (int z = 0; z < 3; z++) {
            for (int i = 0; i < iu + 3; i++) {
                for (int j = u; j < u + 3; j++) {
                    temp[k] = chboard[i][j];
                    temp2[k] = chboard[i + 3][j];
                    temp3[k] = chboard[i + 6][j];
                    k++;
                    if (k == 9) {
                        k = 0;
                    }
                }
            }
            u = u + 3;
            k = 0;
            check = isArrUnique(temp);
            if (!check) {
                return false;
            }
            check = isArrUnique(temp2);
            if (!check) {
                return false;
            }
            check = isArrUnique(temp3);
            if (!check) {
                return false;
            }
        }
        System.out.println("Хороший судоку, повторов нет!");
        return true;
    }

    /**
     * @param arr массив значений от 1 до 9
     * @return true если значение в строке, колонке массива не повторяется, false если есть повторы
     */
    public static boolean isArrUnique(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] != '.') {
                    if (arr[i] == arr[j]) {
                        System.out.println("Плохой судоку, есть повторы");
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
