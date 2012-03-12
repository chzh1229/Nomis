
public class Test {
	public static void main(String[] args)
	{
		int level = Integer.parseInt(args[0]);
		switch (level){
		case 1: MainProcess.MainProcess(4,1,0,0);
				break;
		case 2: MainProcess.MainProcess(5,1,0,0);
				break;
		case 3: MainProcess.MainProcess(6,1,0,0);
				break;
		case 4: MainProcess.MainProcess(9,1,0,0);
				break;
		}
	
	}

}
