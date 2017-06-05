package command;

// receiver
public class Mayo {
	private boolean on;
	// addMayo method
	public void putsMayoOn(){
		on = true;
		System.out.println("Mayo has been added to your menu item.");
	}
	// removeMayo method
	public void takesMayoOff(){
		on = false;
		System.out.println("Mayo has been removed from your menu item.");
	}
}
