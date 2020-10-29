import java.util.*;
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l = new ArrayList<String>();	
		Scanner sc = new Scanner(System.in);
		int c=1;
		while(c!=0) {
		System.out.println("1.Insert \n2.Search \n3.Delete \n4.Display \n5.Exit \nEnter your choice");
		int a=sc.nextInt();
		if(a == 1) {
			System.out.println("Enter the item to be inserted:");
			String s=sc.next();
			l.add(s);
			System.out.println("Item entered successfully");
		}
		else if(a==2) {
			System.out.println("Enter the item to be searched:");
			String s=sc.next();
			boolean b = l.contains(s);
			if(b == true)
			    System.out.println("Searched item exist");
			else
				System.out.println("Searched item does not exist");
		}
		else if(a==3) {
			System.out.println("Enter the item to be deleted");
			int b=sc.nextInt();
			l.remove(b);
			System.out.println("Item successfully deleted");
		}
		else if(a==4) {
			for(String x:l)
			System.out.println(x+" ");
		}
		else if(a==5) {
			c=0;
			System.out.println("Successfully Exited");
		}
		}
	}
}
