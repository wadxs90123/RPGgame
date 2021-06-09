package Objects;

import Entities.Mobs;
import Entities.Players;
import Objects.MobDrops.*;
import Objects.PropsPackage.*;
import Objects.WearingPackage.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class Objects {

	protected int sellIndex=-1;
	protected String productAmount="�L��";
	protected int buyPrice=0;
	protected int sellPrice=0;
	protected boolean isDiamond = false;
	protected Players owner;
	protected boolean isSkill = false;
	protected static Mobs enemy;
	protected String Name;
	protected int ID=0;
	protected String Note;
	protected double lotChance;
	protected int Amount=1;
	protected int Armor=0;
	protected int attack=0;
	protected int escape = 0;
	protected int Hit=0;
	protected int boom = 0;
	protected int dropChance = 0;//�������v0-100
	protected double BoomAttackRate=0;//�B�~�[��
	protected int magicAttack=0;
	
	protected int LV_ACQUIRED=0;//���ŭ���

	protected int STR_ACQUIRED=0;//�O�q����
	protected int INT_ACQUIRED=0;//���z����
	protected int LUK_ACQUIRED=0;//���B����
	protected int AGI_ACQUIRED=0;//�ӱ�����
	
	protected int strength=0;//�j�Ƶ���
	
	protected String QUALITY;//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
							 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
	protected String WEARING_TYPE;
	protected int HP=0;//�ͩR
	protected int MP=0;//�]�O
	
	protected int STR=0;//�O�q
	protected int INT=0;//���z
	protected int LUK=0;//���B
	protected int AGI=0;//�ӱ�

	protected Background Image;
	protected boolean isHeal;
	protected  boolean isMp;
	public Objects(Players player){
		owner = player;
		QUALITY = "���q";
		Name="�w�]�W��";
		Amount = 1;
		isHeal = true;
		isMp = false;
		Note="�w�]���e";
	}
	public boolean isSkill() {
		return isSkill;
	}
	public void setSkill(boolean isSkill) {
		this.isSkill = isSkill;
	}
	public void setLotChance(double lc) {
		this.lotChance = lc;
	}
	public double getLotChance() {
		return this.lotChance;
	}
	public void setProAmt(String ProAmt) {
		this.productAmount = ProAmt;
	}
	public String getProAmt() {
		return this.productAmount;
	}
	public void setSellIndex(int index) {
		this.sellIndex = index;
	}
	public int getSellIndex() {
		return this.sellIndex;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getName() {
		return this.Name;
	}
	public boolean isDiamond() {
		return isDiamond;
	}
	public void setIsDiamond(boolean isDiamond) {
		this.isDiamond = isDiamond;
	}
	public int getBuyPrice() {
		return this.buyPrice;
	}
	public int getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public String getWearType() {
		return this.WEARING_TYPE;
	}
	public void setQuality(String Quality) {
		this.QUALITY = Quality;
	}
	public String getQuality() {
		return this.QUALITY;
	}
	public void setLevelAqu(int LV_ACQUIRED) {
		this.LV_ACQUIRED =LV_ACQUIRED;
	}
	public void setINTAqu(int INT_ACQUIRED) {
		this.INT_ACQUIRED = INT_ACQUIRED;
	}
	public void setSTRAqu(int STR_ACQUIRED) {
		this.STR_ACQUIRED = STR_ACQUIRED;
	}
	public void setLUKAqu(int LUK_ACQUIRED) {
		this.LUK_ACQUIRED = LUK_ACQUIRED;
	}
	public void setAGIAqu(int AGI_ACQUIRED) {
		this.AGI_ACQUIRED = AGI_ACQUIRED;
	}
	public void setStrength(int strength) {
		this.strength=strength;//�j�Ƶ���
	}
	public int getLevelAqu() {
		return this.LV_ACQUIRED;
	}
	public int getINTAqu() {
		return this.INT_ACQUIRED;
	}
	public int getSTRAqu() {
		return this.STR_ACQUIRED;
	}
	public int getLUKAqu() {
		return this.LUK_ACQUIRED;
	}
	public int getAGIAqu() {
		return this.AGI_ACQUIRED;
	}
	public int getStrength() {
		return this.strength;//�j�Ƶ���
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
	public void setWearType(String TYPE) {
		//HELMET ARMOR PANTS SHOES
		switch(TYPE) {
		 case "WEAPON":
			 	this.WEARING_TYPE = TYPE;
			 	break;
		 case "HELMET":
				this.WEARING_TYPE = TYPE;
				break;
		 case "ARMOR":
				this.WEARING_TYPE = TYPE;
				break;
		 case "PANTS":
				this.WEARING_TYPE = TYPE;
				break;
		 case "SHOES":
				this.WEARING_TYPE = TYPE;
				break;
		default:
			System.err.println("�˳������]�m���~.���ˬd�{���X!");
				break;
		}
	}
	public void setDropChance(int dropChance) {
		this.dropChance = dropChance;
	}
	public int getDropChance() {
		return this.dropChance;
	}
	public void setBoom(int boom) {
		this.boom = boom;
	}
	public int getBoom() {
		return this.boom;
	}
	public double getBoomAttackRate() {
		return this.BoomAttackRate;
	}
	public void setBoomAttackRate(double boomAttackRate) {
		this.BoomAttackRate = boomAttackRate;
	}
	public void setArmor(int armor) {
		this.Armor = armor;
	}
	public void setHit(int hit) {
		this.Hit = hit;
	}
	public int getHit() {
		return this.Hit;
	}
	public int getArmor() {
		return this.Armor;
	}
	public void setEscape(int escape) {
		this.escape = escape;
	}
	public int getEscape() {
		return this.escape;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getAttack() {
		return this.attack;
	}
	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	public int getMagicAttack() {
		return this.magicAttack;
	}
	public void setEnemy(Mobs mob) {
		enemy = mob;
	}
	
	public String getNote() {
		return this.Note;
	}
	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	public int getHealthPlus() {
		return this.HP;
	}
	public void setManaPlus(int ManaPlus) {
		this.MP = ManaPlus;
	}
	public int getManaPlus() {
		return this.MP;
	}
	public void setHealthPlus(int HP) {
		this.HP = HP;
	}
	public int getAmount() {
		return this.Amount;
	}
	public void setAmount(int Amount) {
		this.Amount = Amount;
	}
	public boolean isHeal() {
		return this.isHeal;
	}
	public boolean isMP() {
		return this.isMp;
	}
	public void setIsMPH(boolean isMP) {
		this.isMp = isMP;
	}
	public void setIsHPH(boolean isHP) {
		this.isHeal=isHP;
	}
	public int getHealAmount() {
		return 1; 
	}
	public void Heal() {
		this.owner.setHealth(this.owner.getHealth()+0);
	}
	public Background getImage() {
		return this.Image;
	}
	public void setImage(Background Image) {
		this.Image=Image;
	}
	public static Background makeBG(String URL) { 
		Image bi = new Image(URL);
		BackgroundImage bgi= new BackgroundImage(bi, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background bg = new Background(bgi);
		return bg;
	}
	public static Objects getDataPropsCreate(Players player,int id,int Amount) {
		Objects result = new healer(player);//�w�]ID:1;
		if(id==1) {
			result = new healer(player);
		}else if(id==2) {
			result = new healer2(player);
		}else if(id==3) { 
			result = new mpHealer(player);
		}else if(id==4) {
			result = new healer3(player);
		}else if(id==5) { 
			result = new mpHealer2(player);
		}else if(id==6) {
			result = new mpHealer3(player);
		}else if(id==50) {
			result = new healer10(player);
		}else if(id==51) { 
			result = new mpHealer10(player);
		}else if(id==52) { 
			result = new weardDrink(player);
		}else if(id==500) {
			result = new tooth1(player);
		}else if(id==501) {
			result = new tooth2(player);
		}else if(id==502) {
			result = new tooth3(player);
		}else if(id==503) {
			result = new tooth4(player);
		}else if(id==1000) {
			result = new defaultWeapon(player);
		}else if(id==4000) {
			result = new defaultHelmet(player);
		}else if(id==4001) {
			result = new defaultArmor(player);
		}else if(id==4002) {
			result = new defaultPants(player);
		}else if(id==4003) {
			result = new defaultShoes(player);
		}else if(id==9991) {
			result = new SkillsBook7(player);
		}else if(id==9992) {
			result = new SkillsBook6(player);
		}else if(id==9993) {
			result = new SkillsBook5(player);
		}else if(id==9994) {
			result = new SkillsBook4(player);
		}else if(id==9995) {
			result = new SkillsBook3(player);
		}else if(id==9996) {
			result = new SkillsBook2(player);
		}else if(id==9997) {
			result = new SkillsBook(player);
		}else if(id==10000) {
			result = new Weapons(player);
		}else if(id==40000) {
			result = new Helmet(player);
		}else if(id==40001) {
			result = new Armor(player);
		}else if(id==40002) {
			result = new Pants(player);
		}else if(id==40003) {
			result = new Shoes(player);
		}else if(id==30000) {
			result = new Weapons2(player);
		}else if(id==40004) { 
			result = new helmet01(player);
		}else if(id==40005) {
			result = new Armor01(player);
		}else if(id==40006) { 
			result = new Pants01(player);
		}else if(id==40007) { 
			result = new Shoes01(player);
		}else if(id==40008) { 
			result = new helmet02(player);
		}else if(id==40009) {
			result = new Armor02(player);
		}else if(id==40010) { 
			result = new Pants02(player);
		}else if(id==40011) { 
			result = new Shoes02(player);
		}else if(id==40012) { 
			result = new helmet03(player);
		}else if(id==40013) {
			result = new Armor03(player);
		}else if(id==40014) { 
			result = new Pants03(player);
		}else if(id==40015) { 
			result = new Shoes03(player);
		}else if(id==40016) { 
			result = new helmet04(player);
		}else if(id==40017) {
			result = new Armor04(player);
		}else if(id==40018) { 
			result = new Pants04(player);
		}else if(id==40019) { 
			result = new Shoes04(player);
		}else if(id==40020) { 
			result = new helmet05(player);
		}else if(id==40021) {
			result = new Armor05(player);
		}else if(id==40022) { 
			result = new Pants05(player);
		}else if(id==40023) { 
			result = new Shoes05(player);
		}else if(id==40024) { 
			result = new helmet06(player);
		}else if(id==40025) {
			result = new Armor06(player);
		}else if(id==40026) { 
			result = new Pants06(player);
		}else if(id==40027) { 
			result = new Shoes06(player);
		}else if(id==40028) { 
			result = new helmet07(player);
		}else if(id==40029) {
			result = new Armor07(player);
		}else if(id==40030) { 
			result = new Pants07(player);
		}else if(id==40031) { 
			result = new Shoes07(player);
		}else if(id==40032) { 
			result = new helmet08(player);
		}else if(id==40033) {
			result = new Armor08(player);
		}else if(id==40034) { 
			result = new Pants08(player);
		}else if(id==40035) { 
			result = new Shoes08(player);
		}else if(id==40036) { 
			result = new helmet09(player);
		}else if(id==40037) {
			result = new Armor09(player);
		}else if(id==40038) { 
			result = new Pants09(player);
		}else if(id==40039) { 
			result = new Shoes09(player);
		}else if(id==10001) { 
			result = new Weapons01(player);
		}else if(id==10002) {
			result = new Weapons02(player);
		}else if(id==10003) { 
			result = new Weapons03(player);
		}else if(id==10004) { 
			result = new Weapons04(player);
		}else if(id==10005) { 
			result = new Weapons05(player);
		}else if(id==10006) {
			result = new Weapons06(player);
		}else if(id==10007) { 
			result = new Weapons07(player);
		}else if(id==10008) { 
			result = new Weapons08(player);
		}else if(id==10009) { 
			result = new Weapons09(player);
		}else if(id==10010) {
			result = new Weapons001(player);
		}else if(id==10011) { 
			result = new Weapons002(player);
		}else if(id==10012) { 
			result = new Weapons003(player);
		}else if(id==10013) {
			result = new Weapons004(player);
		}else if(id==10014) { 
			result = new Weapons005(player);
		}else if(id==10015) { 
			result = new Weapons006(player);
		}else if(id==10016) {
			result = new Weapons007(player);
		}else if(id==10017) { 
			result = new Weapons008(player);
		}else if(id==10018) { 
			result = new Weapons009(player);
		}else if(id==10019) { 
			result = new Weapons0001(player);
		}else if(id==10020) { 
			result = new Weapons0002(player);
		}else if(id==10021) { 
			result = new Weapons0003(player);
		}else if(id==10022) { 
			result = new Weapons0004(player);
		}else if(id==10023) { 
			result = new Weapons0005(player);
		}else if(id==10024) { 
			result = new Weapons0006(player);
		}else if(id==10025) { 
			result = new Weapons0007(player);
		}else if(id==10026) { 
			result = new Weapons0008(player);
		}else if(id==10027) { 
			result = new Weapons0009(player);
		}else if(id==10028) { 
			result = new Weapons0010(player);
		}else if(id==10029) { 
			result = new Weapons0011(player);
		}else if(id==10030) { 
			result = new Weapons0012(player);
		}
		
		result.setAmount(Amount);
		return result;
	}
	public static Objects getDataWearingsCreate(Players player,int id,int strength) {
		Objects result = new Weapons(player);//�w�]ID:10000;
		if(id==10000) {
			result = new Weapons(player);
		}else if(id==40000) { 
			result = new Helmet(player);
		}else if(id==40001) {
			result = new Armor(player);
		}else if(id==40002) { 
			result = new Pants(player);
		}else if(id==40003) { 
			result = new Shoes(player);
		}else if(id==1000) {
			result = new defaultWeapon(player);
		}else if(id==4000) {
			result = new defaultHelmet(player);
		}else if(id==4001) {
			result = new defaultArmor(player);
		}else if(id==4002) {
			result = new defaultPants(player);
		}else if(id==4003) {
			result = new defaultShoes(player);
		}else if(id==30000) {
			result = new Weapons2(player);
		}else if(id==40004) { 
			result = new helmet01(player);
		}else if(id==40005) {
			result = new Armor01(player);
		}else if(id==40006) { 
			result = new Pants01(player);
		}else if(id==40007) { 
			result = new Shoes01(player);
		}else if(id==40008) { 
			result = new helmet02(player);
		}else if(id==40009) {
			result = new Armor02(player);
		}else if(id==40010) { 
			result = new Pants02(player);
		}else if(id==40011) { 
			result = new Shoes02(player);
		}else if(id==40012) { 
			result = new helmet03(player);
		}else if(id==40013) {
			result = new Armor03(player);
		}else if(id==40014) { 
			result = new Pants03(player);
		}else if(id==40015) { 
			result = new Shoes03(player);
		}else if(id==40016) { 
			result = new helmet04(player);
		}else if(id==40017) {
			result = new Armor04(player);
		}else if(id==40018) { 
			result = new Pants04(player);
		}else if(id==40019) { 
			result = new Shoes04(player);
		}else if(id==40020) { 
			result = new helmet05(player);
		}else if(id==40021) {
			result = new Armor05(player);
		}else if(id==40022) { 
			result = new Pants05(player);
		}else if(id==40023) { 
			result = new Shoes05(player);
		}else if(id==40024) { 
			result = new helmet06(player);
		}else if(id==40025) {
			result = new Armor06(player);
		}else if(id==40026) { 
			result = new Pants06(player);
		}else if(id==40027) { 
			result = new Shoes06(player);
		}else if(id==40028) { 
			result = new helmet07(player);
		}else if(id==40029) {
			result = new Armor07(player);
		}else if(id==40030) { 
			result = new Pants07(player);
		}else if(id==40031) { 
			result = new Shoes07(player);
		}else if(id==40032) { 
			result = new helmet08(player);
		}else if(id==40033) {
			result = new Armor08(player);
		}else if(id==40034) { 
			result = new Pants08(player);
		}else if(id==40035) { 
			result = new Shoes08(player);
		}else if(id==40036) { 
			result = new helmet09(player);
		}else if(id==40037) {
			result = new Armor09(player);
		}else if(id==40038) { 
			result = new Pants09(player);
		}else if(id==40039) { 
			result = new Shoes09(player);
		}else if(id==10001) { 
			result = new Weapons01(player);
		}else if(id==10002) {
			result = new Weapons02(player);
		}else if(id==10003) { 
			result = new Weapons03(player);
		}else if(id==10004) { 
			result = new Weapons04(player);
		}else if(id==10005) { 
			result = new Weapons05(player);
		}else if(id==10006) {
			result = new Weapons06(player);
		}else if(id==10007) { 
			result = new Weapons07(player);
		}else if(id==10008) { 
			result = new Weapons08(player);
		}else if(id==10009) { 
			result = new Weapons09(player);
		}else if(id==10010) {
			result = new Weapons001(player);
		}else if(id==10011) { 
			result = new Weapons002(player);
		}else if(id==10012) { 
			result = new Weapons003(player);
		}else if(id==10013) {
			result = new Weapons004(player);
		}else if(id==10014) { 
			result = new Weapons005(player);
		}else if(id==10015) { 
			result = new Weapons006(player);
		}else if(id==10016) {
			result = new Weapons007(player);
		}else if(id==10017) { 
			result = new Weapons008(player);
		}else if(id==10018) { 
			result = new Weapons009(player);
		}else if(id==10019) { 
			result = new Weapons0001(player);
		}else if(id==10020) { 
			result = new Weapons0002(player);
		}else if(id==10021) { 
			result = new Weapons0003(player);
		}else if(id==10022) { 
			result = new Weapons0004(player);
		}else if(id==10023) { 
			result = new Weapons0005(player);
		}else if(id==10024) { 
			result = new Weapons0006(player);
		}else if(id==10025) { 
			result = new Weapons0007(player);
		}else if(id==10026) { 
			result = new Weapons0008(player);
		}else if(id==10027) { 
			result = new Weapons0009(player);
		}else if(id==10028) { 
			result = new Weapons0010(player);
		}else if(id==10029) { 
			result = new Weapons0011(player);
		}else if(id==10030) { 
			result = new Weapons0012(player);
		}
		result.setStrength(strength);
		return result;
	}
	public static void addDataPropsCreate(Players player,int id , int Amount) {
		player.getProps().add(getDataPropsCreate(player,id,Amount));//�гy�X�D��
	}
}
