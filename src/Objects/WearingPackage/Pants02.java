package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Pants02 extends Objects{
	public Pants02(Players player) {
		super(player);
		ID = 40010;
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="PANTS";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�_�I�̪���";
		Note = "�_�I�̱`�諸�Ǥl";
		Image = makeBG("/Images/�H��02.png");
		strength = 0;//�j�Ƶ���
		Armor=19;//�@�ҭ�
		LV_ACQUIRED = 15;//���ŭ���
		AGI_ACQUIRED =16;
	    INT_ACQUIRED =14;
	    STR_ACQUIRED =14;
	    LUK_ACQUIRED =17;
	    
	    escape = 2;//�{�׺�
		boom =2;//���κ�
		BoomAttackRate=0.04;//���
		Hit = 2; //�R��
		
		HP+=73;//�ͩR
		MP+=65;//�]�O
		STR+=6;//�O�q
		INT+=5;//���z
		LUK+=5;//���B
		AGI+=7;//�ӱ�
		
		sellPrice =500;
		buyPrice =2500;
		dropChance=10;
	}

}
