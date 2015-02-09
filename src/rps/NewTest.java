package rps;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest
{
    RockPaperScisors rps;
    Player p1;
    Player p2;
    
    @BeforeClass
    public void setUpClass()
    {
            rps = new RockPaperScisors();
            p1=new Player("Martin");
            p2=new Player("Jack");
    }
    
    
    @AfterClass
    public void tearDownClass()
    {
            rps = null;
            p1=null;
            p2=null;
    }
    
    @DataProvider(name = "Win")
    public Object[][] createWinData() 
    {
     return new Object[][] 
     {
       { RPSEnum.ROCK, RPSEnum.SCISORS },
       { RPSEnum.PAPER, RPSEnum.ROCK},
       { RPSEnum.SCISORS, RPSEnum.PAPER},
     };
    }
    
    @DataProvider(name = "Lost")
    public Object[][] createLostData() 
    {
     return new Object[][] 
     {
       { RPSEnum.ROCK, RPSEnum.PAPER },
       { RPSEnum.PAPER, RPSEnum.SCISORS},
       { RPSEnum.SCISORS, RPSEnum.ROCK},
     };
    }

    @DataProvider(name = "Tie")
    public Object[][] createTieData() 
    {
     return new Object[][] 
     {
       { RPSEnum.ROCK, RPSEnum.ROCK },
       { RPSEnum.PAPER, RPSEnum.PAPER},
       { RPSEnum.SCISORS, RPSEnum.SCISORS},
     };
    }
    
    @Test(dataProvider="Win")
    public void testWinPlay(RPSEnum m1, RPSEnum m2)
    {
    		m1=p1.collection.get(0);
    		m2=p2.collection.get(0);
    		System.out.println(m1);
    		System.out.println(m2);
            Assert.assertEquals(rps.play(m1, m2), Result.WIN);
    }
    
    @Test(dataProvider="Tie")
    public void testTiePlay(RPSEnum p1, RPSEnum p2)
    {
            Assert.assertEquals(rps.play(p1, p2), Result.TIE);
    }
    
    @Test(dataProvider="Lost")
    public void testLostPlay(RPSEnum p1, RPSEnum p2)
    {
            Assert.assertEquals(rps.play(p1, p2), Result.LOST);
    }
}

