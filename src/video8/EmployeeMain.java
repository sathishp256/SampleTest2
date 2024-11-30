package video8;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.eid=1173478;
		emp1.ename="Sathish";
		emp1.job="SSE";
		emp1.sal=35000;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=1173479;
		emp2.ename="Srinivas";
		emp2.job="SP";
		emp2.sal=123334;
		
		emp2.display();
	}

}
