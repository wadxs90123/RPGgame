package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Armor06 extends Objects{
	public Armor06(Players player) {
		super(player);
		ID = 40025;
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="ARMOR";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "���ɾԥ�";
		Note = "�b�H�]���ɤ������ԻP�ӷl���A\n�@�p���]�����O�ҥ��|���Z��";
		Image = makeBG("/Images/����06.png");
		strength = 0;//�j�Ƶ���
		Armor=265;//�@�ҭ�
		LV_ACQUIRED = 57;//���ŭ���
		AGI_ACQUIRED =58;
	    INT_ACQUIRED =55;
	    STR_ACQUIRED =43;
	    LUK_ACQUIRED =39;
	    
	    escape = 10;//�{�׺�
		boom = 10;//���κ�
		BoomAttackRate=0.15;//���
		Hit = 10; //�R��
		
		HP+=505;//�ͩR
		MP+=207;//�]�O
		STR+=47;//�O�q
		INT+=39;//���z
		LUK+=38;//���B
		AGI+=44;//�ӱ�
		
		sellPrice =20000;
		buyPrice =100000;
		dropChance=5;
	}

}
