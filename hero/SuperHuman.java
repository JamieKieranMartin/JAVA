package hero;

import java.util.Arrays;
import java.util.HashSet;

public class SuperHuman extends SuperHero {
    HashSet<SuperPower> powers;

    public SuperHuman(String realName, String secretIdentity, SuperPower[] innatePowers) {
        super(realName, secretIdentity);
        this.powers = new HashSet<SuperPower>(Arrays.asList(innatePowers));
    }

    public void acquirePowers(SuperPower[] newPowers) {
        powers.addAll(Arrays.asList(newPowers));
    }

    public boolean hasPower(SuperPower queriedPower) {
        return powers.contains(queriedPower);
    }

    public void losePowers(SuperPower[] oldPowers) {
        powers.removeAll(Arrays.asList(oldPowers));
    }

    public int totalPower() {
        int sum = 0;
        for (SuperPower power : powers) {
            sum += power.getValue();
        }
        return sum;
    }
}
