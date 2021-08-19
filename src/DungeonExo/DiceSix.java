package DungeonExo;

public class DiceSix {

        public static int caracAtk(){


        //Création d'un tableau
        int[] tab = new int[4];
        int temp, caracFinalAtk;

        //Lancement d'un dé de 6 faces et ajout au tableau par une boucle
        for ( int i = 0; i < 4; i++ ){


            int d1 = (int) (Math.random()*5 + 1);
            tab[i] = d1;
        }

            //Boucle pour comparer les valeurs
            for ( int j = 1; j < (4-1); j++)
            {
                if (tab[j-1] > tab[j])
                {
                    temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }
            }

            //Addition des trois plus grosses valeurs avec les indices 1, 2 et 3
            caracFinalAtk = tab[1] + tab[2] + tab[3];

            return caracFinalAtk;



    }


    public static int caracStamina() {


        //Création d'un tableau
        int[] tab = new int[4];
        int temp, caracFinalStamina;

        //Lancement d'un dé de 6 faces et ajout au tableau par une boucle
        for (int i = 0; i < 4; i++) {


            int d1 = (int) (Math.random() * 5 + 1);
            tab[i] = d1;
        }

        //Boucle pour comparer les valeurs
        for (int j = 1; j < (4 - 1); j++) {
            if (tab[j - 1] > tab[j]) {
                temp = tab[j - 1];
                tab[j - 1] = tab[j];
                tab[j] = temp;
            }
        }

        //Addition des trois plus grosses valeurs
        caracFinalStamina = tab[1] + tab[2] + tab[3];



        return caracFinalStamina;

    }

    public static int caracHp(){


        //Création d'un tableau
        int[] tab = new int[4];
        int temp, caracFinalHp;

        //Lancement d'un dé de 6 faces et ajout au tableau par une boucle
        for (int i = 0; i < 4; i++) {


            int d1 = (int) (Math.random() * 5 + 1);
            tab[i] = d1;
        }

        //Boucle pour comparer les valeurs
        for (int j = 1; j < (4 - 1); j++) {
            if (tab[j - 1] > tab[j]) {
                temp = tab[j - 1];
                tab[j - 1] = tab[j];
                tab[j] = temp;
            }
        }

        //Addition des trois plus grosses valeurs
        caracFinalHp = tab[1] + tab[2] + tab[3];

        return caracFinalHp;
    }
}
