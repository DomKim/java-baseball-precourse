package baseball.domain;

public class BallCount {
    private final int strike;
    private final int ball;

    public BallCount(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isNothing(){
        return this.strike==0 && this.ball==0;
    }

    public boolean isStrike(){
        return this.strike==3;
    }

    @Override
    public String toString() {
        if(isNothing()){
            return "낫싱";
        }
        if(this.ball==0){
            return this.strike + "스트라이크";
        }
        if(this.strike==0){
            return this.ball + "볼";
        }
        return this.ball + "볼" + " " + this.strike + "스트라이크";
    }
}
