package Events;

import Entities.Mobs;
import Entities.Players;
import GUI.GUI;
import Skills.skillStatus;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class damageAndMoveDisplayEvent implements Runnable{
	private static Label mobCount;//��q�p��
	private static Label mobStatus;//�Ǫ��ݩʵ��� �W��
	private static ProgressBar pbar;//�Ǫ���q���

	private AnchorPane combating;
	private int sleepMilis;
	private int times;
	private double distance;
	private double distance1;
	private double distance2;
	private Label toMove1;
	private static Players player;
	private static Mobs mob;
	private Label toMove2;
  
	private Button attack;
	private Button props;
	private Button skills;
	private Button run;
	private Rectangle health;
	private Rectangle Mana;
	private Label healthCount;
	private Label ManaCount;
	public damageAndMoveDisplayEvent(AnchorPane combating ,Rectangle health,Button attack,Button props,Button skills,Button run,Label damage1 , Label damage2 ,Players player,Mobs mob,Label toMove1,Label toMove2,double distance1,double distance2,double distance,int times,int sleepMilis) {
		this.sleepMilis = sleepMilis;
		this.combating = combating;
		this.distance = distance;
		this.distance1 = distance1;
		this.distance2 = distance2;
		this.times = times;
		this.player =player;
		this.mob = mob;
		this.toMove1 = toMove1;
		this.toMove2 = toMove2;
	 
		this.attack = attack;
		this.props = props;
		this.skills = skills;
		this.run = run;
		this.health = health;
		this.mobCount = BattleEvent.getMobCount();
		this.mobStatus = BattleEvent.getMobStatus();
		this.pbar = BattleEvent.getPbar();		
	}

	@Override
	public void run() {
 		attack.setDisable(true);
		props.setDisable(true);
		skills.setDisable(true);
		run.setDisable(true);
		
		System.out.println("\n��m: " + toMove2.getLayoutX() +"\n");
		
		double origin1 = 138;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		GUI.move1(toMove1, distance1);	

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		toMove1.setLayoutX(origin1);
//		
//		friend.setLayoutX(138);
//		friend.setLayoutY(125);
//		enemy.setLayoutX(810);
//		enemy.setLayoutY(300);
		System.out.println(player.getHit() + " moe " + mob.getEscape());
		System.out.println(mob.getName());
			if((int)(Math.random()*99)<=(player.getHit()-mob.getEscape())) {
					if((int)(Math.random()*99)<=player.getBoom()) {
						damageDisplayEvent dde = new damageDisplayEvent(combating, "playerBoom", DamageEvent.damageTo(player, mob,true));
						Thread t = new Thread(dde);
						t.start();
						
						if(mob.getHealth()>0&&!mob.getIsIced()) {//�Ǫ������ʩM�ˮ`damage1
								try {
									Thread.sleep(300);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}	
								
								double origin12 = 810;
								
								GUI.move2(toMove2, distance2);
								System.out.println("\n��m: " + toMove2.getLayoutX() +"\n");
	
								try {
									Thread.sleep(300);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								toMove2.setLayoutX(origin12);
										
								if((int)(Math.random()*99)<=player.getEscape()) {					
									damageDisplayEvent dde2 = new damageDisplayEvent(combating, "mobMiss", 0);						
									Thread t2 = new Thread(dde2);						
									t2.start();						
								}else {										
									damageDisplayEvent dde2 = new damageDisplayEvent(combating, "mobDamage", DamageEvent.damageTo(mob,player));												
									Thread t2 = new Thread(dde2);	
									t2.start();					
								}
									
						 
						if(!player.getBuffs().isEmpty()||!mob.getBuffs().isEmpty()) {
							statusThread stt = new statusThread(attack, props, skills, run, times, distance, mob);
							stt.run();
						}else {
							BattleEvent.updateCombatCount();

							attack.setDisable(false);
							props.setDisable(false);
							skills.setDisable(false);
							run.setDisable(false);
						}
							return;
						
						
						
						}else {
							mob.setIsIced(false);//�ᵲ��l��
							if(!player.getBuffs().isEmpty()||!mob.getBuffs().isEmpty()) {
								statusThread stt = new statusThread(attack, props, skills, run, times, distance, mob);
								stt.run();
							}else {
								BattleEvent.updateCombatCount();

								attack.setDisable(false);
								props.setDisable(false);
								skills.setDisable(false);
								run.setDisable(false);
							}
						}
						
					}else {
						damageDisplayEvent dde = new damageDisplayEvent(combating, "playerDamage", DamageEvent.damageTo(player, mob,false));
						Thread t = new Thread(dde);
						t.start();
						if(mob.getHealth()>0&&!mob.getIsIced()) {//�Ǫ������ʩM�ˮ`damage1
							
								try {
									Thread.sleep(300);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								double origin12 = 810;
								
								GUI.move2(toMove2, distance2);
								System.out.println("\n��m: " + toMove2.getLayoutX() +"\n");
	
								try {
									Thread.sleep(300);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								toMove2.setLayoutX(origin12);
										
								if((int)(Math.random()*99)<=player.getEscape()) {					
									damageDisplayEvent dde2 = new damageDisplayEvent(combating, "mobMiss", 0);						
									Thread t2 = new Thread(dde2);						
									t2.start();						
								}else {										
									damageDisplayEvent dde2 = new damageDisplayEvent(combating, "mobDamage", DamageEvent.damageTo(mob,player));												
									Thread t2 = new Thread(dde2);	
									t2.start();					
								}
					
						 
						
						if(!player.getBuffs().isEmpty()||!mob.getBuffs().isEmpty()) {
							statusThread stt = new statusThread(attack, props, skills, run, times, distance, mob);
							stt.run();
						}else {
							BattleEvent.updateCombatCount();

							attack.setDisable(false);
							props.setDisable(false);
							skills.setDisable(false);
							run.setDisable(false);
						}
					}else {
						mob.setIsIced(false);//�ᵲ��l��
						if(!player.getBuffs().isEmpty()||!mob.getBuffs().isEmpty()) {
							statusThread stt = new statusThread(attack, props, skills, run, times, distance, mob);
							stt.run();
						}else {
							BattleEvent.updateCombatCount();

							attack.setDisable(false);
							props.setDisable(false);
							skills.setDisable(false);
							run.setDisable(false);
						}
					}
						for(int i = 0 ; i < GUI.getPlayer().getSkills().size() ; i ++) {
							if(GUI.getPlayer().getSkills().get(i).isCanBeApply()==false) {
								if(GUI.getPlayer().getSkills().get(i).getNowCooldown()>=GUI.getPlayer().getSkills().get(i).getCool()-1) {
									GUI.getPlayer().getSkills().get(i).setCanBeApply(true);
									GUI.getPlayer().getSkills().get(i).setNowCooldown(-1);
								}else {
									GUI.getPlayer().getSkills().get(i).setNowCooldown(GUI.getPlayer().getSkills().get(i).getNowCooldown()+1);
								}
							}
						}

					return;
				}
			}else {
				damageDisplayEvent dde = new damageDisplayEvent(combating, "playerMiss", 0);
				Thread t = new Thread(dde);
				t.start();		
				if(mob.getHealth()>0&&!mob.getIsIced()) {//�Ǫ������ʩM�ˮ`damage1
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						double origin12 = 810;
						
						GUI.move2(toMove2, distance2);
						System.out.println("\n��m: " + toMove2.getLayoutX() +"\n");
	
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						toMove2.setLayoutX(origin12);
								
						if((int)(Math.random()*99)<=player.getEscape()) {					
							damageDisplayEvent dde2 = new damageDisplayEvent(combating, "mobMiss", 0);						
							Thread t2 = new Thread(dde2);						
							t2.start();						
						}else {										
							damageDisplayEvent dde2 = new damageDisplayEvent(combating, "mobDamage", DamageEvent.damageTo(mob,player));												
							Thread t2 = new Thread(dde2);	
							t2.start();					
						}
	
				 
				mob.setIsIced(false);//�ᵲ��l��
				
				
				if(!player.getBuffs().isEmpty()||!mob.getBuffs().isEmpty()) {
			
					statusThread stt = new statusThread(attack, props, skills, run, times, distance, mob);
					stt.run();
				}else {
					BattleEvent.updateCombatCount();

					skillStatus.mobStatusRecovery();
					skillStatus.playerStatusRecovery();
					attack.setDisable(false);
					props.setDisable(false);
					skills.setDisable(false);
					run.setDisable(false);
				}
				return;
			}else {
				
				mob.setIsIced(false);//�ᵲ��l��

				if(!player.getBuffs().isEmpty()||!mob.getBuffs().isEmpty()) {
					
					statusThread stt = new statusThread(attack, props, skills, run, times, distance, mob);
					stt.run();
				}else {
					BattleEvent.updateCombatCount();

					skillStatus.mobStatusRecovery();
					skillStatus.playerStatusRecovery();
					attack.setDisable(false);
					props.setDisable(false);
					skills.setDisable(false);
					run.setDisable(false);
				}
			}
				for(int i = 0 ; i < GUI.getPlayer().getSkills().size() ; i ++) {
					if(GUI.getPlayer().getSkills().get(i).isCanBeApply()==false) {
						if(GUI.getPlayer().getSkills().get(i).getNowCooldown()>=GUI.getPlayer().getSkills().get(i).getCool()-1) {
							GUI.getPlayer().getSkills().get(i).setCanBeApply(true);
							GUI.getPlayer().getSkills().get(i).setNowCooldown(-1);
						}else {
							GUI.getPlayer().getSkills().get(i).setNowCooldown(GUI.getPlayer().getSkills().get(i).getNowCooldown()+1);
						}
					}
				}

			return ;
				
 	}
	}
	

}