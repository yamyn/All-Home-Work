package Lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int elementmin = Integer.MAX_VALUE;
        int elementmax = Integer.MIN_VALUE;
        int five = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву: ");
        int arrayLength   = scanner.nextInt();// 1. Визначає розмір масиву
        int[] array = new int[arrayLength];
//......................................................................//
        System.out.println("Задайте елементи масиву \n(написати елементи в рядок, ввідділяючи клавішою probel)");
        for (int i = 0; i < arrayLength; i++) { // 2. Задає елементи масиву
            array[i] = scanner.nextInt();
        }
//.......................................................................//

        System.out.println();

//........................................................................//

        System.out.println("Масив задано успішно");
        System.out.println();

        int operating = 1;
        while (operating == 1){//Цикл, що дозволяє запитувати користувача, про потребу виконання дій над масивом ще раз
//.......................................................................//
            System.out.println("Які дії ви бажаєте виконати з масивом:\n " +//запитує у користувача яку дію слід виконати
                    "Показати найменше число масиву - 1\n " +
                    "Показати найбільше число масиву - 2\n " +
                    "Показати кількість повторень числа '5' - 3\n " +
                    "Порядкувати числа масиву - 4\n" +
                    "(Ввести цифру, яка відповідає номеру питання)  ");
            System.out.println();
            int ask = scanner.nextInt();
//........................................................................//
            if (ask == 1) {//Оператор if, що визначає яку дію слід виконати
                for (int element : array)
                    if (element < elementmin)
                        elementmin = element;// 3. Знаходе найменше число масиву
                System.out.println("Найменше число масиву становить -  " + elementmin);
//.......................................................................//
            }else if(ask == 2) {
                for (int element : array)
                    if (element > elementmax)
                        elementmax = element;//4. Знаходе найбільше число масиву
                System.out.println("Найбільше число масиву становить -  " + elementmax);
//........................................................................//
            } else if (ask == 3){
                for (int element : array)
                    if (element == 5)
                        five++;//5. Визначає кількість повторень числа 5
                System.out.println("Кількість повторень числа 5 становить: " + five);
            }else if (ask == 4){
//...................................................................//
                for (int j = arrayLength - 1; j > 0; j--){//Порядкування
                    for (int i = 0; i < j; i++)
                        if (array[i] > array[i + 1]) {
                            array[i] ^= array[i + 1];
                            array[i + 1] ^= array[i];
                            array[i] ^= array[i + 1];
                        }
                }
                for (int element: array) {
                    System.out.print(element + " ");
                }
            }else{
                System.out.println("Ви невірно задали номер питання!");
            } ;
            System.out.println("\n");
            System.out.println("Чи бажаєте ви виконати ще якісь дії з масивом? \n" +
                    "Так - введіть '1' \n" +
                    "Ні - введіть '2' ");
            operating = scanner.nextInt();}
        System.out.println("До зустрічі, гарного дня!");



    }
}

