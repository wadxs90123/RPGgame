package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Pants01 extends Objects{
	public Pants01(Players player) {
		super(player);
		ID = 40006;
		QUALITY = "�ʦH";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="PANTS";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�ʻs�ֿ�";
		Note = "���u�ʦH���ֿ�";
		Image = makeBG("/Images/�H��01.png");
		strength = 0;//�j�Ƶ���
		Armor=9;//�@�ҭ�
		LV_ACQUIRED = 5;//���ŭ���
		AGI_ACQUIRED =6;
	    INT_ACQUIRED =4;
	    STR_ACQUIRED =8;
	    LUK_ACQUIRED =4;
	    
	    escape = 1;//�{�׺�
		boom =1;//���κ�
		BoomAttackRate=0.02;//���
		Hit = 1; //�R��
		
		HP+=23;//�ͩR
		MP+=15;//�]�O
		STR+=2;//�O�q
		INT+=4;//���z
		LUK+=4;//���B
		AGI+=3;//�ӱ�
		
		sellPrice =100;
		buyPrice =500;
		dropChance=10;
	}

}
