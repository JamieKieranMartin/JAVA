package hero;

import java.util.Arrays;
import java.util.HashSet;

public class EnhancedHuman extends SuperHero {
    HashSet<SuperPower> powers;

    public EnhancedHuman(String normalIdentity, String enhancedIdentity, SuperPower[] acquiredPowers) {
        super(normalIdentity, enhancedIdentity);
        this.powers = new HashSet<SuperPower>(Arrays.asList(acquiredPowers));
    }

    public void switchIdentity() {
        super.switchIdentity();
    }

    public boolean hasPower(SuperPower power) {
        if (currentIdentity == trueIdentity) {
            return false;
        }
        return powers.contains(power);
    }

    public int totalPower() {
        int sum = 0;
        if (currentIdentity != trueIdentity) {
            for (SuperPower power : powers) {
                sum += power.getValue();
            }
        }
        return sum;
    }
}
