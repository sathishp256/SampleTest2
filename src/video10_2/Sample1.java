package video10_2;

public class Sample1 {
	
	//encapsulation
	
	/*wrappping of data and methods into single unit/class
	its kind of security mechanism
	3 rules
	all variables should be private
	we have to write setter and getter methods for every variable
	variables can operated through methods*/
	
	private int id;
	private String name;
	private int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	
}
