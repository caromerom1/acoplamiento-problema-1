package cars;

public class Car {
	private Motor motor;

	public Car(Motor motor) {
		this.motor = motor;
	}

	public void accelerate() {
		this.motor.accelerate();
	}

	public void stop() {
		this.motor.stop();
	}

	public static void main(String[] args) {
		Motor motor = new Motor();
		Dashboard dashboard = new Dashboard();
		Car car = new Car(motor);

		dashboard.printDashboard(motor.getRpm(), motor.getSpeed(), motor.getOilLevel(), motor.getGasLevel());
		car.accelerate();
		dashboard.printDashboard(motor.getRpm(), motor.getSpeed(), motor.getOilLevel(), motor.getGasLevel());
		car.stop();
		dashboard.printDashboard(motor.getRpm(), motor.getSpeed(), motor.getOilLevel(), motor.getGasLevel());
	}
}
