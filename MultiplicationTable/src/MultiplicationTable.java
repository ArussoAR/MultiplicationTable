
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new int is the amount of rows and columns
	    int[][] numbers = new int[10][10];

	    numbers = timesTable(10,10);


	    for (int row = 0; row < numbers.length ; row++)
	    {
	        for (int column = 0; column < numbers[row].length; column++)
	        {
	            System.out.printf("%2d ", numbers[row][column]);
	        }
	        System.out.println();

	    }
	}

	public static int[][] timesTable(int R, int C)
	{
	    int [][] yes = new int[R][C];
	    for (int row = 0; row < yes.length ; row++)
	    {
	        for (int column = 0; column < yes[row].length; column++)
	        {
	            yes[row][column] = (row+1)*(column+1);
	        }

	    }
	    return yes;
	}

	
			 }
		
	
