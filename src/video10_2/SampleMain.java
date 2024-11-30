package video10_2;

public class SampleMain {

	public static void main(String[] args) {
		
		/*Sample s1=new Sample();
		Sample s2=new Sample(10);
		Sample s3=new Sample(10,20);
		Sample s4=new Sample(10,20,20);
		s1.test();
		s1.test(1,2);
		s1.test(1,2.473665);
		s1.test(1.244236,2);*/
		
		// encapsulation
		
		Sample1 sa1=new Sample1();
		sa1.setId(1173478);
		sa1.setName("Sathish");
		sa1.setSal(24424);
		
		System.out.println(sa1.getId());
		System.out.println(sa1.getName());
		System.out.println(sa1.getSal());
		
	}

}
