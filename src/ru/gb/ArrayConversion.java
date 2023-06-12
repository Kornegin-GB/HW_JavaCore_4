package ru.gb;

public class ArrayConversion {
    /**
     * Метод преобразования строкового массива размером 4x4 в числовой
     * 
     * @param array входящий строковый массив
     * @return возвращается преобразованный числовой массив размером 4x4
     * @throws MyArraySizeException ошибка если входящий массив не соответсвует
     *                              заданному размеру
     * @throws MyArrayDataException ошибка если элемент входящего массива невозможно
     *                              преобразовать в число
     */
    public int[][] ArrayConv(String array[][]) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            String strMess = String.format("Входящий массив размером %dx%d не соответвует необходимому 4x4",
                    array[0].length, array.length);
            throw new MyArraySizeException(strMess);
        }
        int[][] newArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    newArray[i][j] = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    String strMess = String.format(
                            "Элемент массива в строке %d столбце %d преобразовать в число невозможно", i, j);
                    throw new MyArrayDataException(strMess);
                }
            }
        }
        return newArray;
    }
}
