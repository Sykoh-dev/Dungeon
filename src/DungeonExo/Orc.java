package DungeonExo;

public final class Orc extends Monster implements LootGold {

    public Orc(String name, int hp, int atk, int stamina) {
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
}
