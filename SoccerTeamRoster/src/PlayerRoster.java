import java.util.Scanner;

public class PlayerRoster {

    public static void menu() {
            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit\n");
            System.out.println("Choose an option:");
    }

    public static void playerInfo(int[] jersey, int rating[], int min) {
        System.out.println(((min > 0) ? ("ABOVE " + min) : ("ROSTER")));
        for (int i = 0; i < 5; i++) {
            if (rating[i] > min) {
                System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + rating[i]);
            }
        }
        System.out.println();
    }


    public static void main(String[] args) throws Exception {
        //variables
        int [] jersey = new int [5];
        int [] rating = new int [5];

        Boolean menu = true;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            
            System.out.println("Enter player " + (i + 1) + "'s jersey number:");
            jersey[i] = sc.nextInt();

            System.out.println("Enter player " + (i + 1) + "'s rating:");
            rating[i]= sc.nextInt();

            System.out.println();
        }

        
       playerInfo(jersey, rating, 0);


        //menu option
        while (menu){

            menu(); //function menu

            char input = sc.next().charAt(0);

            if(input == 'q') {
                menu = false;
            }
            else if (input == 'o') {
                playerInfo(jersey, rating, 0);
            }
            
            else if (input == 'u') {
                System.out.println("Enter a jersey number:");
                int jerseyNum = sc.nextInt();
                System.out.println("Enter a new rating for player:");
                int newRating = sc.nextInt();

                for (int i = 0; i < 5; i++) {
                    if (jersey[i] == jerseyNum) {
                        rating[i] = newRating;
                    }
                }
                 System.out.println();
            }

            else if (input == 'a') {
                System.out.println("Enter a rating:");
                int aboveRate = sc.nextInt();
                playerInfo(jersey, rating, aboveRate);
            }

            else if (input == 'r') {
                System.out.println("Enter a jersey number:");
                int jerseyNum = sc.nextInt();

                for (int i = 0; i < 5; i++) {

                    if(jersey[i] == jerseyNum){
                        System.out.println("Enter a new Jersey number:");
                        jersey[i] = sc.nextInt();

                        System.out.println("Enter a new rating for the new player:");
                        rating[i] = sc.nextInt();
                    }
            }
            System.out.println();
        }

        }


    }

}
