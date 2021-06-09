package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Pants03 extends Objects{
	public Pants03(Players player) {
		super(player);
		ID = 40014;
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="PANTS";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�]�F����";
		Note = "�ǻ��Q�]�����F�ұH�J�L���Ǥl";
		Image = makeBG("/Images/�H��03.png");
		strength = 0;//�j�Ƶ���
		Armor=49;//�@�ҭ�
		LV_ACQUIRED = 25;//���ŭ���
		AGI_ACQUIRED =18;
	    INT_ACQUIRED =22;
	    STR_ACQUIRED =24;
	    LUK_ACQUIRED =18;
	    
	    escape = 3;//�{�׺�
		boom =3;//���κ�
		BoomAttackRate=0.06;//���
		Hit = 6; //�R��
		
		HP+=123;//�ͩR
		MP+=85;//�]�O
		STR+=8;//�O�q
		INT+=7;//���z
		LUK+=7;//���B
		AGI+=9;//�ӱ�
		
		sellPrice =1000;
		buyPrice =5000;
		dropChance=10;
	}

}
