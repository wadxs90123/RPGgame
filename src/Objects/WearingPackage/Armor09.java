package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Armor09 extends Objects{
	public Armor09(Players player) {
		super(player);
		ID = 40037;
		QUALITY = "����";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="ARMOR";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�`�W�Z��";
		Note = "�H�ɪŤ����N���l�c���A����j�j";
		Image = makeBG("/Images/����09.png");
		strength = 0;//�j�Ƶ���
		Armor=1500;//�@�ҭ�
		LV_ACQUIRED = 87;//���ŭ���335
		AGI_ACQUIRED =100;
	    INT_ACQUIRED =100;
	    STR_ACQUIRED =100;
	    LUK_ACQUIRED =100;
	    
	    escape = 50;//�{�׺�
		boom = 50;//���κ�
		BoomAttackRate=1;//���
		Hit = 50; //�R��
		
		HP+=10000;//�ͩR
		MP+=5000;//�]�O
		STR+=150;//�O�q
		INT+=150;//���z
		LUK+=150;//���B
		AGI+=150;//�ӱ�
		
		sellPrice =1000000;
		buyPrice =100000000;
		dropChance=1;
	}

}
