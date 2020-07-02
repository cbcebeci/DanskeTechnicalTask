import java.util.Scanner;

public class TechnicalTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number for your pyramid");

        int input = scanner.nextInt();

        createAPyramid(input);



    }

    static void createAPyramid (Integer number){

        for (int counter = 0; counter < number; counter++) {     //height of the pyramid
            for (int counter1 = 1; counter1 < number-counter; counter1++) { // how many gabs we have in the beginning
                System.out.print(" ");
            }
            for (int counter2 = 0; counter2 < counter+1 ; counter2++) { // how many stars we have on each line
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
