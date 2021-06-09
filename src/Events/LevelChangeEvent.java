package Events;

import Datas.DataCommander;
import Datas.Datas;
import Entities.Mobs;
import Entities.Players;
import GUI.GUI;

public class LevelChangeEvent {
	private static double rateOfHealth=1.1;
	private static double rateOfDamage=1.1;
	private static double rateOfArmour=1.1;
	private static double rateOfExp=1.15;
	public static void judgeLevelUp(Players player,Datas data,Mobs mob) {
		if(player.getExp()>=player.getMaxExp()) {
			while(player.getExp()>=player.getMaxExp()) {
				DataCommander dataCommand = new DataCommander();
				player.setExp(player.getExp()-player.getMaxExp());
				player.setStatusPoint(player.getStatusPoint()+5);
				player.setLevel(player.getLevel()+1);
				player.updataPlayerStatus();
				player.heal();
				player.mpHeal();
				GUI.LevelUpNote(player);
				
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("�A�ɯŤF!! �A�ثe���ŬO: " + player.getLevel());
				System.out.println("�ثe���A�O:");
				System.out.println("����: " + player.getLevel());
				System.out.printf("����: %d\n",player.getDamage());
				System.out.printf("��q: %d/%d\n",player.getHealth(),player.getMaxHealth());
				System.out.printf("�g���: %.0f/%.0f\n",player.getExp(),player.getMaxExp());
				dataCommand.dataSave(player,data);
				System.out.println();
			}
			
		}else if(player.getExp()<0){
			while(player.getExp()<0) {
				DataCommander dataCommand = new DataCommander();
				if(player.getLevel()>1) {
				player.setLevel(player.getLevel()-1);
				player.updataPlayerStatus();
				player.setExp(player.getExp()+player.getMaxExp());
				player.setStatusPoint(player.getStatusPoint()-5);
				}else {
					player.setExp(0);
					player.updataPlayerStatus();
					break;
				}
				player.updataPlayerStatus();
				player.heal();
				player.mpHeal();
				GUI.LevelDownNote(player);
				
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("�A���ŤF!! �A�ثe���ŬO: " + player.getLevel());
				System.out.println("�ثe���A�O:");
				System.out.println("����: " + player.getLevel());
				System.out.printf("����: %d\n",player.getDamage());
				System.out.printf("��q: %d/%d\n",player.getHealth(),player.getMaxHealth());
				System.out.printf("�g���: %.0f/%.0f\n",player.getExp(),player.getMaxExp());
				dataCommand.dataSave(player,data);
				System.out.println();
			}
		}
		
	}
	public static boolean isLevelUp(Players player) {
		if(player.getExp()>=player.getMaxExp()) {
			return true;
		}else {
			return false;
		}
	}
}
