package arraysPrograms;

public class Array01 {

	public static void main(String[] args) throws Exception {
		try{
		int a[]={12,34,32,56,67,87};
		int b[]=new int[6];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
			if(i==a.length-1){
				a[i]=-4;
			}
		}
		//System.out.print("ARRAY 1 :-");
		for(int i=0;i<=a.length;i++){
			System.out.println();
			System.out.print(" "+b[i]);
			
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		/*for(int i=0;i<a.length;i++){
			System.out.println();
			System.out.print(" "+a[i]);
		}*/
	}

}
