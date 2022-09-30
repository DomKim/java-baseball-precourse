package baseball.domain;

import java.util.Objects;

public class BaseBallForJudge {
    private final int number;
    private final int position;

    public BaseBallForJudge(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public static BaseBallForJudge of(BaseBall baseball){
        return new BaseBallForJudge(baseball.getNumber(), baseball.getPosition());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseBallForJudge)) return false;
        BaseBallForJudge that = (BaseBallForJudge) o;
        return number == that.number && position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, position);
    }
}
