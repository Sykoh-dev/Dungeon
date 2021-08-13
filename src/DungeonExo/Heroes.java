package DungeonExo;
import java.util.Scanner;


public class Heroes extends Character {

    public Heroes(String name, int hp, int atk, int stamina) {
        super(name, hp, atk, stamina);
    }


    public static Character heroChoose(){
        Scanner sc = new Scanner(System.in);



        do{
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("---  Choissisez un hero! :                                              ---");
            System.out.println("---1.Humain                                                             ---");
            System.out.println("---  Les humains possèdent un bonus de +1 en force et +1 en endurance   ---");
            System.out.println("---2.Nain                                                               ---");
            System.out.println("---  Les nains possèdent un bonus +2 en endurance                       ---");
            System.out.println("---------------------------------------------------------------------------");




            int choice = sc.nextInt();
            int hp = DiceSix.caracHp();
            int atk = DiceSix.caracAtk();
            int stamina = DiceSix.caracStamina();
            int finalhp;
            int hpH, hpD;



            switch(choice){
                case 1:
                    System.out.println("Vous avez choisi un humain");
                    int atkHuman = atk + 1;
                    int staminaHuman = stamina + 1;
                    if (staminaHuman  < 5) {
                        hpH = hp  - 1;
                    }
                    else if (staminaHuman < 10) {
                        hpH = hp ;
                    }
                    else if (staminaHuman < 15) {
                        hpH = hp  + 1;
                    }
                    else {
                        hpH = hp  + 2;
                    }

                    System.out.println("Vous avez : " + hpH + " HP, " + " " + atkHuman + " ATK, " + " " + staminaHuman + " STAMINA" );

                    return new Human("Humain", hpH, atkHuman, stamina);
                case 2:
                    System.out.println("Vous avez choisi un nain");
                    int staminaDwarf = stamina + 2;
                    if (staminaDwarf  < 5) {
                        hpD = hp  - 1;
                    }
                    else if (staminaDwarf < 10) {
                        hpD = hp ;
                    }
                    else if (staminaDwarf < 15) {
                        hpD = hp  + 1;
                    }
                    else {
                        hpD  = hp  + 2;
                    }

                    System.out.println("Vous avez : " + hpD + " HP, " + " " + atk + " ATK, " + " " + staminaDwarf + " STAMINA " );

                    return new Dwarf("Nain", hpD, atk, stamina);



                default:
                    System.out.println("Choix invalide, veuillez recommencer");
                    break;


            }

        }while(true);




        }
    }

