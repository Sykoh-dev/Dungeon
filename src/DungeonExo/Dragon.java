package DungeonExo;

public final class Dragon extends Monster implements LootGold, LootLeather {

    public Dragon(String name, int hp, int atk, int stamina) {
        super(name, hp, atk, stamina);
    }

    private int gold= (int) (Math.random()*3 + 1);

    public int getGold() {
        return gold;
    }

    public int gold(){
        getGold();
        return gold;
    }


    private int leather= (int) (Math.random()*3 + 1);

    public int getLeather() {
        return leather;
    }

    public int leather(){
        getLeather();
        return leather;
    }
}
