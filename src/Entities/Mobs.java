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
	
	private static Label mobCount;//��q�p��
	private static Label mobStatus;//�Ǫ��ݩʵ��� �W��
	private static ProgressBar pbar;//�Ǫ���q���
	private ArrayList<skillStatus> buffs = new ArrayList<>();//buff���έp�B
	
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
	private int escape= 0;//�{�ײv
	
	private double Exp;
	private	static int count = 0;
	private ArrayList<Objects> drop = new ArrayList<>();
	public Mobs(int areaLevel,int areaName) {
		if(areaLevel==9&&areaName==9) {
			NAME = "�]��";
		}
		double rand = Math.random()*100;
		if(rand<10&&areaLevel!=9&&areaName!=9) {
			MobDropEvent mde = new MobDropEvent(areaLevel,true);
			drop = mde.getDrop();
			System.err.println("!!�p���������|���վ�!!");
			NAME = Area.name(areaName)+" (����)";
	
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
		if(NAME.equals("�����L")||NAME.equals("�����L" + " (����)")) {//�i�ӧO�[�W�������H�δ��W�ӧO�Ϥ�400x400
			eb = GUI.backgroundCreate("/Images/�����L.png");
		}else if(NAME.equals("�v�ܩi")||NAME.equals("�v�ܩi" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�v�ܩi.png");
		}else if(NAME.equals("���T")||NAME.equals("���T" + " (����)")){
			eb = GUI.backgroundCreate("/Images/���T.png");	
		}else if(NAME.equals("�⭷�")||NAME.equals("�⭷�" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�⭷�.png");
		}else if(NAME.equals("���������L")||NAME.equals("���������L" + " (����)")){
			eb = GUI.backgroundCreate("/Images/���������L.png");
		}else if(NAME.equals("�p�ֳ���")||NAME.equals("�p�ֳ���" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�p�ֳ���.png");
		}else if(NAME.equals("���F���")||NAME.equals("���F���" + " (����)")){
			eb = GUI.backgroundCreate("/Images/���F���.png");
		}else if(NAME.equals("��")||NAME.equals("��" + " (����)")){
			eb = GUI.backgroundCreate("/Images/��.png");
		}else if(NAME.equals("�g�ɸ��G")||NAME.equals("�g�ɸ��G" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�g�ɸ��G.png");
		}else if(NAME.equals("���Ͱ�")||NAME.equals("���Ͱ�" + " (����)")){
			eb = GUI.backgroundCreate("/Images/���Ͱ�.png");
		}else if(NAME.equals("�����")||NAME.equals("�����" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�����.png");
		}else if(NAME.equals("�ը��u��")||NAME.equals("�ը��u��" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�ը��u��.png");
		}else if(NAME.equals("���s")||NAME.equals("���s" + " (����)")){
			eb = GUI.backgroundCreate("/Images/���s.png");
		}else if(NAME.equals("�B�Ť���")||NAME.equals("�B�Ť���" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�B�Ť���.png");
		}else if(NAME.equals("�L�^���")||NAME.equals("�L�^���" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�L�^���.png");
		}else if(NAME.equals("�]�ڽçL")||NAME.equals("�]�ڽçL" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�]�ڽçL.png");
		}else if(NAME.equals("����y�H")||NAME.equals("����y�H" + " (����)")){
			eb = GUI.backgroundCreate("/Images/����y�H.png");
		}else if(NAME.equals("�]�����~")||NAME.equals("�]�����~" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�]�����~.png");
		}else if(NAME.equals("�]�����s")||NAME.equals("�]�����s" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�]�����s.png");
		}else if(NAME.equals("�]�ڶ���")||NAME.equals("�]�ڱڪ�" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�]�ڶ���.png");
		}else if(NAME.equals("�]�����~")||NAME.equals("�]�����~" + " (����)")) {
			eb = GUI.backgroundCreate("/Images/�]�����~.png");
		}else if(NAME.equals("�]�����")||NAME.equals("�]�����" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�]�����.png");
		}else if(NAME.equals("�]�����s")||NAME.equals("�]�����s" + " (����)")){
			eb = GUI.backgroundCreate("/Images/�]�����s.png");
		}else if(NAME.equals("�]������")||NAME.equals("�]������" + " (����)")){

			eb = GUI.backgroundCreate("/Images/�]������.png");
		}else if(NAME.equals("�]��")){
			eb = GUI.backgroundCreate("/Images/�]��.png");
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
		if(test.equals("���թǪ�")){
			testmob.setName("***�����u��***");
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
	public int getEscape() {//�{�ײv
		return this.escape;
	}
	public void setEscape(int escape) {//�{�ײv
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
