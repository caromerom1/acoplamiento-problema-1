package cars;

public class Dashboard {

	public Dashboard() {
	}

	public void printDashboard(int rpm, int speed, float oilLevel, float gasLevel) {
		System.out.println("--------------------------------");
		System.out.println("DASHBOARD:");
		System.out.println("\t RPM: " + rpm);
		System.out.println("\t Speed: " + speed);
		System.out.println("\t Oil level: " + oilLevel);
		System.out.println("\t Gas level: " + gasLevel);
	}
}
