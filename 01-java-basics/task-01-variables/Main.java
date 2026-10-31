import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            printFormattedDate(number);
        } else System.out.println("Введено не число, попробуйте заново");
        sc.close();
    }


    static void printFormattedDate(int numbers){

        int weekSec = 7 * 24 * 60 * 60;//секунд в неделе
        int weeks = numbers / weekSec;

        int daysSec = 24 * 60 * 60; // секунд в сутках
        int days = (numbers - weeks * weekSec) / daysSec;

        int hourSec = 60 * 60;//секунд в часе
        int hours = (numbers - weeks * weekSec - days * daysSec) / hourSec;

        int minSec = 60;// секунд в минуте
        int minutes = (numbers - weeks * weekSec - days * daysSec - hours * hourSec) / minSec;

        int seconds = numbers % 60;

        System.out.println("недель: " + weeks + ", дней: " + days + ", часов: " + hours + ", минут: "
                + minutes + ", секунд: " + seconds);
    }
}