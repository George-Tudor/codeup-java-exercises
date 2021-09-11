public class Lion {
    private String name;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeNoise() {
        System.out.println(name + " goes " + sound + "!!!");
    }


}
