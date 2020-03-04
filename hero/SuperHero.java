package hero;

public abstract class SuperHero implements Hero {
    String trueIdentity;
    String alterEgo;
    String currentIdentity;

    public SuperHero(String trueIdentity, String alterEgo) {
        this.trueIdentity = trueIdentity;
        this.currentIdentity = trueIdentity;
        this.alterEgo = alterEgo;
    }

    public String currentIdentity() {
        return currentIdentity;
    }

    public void switchIdentity() {
        if (currentIdentity == trueIdentity) {
            currentIdentity = alterEgo;
        } else {
            currentIdentity = trueIdentity;
        }
    }

    abstract boolean hasPower(SuperPower power);
    abstract int totalPower();
}
