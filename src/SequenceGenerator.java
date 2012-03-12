import java.util.Random;


public class SequenceGenerator {
	public static int[] SequenceGenerator(int squares,int length)
	{
		int a[]=new int[length];
		Random Generator =new Random();
		for (int i=0;i<length;i++)
		{
			a[i]=Generator.nextInt(squares-1)+1;
			
		}
		return a;
	}
}
