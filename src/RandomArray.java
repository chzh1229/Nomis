import java.util.Random;
import java.lang.Thread;
import java.util.Scanner;

public class RandomArray{

	public static int[] SequenceGenerator(int squares,int length)
	{
		int a[]=new int[length];
		Random Generator =new Random();
		for (int i=0;i<length;i++)
		{
			a[i]=Generator.nextInt(squares-1);
			
		}
		return a;
	}
	
	public static void SequenceDisplay(int squares,int record[]) {
		// TODO Auto-generated method stub
		int n=record.length;
		for (int i=0;i<n;i++)
		{
		System.out.print(record[i]+" ");
		//display delay; speed changes while level changes
		try {
			Thread.currentThread().sleep(4000/squares);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		}
		//this is just for cleaning the screen
		//for (int i=0;i<200;i++) System.out.println();
	}

	
	public static boolean Compare(int[] record)
	{
		
		Scanner scanner = new Scanner(System.in);
		String inputS=scanner.next();
		int l=inputS.length();
		int input[]=new int[l];
		for (int i=0;i<l;i++)
		{
			input[i]=Integer.parseInt(inputS.charAt(i)+"");
			if (input[i]!=record[i]) return false;
		}
		if (l!=record.length) return false;
		return true;
		
	}
	
	public static void Fail(int presentmark){
		//just show you are failed somehow
		System.out.println("You failed!");
		System.out.println("Your total mark is "+presentmark);
		//then calculate scores
	}
	
	
	public static void MainProcess(int squares,int length,int presentmark)
	{
		boolean pass = true;
		int record[] = SequenceGenerator(squares,length);
		SequenceDisplay(squares,record);
		//choose to use or not use item during the next process + there should be a time limit(NOT DONE)
		if (Compare(record)) MainProcess(squares,length+1,presentmark+squares*length);
		else Fail(presentmark);	
	}
	
	public static void main(String[] args)
	{
		int level = Integer.parseInt(args[0]);
		switch (level){
		case 1: MainProcess(4,1,0);
				break;
		case 2: MainProcess(5,1,0);
				break;
		case 3: MainProcess(6,1,0);
				break;
		case 4: MainProcess(10,5,0);
				break;
		}
	
	}

}