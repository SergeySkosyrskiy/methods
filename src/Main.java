
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задача1");
        int year = 2025;
        printIsLeapYearResult(year);
    }

    private static void printIsLeapYearResult(int year) {
        if (isaBoolean(year) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else System.out.println(year + " год — невисокосный год");
    }

    private static boolean isaBoolean(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }


    private static void task2() {
        System.out.println("Задача№2");
        int clientOS = 0;
        int versionDevice = 2015;
        int clientDeviceYear = 2014;
        recomendatedAppVersion(clientOS, clientDeviceYear, versionDevice);


    }

    private static void recomendatedAppVersion(int clientOS, int clientDeviceYear, int versionDevice) {

        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Неизвестная операционная система");
        } else if (clientOS == 1 && clientDeviceYear >= versionDevice) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= versionDevice) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    private static void task3() {
        System.out.println("Задача№3");
        int deliveryDistance = 101;
        getDeliveryTime(deliveryDistance);
    }

    private static void getDeliveryTime(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }
    }


}

