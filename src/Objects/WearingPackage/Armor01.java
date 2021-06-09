package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Armor01 extends Objects{
	public Armor01(Players player) {
		super(player);
		ID = 40005;
		QUALITY = "�ʦH";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="ARMOR";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�ʻs�֦�";
		Note = "���u�ʦH���֦�";
		Image = makeBG("/Images/����01.png");
		strength = 0;//�j�Ƶ���
		Armor=15;//�@�ҭ�
		LV_ACQUIRED = 7;//���ŭ���
		AGI_ACQUIRED =8;
	    INT_ACQUIRED =5;
	    STR_ACQUIRED =9;
	    LUK_ACQUIRED =6;
	    
	    escape = 1;//�{�׺�
		boom =1;//���κ�
		BoomAttackRate=0.03;//���
		Hit = 2; //�R��
		
		HP+=35;//�ͩR
		MP+=25;//�]�O
		STR+=3;//�O�q
		INT+=2;//���z
		LUK+=4;//���B
		AGI+=3;//�ӱ�
		
		sellPrice =100;
		buyPrice =500;
		dropChance=10;
	}

}
