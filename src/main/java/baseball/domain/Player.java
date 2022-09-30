package baseball.domain;

import java.util.LinkedHashSet;

public class Player {



    private BaseBalls baseBalls;

    private Player(BaseBalls baseBalls) {
        this.baseBalls = baseBalls;
    }


    public static Player prepareForGame(int numbersFromPlayer){
        BaseBalls baseBalls = BaseBalls.generateBallsForPlayer(GameRules.NUMBER_OF_POSITION.getValue(), numbersFromPlayer);
        return new Player(baseBalls);
    }

    public LinkedHashSet<BaseBall> getBaseBalls() {
        return baseBalls.getBaseBalls();
    }

    public void setBaseBalls(int numbersFromPlayer) {
        this.baseBalls = BaseBalls.generateBallsForPlayer(GameRules.NUMBER_OF_POSITION.getValue(), numbersFromPlayer);
    }
}
