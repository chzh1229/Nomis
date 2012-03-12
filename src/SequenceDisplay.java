
public class SequenceDisplay {
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
		System.out.println();
		//this is just for cleaning the screen
		//for (int i=0;i<200;i++) System.out.println();
	}

}
