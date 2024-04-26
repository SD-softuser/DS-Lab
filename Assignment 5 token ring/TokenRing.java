import java.util.*; 

public class TokenRing{ 

	public static void main(String[] args){ 
	
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the number of nodes in the ring: "); 
		int n = sc.nextInt(); 
		
		System.out.println("Ring form as follows: "); 
		for(int i = 0; i<n; i++){
			System.out.print(" " + i); 
		}
		System.out.println("0"); 
		
		int choice = 0; 
		
		do{ 
			
			System.out.println("enter the sender: ");
			int sender = sc.nextInt();  
			
			System.out.println("enter the receiver: "); 
			int receiver = sc.nextInt();
			
			System.out.println("enter the data that you want to send: "); 
			int data = sc.nextInt();
			
			int token = 0; 
			
			System.out.println("Passing token...");
			
			for(int i=token; i<sender; i++){
				System.out.print(" "+i+"->");
			}
			
			System.out.println(" "+sender);
			System.out.println("Sender: "+sender+"Sending data: "+data);
			
			for(int i = sender; i!=receiver; i=(i+1)%n){ 
				System.out.println("Data: "+data+"Forwarde by "+i); 
			}
			
			System.out.println("Receiver: "+receiver+"Received data: "+data); 
			
			System.out.println("Do you continue sending data? if YES enter 1 or if NO enter 0: ");
			choice = sc.nextInt(); 
			
		}while(choice == 1); 
	
	}

}
