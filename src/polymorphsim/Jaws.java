package polymorphsim;

public class Jaws extends movie{

	   public Jaws() {
	        super("Jaws");
	    }

	    @Override
	    public String plot() {
	        return "A shark eats lots of people";
	    }

	}
