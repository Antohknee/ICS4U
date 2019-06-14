
public class SlotMachine 
{
	//Attributes
	int timesplayed;
	int payout;
	int wininterval;
	int costperplay;
	int totalpay;
		
	public SlotMachine(int interval, int pay, int playedAlready, int cost) 
	{
		// TODO Auto-generated constructor stub
		this.wininterval = interval;
		this.payout = pay;
		this.timesplayed = playedAlready;
		this.costperplay = cost;
	}

	public int Spin() 
	{
		this.totalpay = 0;
		if (this.timesplayed == this.wininterval)
		{	
			this.timesplayed = 0;
			this.totalpay = this.payout;
		}
		else
		{
			this.totalpay = 0;
		}
		this.timesplayed++;
		return totalpay;

	}
}
