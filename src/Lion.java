import org.w3c.dom.ls.LSOutput;

public class Lion {
    public String name;
    public String sound;

//    public void setName(String name) {
//        this.name = name;
//    }

//    public String getName() {
//        return name;
//    }

    public void makeNoise() {

        System.out.println(name + " goes " + sound + "!!!");
    }

    public String randomQuote() {
        return  Quote.randomQuote();
    }
}
