public class Console {
    public static void main(String[] args) {
        Player emrah = new Player("Emrah", -80, Weapon.SWORD);
        Player osman = new Player("Osman", 1000, Weapon.AXE);

        System.out.println(emrah);
        System.out.println(osman);

        System.out.println("**********");

        emrah.restore(100);
        emrah.loseHealth(30);
        System.out.println(emrah.healthRemaining());
        emrah.loseHealth(100);
        System.out.println(emrah.healthRemaining());

        osman.loseHealth(50);

        osman.restore(80);
        System.out.println(osman.healthRemaining());

    }
}
