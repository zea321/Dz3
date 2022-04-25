import java.awt.desktop.SystemSleepEvent;

public class Main {


    public static void main(String[] args) {
        System.out.println("Задание 1.");

        int clientOS = 1;
        if (clientOS == 1 ) {
        System.out.println("Установите версию приложения для iOS по ссылке ");}
        else { System.out.println("Установите версию приложения для Android по ссылке");}

        System.out.println("Задание 2");

        int ios = 0;
        int clientDeviceYear = 2014; //. Поменяй мое значение.

       if (ios >= 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для ios по ссылке");}
         else if (ios >= 1 && clientDeviceYear < 2015)
        {
            System.out.println("Установите облегченную версию приложения для ios по ссылке");}
         else if ( ios < 1 && clientDeviceYear >= 2015) {
           System.out.println("Установите версию приложения для Android по ссылке");}
         else if (ios < 1 && clientDeviceYear < 2015) {
           System.out.println("Установите облегченную версию приложения для Android по ссылке");
       }
        System.out.println("Задание 3");

         int year = 2020;
         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
             System.out.println( year + " год является високосным");}
             else {
             System.out.println(year + " год не является високосным");
         }
System.out.println("Задание 4");

          byte deliveryDistance = 95;
          byte deliveryDay = 1;
          if (deliveryDistance > 20)
          { deliveryDay++;
          }
           if (deliveryDistance > 60 ){
          deliveryDay++;}
           if (deliveryDistance >= 100)
               deliveryDay++; {

             System.out.println("Потребуется дней: " + deliveryDay);
        }
        System.out.println("Задание 5");

        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Лето");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Осень");
                    break;






        }
}}