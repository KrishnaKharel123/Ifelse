import java.util.Scanner;

public class SwitchCase1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
       ///// char a = scanner.next().charAt(0);
        /////double xyz = scanner.nextDouble();
        //////String name = scanner.next();

        votingAge(age);                   //calling method into
    }

    public static void votingAge(int age) {
        switch (age) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:


                System.out.println("Not Legal to Vote");


                break;


            default:

                System.out.println("Legal to Vote");


        }


    }
}