/**
 * Subject interface requires methods to register,remove, and notify observers
 * @author Adam Nguyen
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();

}
