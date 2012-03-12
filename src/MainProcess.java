import java.util.Scanner;


public class MainProcess {
	public static void MainProcess(int squares,int length,int presentmark,int items)
	{
		boolean pass = true;
		//every 5 levels we get a magic item
		int itemleft;
		if (length%5==1) itemleft = items+1;
		else itemleft=items;
		//for command shell play
		System.out.println("Now you are in the level "+length);
		System.out.println("You now have "+itemleft+" magicitems!");
		int record[] = SequenceGenerator.SequenceGenerator(squares,length);		
		SequenceDisplay.SequenceDisplay(squares,record);		
		//choose to use or not use item during the next process + there should be a time limit(NOT DONE)
		//if (Compare.Compare(record)) MainProcess(squares,length+1,presentmark+squares*length);
		//else Fail.Fail(presentmark);	
		//compare part		
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		while (pass&&counter<length)
		{
			int input=scanner.nextInt();
			//use magic item
			if (input==0)
			{
				if (itemleft>0) 
				{
					itemleft--;
					System.out.println("One magic item has been used!");
					System.out.println("You now have "+itemleft+" magicitems!");
					SequenceDisplay.SequenceDisplay(squares, record);
					counter=0;
					continue;
				}
				//no items left
				else 
				{
					System.out.println("You have run out of magic items!");
					System.out.println("Please retype sequence again!");
					counter=0;
					continue;
				}
			}
			//not use magic item
			else
			{
				//though there is a possibility to input a number which is out of range when playing with command shell
				//but it will not appear when we have GUI
				if (input!=record[counter])
				{
					pass=false;
					Fail.Fail(presentmark);
				}
				else counter++;
			}
			
		}
		//success
		if (pass) 
		{
			System.out.println("You succeed!");
			MainProcess(squares,length+1,presentmark+squares*length,itemleft);
		}

		

	}
}
