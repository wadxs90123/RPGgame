package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class helmet05 extends Objects{
	public helmet05(Players player) {
		super(player);
		ID = 40020;
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="HELMET";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�L�^�Y��";
		Note = "�q�L�^�Ҧa�^�Ӫ��H�ҳQ�ᤩ���Y��";
		Image = makeBG("/Images/�Y��05.png");
		strength = 0;//�j�Ƶ���
		Armor=78;//�@�ҭ�
		LV_ACQUIRED = 43;//���ŭ���
		AGI_ACQUIRED =39;
	    INT_ACQUIRED =30;
	    STR_ACQUIRED =33;
	    LUK_ACQUIRED =31;
	    
	    escape = 5;//�{�׺�
		boom =5;//���κ�
		BoomAttackRate=0.08;//���
		Hit = 8; //�R��
		
		HP+=217;//�ͩR
		MP+=162;//�]�O
		STR+=20;//�O�q
		INT+=21;//���z
		LUK+=18;//���B
		AGI+=19;//�ӱ�
		sellPrice =10000;
		buyPrice =50000;
		dropChance=5;
	}

}
