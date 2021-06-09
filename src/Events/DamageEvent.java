package Events;

import Entities.Mobs;
import Entities.Players;
import GUI.GUI;


public class DamageEvent {
	
	public static int damageTo(Mobs mob,Players player) {
		System.out.println("���a "+ player.getPlayer() +  " ����F " + mob.getName() + " ������");
		double totalDamage = mob.getDamage()*1+((int)(Math.random()*mob.getDamage()*0.2));
		int damageOffset = (int)(totalDamage*((double)mob.getDamage()/((double)player.getArmor()+(double)mob.getDamage())));
		//������j�󨾿m�V�h�A�ȴN�V�ͪ��1 �ҥHtotaldamage�N�V�ͪ��쥻���ˮ`,�Ϥ���M�A�o�N�O�o���ˮ`�p�⦡���Ѩ�
		System.out.println("�H�����m�y���ˮ`��K��: " + (int)(totalDamage-damageOffset));
		player.setHealth((int)player.getHealth()-(int)(damageOffset));
		GUI.HPMPUpdate(player);
		GUI.HPMPLoaderUpdata(player);
		if((int)player.getHealth()<=0) {
			System.out.println("���a�w���`!");
		}else {
			System.out.println("���� " + (int)(damageOffset) + " �I�ˮ`!");
			System.out.printf(player.getPlayer()+" ���ͩR��: %d/%d\n",(int)player.getHealth(),(int)player.getMaxHealth());
		}
		return (int)(damageOffset);
	}
	public static int damageTo(Players player,Mobs mob,boolean boom) {
		double totalDamage = player.getDamage()*1+((int)(Math.random()*player.getDamage()*0.3))-mob.getArmor()*(mob.getLevel()/(player.getLevel()+mob.getLevel()));
		int damageOffset = (int)(totalDamage*((double)player.getDamage()/((double)mob.getArmor()+(double)player.getDamage())));
		
		if(boom==true) {
			totalDamage*=player.getBoomAttackRate();
			damageOffset = (int)(totalDamage*((double)player.getDamage()/((double)mob.getArmor()+(double)player.getDamage())));
		
			mob.setHealth((int)mob.getHealth()-(int)(damageOffset));
			System.out.println("���a "+ player.getPlayer() +  " �� " + mob.getName() + " �ϥX "+ player.getSkills().get(0).getName() + " �y�� " + (int)(damageOffset) + " �I�ˮ`(����)");
			//////
			if((int)mob.getHealth()<=0) {
				System.out.println("�Ǫ��w���`!");
			}else {
				System.out.printf(mob.getName() + " ����q��: %d/%d\n",(int)mob.getHealth(),(int)mob.getMaxHealth());
			}
			//////

			System.out.println("�Ǫ����m�y���ˮ`��K��: " + (totalDamage - damageOffset));
			return (int)(damageOffset);
		}else {
			mob.setHealth((int)mob.getHealth()-(int)(damageOffset));
			System.out.println("���a "+ player.getPlayer() +  " �� " + mob.getName() + " �ϥX "+ player.getSkills().get(0).getName() + " �y�� " + (int)(damageOffset) + " �I�ˮ`");
			//////
			if((int)mob.getHealth()<=0) {
				System.out.println("�Ǫ��w���`!");
				
			}else {
				System.out.printf(mob.getName() + " ����q��: %d/%d\n",(int)mob.getHealth(),(int)mob.getMaxHealth());
			}
			//////

			System.out.println("�Ǫ����m�y���ˮ`��K��: " + (totalDamage - damageOffset));
			return (int)(damageOffset);
		}
		
	}
}
