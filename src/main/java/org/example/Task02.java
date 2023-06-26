//Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

package org.example;

public class Task02 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] intArray = {1, 2, 3, 4, 5, 6};
//        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, null, 10};
        try {
            int d = 4;
            double catchedRes = intArray[8] / (double)d;
            System.out.println("CatchedRes = " + catchedRes);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
