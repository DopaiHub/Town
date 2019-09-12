
import java.util.ArrayList;
/**
 * Watchman class creates arraylist of observers and can add, remove, and notify these observers.
 * @author Adam Nguyen
 *
 */
public class Watchman implements Subject {
	/**
	 * Arraylist of observers to hold each one
	 * int warning to show amount of trumpet calls, 1 moderate, 2 critical
	 */
	private ArrayList<Observer> observers;
	public int warning;
	/**
	 * Constructor creates arraylist
	 */
	public Watchman()
	{
		observers=new ArrayList<Observer>();
	}
	/**
	 * registers each observer to the arraylist
	 */
	public void registerObserver(Observer observer)
	{
		observers.add(observer);
	}
	/**
	 * removes observer from arraylist
	 */
	public void removeObserver(Observer observer)
	{
		observers.remove(observer);
	}
	/**
	 * updates each observer in the arraylist with the warning value
	 */
	public void notifyObservers()
	{
		for(Observer observer:observers)
			observer.update(warning);
	}
	/**
	 * Updates warning variable to either 1 or 2, Prints out that many trumpet calls and calls notifyObservers method to update them
	 * @param warning
	 */
	public void issueWarning(int warning)
	{
		if(warning==1||warning==2)
		{
			this.warning=warning;
			System.out.println("WARNING: "+warning+" trumpet was played!");
			notifyObservers();
		}
		else
			System.out.println("Invalid warning");
	}

}
