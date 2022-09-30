package baseball.domain;

import baseball.views.InputViews;
import camp.nextstep.edu.missionutils.Console;

import java.util.Objects;

public class Referee {
    public static boolean playBall(){
        PlayGround playGround = PlayGround.prepareForGame();
        while(!judge(playGround)){
            playGround.playerRetry();
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        return true;
    }

    public static boolean judge(PlayGround playGround){
        BallCount ballCount = playGround.compareBetweenGameHostAndPlayer();
        ballCount.toString();

        return ballCount.isStrike();
    }
}
