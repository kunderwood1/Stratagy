public abstract class GameCharacter {
    GuitarBehavior Guitar;
    SoloBehavior Solo;
    GameCharacter() {
        Guitar = new GibsonSG();
        Solo = new SmashTheGuitar();

    }

    void setGuitar(GuitarBehavior guitar) { this.Guitar = guitar; }

    void setSolo(SoloBehavior solo) { this.Solo = solo; }


    @Override
    public String toString() {
        return "GameCharacter{" +
                "Guitar=" + Guitar +
                ", Solo=" + Solo +
                '}';
    }
}
