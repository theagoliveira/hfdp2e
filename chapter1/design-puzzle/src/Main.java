public class Main {

    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character troll = new Troll();
        Character knight = new Knight();

        System.out.println("king fight:");
        king.fight();
        System.out.println("queen fight:");
        queen.fight();
        System.out.println("troll fight:");
        troll.fight();
        System.out.println("knight fight:");
        knight.fight();
        System.out.println("king fight:");
        king.setWeapon(new AxeBehavior());
        king.fight();
    }

}
