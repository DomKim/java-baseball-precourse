package baseball.domain;

import java.util.List;

public class BaseBalls {
    private final List<BaseBall> baseBalls;

    public BaseBalls(List<BaseBall> baseBalls) {
        this.baseBalls = baseBalls;
    }

    public static BaseBalls of(List<BaseBall> baseBalls){
        return new BaseBalls(baseBalls);
    }

    public List<BaseBall> getBaseBalls() {
        return baseBalls;
    }
}
