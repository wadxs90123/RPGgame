package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Pants06 extends Objects{
	public Pants06(Players player) {
		super(player);
		ID = 40026;
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="PANTS";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "���ɪ���";
		Note = "�b�H�]���ɤ������ԻP�ӷl���A\n�@�p���]�����O�ҥ��|���Ǥl";
		Image = makeBG("/Images/�H��06.png");
		strength = 0;//�j�Ƶ���
		Armor=135;//�@�ҭ�
		LV_ACQUIRED = 55;//���ŭ���
		AGI_ACQUIRED =35;
	    INT_ACQUIRED =38;
	    STR_ACQUIRED =45;
	    LUK_ACQUIRED =44;
	    
	    escape = 6;//�{�׺�
		boom =7;//���κ�
		BoomAttackRate=0.12;//���
		Hit = 10; //�R��
		
		HP+=283;//�ͩR
		MP+=195;//�]�O
		STR+=24;//�O�q
		INT+=26;//���z
		LUK+=31;//���B
		AGI+=26;//�ӱ�
		
		sellPrice =20000;
		buyPrice =100000;
		dropChance=5;
	}

}
