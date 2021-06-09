package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons007 extends Objects{

	public Weapons007(Players player) {
		super(player);
		ID= 10016;//裝備從4XX開始 武器從1XX開始
		WEARING_TYPE="WEAPON";
		QUALITY = "史詩";//粗劣 普通 良好 稀有 史詩 傳說 不滅
						 //灰色 白色 綠色 藍色 紫色 橘色 黑色	
		Name = "龍魂長杖";
		Note = "被龍所認可的人啊，\n龍魂之力將會永遠庇護著你...";
		Image = makeBG("/Images/魔杖07.png");
		strength = 0;//強化等級
		LV_ACQUIRED = 70;//等級限制
		AGI_ACQUIRED =35;
	    INT_ACQUIRED =150;
	    STR_ACQUIRED =35;
	    LUK_ACQUIRED =35;
		escape = 0;//閃避綠
		boom =50;//報及綠
		BoomAttackRate=0.7;//抱傷
		Hit = 50; //命中
		
		
		HP+=120;//生命
		MP+=500;//魔力
		magicAttack = 500;
		STR+=45;//力量
		INT+=50;//智慧
		LUK+=45;//幸運
		AGI+=45;//敏捷
		sellPrice =150000;
		buyPrice =750000;
		dropChance=3;
	}
}
