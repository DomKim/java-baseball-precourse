package baseball.domain;

import baseball.exception.BaseBallException;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedHashSet;

public class BaseBalls {
    private final LinkedHashSet<BaseBall> baseBalls;
    private static final String SPLITTER = "";

    public BaseBalls(LinkedHashSet<BaseBall> baseBalls) {
        this.baseBalls = baseBalls;
    }

    public static BaseBalls of(LinkedHashSet<BaseBall> baseBalls){
        return new BaseBalls(baseBalls);
    }

    public LinkedHashSet<BaseBall> getBaseBalls() {
        return baseBalls;
    }

    public static BaseBalls generateRandomBalls(int listSize){
        LinkedHashSet<BaseBall> baseBalls = new LinkedHashSet<>();
        int position = 1;

        while (listSize == baseBalls.size()) {
            int randomNumber = Randoms.pickNumberInRange(GameRules.MIN_NUMBER_IN_RANGE.getValue(),GameRules.MAX_NUMBER_IN_RANGE.getValue());
            position = ifAddedToBaseBallsIncreasePosition(baseBalls, position, randomNumber);
        }

        return new BaseBalls(baseBalls);
    }

    private static int ifAddedToBaseBallsIncreasePosition(LinkedHashSet<BaseBall> baseBalls, int position, int randomNumber) {
        if (baseBalls.add(BaseBall.of(randomNumber, position))) {
            position++;
        }
        return position;
    }

    public static BaseBalls generateBallsForPlayer(int listSize, int threeNumbers){
        String[] numbers = Integer.toString(threeNumbers).split(SPLITTER);
        BaseBallException.overSizeNumberException(numbers);
        LinkedHashSet<BaseBall> baseBalls = new LinkedHashSet<>();

        for (int position = 0; position < listSize;) {
            baseBalls.add(BaseBall.of(Integer.parseInt(numbers[position]), ++position));
        }
        BaseBallException.duplicatedNumberException(baseBalls.size());

        return new BaseBalls(baseBalls);
    }

}
