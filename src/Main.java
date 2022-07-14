import java.util.Scanner;

 //Name: Abel Okoh

public class Main {
	
	public static final int OFF = 0;
	
	public static int cordSpeedLevel = OFF;
	public static DIRECTION speedDirection = DIRECTION.CLOCK_WISE;
	
	
	

	public static enum DIRECTION { // creating two directions for spinning ceiling fan
		CLOCK_WISE("Spinning Right"), ANTI_CLOCK_WISE("Spinning Left");
		public String label;
		private DIRECTION(String label) {
			this.label = label;
		}
	};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ceiling Fan is running " + speedDirection.label + " with speed setting "
				+ cordSpeedLevel);
		Scanner input = new Scanner(System.in);
		
	    while (true) {
	    	//asking user to pull one of the cords
	    	boolean isSpeedCordPulled = true;
	    	System.out.print("Enter 1 to pull Cord One \n");
		    System.out.print("Enter 2 to pull Cord Two \n");
		    System.out.print("Enter 0 to turn OFF Ceiling Fan ");
		    System.out.print("Pull a cord: ");
		    int userInput = input.nextInt();
		    
		    //checking which cords was pulled then call each methods accordingly
		    switch (userInput) {
		    case 0:
				break;
			case 1:
				pullCordOne(isSpeedCordPulled);
				break;
			case 2:
				pullCordTwo(isSpeedCordPulled);

			default:
				System.out.print("Please pull a cord \n");
				break; 
			}
		    
			
		}
	      
	    
	}


	private static void pullCordTwo(boolean isCordTwo) {
		// TODO Auto-generated method stub
		
		if (isCordTwo) {
			//Check if the speed direction is spinning right then reverse the direction when cord two is pulled
			if (speedDirection.equals(DIRECTION.CLOCK_WISE)) {
				speedDirection.equals(DIRECTION.ANTI_CLOCK_WISE);
				System.out.println("Ceiling Fan is running " + speedDirection.label + " with speed setting "
						+ cordSpeedLevel);
			}else {
				speedDirection.equals(DIRECTION.CLOCK_WISE);

			}
		}
		
		System.out.println("Ceiling Fan is running " + speedDirection.label + " with speed setting "
				+ cordSpeedLevel );
		
		
	}


	private static void pullCordOne(boolean isCordOne) {
		// TODO Auto-generated method stub
		// check if the cord is pulled so the speed settings can increase by one
		if (isCordOne) {
			if (cordSpeedLevel == 3) {
				cordSpeedLevel = 0;
				System.out.println("Ceiling Fan is running " + speedDirection.label + " with speed setting "
						+ cordSpeedLevel);
			} else {
				++cordSpeedLevel;
				System.out.println("Ceiling Fan is running " + speedDirection.label + " with speed setting "
						+ cordSpeedLevel);
			}
			
		}
		
	}
	
	
	
}
