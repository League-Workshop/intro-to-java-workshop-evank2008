package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		Random factory = new Random();
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int player=100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
	int dragonh=100;	
		// 4. Create a variable to hold the damage the player's attack does each round
	int pattack=0;	
		// 5. Create a variable to hold the damage the dragon's attack does each round
	int dattack=0;	
		
	int heal=0;
		// 6.  Delete the slashes at the beginning of the next line.  
		while(player>0 && dragonh>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
			String attack = JOptionPane.showInputDialog("slash or heal?");
		// 9. If they typed in "yell":
			if (attack.equals("heal")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
		heal=factory.nextInt(16);
			//-- Subtract that number from the dragon's health variable 
			player+=heal;
			}
		// 10. If they typed in "kick":
			if (attack.equals("slash")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			pattack=factory.nextInt(36);
			//-- Subtract that number from the dragon's health variable
			dragonh-=pattack;
			}
			
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		dattack=factory.nextInt(41);
		// 12. Subtract this number from the player's health
		player-=dattack;
		
		
		// 13. If the user's health is less than or equal to 0
		if (player<=0) {
			JOptionPane.showMessageDialog(null, "You OOFed fighting the dragon. Later heroes laughed at your demise while slaying the dragon with ease...");
			
		}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		else if (dragonh<=0) {
			JOptionPane.showMessageDialog(null, "YOU WON! You earned 2 XP and 9 GOLD!");
			
		}
			//-- Tell the user that the dragon is dead and they took a ton of gold!
		{
			if(attack.equals("heal")) {
				JOptionPane.showMessageDialog(null, "You ate your Stick of Butter With Cinnamon. You recovered " + heal + " HP! The dragon ate your fat belly and you lost " + dattack + " HP! You have " + player + " HP. The dragon has " + dragonh + " HP.");
				
			}
			else if(attack.equals("slash")) {
				JOptionPane.showMessageDialog(null, "You threw a pencil at the dragon. It pierced its nose and did " + pattack + " damage. The dragon ate your fat belly and you lost " + dattack + " HP! You have " + player + " HP. The dragon has " + dragonh + " HP.");
				
			}
			else if(attack.equals("supersecretcheatcode")) {
				
				dragonh-=100000000;
				JOptionPane.showMessageDialog(null, "You poked the dragon's ear. It commited suicide");
			}
			
		}
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}
}
