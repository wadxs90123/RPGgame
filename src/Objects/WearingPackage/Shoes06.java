package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Shoes06 extends Objects{
	public Shoes06(Players player) {
		super(player);
		ID = 40027;
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="SHOES";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "���ɪ��u";
		Note = "�b�H�]���ɤ������ԻP�ӷl���A\n�@�p���]�����O�ҥ��|���u�l";
		Image = makeBG("/Images/���u06.png");
		strength = 0;//�j�Ƶ���
		Armor=89;//�@�ҭ�
		LV_ACQUIRED = 54;//���ŭ���
		AGI_ACQUIRED =32;
	    INT_ACQUIRED =25;
	    STR_ACQUIRED =29;
	    LUK_ACQUIRED =34;
	    
	    escape = 6;//�{�׺�
		boom =6;//���κ�
		BoomAttackRate=0.1;//���
		Hit = 8; //�R��
		
		HP+=267;//�ͩR
		MP+=228;//�]�O
		STR+=25;//�O�q
		INT+=24;//���z
		LUK+=26;//���B
		AGI+=23;//�ӱ�
		
		sellPrice =20000;
		buyPrice =100000;
		dropChance=5;
	}

}
