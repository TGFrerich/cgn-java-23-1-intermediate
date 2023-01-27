package org.example;

import java.util.Arrays;

public class StringArray {

    private String[] array = new String[]{"Eins","Zwei","Drei","Vier","Fünf","Sechs","Sieben","Acht","Neun","Zehn"};


    public String printNumber(int a){
        if(a >= 1 && a < 10) {
            return array[a - 1];
        }
        else{
            return "false";
        }
    }


    public String[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "StringArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
