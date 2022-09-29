package baseball.domain;

import java.util.Objects;

public class BaseBall {
    private final int number;
    private final int position;

    public BaseBall(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public static BaseBall of(int number , int position){
        return new BaseBall(number,position);
    }

    public int getNumber() {
        return number;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseBall)) return false;
        BaseBall baseBall = (BaseBall) o;
        return number == baseBall.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
