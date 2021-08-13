package DungeonExo;

public final class Wolf extends Monster implements LootLeather {

    public Wolf(String name, int hp, int atk, int stamina) {
        super(name, hp, atk, stamina);
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
