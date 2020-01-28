public class GameCharacterSlash extends GameCharacter {
    GameCharacterSlash() {
    }
    @Override
    public String toString() {
        return "Playing as Slash on a " + Guitar.play() + ", the Solo is " + Solo.solo();
    }
}
