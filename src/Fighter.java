public class Fighter {
    public String name;
    public int hitPoints;
    public int maxDamage;
    public void printStats(){
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage");

    }

    public void battleRoar(){
        System.out.println("I am " + name + " and I will destroy you!");
    }

    public int attackRoll(){
        return D20.rollD20();
    }


}