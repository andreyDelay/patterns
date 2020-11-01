package andrey.patterns.creational.prototype.second;

public class Launcher {
    public static void main(String[] args) {
        Game game = new Game(1, "Andrey", "street");

        System.out.println(game);

        GameLauncher launcher = new GameLauncher(game);
        Game gameClone = launcher.launchGame();
        System.out.println(gameClone);
    }
}
