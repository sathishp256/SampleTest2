package video4;

public class SwitchCases {
	
	public static void main(String[] args)
	{
		
		String weekno="Friday";
		
		switch(weekno)
		{
		case "Monday":System.out.println("1");break;
		case "Tuesday":System.out.println("2");break;
		case "Wednesday":System.out.println("3");break;
		case "Thursday":System.out.println("4");break;
		case "Friday":System.out.println("5");break;
		case "Saturday":System.out.println("6");break;
		case "Sunday" :System.out.println("7");break;
		default:System.out.println("Invalid Weekname");
		}
	}

}
