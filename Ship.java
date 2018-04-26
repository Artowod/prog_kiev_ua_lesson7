package ua.prog.java.lesson7;

public class Ship implements Runnable {

	private ShipsAndDocks unloading;
	private int shipNumber;
	private int boxesNumbers;

	public Ship(ShipsAndDocks currentShip, int shipNumber, int boxesNumbers) {
		this.unloading = currentShip;
		this.shipNumber = shipNumber;
		this.boxesNumbers = boxesNumbers;

	}

	public int getShipNumber() {
		return shipNumber;
	}

	@Override
	public void run() {
		System.out.println("Ship number " + this.getShipNumber() + " is ready.");
		unloading.unloadBoxes(this);

		for (int i = 1; i <= boxesNumbers; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.getStackTrace();
			}
			System.out.println(i + " boxes are unloaded by Ship num. " + shipNumber);
		}
		System.out.println("Ship num " + shipNumber + " has left the Dock.");
		unloading.releaseDock();
	}

}
