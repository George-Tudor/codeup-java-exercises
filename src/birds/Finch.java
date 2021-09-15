package birds;

public class Finch extends  Bird{
    public void makeNoise() {
        //call the superclass makenoise method
        super.makeNoise();
        //then add extra custom cocde after running the superclass code
        System.out.println("Chirp chirp");
    }
}
