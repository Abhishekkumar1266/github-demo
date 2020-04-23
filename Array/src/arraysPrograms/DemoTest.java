package arraysPrograms;

public class DemoTest {

	public static void main(String[] args) {
		try{
			int a=12;
			int b=3;
			if(a/b>0){
				System.out.println("a is greater");
			}
				else
				{
					System.out.println("b is greater");
				}
		}
			catch (ArithmeticException e) {
          System.out.println(e.getMessage());			 
			}
		finally{
			System.out.println("Not any exception");
			}
		}

	}


