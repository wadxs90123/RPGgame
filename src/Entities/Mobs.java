package Entities;

import java.util.ArrayList;

import Events.MobDropEvent;
import GUI.GUI;
import Maps.Area;
import Objects.*;
import Objects.MobDrops.*;
import Objects.PropsPackage.*;
import Skills.beFired;
import Skills.beHealed;
import Skills.beIced;
import Skills.beMagicDamageBuffed;
import Skills.beMagicDamageDebuffed;
import Skills.skillStatus;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Background;
import javafx.scene.text.Font;

public class Mobs implements Runnable{
	
	private static Label mobCount;//¦å¶q­p¼Æ
	private static Label mobStatus;//©Çª«ÄÝ©Êµ¥¯Å ¦WºÙ
	private static ProgressBar pbar;//©Çª«¦å¶qÅã¥Ü
	private ArrayList<skillStatus> buffs = new ArrayList<>();//buffªº²Î­p³B
	
	private static boolean isIced = false;
	
	private int ID;
	private String NAME;
	private int maxHealth;
	private int LEVEL;
	private int Damage;
	private int armor;
	private int Health;
	private int Money;
	private int Diamond;
	private int escape= 0;//°{Á×²v
	
	private double Exp;
	private	static int count = 0;
	private ArrayList<Objects> drop = new ArrayList<>();
	public Mobs(int areaLevel,int areaName) {
		if(areaLevel==9&&areaName==9) {
			NAME = "Å]¤ý";
		}
		double rand = Math.random()*100;
		if(rand<10&&areaLevel!=9&&areaName!=9) {
			MobDropEvent mde = new MobDropEvent(areaLevel,true);
			drop = mde.getDrop();
			System.err.println("!!¤p¤ý±¼¸¨ª«©|¥¼½Õ¾ã!!");
			NAME = Area.name(areaName)+" (¤ý¯Å)";
	
			LEVEL = Area.level(areaLevel);
			maxHealth = (int)(6.26*Math.pow(LEVEL,2)+12.2*LEVEL+163.4*Math.random())*3;
			
			Health = maxHealth;
		
			Damage = (int)(8.2*LEVEL+1.5+20*Math.random())*3;
			armor =(int)(1.32*Math.pow(LEVEL,2)+5.2*LEVEL+120*Math.random())*3;
			Money = (int)(1.56*Math.pow(LEVEL,2)+3.2*LEVEL+63.4*Math.random())*10;
			Diamond = (int)(100+LEVEL*2.3);
//			escape = (int)(LEVEL*0.3)*2;
			Exp = (int)Math.pow((LEVEL*30.26+Math.getExponent(LEVEL*Math.random()*(areaLevel+100))),1.06)*5;
			ID = count++;			
			skillStatus.setLabel(this);
		}else if(rand>=10&&areaLevel!=9&&areaName!=9){
			
			MobDropEvent mde = new MobDropEvent(areaLevel,false);
			drop = mde.getDrop();
			NAME = Area.name(areaName);

			LEVEL = Area.level(areaLevel);
			maxHealth = (int)(6.26*Math.pow(LEVEL,2)+12.2*LEVEL+163.4*Math.random());
			Health = maxHealth;

			Damage = (int)(8.2*LEVEL+1.5+20*Math.random());
			armor =(int)(1.32*Math.pow(LEVEL,2)+5.2*LEVEL+120*Math.random());
			Money = (int)(1.56*Math.pow(LEVEL,2)+3.2*LEVEL+63.4*Math.random());
			Diamond = 0;
			escape = (int)(LEVEL*0.3);
			Exp = (int)Math.pow((LEVEL*30.26+Math.getExponent(LEVEL*Math.random()*(areaLevel+100))),1.06);
			ID = count++;
			skillStatus.setLabel(this);
		}
		Background eb = null;
		if(NAME.equals("­ô¥¬ªL")||NAME.equals("­ô¥¬ªL" + " (¤ý¯Å)")) {//¥i­Ó§O¥[¤W±¼¸¨ª«¥H¤Î´«¤W­Ó§O¹Ï¤ù400x400
			eb = GUI.backgroundCreate("/Images/­ô¥¬ªL.png");
		}else if(NAME.equals("¥vµÜ©i")||NAME.equals("¥vµÜ©i" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/¥vµÜ©i.png");
		}else if(NAME.equals("¯ó­ì¯T")||NAME.equals("¯ó­ì¯T" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/¯ó­ì¯T.png");	
		}else if(NAME.equals("»â­·ì¦")||NAME.equals("»â­·ì¦" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/»â­·ì¦.png");
		}else if(NAME.equals("¥¨­¹­ô¥¬ªL")||NAME.equals("¥¨­¹­ô¥¬ªL" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/¥¨­¹­ô¥¬ªL.png");
		}else if(NAME.equals("«p¥Ö³¥½Þ")||NAME.equals("«p¥Ö³¥½Þ" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/«p¥Ö³¥½Þ.png");
		}else if(NAME.equals("ºëÆF«è©À")||NAME.equals("ºëÆF«è©À" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/ºëÆF«è©À.png");
		}else if(NAME.equals("¾ð§¯")||NAME.equals("¾ð§¯" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/¾ð§¯.png");
		}else if(NAME.equals("¨g¼É¸¼°G")||NAME.equals("¨g¼É¸¼°G" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/¨g¼É¸¼°G.png");
		}else if(NAME.equals("­¹«Í°­")||NAME.equals("­¹«Í°­" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/­¹«Í°­.png");
		}else if(NAME.equals("ª¦¦æªÌ")||NAME.equals("ª¦¦æªÌ" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/ª¦¦æªÌ.png");
		}else if(NAME.equals("«Õ¨¦¦u½Ã")||NAME.equals("«Õ¨¦¦u½Ã" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/«Õ¨¦¦u½Ã.png");
		}else if(NAME.equals("®üµs")||NAME.equals("®üµs" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/®üµs.png");
		}else if(NAME.equals("¯BªÅ¤ô¥À")||NAME.equals("¯BªÅ¤ô¥À" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/¯BªÅ¤ô¥À.png");
		}else if(NAME.equals("µL¦^·àªê")||NAME.equals("µL¦^·àªê" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/µL¦^·àªê.png");
		}else if(NAME.equals("Å]±Ú½Ã§L")||NAME.equals("Å]±Ú½Ã§L" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/Å]±Ú½Ã§L.png");
		}else if(NAME.equals("½àª÷Ây¤H")||NAME.equals("½àª÷Ây¤H" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/½àª÷Ây¤H.png");
		}else if(NAME.equals("Å]·½¥®Ã~")||NAME.equals("Å]·½¥®Ã~" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/Å]·½¥®Ã~.png");
		}else if(NAME.equals("Å]·½¥®Às")||NAME.equals("Å]·½¥®Às" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/Å]·½¥®Às.png");
		}else if(NAME.equals("Å]±Ú¶¤ªø")||NAME.equals("Å]±Ú±Úªø" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/Å]±Ú¶¤ªø.png");
		}else if(NAME.equals("Å]·½¥¨Ã~")||NAME.equals("Å]·½¥¨Ã~" + " (¤ý¯Å)")) {
			eb = GUI.backgroundCreate("/Images/Å]·½¥¨Ã~.png");
		}else if(NAME.equals("Å]¤ýªñ½Ã")||NAME.equals("Å]¤ýªñ½Ã" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/Å]¤ýªñ½Ã.png");
		}else if(NAME.equals("Å]·½¥¨Às")||NAME.equals("Å]·½¥¨Às" + " (¤ý¯Å)")){
			eb = GUI.backgroundCreate("/Images/Å]·½¥¨Às.png");
		}else if(NAME.equals("Å]¤ý¤À¨­")||NAME.equals("Å]¤ý¤À¨­" + " (¤ý¯Å)")){

			eb = GUI.backgroundCreate("/Images/Å]¤ý¤À¨­.png");
		}else if(NAME.equals("Å]¤ý")){
			eb = GUI.backgroundCreate("/Images/Å]¤ý.png");
			LEVEL = 90;
			maxHealth = (int)(6.26*Math.pow(LEVEL,2)+12.2*LEVEL+163.4*Math.random())+999999;
			Health = maxHealth;

			Damage = (int)(12.2*LEVEL+1.5+20*Math.random())+9999;
			armor =(int)(1.32*Math.pow(LEVEL,2)+5.2*LEVEL+120*Math.random())+9999;
			Money = (int)(1.56*Math.pow(LEVEL,2)+3.2*LEVEL+63.4*Math.random())+999999;
			Diamond = 10000;
			escape = (int)200;
			Exp = (int)Math.pow((LEVEL*8.26+Math.getExponent(LEVEL*Math.random()*(areaLevel+100))),1.06)+109999;
			ID = count++;
			skillStatus.setLabel(this);
		}
		GUI.getEnimy().setBackground(eb);

	}
	public Mobs() {
	}
	public Mobs mobTest(String test) {
		Mobs testmob = new Mobs(1,1);
		if(test.equals("´ú¸Õ©Çª«")){
			testmob.setName("***´ú¸ÕÉuª«***");
			testmob.setDiamond(100);
			testmob.setHealth(99999999);
			testmob.setExp(999999);
			testmob.setMaxHealth(99999999);
			testmob.setLevel(999);
			testmob.setDamage(0);
			Objects drop1 = new mpHealer10(GUI.getPlayer());
			drop1.setDropChance(100);
			drop1.setAmount(100);
			Objects drop2 = new healer10(GUI.getPlayer());
			drop2.setAmount(100);
			drop2.setDropChance(100);
			testmob.getDrops().add(drop1);
			testmob.getDrops().add(drop2);
			testmob.setArmor(150000);
			
//			testmob.getBuffs().add(new beFired());
			testmob.getBuffs().add(new beIced());
//			testmob.getBuffs().add(new beHealed());
//			testmob.getBuffs().add(new beMagicDamageBuffed());
//			testmob.getBuffs().add(new beMagicDamageDebuffed());		
			skillStatus.setLabel(testmob);

			skillStatus.skillStatusSort(testmob);
			return testmob;
		}
		return testmob;
	}
	public void setIsIced(boolean isIced) {
		this.isIced = isIced;
	}
	public boolean getIsIced() {
		return this.isIced;
	}
	public ArrayList<Objects> getDrops(){
		return drop;
	}
	public void setArmor(int armor) {
		this.armor=armor;
	}
	public int getArmor() {
		return this.armor;
	}
	public void setDrops(ArrayList<Objects> drop) {
		this.drop = drop;
	}
	public int getMoney() {
		return Money;
	}
	public void setMoney(int Money) {
		this.Money = Money;
	}
	public void setDiamond(int Diamond) {
		this.Diamond = Diamond;
	}
	public int getDiamond() {
		return Diamond;
	}
	public void setName(String name) {
		this.NAME = name;
		return;
	}
	public int getEscape() {//°{Á×²v
		return this.escape;
	}
	public void setEscape(int escape) {//°{Á×²v
		this.escape = escape;
	}
	public int getLevel() {
		return this.LEVEL;
	}
	public void setLevel(int LEVEL) {
		this.LEVEL = LEVEL;
	}
	public String getName() {
		return this.NAME;
	}
	public void setMaxHealth(int health) {
		this.maxHealth = health;
		this.Health = health;
		return;
	}
	public void setHealth(int health) {
		this.Health = health;
		return;
	}
	public int getHealth() {
		return this.Health;
	}
	public int getMaxHealth() {
		return this.maxHealth;
	}
	public void setDamage(int damage) {
		this.Damage = damage;
		return;
	}
	public int getDamage() {
		return this.Damage;
	}
	public void setExp(int exp) {
		this.Exp = exp;
		return;
	}
	public double getExp() {
		return this.Exp;
	}
	public void setMobStatus(String mobStatus) {
		this.mobStatus.setFont(new Font((int)(18-mobStatus.length()*0.3)));
		this.mobStatus.setText(mobStatus);
	}
	public Label getMobStatus() {
		return this.mobStatus;
	}
	public void setMobCount(int health,int maxHealth) {
		mobCount.setText(String.valueOf(health) + " / " +  String.valueOf(maxHealth));
	}
	public Label getMobCount() {
		return mobCount;
	}
	public void setPBar(ProgressBar pbar) {
		pbar.setProgress((double)Health/(double)maxHealth);
	}
	public ProgressBar getPBar() {
		return pbar;
	}
 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public ArrayList<skillStatus> getBuffs() {
		return buffs;
	}
	public void setBuffs(ArrayList<skillStatus> buffs) {
		this.buffs = buffs;
	}
	
}
