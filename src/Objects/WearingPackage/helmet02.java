package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class helmet02 extends Objects{
	public helmet02(Players player) {
		super(player);
		ID = 40008;
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="HELMET";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�_�I���Y��";
		Note = "�_�I�̱`�����Y��";
		Image = makeBG("/Images/�Y��02.png");
		strength = 0;//�j�Ƶ���
		Armor=18;//�@�ҭ�
		LV_ACQUIRED = 13;//���ŭ���
		AGI_ACQUIRED =8;
	    INT_ACQUIRED =10;
	    STR_ACQUIRED =13;
	    LUK_ACQUIRED =10;
	    
	    escape = 2;//�{�׺�
		boom =2;//���κ�
		BoomAttackRate=0.03;//���
		Hit = 5; //�R��
		
		HP+=67;//�ͩR
		MP+=32;//�]�O
		STR+=5;//�O�q
		INT+=6;//���z
		LUK+=7;//���B
		AGI+=8;//�ӱ�
		sellPrice =500;
		buyPrice =2500;
		dropChance=10;
	}

}
