public class FighterTest {
    public static void main(String[] args) {
        Fighter arata = new Fighter();
        arata.name = "Arata";
        arata.hitPoints = 17;
        arata.maxDamage = 14;
        arata.printStats();
        arata.battleRoar();

        Fighter sozalix = new Fighter();
        sozalix.name = "Sozalix";
        sozalix.battleRoar();

        int attackRoll = arata.attackRoll();
        System.out.println("Arata attacks and rolls a " + attackRoll);
    }

}
