package baseball.domain;

import java.util.LinkedHashSet;

public class GameHost {
    private BaseBalls baseBalls;
    public static void prepareForGame(){
        LinkedHashSet<BaseBall> baseBalls = BaseBalls.generateRandomBalls(GameRules.NUMBER_OF_POSITION.getValue());


    }
}
