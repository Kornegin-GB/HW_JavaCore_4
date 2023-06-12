package ru.gb;

public class Program {
    public static void main(String[] args) {
        String[][] arrStrings = {
                { "01", "02", "wqe", "04" },
                { "05", "06", "07", "08" },
                { "09", "10", "11", "12" },
                { "13", "14", "15", "16" },
        };

        ArrayConversion arrayConversion = new ArrayConversion();
        try {
            int[][] arr = arrayConversion.ArrayConv(arrStrings);
            for (int i = 0; i < arrStrings.length; i++) {
                System.out.print("[ ");
                for (int j = 0; j < arrStrings[0].length; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
                System.out.println("]");
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }
}