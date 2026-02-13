import java.util.*;
class Sink_Node
{
	public static void main(String args[])
	{
		int adj_matrix[][] = { {0,1,1,0,1}, {0,0,0,1,0}, {0,0,0,1,1}, {0,0,0,0,0}, {0,0,0,0,0}};
		int sink_ctr = 0;
		for(int i = 0; i < adj_matrix.length; i++)
		{
			int count = 0;
			for(int j = 0; j < adj_matrix.length; j++)
			{
				if(adj_matrix[i][j] == 0)
				{
					count++;
				}
			}
			if(count == adj_matrix.length)
			{
				System.out.println("Sink node : " +(char)(65 + i));	// explicit typecasting from integer to character. Ascii value for A is 65.
				sink_ctr++;
			}
		}
		System.out.println("Number of sink nodes : " + sink_ctr);
	}
}