package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Armor03 extends Objects{
	public Armor03(Players player) {
		super(player);
		ID = 40013;
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="ARMOR";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�]�F�Z��";
		Note = "�ǻ��Q�]�����F�ұH�J�L���Z��";
		Image = makeBG("/Images/����03.png");
		strength = 0;//�j�Ƶ���
		Armor=85;//�@�ҭ�
		LV_ACQUIRED = 27;//���ŭ���
		AGI_ACQUIRED =28;
	    INT_ACQUIRED =15;
	    STR_ACQUIRED =29;
	    LUK_ACQUIRED =26;
	    
	    escape = 5;//�{�׺�
		boom = 5;//���κ�
		BoomAttackRate=0.08;//���
		Hit = 4; //�R��
		
		HP+=205;//�ͩR
		MP+=87;//�]�O
		STR+=17;//�O�q
		INT+=19;//���z
		LUK+=18;//���B
		AGI+=19;//�ӱ�
		
		sellPrice =1000;
		buyPrice =5000;
		dropChance=10;
	}

}
