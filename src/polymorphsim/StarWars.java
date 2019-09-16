package polymorphsim;

public class StarWars extends movie {
	
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }

}