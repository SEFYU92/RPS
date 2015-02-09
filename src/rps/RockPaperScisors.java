/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps;

/**
 *
 * @author
 */
public class RockPaperScisors
{
	public Result play(RPSEnum p1, RPSEnum p2)
    {
            switch(p1)
            {        
                    case ROCK:
                            switch (p2)
                            {
                                    case ROCK:
                                            return Result.TIE;
                                            
                                    case PAPER:
                                            return Result.LOST;
                                            
                                    case SCISORS:
                                            return Result.WIN;
                            }
                            
                    case PAPER:
                            switch (p2)
                            {
                                    case ROCK:
                                            return Result.WIN;
                                            
                                    case PAPER:
                                            return Result.TIE;
                                            
                                    case SCISORS:
                                            return Result.LOST;
                            }
                            
                    case SCISORS:
                            switch (p2)
                            {           
                                    case ROCK:
                                            return Result.LOST;
                                            
                                    case PAPER:
                                            return Result.WIN;
                                            
                                    case SCISORS:
                                            return Result.TIE;
                            }
                   default: return Result.LOST;
            }
    }
	Result play(Player p1, Player p2)
	{
		return Result.LOST;
	}
}
