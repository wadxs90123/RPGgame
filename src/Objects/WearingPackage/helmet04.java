package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class helmet04 extends Objects{
	public helmet04(Players player) {
		super(player);
		ID = 40016;
		QUALITY = "�}�n";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="HELMET";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�ը��Y��";
		Note = "�L�L���F��q���B�X�A\n�O�Q���a����ҥ��|�X�Ӫ��Y��";
		Image = makeBG("/Images/�Y��04.png");
		strength = 0;//�j�Ƶ���
		Armor=58;//�@�ҭ�
		LV_ACQUIRED = 33;//���ŭ���
		AGI_ACQUIRED =34;
	    INT_ACQUIRED =25;
	    STR_ACQUIRED =29;
	    LUK_ACQUIRED =28;
	    
	    escape = 4;//�{�׺�
		boom =4;//���κ�
		BoomAttackRate=0.07;//���
		Hit = 7; //�R��
		
		HP+=167;//�ͩR
		MP+=122;//�]�O
		STR+=15;//�O�q
		INT+=15;//���z
		LUK+=12;//���B
		AGI+=13;//�ӱ�
		sellPrice =5000;
		buyPrice =25000;
		dropChance=10;
	}

}
