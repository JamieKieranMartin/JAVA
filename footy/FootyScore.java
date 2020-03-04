package footy;

public class FootyScore {
    private int goals;
    private int behinds;

    public int getPoints() {
        return (goals * 6) + behinds;
    }

    public void kickGoal() {
        goals++;
    }

    public void kickBehind() {
        behinds++;
    }

    public String sayScore() {
        return goals + ", " + behinds + ", " + getPoints();
    }

    public boolean inFrontOf(FootyScore otherTeam) {
        return getPoints() > otherTeam.getPoints();
    }
}