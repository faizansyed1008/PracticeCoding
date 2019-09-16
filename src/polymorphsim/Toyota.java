package polymorphsim;

public class Toyota extends Car {

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startengine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }

}
