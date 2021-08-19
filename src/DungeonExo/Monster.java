package DungeonExo;

import java.util.Random;

public class Monster extends Character {

    public Monster(String name, int hp, int atk, int stamina) {
        super(name, hp, atk, stamina);
    }




    //Methode d'un choix de monstre aléatoire parmis trois possibilitées
    public static Monster generateMonster(){

        Random rand = new Random();


        int hp = DiceSix.caracHp();
        int atk = DiceSix.caracAtk();
        int stamina = DiceSix.caracStamina();
        int finalhp, atkOrc;




        while(true){
            switch(rand.nextInt(3) + 1){

                case 1:  // C'est un loup

                    System.out.println("--->Un loup apparaît<---");
                    System.out.println("le combat commence!");
                    //Modificateur de stat
                    if (stamina  < 5) {
                        finalhp = hp  - 1;
                    }
                    else if (stamina < 10) {
                        finalhp = hp ;
                    }
                    else if (stamina < 15) {
                        finalhp = hp  + 1;
                    }
                    else {
                        finalhp = hp  + 2;
                    }

                    System.out.println("Le loup a : " + finalhp + "HP," + " " + atk + "ATK," + " " + stamina + "STAMINA" );
                    return new Wolf("Loup",  finalhp, atk, stamina);

                case 2: // C'est un orc
                    System.out.println("--->Un orc apparaît<---");
                    System.out.println("le combat commence!");

                    atkOrc = atk + 1; // Ajout d'attaque car c'est un orc
                    //Modificateur de stat
                    if (stamina  < 5) {
                        finalhp = hp  - 1;
                    }
                    else if (stamina < 10) {
                        finalhp = hp ;
                    }
                    else if (stamina < 15) {
                        finalhp = hp  + 1;
                    }
                    else {
                        finalhp = hp  + 2;
                    }

                    System.out.println("L'orc a  : " + finalhp + "HP," + " " + atkOrc + "ATK," + " " + stamina + "STAMINA" );
                    return new Orc("Orc",  finalhp, atkOrc, stamina);

                case 3: // C'est un dragon

                    System.out.println("--->Un dragon apparaît<---");
                    System.out.println("le combat commence!");

                    stamina = stamina + 1; // Ajout d'endurance car Dragon
                    //Modificateur de stat
                    if (stamina  < 5) {
                        finalhp = hp  - 1;
                    }
                    else if (stamina < 10) {
                        finalhp = hp ;
                    }
                    else if (stamina < 15) {
                        finalhp = hp  + 1;
                    }
                    else {
                        finalhp = hp  + 2;
                    }

                    System.out.println("Le dragon a : " + finalhp + "HP," + " " + atk + "ATK," + " " + stamina + "STAMINA" );
                    return new Dragon("Dragon",  finalhp, atk, stamina);
            }
        }
    }
}
