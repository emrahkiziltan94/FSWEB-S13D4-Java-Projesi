public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        checkHealthPercentage(healthPercentage);
        this.weapon = weapon;
    }

    private void checkHealthPercentage(int healthPercentage) {
        if (healthPercentage < 0)
            this.healthPercentage = 0;
        else if (healthPercentage > 100)
            this.healthPercentage = 100;
        else
            this.healthPercentage = healthPercentage;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        int healthRemain = healthPercentage - damage;
        if (healthRemain <= 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        healthPercentage = healthRemain;
        checkHealthPercentage(healthPercentage);
    }

    public void restore(int healthPotion) {
        this.healthPercentage += healthPotion;
        checkHealthPercentage(this.healthPercentage);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + (weapon.getDamage() + "-" + weapon.getAttackSpeed()) +
                '}';
    }
}
