package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Shoes02 extends Objects{
	public Shoes02(Players player) {
		super(player);
		ID = 40011;
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="SHOES";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�_�I�̵u�u";
		Note = "�_�I�̱`�諸�u�l";
		Image = makeBG("/Images/���u02.png");
		strength = 0;//�j�Ƶ���
		Armor=27;//�@�ҭ�
		LV_ACQUIRED = 14;//���ŭ���
		AGI_ACQUIRED =8;
	    INT_ACQUIRED =13;
	    STR_ACQUIRED =17;
	    LUK_ACQUIRED =12;
	    
	    escape = 1;//�{�׺�
		boom =2;//���κ�
		BoomAttackRate=0.05;//���
		Hit = 2; //�R��
		
		HP+=67;//�ͩR
		MP+=48;//�]�O
		STR+=6;//�O�q
		INT+=7;//���z
		LUK+=6;//���B
		AGI+=5;//�ӱ�
		
		sellPrice =500;
		buyPrice =2500;
		dropChance=10;
	}

}
