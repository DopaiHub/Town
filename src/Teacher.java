/**
 * Teacher is an observer that reacts to warning
 * @author Adam Nguyen
 *
 */
public class Teacher implements Observer {
	/**
	 * subject watchman variable gets set to parameter in constructor and is added to observer list
	 */
private Subject watchman;
	
	public Teacher(Subject watchman)
	{
		this.watchman=watchman;
		watchman.registerObserver(this);
	}
	/**
	 * update method decides how teacher reacts based on severity of warning
	 */
	public void update(int warning)
	{
		if(warning==1)
			System.out.println("Teacher:Helps get every kid home safe");
		else if(warning==2)
			System.out.println("Teacher:Brings all students to the underground shelter");
		else
			System.out.println("Invalid warning");
	}
}
