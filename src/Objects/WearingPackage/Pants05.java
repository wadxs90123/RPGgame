package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Pants05 extends Objects{
	public Pants05(Players player) {
		super(player);
		ID = 40022;
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="PANTS";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�L�^����";
		Note = "�q�L�^�Ҧa�^�Ӫ��H�ҳQ�ᤩ���Ǥl";
		Image = makeBG("/Images/�H��05.png");
		strength = 0;//�j�Ƶ���
		Armor=105;//�@�ҭ�
		LV_ACQUIRED = 45;//���ŭ���
		AGI_ACQUIRED =30;
	    INT_ACQUIRED =35;
	    STR_ACQUIRED =39;
	    LUK_ACQUIRED =34;
	    
	    escape = 5;//�{�׺�
		boom =6;//���κ�
		BoomAttackRate=0.1;//���
		Hit = 8; //�R��
		
		HP+=253;//�ͩR
		MP+=165;//�]�O
		STR+=21;//�O�q
		INT+=21;//���z
		LUK+=23;//���B
		AGI+=19;//�ӱ�
		
		sellPrice =10000;
		buyPrice =50000;
		dropChance=5;
	}

}
