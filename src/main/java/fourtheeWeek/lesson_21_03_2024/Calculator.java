package fourtheeWeek.lesson_21_03_2024;

import fourtheeWeek.lesson_21_03_2024.constants.Constants;
import fourtheeWeek.lesson_21_03_2024.utils.Util;

import java.util.Objects;
import java.util.Scanner;

/**
 * апишите программу "Калькулятор", производящую вычисления с двумя числами c дробной частью. 
 * Тип данных вводимых аргументов должен быть Double. 
 * Пользователь должен ввести с клавиатуры знак выполняемой математической операции в формате строки,
 * а затем программа должна преобразовать введенную строку в значение переменной типа Char
 * (получить из строки первый символ методом string.charAt(0);).
 * Требуется произвести проверку введенных данных:
 * Если пользователь ввёл знак операции, отличный от +, -, *, / - выводить сообщение о том,
 * что указанная операция не поддерживается программой.
 * Если пользователь хочет выполнить операцию деления и в качестве значения второго аргумента ввёл значение 0,
 * то программа должна вывести сообщение о том, что на 0 делить нельзя.
 * В обеих ситуациях программа должна прекращать дальнейшую работу.
 * Результат вычислений необходимо вывести с точностью до двух чисел после запятой
 * в формате <значение переменной argumentOne> <знак математической операции> <значение переменной argumentTwo> = <значение переменной результата>.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            double value1 = Util.getNumber();
            double value2 = Util.getNumber();
            char operation = Util.getOperation();
            Util.printResult(value1,value2,operation);
            System.out.println("\ndo you want to stop ? if yes enter ' Y ' : 'y' ");
            Character stopValue = scanner.next().charAt(0);
            if(Objects.equals(Character.toUpperCase(stopValue),Constants.IS_STOP)){
                System.out.println("bye bye ");
                break;
            }
        }


//        System.out.println(Util.getResult(value1,value2,operation));

    }
}
