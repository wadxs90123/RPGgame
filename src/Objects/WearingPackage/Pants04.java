package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Pants04 extends Objects{
	public Pants04(Players player) {
		super(player);
		ID = 40018;
		QUALITY = "�}�n";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="PANTS";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�ը�����";
		Note = "�L�L���F��q���B�X�A\n�O�Q���a����ҥ��|�X�Ӫ��Ǥl";
		Image = makeBG("/Images/�H��04.png");
		strength = 0;//�j�Ƶ���
		Armor=65;//�@�ҭ�
		LV_ACQUIRED = 35;//���ŭ���
		AGI_ACQUIRED =25;
	    INT_ACQUIRED =29;
	    STR_ACQUIRED =34;
	    LUK_ACQUIRED =27;
	    
	    escape = 4;//�{�׺�
		boom =4;//���κ�
		BoomAttackRate=0.07;//���
		Hit = 7; //�R��
		
		HP+=183;//�ͩR
		MP+=125;//�]�O
		STR+=16;//�O�q
		INT+=16;//���z
		LUK+=14;//���B
		AGI+=13;//�ӱ�
		
		sellPrice =5000;
		buyPrice =25000;
		dropChance=10;
	}

}
