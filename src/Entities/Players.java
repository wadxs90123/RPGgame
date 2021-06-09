package Entities;

import java.util.ArrayList;
import java.util.HashMap;

import Objects.Objects;
import Objects.WearingPackage.defaultArmor;
import Objects.WearingPackage.defaultHelmet;
import Objects.WearingPackage.defaultPants;
import Objects.WearingPackage.defaultShoes;
import Objects.WearingPackage.defaultWeapon;
import Skills.Skills;
import Skills.skillStatus;
import Skills.SkillPackage.DragonFireBall;
import Skills.SkillPackage.FireBall;
import Skills.SkillPackage.NormalAttack;
import javafx.scene.control.Label;

public class Players implements Runnable{
	private String Id;//�W�r
	private int Level;//����
	private int Armor;//���m�O
	private int Damage;//���z�ˮ`
	private int MagicDamage;//�]�k�ˮ`(�άO�ޯ�ˮ`)
	private boolean isEnd = false;

	
	private static ArrayList<skillStatus> buffs = new ArrayList<>();//buff�έp�B�n�O�ostatic�o�ˤ~��@�P�s���@�ӰO�����m
	private static ArrayList<Thread> damageDisplay = new ArrayList<>();//buff�έp�B�n�O�ostatic�o�ˤ~��@�P�s���@�ӰO�����m
	
	private Objects NOW_HELMET = null;
	private Objects NOW_ARMOR = null;//�{�b�諸�˳�
	private Objects NOW_PANTS = null;
	private Objects NOW_SHOES = null;
	private Objects NOW_WEAPON = null;

	private int totalSTR=0;//�`�O�q(�N�O�˳ƥ[�W�ݩʭ��O�I��)
	private int totalINT=0;//�`���z
	private int totalLUK=0;//�`���B
	private int totalAGI=0;//�`�ӱ�
	
	private int totalDamage;//�`�ˮ`
	private int STR=0;//�O�q
	private int INT=0;//���z
	private int LUK=0;//���B
	private int AGI=0;//�ӱ�
	private int statusPoint;//��O�I
	
	private int Hit;//�R���v
	private	int maxHealth;//�̤j�ͩR
	private	int nowHealth;//��e�ͩR
	private int escape;//�{�ײv
	private int boom;//�����v
	private double boomAttackRate=1.5;//�����ˮ`���v => �`�ˮ`=(���z�ˮ`or�]�k�ˮ`)*�������v
	private	double nowExp;//�g���
	private	double needExp;//�ɯũһݸg���
	private HashMap<Integer,Label> Area;//�˳ƹϤ�
	private ArrayList<Skills> Skills;//�ޯ�
	private int Mana;//��e�]�O
	private int maxMana;//��e�̤j�]�O
	private int Money;//����
	private int Diamond;//�]���� ���I���O���]���]�k��
	private ArrayList<Objects> props;//�D��
	
