package hero;

public class Human extends SuperHero {

    public Human(String realName, String secretIdentity) {
        super(realName, secretIdentity);
    }

    public boolean hasPower(SuperPower power) {
        return false;
    }

    public int totalPower() {
        return 0;
    }
}
