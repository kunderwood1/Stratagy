public class GuitarHero {

    public static void main(String[] args) {

        GameCharacter player1 = new GameCharacterSlash();
        GameCharacter player2 = new GameCharacterHendrix();
        GameCharacter player3 = new GameCharacterYoung();

        System.out.println(" ");
        System.out.println(player1.toString());
        System.out.println("XXXXXXXXXXXXXXX");
        System.out.println(player2.toString());
        System.out.println("XXXXXXXXXXXXXXX");
        System.out.println(player3.toString());
        System.out.println(" ");

        //add code below to show the swapping of behaviors
        player1.setGuitar(new Telecaster());
        player1.setSolo(new JumpOffStage());
        player2.setGuitar(new Telecaster());
        player2.setSolo(new JumpOffStage());
        player3.setGuitar(new Telecaster());
        player3.setSolo(new JumpOffStage());

        System.out.println(" ");
        System.out.println(player1.toString());
        System.out.println("XXXXXXXXXXXXXXX");
        System.out.println(player2.toString());
        System.out.println("XXXXXXXXXXXXXXX");
        System.out.println(player3.toString());
        System.out.println(" ");

        player1.setGuitar(new GibsonFlyingV());
        player1.setSolo(new GuitarOnFire());
        player2.setGuitar(new GibsonFlyingV());
        player2.setSolo(new GuitarOnFire());
        player3.setGuitar(new GibsonFlyingV());
        player3.setSolo(new GuitarOnFire());

        System.out.println(" ");
        System.out.println(player1.toString());
        System.out.println("XXXXXXXXXXXXXXX");
        System.out.println(player2.toString());
        System.out.println("XXXXXXXXXXXXXXX");
        System.out.println(player3.toString());
        System.out.println(" ");
    }

}
