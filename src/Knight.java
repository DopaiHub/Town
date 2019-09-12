/**
 * Knight is an observer that reacts to warning
 * @author Adam Nguyen
 *
 */
public class Knight implements Observer{
	/**
	 * subject watchman variable gets set to parameter in constructor and is added to observer list
	 */
private Subject watchman;
	
	public Knight(Subject watchman)
	{
		this.watchman=watchman;
		watchman.registerObserver(this);
	}
	/**
	 * update method decides how knight reacts based on severity of warning
	 */
	public void update(int warning)
	{
		if(warning==1)
			System.out.println("Knight:Helps everyone get home safe");
		else if(warning==2)
			System.out.println("Knight:Prepares for battle");
		else
			System.out.println("Invalid warning");
	}

}
