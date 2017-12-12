package Lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день");
        System.out.println();
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println();
        System.out.println(name + ", в каком городе вы живёте?");
        String city = scanner.nextLine();
        System.out.println("Замечательно");
        System.out.println();
        System.out.println("Какие у вас увлечения?");
        String hobby = scanner.nextLine();
        System.out.println("О, это интересно!");
        System.out.println();
        System.out.println("Сколько вам лет? ");
        int age = scanner.nextInt();
//...................................................................//
        System.out.println("Variant 1");
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);
        System.out.println();
//...................................................................//
        System.out.println("Variant 2 ");
        System.out.println("Человек по имени " + name + " живет в городе " + city + ". ");
        System.out.println("Этому человеку " + age + " лет и ему нравиться " + hobby + ".");
        System.out.println();
//....................................................................//
        System.out.println("Variant 3");
        System.out.println( name + " - имя");
        System.out.println( city + " - город");
        System.out.println(age + " - возраст");
        System.out.println( hobby + " - хобби");
    }
}


