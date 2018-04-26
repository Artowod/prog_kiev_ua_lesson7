package ua.prog.java.lesson7;

public class ShipsAndDocks {

	static final int DOCKS = 2;
	private int fullDocks = 0;

	public ShipsAndDocks() {
		super();
	}

	public int getFullDocks() {
		return fullDocks;
	}

	public synchronized void setFullDocks(int fullDocks) {
		this.fullDocks = fullDocks;
	}

	public synchronized boolean isDockFull() {
		if (fullDocks == DOCKS) {
			return true;
		} else {
			fullDocks += 1;
			return false;
		}
	}

	public synchronized void releaseDock() {
		notifyAll();
		setFullDocks(fullDocks - 1);
	}

	public void unloadBoxes(Ship currentShip) {
		int shipNumber = currentShip.getShipNumber();
		for (; isDockFull();) {
			System.out.println(shipNumber + " is waiting...");
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.getMessage();
				}
			}
		}
		System.out.println("Start! " + shipNumber);
	}
}
