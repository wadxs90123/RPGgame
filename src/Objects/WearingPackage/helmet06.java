package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class helmet06 extends Objects{
	public helmet06(Players player) {
		super(player);
		ID = 40024;
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="HELMET";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "���ɾԲ�";
		Note = "�b�H�]���ɤ������ԻP�ӷl���A\n�@�p���]�����O�ҥ��|���Y��";
		Image = makeBG("/Images/�Y��06.png");
		strength = 0;//�j�Ƶ���
		Armor=108;//�@�ҭ�
		LV_ACQUIRED = 53;//���ŭ���
		AGI_ACQUIRED =42;
	    INT_ACQUIRED =35;
	    STR_ACQUIRED =41;
	    LUK_ACQUIRED =43;
	    
	    escape = 6;//�{�׺�
		boom = 6;//���κ�
		BoomAttackRate=0.1;//���
		Hit = 10; //�R��
		
		HP+=267;//�ͩR
		MP+=192;//�]�O
		STR+=25;//�O�q
		INT+=24;//���z
		LUK+=26;//���B
		AGI+=24;//�ӱ�
		sellPrice =20000;
		buyPrice =100000;
		dropChance=5;
	}

}
