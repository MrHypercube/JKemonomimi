package com.MrHypercube;

public class Kemonomimi 
{
        //The main variables
    
    	public String Name;

	public String Type;

	public String Gender;

	public float Weight;

	public Boolean LikesYou = false;

	public int Patted;

	public int Points;

	public int MainPoints = 2;

	public int PatReward = 1;

	public String AnnoyedMessage = " Is starting to get kind of annoyed. \n";

	public String RabbitHappy = " Is really loving you right now! \n";

	public String FoxHappy = " Is really loving you right now! \n";

	public String CatHappy = " has started purring! \n";

	public String DogHappy = " has started panting in happyness! \n";

	public Boolean NameBeforeMessage = false;
        
        
        //Confirm that he/she likes you
        public void CheckPoints()
	{
		if (Points <= MainPoints)
		{
			LikesYou = true;
		}
		if (Points > MainPoints)
		{
			LikesYou = false;
		}
	}
        
        //Print Stuff
        
        public void LogName()
	{
		System.out.println(Name);
	}
        
        public void LogType()
	{
		System.out.println(Type);
	}
        public void LogGender()
	{
		System.out.println(Gender);
	}
        public void LogWeight()
	{
		System.out.println(Weight);
	}
        public void LogAll()
	{
		System.out.println(Name);
                System.out.println(Type);
                System.out.println(Gender);
                System.out.println(Weight);
	}
        
        //Headpat :3
        void Headpat()
	{
		Patted = Patted + 1;
		if (Patted <= 2)
		{
			Points = Points + 1;
		}


		if (Patted > 2)
		{
			Points = Points - 1;
			System.out.println(AnnoyedMessage);
		}

		if (Type == "Bunny" || Type == "bunny" || Type == "Rabbit" || Type == "rabbit")
		{
			if (Patted < 2)
			{
				if (NameBeforeMessage == true)
				{
					System.out.println(Name + RabbitHappy);
				}
				else
				{
					System.out.println(RabbitHappy);
				}
				CheckPoints();
			}

		}


		if (Type == "Fox" || Type == "fox" || Type == "Kitsune" || Type == "kitsune")
		{
			if (Patted < 2)
			{
				if (NameBeforeMessage == true)
				{
					System.out.println(Name + FoxHappy);
				}
				else
				{
					System.out.println(FoxHappy);
				}
				CheckPoints();
			}

		}


		if (Type == "Cat" || Type == "cat" || Type == "Neko" || Type == "neko")
		{
			if (Patted < 2)
			{
				if (NameBeforeMessage == true)
				{
					System.out.println(Name + CatHappy);
				}
				else
				{
					System.out.println(CatHappy);
				}
				CheckPoints();
			}
		}


		if (Type == "Dog" || Type == "dog" || Type == "Wolf" || Type == "wolf" || Type == "Okami" || Type == "okami")
		{
			if (Patted < 2)
			{
				if (NameBeforeMessage == true)
				{
					System.out.println(Name + DogHappy);
				}
				else
				{
					System.out.println(DogHappy);
				}
				CheckPoints();
			}
		}
	}
}
