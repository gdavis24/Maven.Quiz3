package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSOR("SCISSOR");

    private final String value;

    RockPaperScissorHandSign(String value) {
        this.value = value;
    }

    public RockPaperScissorHandSign getWinner() {
        return null;
    }

    public RockPaperScissorHandSign getLoser() {
        return null;
    }
}
