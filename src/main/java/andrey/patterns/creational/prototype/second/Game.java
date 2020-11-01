package andrey.patterns.creational.prototype.second;

public class Game implements Copyable{
    private int gameLevel;
    private String characterName;
    private String lastLocation;

    public Game(int gameLevel, String characterName, String lastLocation) {
        this.gameLevel = gameLevel;
        this.characterName = characterName;
        this.lastLocation = lastLocation;
    }

    public int getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(int gameLevel) {
        this.gameLevel = gameLevel;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getLastLocation() {
        return lastLocation;
    }

    public void setLastLocation(String lastLocation) {
        this.lastLocation = lastLocation;
    }

    @Override
    public Object copy() {
        Game copy = new Game(gameLevel, characterName, lastLocation);
        return copy;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameLevel=" + gameLevel +
                ", characterName='" + characterName + '\'' +
                ", lastLocation='" + lastLocation + '\'' +
                '}';
    }
}
