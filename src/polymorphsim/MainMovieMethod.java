package polymorphsim;

public class MainMovieMethod {

	public static void main(String[] args) {
        for(int i=1; i<3; i++) {
            movie movie = randomMovie();
            System.out.println("Movie #" + i +
                            " : " + movie.getName() + "\n" +
                            "Plot: " + movie.plot() + "\n");
        }
    
    
}
    
    public static movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new TheGodFather();
            case 4:
                return new StarWars();
            case 5:
                return new Braveheart();
        }

        return null;
    }
    
    public static movie allMovie() {
        
        return null;
    }

}

