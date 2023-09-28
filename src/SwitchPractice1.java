import java.util.Scanner;

public class SwitchPractice1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 14");
        int num = scanner.nextInt();
        displayDay(num);
        displayNum1(num);

    }


    public static void displayDay(int num) {
        switch (num) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is Sunday");
                break;

            ///default:
            //// System.out.println("Invalid Entry");

        }


    }

    public static void displayNum1(int num) {

        if (num == 8) {
            System.out.println("The day is Monday1");


        } else if (num==9) {

            System.out.println("The day is Tuesday 2");

        } else if (num==10) {

            System.out.println("The day is Wednesday 3");

        } else if (num==11) {
            System.out.println("The day is Thursday 4");

        } else if (num==12) {
            System.out.println("The day is Friday 5");

        }else if (num==13) {

            System.out.println("The day is Saturday 6");

        }else if (num==14) {
            System.out.println("The day is Sunday 7");

        }else
            System.out.println("Invalid day");




        }
    }




































