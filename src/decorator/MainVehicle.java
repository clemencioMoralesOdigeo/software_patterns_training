package decorator;

public class MainVehicle {

	public static void main(String [] args) {

		Component vehicle = new Vehicle("Basic vehicle without extras", 15000);

		Component packageGps = new GPS(vehicle);
		Component packageMusic = new MP3(packageGps);
		Component packageLuxury = new EDS(packageMusic);

		System.out.println(packageGps.getDescription());
		System.out.println(packageGps.getPrice());
		System.out.println();
		System.out.println(packageMusic.getDescription());
		System.out.println(packageMusic.getPrice());
		System.out.println();
		System.out.println(packageLuxury.getDescription());
		System.out.println(packageLuxury.getPrice());
	}
}

