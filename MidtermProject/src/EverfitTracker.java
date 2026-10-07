/** Desiree Hartpence - 901134291
 * CIS171 Online
 * Date: 10/2/2026
 * Operating System: Windows 11
 * IDE:IntelliJ
 * Program Description(short): A fitness tracker that uses user input and basic math to determine
 * an individuals calories burned, workout intensity, and  a random or custom
 * motivational message strength.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified
 * Documentation of Resources Used:  (Copilot for the skeleton of my if loops, W3 schools)
 **/

import java.util.Scanner
public class EverfitTracker {

    public static void main (String args[]) {
        //getting the users input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Whats your name?");
        String userName = myObj.nextLine();
        System.out.println("What type of workout did you hit today? " +
                "(Upper,lower,full-body, stretching");
        String WorkoutType = myObj.nextLine();
        System.out.println("How long was the workout today?");
        int duration = myObj.nextInt();
        System.out.println("minutes");
        System.out.println("Out of 10, how would you rate your energy level " +
                "during your workout today?");
        int energyLevel = myObj.nextInt();
        System.out.println("Do you have a favorite motivational phrase? Or would" +
                "you like a random phrase?");
        Boolean userMotivation = myObj.nextBoolean();


        //Processing and configuring data
        //fixme public static boolean isAlphabetic(String input) {
            if (input == null || input.isEmpty()) return false;

            for (char c : input.toCharArray()) {
                if (!Character.isLetter(c) && c != ' ') return false;
            }
            return true;

        }


    }
}
