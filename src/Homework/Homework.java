package Homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner Homework = new Scanner(System.in);

		System.out.println(
				"Please Select Your Car Brand \npress 1 for Bugatti \npress 2 for Lamborgini \npress 3 for Ferrari \npress 4 for Rolls Royce");
		int make = Homework.nextInt();
		switch (make) {

		case 1:
			System.out.println(
					"For Info about Bugatti La Voiture Noire Press 1 \nFor Info About Bugatti Chiron press 2 ");
			int model = Homework.nextInt();

			if (model == 1) {
				System.out
						.println("$18.9 Million Bugatti \"La Voiture Noire\" Is the Most Expensive New Car Ever Sold");
			} else {
				System.out.println(
						"The Chiron can accelerate from 0–97 km/h (0–60 mph) in 2.4 seconds according to the manufacturer,[4] 0–200 km/h (0–124 mph) in 6.5 seconds and 0–300 km/h (0–186 mph) in 13.6 seconds. In a world-record-setting test at the time in 2017, the Chiron reached 400 km/h (249 mph) in 32.6 seconds, after which it needed 9.4 seconds to brake to standstill");
			}
			break;

		case 2:
			System.out.println(
					"For info about Lamborgini Aventador Press 1 \nFor Info About Lamborgini Huracan perfomante press 2");
			int modeL = Homework.nextInt();

			if (modeL == 1) {
				System.out.println(
						"The Lamborghini Aventador is a two-seater hyper sportscar and was unveiled at the Geneva Motor Show in 2011. The Aventador will replace the Murciélago and uses a 6.5-litre, V12 engine which produces 700 HP at 8,250 rpm and 509 lb-ft at 5,500 rpm");
			} else {
				System.out.println(
						"The Lamborghini Huracán Performante Spyder was unveiled at the 2018 Geneva Motor Show. It takes much of the styling inspiration from the coupé and the outgoing LP 610-4 Spyder. The Spyder is identical to the coupé from performance and technological standpoint, but the acceleration time from 0–97 km/h (0–60 mph) has risen by one-tenth of a second and stands at 3.1 seconds while the 0–200 km/h (0–124 mph) has risen by four-tenths of a second and stands at 9.3 seconds. Due to the loss of the roof, the Spyder weighs 125 kg (276 lb) more than the coupé due to chassis reinforcing components. Top speed remains the same as well and stands at 325 km/h (202 mph). Deliveries of the Spyder began in the fourth quarter of 2018");
			}
			break;

		case 3:
			System.out.println(
					"For info about Ferrari La Ferrari Press 1 \nFor Info About Ferrari 812 Superfast Press 2");
			int modEL = Homework.nextInt();

			if (modEL == 1) {
				System.out.println(
						"Above sports cars, there are exotic sports cars—and then there’s the LaFerrari. Its 789-hp V-12 gets a 161-hp boost from an electric motor—that’s right, it’s a hybrid—enabling it to accelerate like a Bugatti Veyron while achieving somewhat respectable fuel economy. Far prettier than its predecessor, the Enzo, the LaFerrari is styled like a ground-bound fighter jet. Its interior is custom-fit for its owner—as it should be, given its monumental price tag.");
			} else {
				System.out.println(
						" this is the company's most powerful series production road car ever, boasting 800hp, or 789bhp in imperial ponies from its 6.5-litre V12. Note there's not a single turbocharger in sight. Ferrari quotes 0-62mph in 2.9sec and a top speed of 'over 211mph.'");
			}
			break;

		case 4:
			System.out.println("For Info About Rolls Royce Phantom Press 1 \nFor Info About Rolls Royce Ghost Press 2");
			int moDEL = Homework.nextInt();

			if (moDEL == 1) {
				System.out.println(
						"The Phantom is not only the ultimate status symbol, it's the Holy Grail of handcrafted luxury automobiles. Its decadent design is derived from an aluminum structure that rides atop an air suspension for euphoric comfort. Want to show the world you've arrived? You need a Phantom.");
			} else {
				System.out.println(
						"The Ghost is a Rolls-Royce to take when the parking is tighter and the chauffeur’s got the day off. Smaller, in the same way a tanker is to a supertanker, the Ghost keeps Rolls-Royce’s imperious manner, but hides it behind slightly more bluff edges and not quite as aggrandising a front grille.");
			}
			break;
		default:
			System.out.println("Ivalid Selection");

		}

	}

}
