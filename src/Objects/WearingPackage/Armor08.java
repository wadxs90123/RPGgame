package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Armor08 extends Objects{
	public Armor08(Players player) {
		super(player);
		ID = 40033;
		QUALITY = "�ǻ�";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="ARMOR";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�]���ԥ�";
		Note = "�]���j���W�̺�¤��O�A���񯫤��N��";
		Image = makeBG("/Images/����08.png");
		strength = 0;//�j�Ƶ���
		Armor=800;//�@�ҭ�
		LV_ACQUIRED = 77;//���ŭ���335
		AGI_ACQUIRED =80;
	    INT_ACQUIRED =80;
	    STR_ACQUIRED =80;
	    LUK_ACQUIRED =80;
	    
	    escape = 25;//�{�׺�
		boom = 25;//���κ�
		BoomAttackRate=0.5;//���
		Hit = 25; //�R��
		
		HP+=2500;//�ͩR
		MP+=800;//�]�O
		STR+=80;//�O�q
		INT+=80;//���z
		LUK+=80;//���B
		AGI+=80;//�ӱ�
		
		sellPrice =500000;
		buyPrice =5000000;
		dropChance=2;
	}

}
