package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class helmet03 extends Objects{
	public helmet03(Players player) {
		super(player);
		ID = 40012;
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="HELMET";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�]�F�Y��";
		Note = "�ǻ��Q�]�����F�ұH�J�L���Y��";
		Image = makeBG("/Images/�Y��03.png");
		strength = 0;//�j�Ƶ���
		Armor=38;//�@�ҭ�
		LV_ACQUIRED = 23;//���ŭ���
		AGI_ACQUIRED =24;
	    INT_ACQUIRED =19;
	    STR_ACQUIRED =23;
	    LUK_ACQUIRED =23;
	    
	    escape = 3;//�{�׺�
		boom =3;//���κ�
		BoomAttackRate=0.06;//���
		Hit = 6; //�R��
		
		HP+=117;//�ͩR
		MP+=82;//�]�O
		STR+=12;//�O�q
		INT+=11;//���z
		LUK+=7;//���B
		AGI+=10;//�ӱ�
		sellPrice =1000;
		buyPrice =5000;
		dropChance=10;
	}

}
