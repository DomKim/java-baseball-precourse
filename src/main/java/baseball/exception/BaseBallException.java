package baseball.exception;

import baseball.domain.GameRules;

public class BaseBallException {
    private static final String SPLITTER ="";
    private static final String EXCEEDED_NUMBER_SIZE_MESSAGE ="숫자가 세자리 수 이상입니다.";
    private static final String DUPLICATE_NUMBER_MESSAGE ="중복되는 숫자가 있습니다.";

    public static void overSizeNumberException(String[] inputNumbersByPlayer){

        if (inputNumbersByPlayer.length> GameRules.NUMBER_OF_POSITION.getValue()){
            throw new IllegalArgumentException(EXCEEDED_NUMBER_SIZE_MESSAGE);
        }

    }

    public static void duplicatedNumberException(int totalSizeAfterRemoveDuplicates){
        if(totalSizeAfterRemoveDuplicates < GameRules.NUMBER_OF_POSITION.getValue()){
            throw new IllegalArgumentException(DUPLICATE_NUMBER_MESSAGE);
        }
    }
}
