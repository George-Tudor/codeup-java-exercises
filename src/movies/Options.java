package movies;

import util.Input;

public class Options {

    Input input = new Input();

    public void optionsMenu() {

        int userInput;
        do {
            PrintMenu.printMenu();
            userInput = input.getInt(0, 5);

            switch (userInput) {
                case 1 -> showCategory(null);
                case 2 -> showCategory("animated");
                case 3 -> showCategory("drama");
                case 4 -> showCategory("horror");
                case 5 -> showCategory("scifi");
            }
        } while (userInput != 0);
        System.out.println(Colors.ANSI_PURPLE + "Thank you for silencing your cell phone, and not talking during the movie!" + Colors.ANSI_RESET);
    }

    public void showCategory(String category) {
        for(Movie movie : MoviesArray.findAll()) {
            if(category == null || movie.getCategory().equals(category)) {
                System.out.println(movie);
            }
        }
    }


}
