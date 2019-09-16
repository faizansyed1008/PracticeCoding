package polymorphsim;

public class MainCarMethod {

	public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startengine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startengine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startengine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Toyota holden = new Toyota(6, "Toyota Corolla");
        System.out.println(holden.startengine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }

}
	


