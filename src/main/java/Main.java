import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Select a number between 1 and 7!");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        while(userNumber < 1 || userNumber > 7) {
            System.out.println("No! The number must be between 1 and 7!");
            userNumber = scanner.nextInt();
        }
        System.out.println("Day " + userNumber + " of the week is " + weekdays[userNumber - 1] + ".");



    }





}
