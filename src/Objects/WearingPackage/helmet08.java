package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class helmet08 extends Objects{
	public helmet08(Players player) {
		super(player);
		ID = 40032;
		QUALITY = "�ǻ�";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="HELMET";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�]���Բ�";
		Note = "�]���j���W�̺�¤��O�A���񯫤��N��";
		Image = makeBG("/Images/�Y��08.png");
		strength = 0;//�j�Ƶ���
		Armor=500;//�@�ҭ�
		LV_ACQUIRED = 73;//���ŭ���
		AGI_ACQUIRED =65;
	    INT_ACQUIRED =65;
	    STR_ACQUIRED =65;
	    LUK_ACQUIRED =65;
	    
	    escape = 20;//�{�׺�
		boom = 20;//���κ�
		BoomAttackRate=0.3;//���
		Hit = 30; //�R��
		
		HP+=800;//�ͩR
		MP+=500;//�]�O
		STR+=60;//�O�q
		INT+=60;//���z
		LUK+=60;//���B
		AGI+=60;//�ӱ�
		sellPrice =500000;
		buyPrice =5000000;
		dropChance=2;
	}

}
