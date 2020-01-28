public class GameCharacterYoung extends GameCharacter {
    GameCharacterYoung() {
    }
    @Override
    public String toString() {
        return "Playing as Angus Young on a " + Guitar.play() + ", the Solo is " + Solo.solo();
    }
}
