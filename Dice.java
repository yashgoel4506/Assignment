import java.util.*;

public class Dice {
	int n;
	
	Dice(int n)
	{
		this.n=n;
	}
	
	void rollDice()
	{
		Random r1 = new Random();
		if(n<2)
		{
			System.out.println("Faces of a Dice should be atleast Two.");
		}
		else if(n==2)
		{
			boolean b = r1.nextBoolean();
			System.out.println("Dice has "+n+" faces.");
			if(b==true)
				System.out.println("Rolled value is: Heads");
			else
				System.out.println("Rolled value is: Tails");
		}
		else
		{
			int a = r1.nextInt(n-1);
			System.out.println("Dice has "+n+" faces.");
			System.out.println("Rolled value is: "+(a+1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		Dice d = new Dice(x);
		d.rollDice();
	}

}
