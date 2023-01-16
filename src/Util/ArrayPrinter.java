package Util;

public class ArrayPrinter {
    public void print(String message, int[] array) {
        if(!message.isEmpty())
            System.out.print(message + " ");

        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }
}
