package OOPS;

class DDD {
	private int id;
	private String name;
	private int bal;
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
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	
}


public class Encap {

	public static void main(String[] args) {
		
		//Encapsulation - wrapping up the data and methods into single unit is called enacp
		
		DDD d1=new DDD();
		
		d1.setId(101);
		System.out.println(d1.getId());
		
		d1.setName("Sathish");
		System.out.println(d1.getName());
		
		d1.setBal(1000);
		System.out.println(d1.getBal());
		
		
		
	}

}
