package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Shoes04 extends Objects{
	public Shoes04(Players player) {
		super(player);
		ID = 40019;
		QUALITY = "�}�n";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="SHOES";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�ը��u�u";
		Note = "�L�L���F��q���B�X�A\n�O�Q���a����ҥ��|�X�Ӫ��u�l";
		Image = makeBG("/Images/���u04.png");
		strength = 0;//�j�Ƶ���
		Armor=49;//�@�ҭ�
		LV_ACQUIRED = 34;//���ŭ���
		AGI_ACQUIRED =18;
	    INT_ACQUIRED =15;
	    STR_ACQUIRED =21;
	    LUK_ACQUIRED =19;
	    
	    escape = 3;//�{�׺�
		boom =4;//���κ�
		BoomAttackRate=0.06;//���
		Hit = 4; //�R��
		
		HP+=167;//�ͩR
		MP+=128;//�]�O
		STR+=18;//�O�q
		INT+=14;//���z
		LUK+=17;//���B
		AGI+=12;//�ӱ�
		
		sellPrice =5000;
		buyPrice =25000;
		dropChance=10;
	}

}
