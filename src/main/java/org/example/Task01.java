//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должен приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

package org.example;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        System.out.println(returnsFloat());
    }

    public static float returnsFloat() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Введите дробное число ");
            String number =  sc.nextLine();
            try {
                float result = Float.parseFloat(number);
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Введено не число. Попробуйте снова");
            }
        }
    }
}
