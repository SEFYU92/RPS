package rps;

import java.util.ArrayList;
import java.util.List;

public class Player 
{
	public String name;
	public int score;
	public List<RPSEnum> collection;
	Player(String n,List<RPSEnum> c)
	{
		name = n;
		collection = c;
	}
	Player(String n)
	{
		RPSEnum rps;
		name = n;
		collection = new ArrayList<RPSEnum>();
		int rand = 0;
		for (int i = 0; i < 10; i++)
		{
			rand = (int) (Math.random() * 3);
			System.out.println(rand);
			switch(rand)
			{
				case 0 : rps=RPSEnum.ROCK;break;
				case 1 : rps=RPSEnum.PAPER;break;
				case 2 : rps=RPSEnum.SCISORS;break;
				default : rps=RPSEnum.SCISORS;break;
			}
			System.out.println(rps);
			collection.add(rps);
		}
	}
}
