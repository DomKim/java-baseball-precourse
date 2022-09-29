package baseball.domain;

public enum GameRules {
    NUMBER_OF_POSITION(3),
    MIN_NUMBER_IN_RANGE(1),
    MAX_NUMBER_IN_RANGE(9)
    ;
    private final int value;
    GameRules(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
