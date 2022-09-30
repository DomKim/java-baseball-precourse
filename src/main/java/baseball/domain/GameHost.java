package baseball.domain;

import java.util.LinkedHashSet;

public class GameHost {

    private final BaseBalls baseBalls;

    private GameHost(BaseBalls baseBalls) {
        this.baseBalls = baseBalls;
    }

    public static GameHost prepareForGame(){
        BaseBalls baseBalls = BaseBalls.generateRandomBalls(GameRules.NUMBER_OF_POSITION.getValue());
        return new GameHost(baseBalls);
    }

    public LinkedHashSet<BaseBall> getBaseBalls() {
        return baseBalls.getBaseBalls();
    }
}
