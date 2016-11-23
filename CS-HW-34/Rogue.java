//Andrew Qu [Team of Teamz {Yuyang, Michael}]
//APCS1 pd 1
//HW 34 -- Ye Olde Role Playing Game, Unchained
//2016 - 11 - 23

public class Rogue extends Character{
    
    public Rogue(){
	_hitPts = 85;
	_defense = 30;
	_att_rating = .9;
	_strength = 100;
	_name = "Tom";
	originalStrength = _strength;
	originalDefense = _defense;	
    }

    public Rogue(String inName){
	this();
	_name = inName;
    }

    //Returns a brief summary of the chosen Character
    public String about(Character c){
	return "While the rogue may be the most vulnerable out of the pack, he is also the most accurate. As he has the highest attack rating, the rogue is sure to end battles quick and clean!";
    }

    //Increases character's strength and lower its defense for one attack
    public void specialize(){ 
	_defense -= (int)(Math.random() * 20);
	_strength += (int)(Math.random() * 20);
    }

    //Reverts character's stats to original values
    public void normalize(){
	_defense = originalDefense;
	_strength = originalStrength;
    }
}