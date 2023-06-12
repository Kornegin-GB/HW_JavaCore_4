package ru.gb;

public abstract class MyArrayExeptoin extends Exception {

    public MyArrayExeptoin(String message) {
        super(message);
    }

    abstract void MyArraySizeExeption();

    abstract void MyArrayDataExeption();
}
