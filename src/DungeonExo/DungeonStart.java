package DungeonExo;


import java.util.Scanner;


public class DungeonStart {



    public static void main(String[] args) {

        boolean play = true, isAlive, jouer = true;
        int damage, bag = 0, goldBag = 0;
        Character monster;
        Character hero;
        Scanner sc = new Scanner(System.in);




        // Message d'acceuil du jeu
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("---                                HEROES VS MONSTERS                                           ---");
        System.out.println("---                                |                                                            ---");
        System.out.println("---                      O=========|>>>>>>>>>>>>>>>>>>>>>>>>>>                                  ---");
        System.out.println("---                                |                                                            ---");
        System.out.println("--- Bienvenue dans la forêt de Shorewood aventurier                                             ---");
        System.out.println("--- d'après les légendes, cette forêt est magique et regorge de trésor                          ---");
        System.out.println("--- cependant, ils sont gardé par de féroce monstres                                            ---");
        System.out.println("--- oserez-vous y pénétrer afin d'affronter ces dangers et récolter la gloire et richesse ?     ---");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println();

        //Boucle de mon jeu pour rejouer
        while(jouer){

            //Choix du personnage
            hero = Heroes.heroChoose();
            int heroHp = hero.getHp();


            //Boucle qui relance un combat tant que mon personnage gagne
            while(play){
                isAlive = true;

                // Choix d'un monstre aléatoire
                monster = Monster.generateMonster();
                System.out.print("Press any key to continue . . . ");
                sc.nextLine();
                System.out.println();
                System.out.println("--------------------");

                //Boucle de combat entre le héro choisi et le monstre aléatoire
                while(isAlive) { // Boolean initialisé à true

                    //Si le hero ou le monstre ont plus de 0hp on attaque, sinon on sort de la boucle
                    if (hero.getHp() > 0 && monster.getHp() > 0){
                        System.out.println("Vous attaquez");
                        damage = DiceFour.atk();
                        System.out.println(hero.getName() + " attaque de : " + damage + " de dégàts à " + monster.getName() + "!");
                        monster.setHp(monster.getHp() - damage);
                        System.out.println("il reste " + monster.getHp() + " HP à " + monster.getName());
                    }
                    else{
                        isAlive = false;
                    }

                    //Si le hero ou le monstre ont plus de 0hp on attaque, sinon on sort de la boucle
                    if (monster.getHp() > 0 && hero.getHp() > 0){
                        System.out.println("Le monstre attaque");
                        damage = DiceFour.atk();
                        System.out.println(monster.getName() + " attaque de : " + damage + "de dégàts à " + hero.getName() + "!");
                        hero.setHp(hero.getHp() - damage);
                        System.out.println("il vous reste " + hero.getHp() + " HP " );
                    }
                    else{
                        isAlive = false;
                    }

                }


                //Affichage d'état du héro gagnant ou vaincu
                if( hero.getHp() > 0 ) {
                    System.out.println(" Vous avez vaincu " + monster.getName());
                    System.out.println("--------------------");
                    System.out.println();
                    isAlive = true;
                    hero.setHp(heroHp); // remise au max des pv du héro


                    // Condition qui récupère le butin des monstres vaincus
                    if (monster.getName().equals("Dragon")){
                        bag += ((Dragon)monster).leather();
                        goldBag += ((Dragon)monster).gold();
                    }
                    else if (monster.getName().equals("Loup")){
                        bag +=  ((Wolf)monster).leather();
                    }
                    else if (monster.getName().equals("Orc")){
                        goldBag += ((Orc)monster).gold();
                    }

                }
                else{
                    System.out.println("!!!!Vous êtes mort!!!!");
                    System.out.println("Vous avez accumulez" + " " + goldBag + " or et " + bag + " cuir"   ); //affichage du butin
                    play = false;

                }


            }
            play = true;
            System.out.println("----------------------------------------");
            System.out.println("--- Voulez vous rejouer une partie ? ---");
            System.out.println("----------------------------------------");
            jouer = Boolean.parseBoolean(sc.nextLine());
        }


        System.out.println("Merci d'avoir joué, à bientôt");

    }
}
