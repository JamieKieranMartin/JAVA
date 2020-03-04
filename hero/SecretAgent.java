package hero;

public class SecretAgent extends Object implements Hero {
    String trueIdentity;
    String alterEgo;
    String currentIdentity;
    String gadget;

    public SecretAgent(String trueName, String codeName, String gadget) {
        this.trueIdentity = trueName;
        this.currentIdentity = trueName;
        this.alterEgo = codeName;
        this.gadget = gadget;
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

    public String getGadget() {
        return gadget;
    }

}
