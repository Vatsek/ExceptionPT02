//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя!!!
package org.example;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        notEmptyString();
    }

    public static void notEmptyString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст (поле не должно быть пустым и не должно состоять только из пробелов): ");
        String text = sc.nextLine();
        if (text.equals("")){
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
        text = text.replaceAll("\s", "");
        if (text.isEmpty()) {
            throw new RuntimeException("Строку состоящую только из пробелов вводить нельзя");
        }
    }
}
