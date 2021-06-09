package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Armor02 extends Objects{
	public Armor02(Players player) {
		super(player);
		ID = 40009;
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="ARMOR";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�_�I���Z��";
		Note = "�_�I�̱`�諸�Z��";
		Image = makeBG("/Images/����02.png");
		strength = 0;//�j�Ƶ���
		Armor=35;//�@�ҭ�
		LV_ACQUIRED = 17;//���ŭ���
		AGI_ACQUIRED =28;
	    INT_ACQUIRED =15;
	    STR_ACQUIRED =19;
	    LUK_ACQUIRED =26;
	    
	    escape = 2;//�{�׺�
		boom =2;//���κ�
		BoomAttackRate=0.05;//���
		Hit = 3; //�R��
		
		HP+=105;//�ͩR
		MP+=57;//�]�O
		STR+=7;//�O�q
		INT+=9;//���z
		LUK+=8;//���B
		AGI+=9;//�ӱ�
		
		sellPrice =500;
		buyPrice =2500;
		dropChance=10;
	}

}
