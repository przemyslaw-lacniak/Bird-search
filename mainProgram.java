
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        ArrayList<Bird> birds = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("?");
            String input = scan.nextLine();
            if (input.equals("Quit")) {
                break;
            }

            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameInLatin = scan.nextLine();
                //adding new bird to ArrayList
                birds.add(new Bird(name, nameInLatin));
            }

            if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        bird.Observation();
                    }
                }
            }

            if (input.equals("One")) {
                System.out.print("Bird? ");
                String birdSearched = scan.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(birdSearched)) {
                        System.out.println(bird);
                    }
                }
            }

            if (input.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }

            }

        }

    }

}
