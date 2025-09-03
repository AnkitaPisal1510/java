import java.util.Scanner;
class reverseArray{
	public static void main ( String args []){
 	Scanner sc= new Scanner(System.in);
	int [] arr=new int [7];
	System.out.println("enter elements ");
	for (int i=0;i<7;i++){
		arr[i]=sc.nextInt();
		System.out.println(arr[i]);
	}
	for (int i=arr.lenght-1;i>0;i--){
		System.out.println("reverse of an array ");
		System.out.print(arr[i]);
}
System.out.print(arr);
  }
}