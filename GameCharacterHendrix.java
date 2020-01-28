public class GameCharacterHendrix extends GameCharacter {
    GameCharacterHendrix() {
    }

    @Override
    public String toString() { return "Playing as Jimi Hendrix on a " + Guitar.play() + ", the Solo is " + Solo.solo(); }
}