	public Players() {
		Level = 1;
		Id = "�w�]�W�r";
		statusPoint = 5;
		props = new ArrayList<Objects>();
		Skills = new ArrayList<Skills>();
		Area = new HashMap<Integer,Label>();
		NOW_HELMET = new defaultHelmet(this);
		NOW_ARMOR = new defaultArmor(this);
		NOW_PANTS = new defaultPants(this);
		NOW_SHOES = new defaultShoes(this);
		NOW_WEAPON = new defaultWeapon(this);
		Money = 0;
		
		Diamond = 0;
		STR=0+NOW_HELMET.getSTR()+NOW_ARMOR.getSTR()+NOW_PANTS.getSTR()+NOW_WEAPON.getSTR();//�O�q +1 = �����O +3 ��q + 30 �@�� +2
		INT=0+NOW_HELMET.getINT()+NOW_ARMOR.getINT()+NOW_PANTS.getINT()+NOW_WEAPON.getINT();//���z +1 = �]�O + 30 �]�k�����O +3 �]�k���m�O+2 �]�k�@�y +15  
		LUK=0+NOW_HELMET.getLUK()+NOW_ARMOR.getLUK()+NOW_PANTS.getLUK()+NOW_WEAPON.getLUK();//���B +1 = �����v + 2 �����O +2 ��q +10
		AGI=0+NOW_HELMET.getAGI()+NOW_ARMOR.getAGI()+NOW_PANTS.getAGI()+NOW_WEAPON.getAGI();//�ӱ� +1 = �j�׭� + 3 �����O +1 ��q +10 
		Damage = 15;
		maxHealth =200;
		nowHealth = maxHealth;
		maxMana = 200;
		Mana = maxMana;
		needExp = 100;
		nowExp = 0;
	}
	public void setWearings(String Type,Objects wearings) {
		switch(Type) {
		  case "HELMET":
			  this.NOW_HELMET = wearings;
			  break;
		  case "ARMOR":
			  this.NOW_ARMOR = wearings;
			  break;
		  case "PANTS":
			  this.NOW_PANTS = wearings;
			  break;
		  case "SHOES":
			  this.NOW_SHOES = wearings;
			  break;
		  case "WEAPON":
			  this.NOW_WEAPON = wearings;
			  break;
		  default:
			System.err.println("setWearings�]�m���~ ���ˬd�{���X");
			  break;
			 
		}
	}
	public Objects getWearingByPart(String Type) {
		switch(Type) {
		  case "HELMET":
			  return this.NOW_HELMET;
		  case "ARMOR":
			  return this.NOW_ARMOR;
		  case "PANTS":
			  return this.NOW_PANTS;
		  case "SHOES":
			  return this.NOW_SHOES;
		  case "WEAPON":
			  return this.NOW_WEAPON;
		  default:
			System.err.println("setWearings�]�m���~ ���ˬd�{���X");
			return null;
		}
	}
	public boolean isWearingEmpty() {
		if(NOW_ARMOR==null&&NOW_HELMET==null&&NOW_PANTS==null&&NOW_SHOES==null&&NOW_WEAPON==null) {
			return true;
		}else {
			return false;
		}
	}
	public void setStatus(int index,int amount) {
		if(index==0) {
			this.setSTR(amount);
		}else if(index==1) {
			this.setINT(amount);
		}else if(index==2) {
			this.setAGI(amount);
		}else if(index==3) {
			this.setLUK(amount);
		}
	}
	public int getStatusPoint() {
		return this.statusPoint;
	}
	public void setStatusPoint(int statusPoint) {
		this.statusPoint = statusPoint;
	}
	public void setArea(HashMap<Integer,Label> Area) {
		this.Area = Area;
	}
	public HashMap<Integer,Label> getArea() {
		return Area;
	}
	public void setINT(int INT) {
		this.INT = INT;
	}
	public void setSTR(int STR) {
		this.STR = STR;
	}
	public void setAGI(int AGI) {
		this.AGI = AGI;
	}
	public void setLUK(int LUK) {
		this.LUK = LUK;
	}
	public int getAGI() {
		return this.AGI;
	}
	public int getINT() {
		return this.INT;
	}
	public int getSTR() {
		return this.STR;
	}
	public int getLUK() {
		return this.LUK;
	}
	public double getBoomAttackRate() {
		return this.boomAttackRate;
	}
	public void setBoomAttackRate(double boomAttackRate) {
		this.boomAttackRate = boomAttackRate;
	}
	public void getWearing() {
		System.out.println("�ثe�Z��: " + this.NOW_WEAPON + " ID: " + this.NOW_WEAPON.getID() + " �j�Ƶ���: " + this.NOW_WEAPON.getStrength());
		System.out.println("�ثe�Y��: " + this.NOW_HELMET + " ID: " + this.NOW_HELMET.getID() + " �j�Ƶ���: " + this.NOW_HELMET.getStrength());
		System.out.println("�ثe�@��: " + this.NOW_ARMOR + " ID: " + this.NOW_ARMOR.getID() + " �j�Ƶ���: " + this.NOW_ARMOR.getStrength());
		System.out.println("�ثe�Ǥl: " + this.NOW_PANTS + " ID: " + this.NOW_PANTS.getID() + " �j�Ƶ���: " + this.NOW_PANTS.getStrength());
		System.out.println("�ثe�c�l: " + this.NOW_SHOES + " ID: " + this.NOW_SHOES.getID() + " �j�Ƶ���: " + this.NOW_SHOES.getStrength());
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
	public ArrayList<Objects> getProps(){
		return props;
	}
	public ArrayList<Skills> getSkills(){
		return Skills;
	}
	public void heal() {
		this.nowHealth =this.maxHealth;
		return;
	}
	public void mpHeal() {
		this.Mana = this.maxMana;
	}
	public void setPlayer(String id) {
		this.Id = id;
		return;
	}
	public void setHit(int hit) {
		this.Hit = hit;
	}
	public int getHit() {
		return this.Hit;
	}
	public void setLevel(int level) {
		this.Level = level;
		return;
	}
	public int getLevel() {
		return this.Level;
    }
	public double getExp() {
		return this.nowExp;
	}
	public void setExp(double exp) {
		this.nowExp = exp;
		return;
	}
	public double getMaxExp() {
		return this.needExp;
	}

	public void setMaxExp(double exp) {
		this.needExp = exp;
		return;
	}
	public void setMaxHealth(int health) {
		this.maxHealth = health ;
		return;
	}

	public void setHealth(int health) {
		this.nowHealth = health ;
		return;
	}
	public int getHealth() {
		return this.nowHealth;
	}
	public int getMaxHealth() {
		return this.maxHealth;
	}
	public void showHealth() {
		System.out.println("Player " + this.Id + "'s health is " + this.nowHealth + "/" + this.maxHealth);
		return;
	}
	public void setArmor(int Armor) {
		this.Armor = Armor;
	}
	public int getArmor() {
		return this.Armor;
	}
	public String getPlayer() {
		return this.Id;
	}
	public void updataPlayerStatus() {
		this.setTotalSTR(this.getSTR() + NOW_HELMET.getSTR()+NOW_ARMOR.getSTR()+NOW_PANTS.getSTR()+NOW_WEAPON.getSTR());//�O�q +1 = �����O +3 ��q + 30 �@�� +2
		this.setTotalINT(this.getINT() + NOW_HELMET.getINT()+NOW_ARMOR.getINT()+NOW_PANTS.getINT()+NOW_WEAPON.getINT());//���z +1 = �]�O + 30 �]�k�����O +3 �]�k���m�O+2 �]�k�@�y +15  
		this.setTotalLUK(this.getLUK() + NOW_HELMET.getLUK()+NOW_ARMOR.getLUK()+NOW_PANTS.getLUK()+NOW_WEAPON.getLUK());//���B +1 = �����v + 2 �����O +2 ��q +10
		this.setTotalAGI(this.getAGI() + NOW_HELMET.getAGI()+NOW_ARMOR.getAGI()+NOW_PANTS.getAGI()+NOW_WEAPON.getAGI());
 		int totalArmor = (int)((this.getWearingByPart("ARMOR").getArmor()+this.getWearingByPart("PANTS").getArmor()+this.getWearingByPart("SHOES").getArmor()+this.getWearingByPart("HELMET").getArmor())*1);
		int totalBoom = (int)((this.getWearingByPart("WEAPON").getBoom()+this.getWearingByPart("ARMOR").getBoom() + this.getWearingByPart("PANTS").getBoom()+this.getWearingByPart("SHOES").getBoom()+this.getWearingByPart("HELMET").getBoom())*0.1);
		int totalEscape = (int)((this.getWearingByPart("WEAPON").getEscape()+this.getWearingByPart("ARMOR").getEscape() + this.getWearingByPart("PANTS").getEscape()+this.getWearingByPart("SHOES").getEscape()+this.getWearingByPart("HELMET").getEscape())*0.1);
		int totalHit = (int)((this.getTotalAGI()*0.5)+(this.getWearingByPart("WEAPON").getHit()+this.getWearingByPart("ARMOR").getHit() + this.getWearingByPart("PANTS").getHit()+this.getWearingByPart("SHOES").getHit()+this.getWearingByPart("HELMET").getHit())*0.1);
		double totalBoomAttack = (1.5+this.getLevel()*0.001+this.getTotalLUK()*0.0003+(this.getWearingByPart("WEAPON").getBoomAttackRate()+this.getWearingByPart("ARMOR").getBoomAttackRate() + this.getWearingByPart("PANTS").getBoomAttackRate()+this.getWearingByPart("SHOES").getBoomAttackRate()+this.getWearingByPart("HELMET").getBoomAttackRate()));
		int totalHP = (int)((int)(100+this.getTotalAGI()*10+this.getTotalLUK()*10+this.getTotalSTR()*30+this.getLevel()*(17.25))+(this.getWearingByPart("WEAPON").getHealthPlus()+this.getWearingByPart("ARMOR").getHealthPlus() + this.getWearingByPart("PANTS").getHealthPlus()+this.getWearingByPart("SHOES").getHealthPlus()+this.getWearingByPart("HELMET").getHealthPlus()));
		int totalMP = (int)((int)(60+this.getTotalINT()*30+this.getLevel()*12.56)+(this.getWearingByPart("WEAPON").getManaPlus()+this.getWearingByPart("ARMOR").getManaPlus() + this.getWearingByPart("PANTS").getManaPlus()+this.getWearingByPart("SHOES").getManaPlus()+this.getWearingByPart("HELMET").getManaPlus()));
		this.setMaxHealth((int)(totalHP));
		this.setMaxMana((int)(totalMP));
		this.setArmor((int)(this.getTotalSTR()*5+this.getTotalLUK()*3)+totalArmor);
		this.setDamage((int)(this.getLevel()*11.72+this.getTotalSTR()*5.7+this.getTotalAGI()*3.19+this.getTotalLUK()*2.23));
		this.setMagicDamage((int)(this.getTotalINT()*16.7+this.getTotalLUK()*1.3+this.getLevel()*22.35+this.getWearingByPart("WEAPON").getMagicAttack()*1.5));
		this.setBoom((int)(this.getTotalLUK()*0.05+this.getTotalAGI()*0.02+totalBoom)+5);
		this.setBoomAttackRate(totalHit);
		this.setEscape((int)(this.getTotalLUK()*0.02+this.getTotalAGI()*0.05+totalEscape)+5);
		this.setMaxExp((int)(2*Math.pow(this.getLevel(),2)+15*this.getLevel()+this.getLevel()));
		this.setHit((int)(totalHit*0.1+95+this.getTotalAGI()*0.03+this.getTotalLUK()*0.03));//�R���v
		this.setTotalDamage((int)(this.getDamage()+this.getWearingByPart("WEAPON").getAttack()*1.2));
		this.setBoomAttackRate(totalBoomAttack);
		if(this.getMana()>this.getMaxMana()) {
			this.setMana(this.getMaxMana()); 
		}
		if(this.getHealth()>this.getMaxHealth()) {
			this.setHealth(this.getMaxHealth()); 
		}
	}
	public void setTotalDamage(int totalDamage) {
		this.totalDamage = totalDamage;
		return;
	}
	public int getTotalDamage() {
		return this.totalDamage;
	}
	public void setTotalAGI(int totalAGI) {
		this.totalAGI = totalAGI;
		return;
	}
	public int getTotalAGI() {
		return this.totalAGI;
	}
	public void setTotalLUK(int totalLUK) {
		this.totalLUK = totalLUK;
		return;
	}
	public int getTotalLUK() {
		return this.totalLUK;
	}
	public void setTotalINT(int totalINT) {
		this.totalINT = totalINT;
		return;
	}
	public int getTotalINT() {
		return this.totalINT;
	}
	public void setTotalSTR(int totalSTR) {
		this.totalSTR = totalSTR;
		return;
	}
	public boolean isEnd() {
		return this.isEnd;
	}
	public void setIsEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}
	public int getTotalSTR() {
		return this.totalSTR;
	}
	public void setDamage(int damage) {
		this.Damage = damage;
		return;
	}
	public int getDamage() {
		return this.Damage;
	}
	public void setBoom(int boom) {//�����v
		this.boom = boom;
		return;
	}
	public int getBoom() {
		return this.boom;
	}
	public int getEscape() {//�{�ײv
		return this.escape;
	}
	public void setEscape(int escape) {
		this.escape = escape;
		return;
	}
	public void setMagicDamage(int Magicdamage) {
		this.MagicDamage = Magicdamage;
		return;
	}
	public int getMagicDamage() {
		return this.MagicDamage;
	}
	public void setMana(int Mana) {
		this.Mana = Mana ;
	}
	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana ;
	}
	public int getMana() {
		return Mana;
	}
	public int getMaxMana() {
		return maxMana; 
	}
	
	@Override
	public void run() {
	}
	public ArrayList<skillStatus> getBuffs() {
		return buffs;
	}
	public void setBuffs(ArrayList<skillStatus> buffs) {
		this.buffs = buffs;
	}
	
}
