import java.util.*;

class VectorDemo
{
	public static void main(String args[])
	{
		// Create a Integer Vector with Capacity 5 and Increment capacity 2
		// Size is Initially 0, since no Elements are added Yet
		// Wut Vector ? Dynamic Array
		Vector<Integer> someVector = new Vector<Integer>(5,2);
		System.out.println("Vector Initialized with Size " + someVector.size() + " and Capacity " + someVector.capacity());
		int op = 0;
		while(op!=5)
	       	{
			System.out.println("\n========= Vektor Menu =========");
			System.out.println("1. Add Element");
			System.out.println("2. Remove Element");
			System.out.println("3. Show Vektor Contents");
			System.out.println("4. Show Element at an Index\n");
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			switch(op)
			{
				case 1:
					System.out.println("\nSpecify the Element to add\n");
					someVector.addElement(sc.nextInt());
					break;
				case 2:
					System.out.println("\nSpecify the Index\n");
					int i = sc.nextInt();
					if(i>0 && i<someVector.size())
						someVector.removeElementAt(i);
					break;
				case 3:
					System.out.println("\nVektor Contents\n");
					for(int j = 0; j < someVector.size(); j++)
						System.out.println(someVector.get(j));
					break;
				case 4:
                 	System.out.println("\nSpecify the Index\n");
					int s = sc.nextInt();
					System.out.println("Element at Index " + s + " is " + someVector.get(s));
				default: System.out.println("\nInvalid Selection");
			}
			System.out.println("\nSize : " + someVector.size() + " Capacity : " + someVector.capacity() + "\n");
		}
	}
}
