package Actividad46;

import java.util.Arrays;

public class ImprimirCadenas {
    public static void main(String[] args) {
        int[] numbers = {2,1,11,10};
        String [] strings;
        strings = convertirToStringAndOrder(numbers);
        System.out.println(Arrays.toString(strings));
    }
    private static String[] convertirToStringAndOrder(int[] numbers){
        String[] strings = new String[numbers.length];
        //conversión a String
        for (int i = 0; i < numbers.length; i++){
            strings[i] = String.valueOf(numbers[i]);
        }
        //Ordenar:
        Arrays.sort(strings);

        return strings;
    }
}
