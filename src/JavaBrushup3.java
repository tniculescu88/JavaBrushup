
public class JavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string is an object
		String s = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy";
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		
		String[] arr1 = s.split(" ");
		for (int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
