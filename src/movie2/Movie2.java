package movie2;

public class Movie2 implements Entertains{

    private String name;
    private String director;

    public Movie2() {};

    public Movie2(String name, String director) throws IllegalArgumentException {
        if(name == null || name.isBlank() || director == null || director.isBlank()) {
            throw new IllegalArgumentException("Must enter both a name and director");
        }
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;


    }

    @Override
    public String audienceReaction() {
        return "ooooooooohhhh " + this.name + " was so awesome!";
    }
}
