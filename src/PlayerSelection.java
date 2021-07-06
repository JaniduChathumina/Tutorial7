
import java.util.Scanner;

public class PlayerSelection {


    public static void main (String args[]){
        Player Bat1 = new Player("david malan",34,"BatsMan",888);
        Player Bat2 = new Player("Aaron Finch",35,"BatsMan",830);
        Player Bat3 = new Player("Babar Azam", 27,"BatsMan", 828);
        Player Bat4 = new Player();

        Player Bowl1 = new Player("Tabraiz Shamsi", 31, "Bowler", 750);
        Player Bowl2 = new Player("Rashid Khan", 23, "Bowler", 719);
        Player Bowl3 = new Player("Ashton Agar", 28, "Bowler", 702);
        Player Bowl4 = new Player();

        Player Kep1 = new Player("Mohammad Nabi", 36, "Kepper", 285);
        Player Kep2 = new Player("Shakib Al Hasan", 34, "Kepper", 238);
        Player Kep3 = new Player("Glenn Maxwell", 33, "Kepper", 226);
        Player Kep4 = new Player();

        //menu
        System.out.println("--            MENU            --");
        System.out.println("  Add Player                   A");
        System.out.println("  View all Players             V");
        System.out.println("  Display Best two Batsman     B");
        System.out.println("  Display Best two bowlers     Z");
        System.out.println("  Display the best Keeper      K");
        System.out.println("  EXIT                        99");

        Scanner input = new Scanner(System.in);
        String Name ;
        int Age;
        int Statistics;


        while(true){
            System.out.print(" Please Enter a option : ");
            String option = input.nextLine();

            if(option.equals("A")){
                System.out.print(" Enter the Player type : ");
                String Type = input.nextLine();
                if (Type.equals("BatsMan")){
                    System.out.print(" Enter Player name : ");
                    Name = input.nextLine();
                    System.out.print(" Enter Player age : ");
                    Age=input.nextInt();
                    System.out.print(" Enter Player Rating : ");
                    Statistics=input.nextInt();
                    Bat4.setPlayerDetails(Name, Age, Type, Statistics);

                }else if (Type.equals("Bowler")){
                    System.out.print(" Enter Player name : ");
                    Name = input.nextLine();
                    System.out.print(" Enter Player age : ");
                    Age=input.nextInt();
                    System.out.print(" Enter Player Rating : ");
                    Statistics=input.nextInt();
                    Bowl4.setPlayerDetails(Name, Age, Type, Statistics);

                }else if(Type.equals("Keeper")){
                    System.out.print(" Enter Player name : ");
                    Name = input.nextLine();
                    System.out.print(" Enter Player age : ");
                    Age=input.nextInt();
                    System.out.print(" Enter Player Rating : ");
                    Statistics=input.nextInt();
                    Kep4.setPlayerDetails(Name, Age, Type, Statistics);

                }else {
                    System.out.println(" Invalid player Type");
                }

            }else if(option.equals("V")){
                Bat1.getPlayerDetails();
                Bat2.getPlayerDetails();
                Bat3.getPlayerDetails();
                Bat4.getPlayerDetails();
                Bowl1.getPlayerDetails();
                Bowl2.getPlayerDetails();
                Bowl3.getPlayerDetails();
                Bowl4.getPlayerDetails();
                Kep1.getPlayerDetails();
                Kep2.getPlayerDetails();
                Kep3.getPlayerDetails();
                Kep4.getPlayerDetails();


            }else if(option.equals("B")){



            }else if(option.equals("Z")){



            }else if(option.equals("K")){



            }else if(option.equals("99")){
                break;
            }else {
                System.out.println(" Invalid Option !");

            }
        }
    }


}
