/**
 * ShopOwner is an observer that reacts to warning
 * @author Adam Nguyen
 *
 */
public class ShopOwner implements Observer {
	/**
	 * subject watchman variable gets set to parameter in constructor and is added to observer list
	 */
	private Subject watchman;
	
	public ShopOwner(Subject watchman)
	{
		this.watchman=watchman;
		watchman.registerObserver(this);
	}
	/**
	 * shop owner reacts based on severity of the warning
	 */
	public void update(int warning)
	{
		if(warning==1)
			System.out.println("Shop Owner:Close down shop and head home");
		else if(warning==2)
			System.out.println("Shop Owner:Drops everything and find nearest hideout");
		else
			System.out.println("Invalid warning");
	}

}
