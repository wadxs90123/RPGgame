package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Armor05 extends Objects{
	public Armor05(Players player) {
		super(player);
		ID = 40021;
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="ARMOR";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�L�^�Z��";
		Note = "�q�L�^�Ҧa�^�Ӫ��H�ҳQ�ᤩ���Z��";
		Image = makeBG("/Images/����05.png");
		strength = 0;//�j�Ƶ���
		Armor=185;//�@�ҭ�
		LV_ACQUIRED = 47;//���ŭ���
		AGI_ACQUIRED =48;
	    INT_ACQUIRED =45;
	    STR_ACQUIRED =41;
	    LUK_ACQUIRED =36;
	    
	    escape = 8;//�{�׺�
		boom = 8;//���κ�
		BoomAttackRate=0.12;//���
		Hit = 8; //�R��
		
		HP+=405;//�ͩR
		MP+=167;//�]�O
		STR+=37;//�O�q
		INT+=35;//���z
		LUK+=31;//���B
		AGI+=34;//�ӱ�
		
		sellPrice =10000;
		buyPrice =50000;
		dropChance=5;
	}

}
