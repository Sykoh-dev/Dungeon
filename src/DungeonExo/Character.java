package DungeonExo;

public  class Character {

    //Variable pour les stats de base des personnages
    private String name;
    private int hp;
    private final int atk;
    private final int stamina;


    //Constructor
    public Character(String name, int hp, int atk, int stamina) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.stamina = stamina;

    }



    //Getter-Setter




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }


    public int getStamina() {
        return stamina;
    }


}
