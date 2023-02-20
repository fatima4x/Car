/**
 * 
 * @author BCA
 * @version(1)
 * <p>
 * Creates a class for class Car
 * <p>
 * This is to simulate the working of a car
 * <p>
 * This does two things
 * <p>
 * Checks for the speed and model
 *
 */
public class Car {
	String model;
	int speed;
	/**
	 * <p>
	 * This is the constructor that initializes the attributes of model and car
	 * <p>
	 * @param model tells the model of the car
	 * @param speed tells the speed of the car
	 * </p>
	 * 
	 */
	
	Car(String model, int speed)
	{
		this.model = model;
		this.speed =speed;
	}
	/**
	 * This is the method used to increment the speed
	 * @param increment the speed
	 */
	void go_faster(int increment)
	{
		speed = speed +increment;
	}
	/**
	 * this method is used to decrement the speed
	 * @param decrement
	 */
	void go_slower(int decrement)
	{
		speed=speed-decrement;
	}
  /*
   * the car speed is set to 0
   */
	void stop_car()
	{
		speed=0;
	}
	int get_speed()
	{
		return speed;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
