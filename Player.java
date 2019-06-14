
public class Player 
{
	//Attributes
	int money;
	int numTimesPlayed;
	SlotMachine[] machines;
	
	public Player(int startMoney) 
	{
		// TODO Auto-generated constructor stub
		this.money = startMoney;
	}

	public int playTillBroke(SlotMachine[] machines) 
	{
		this.numTimesPlayed = 0;
		while(this.money != 0)
		{
				//Not a necessary if statement but added it to make all of them consistent
				//If money is greater than 0 then deduct one and add one to times played, then spin SM 1
				if(this.money > 0)
				{
					this.money--;
					this.numTimesPlayed++;
				
					this.money = this.money + machines[0].Spin();
					
					//Checks if money is greater than zero
					//Performs same function and spins SM 2
					if(this.money > 0)
					{
						this.money--;
						this.numTimesPlayed++;
					
						this.money = this.money + machines[1].Spin();
						
						//Spins SM 3 and deducts money
						if(this.money > 0)
						{			
							this.money--;
							this.numTimesPlayed++;
						
							this.money = this.money + machines[2].Spin();
						}
					
					}
				}
		}
		// Int value is returned 
		return numTimesPlayed;
	}

}

