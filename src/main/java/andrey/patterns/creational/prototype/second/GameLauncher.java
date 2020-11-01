package andrey.patterns.creational.prototype.second;

public class GameLauncher {
    Game game;

    public GameLauncher(Game game) {
        this.game = game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    Game launchGame() {
        return (Game) game.copy();
    }
}
