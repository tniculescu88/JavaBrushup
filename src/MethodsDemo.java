
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo();
		String test1 = d.getData();
		System.out.println(test1);
		
		MethodsDemo2 d2 = new MethodsDemo2();
		String test2 = d2.getUserData();
		System.out.println(test2);
		
		getDataStatic();

	}
	
	public String getData()
	{
		System.out.println("Hello world getData");
		return "rahul shetty";
			
	}
	
	public static String getDataStatic()
	{
		System.out.println("Hello world static");
		return "rahul shetty";
			
	}


}
