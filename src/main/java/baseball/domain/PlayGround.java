package baseball.domain;

import baseball.views.InputViews;

import java.util.LinkedHashSet;

public class PlayGround {
    private final GameHost gameHost;
    private final Player player;

    private PlayGround(GameHost gameHost, Player player) {
        this.gameHost = gameHost;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public GameHost getGameHost() {
        return gameHost;
    }


    public static PlayGround prepareForGame(){
        GameHost gameHost = GameHost.prepareForGame();
        int threeBalls = InputViews.getBallNumberByPlayer();
        Player player = Player.prepareForGame(threeBalls);

        return new PlayGround(gameHost , player);
    }

    public void playerRetry(){
        int threeBalls = InputViews.getBallNumberByPlayer();
        player.setBaseBalls(threeBalls);
    }

    public BallCount compareBetweenGameHostAndPlayer(){

        LinkedHashSet<BaseBall> hostBaseBalls = gameHost.getBaseBalls();
        LinkedHashSet<BaseBall> playerBaseBalls = player.getBaseBalls();

        return new BallCount(getBallCount(hostBaseBalls,playerBaseBalls),getStrikeCount(hostBaseBalls,playerBaseBalls));
    }

    public int getBallCount(LinkedHashSet<BaseBall> hostBaseBalls ,LinkedHashSet<BaseBall> playerBaseBalls){
        LinkedHashSet<BaseBall> baseBallsForJudgeBall = new LinkedHashSet<>();
        baseBallsForJudgeBall.addAll(hostBaseBalls);
        baseBallsForJudgeBall.addAll(playerBaseBalls);
        int totalSize = hostBaseBalls.size() + playerBaseBalls.size();

        return totalSize - baseBallsForJudgeBall.size();
    }

    public int getStrikeCount(LinkedHashSet<BaseBall> hostBaseBalls ,LinkedHashSet<BaseBall> playerBaseBalls){
        LinkedHashSet<BaseBallForJudge> baseBallsForJudgeStrike = getBaseBallForJudges(hostBaseBalls, playerBaseBalls);
        int totalSize = hostBaseBalls.size() + playerBaseBalls.size();

        return totalSize - baseBallsForJudgeStrike.size();

    }

    private LinkedHashSet<BaseBallForJudge> getBaseBallForJudges(LinkedHashSet<BaseBall> hostBaseBalls, LinkedHashSet<BaseBall> playerBaseBalls) {
        LinkedHashSet<BaseBallForJudge> baseBallsForJudgeStrike = new LinkedHashSet<>();
        for (BaseBall nextBaseBall : hostBaseBalls) {
            baseBallsForJudgeStrike.add(BaseBallForJudge.of(nextBaseBall));
        }
        for (BaseBall nextBaseBall : playerBaseBalls) {
            baseBallsForJudgeStrike.add(BaseBallForJudge.of(nextBaseBall));
        }
        return baseBallsForJudgeStrike;
    }
}
