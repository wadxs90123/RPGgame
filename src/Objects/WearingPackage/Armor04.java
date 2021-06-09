package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Armor04 extends Objects{
	public Armor04(Players player) {
		super(player);
		ID = 40017;
		QUALITY = "�}�n";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="ARMOR";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�ը��Z��";
		Note = "�L�L���F��q���B�X�A\n�O�Q���a����ҥ��|�X�Ӫ��Z��";
		Image = makeBG("/Images/����04.png");
		strength = 0;//�j�Ƶ���
		Armor=135;//�@�ҭ�
		LV_ACQUIRED = 37;//���ŭ���
		AGI_ACQUIRED =38;
	    INT_ACQUIRED =35;
	    STR_ACQUIRED =31;
	    LUK_ACQUIRED =26;
	    
	    escape = 6;//�{�׺�
		boom = 6;//���κ�
		BoomAttackRate=0.09;//���
		Hit = 6; //�R��
		
		HP+=305;//�ͩR
		MP+=127;//�]�O
		STR+=27;//�O�q
		INT+=25;//���z
		LUK+=21;//���B
		AGI+=24;//�ӱ�
		
		sellPrice =5000;
		buyPrice =25000;
		dropChance=10;
	}

}
