package Events;

import Entities.Mobs;
import Entities.Players;

public class GetExpEvent {
	public static void combatGetExp(Players player,Mobs mob) {
	     if(DeathEvent.mobDeath(mob)) {
	    	 System.out.printf("�A��o %.1f �g���!\n",mob.getExp());
	    	 player.setExp(player.getExp()+mob.getExp());
	     }
	}
	public static void lostExp(Players player) {
	     if(DeathEvent.playerDeath(player)) {
	    	 double lossExp = player.getMaxExp()*0.05;
	    	 System.out.printf("�A���h %.1f �g���!\n",lossExp);
	    	 player.setExp(player.getExp()-lossExp);
	     }
	}
}
