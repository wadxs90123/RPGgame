package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons04 extends Objects{

	public Weapons04(Players player) {
		super(player);
		ID= 10004;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�}�n";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�ը����C";
		Note = "�L�L���F��q���B�X�A\\n�O�Q���a����ҥ��|�X�Ӫ��C";
		Image = makeBG("/Images/�Z��04.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 40;//���ŭ���
		AGI_ACQUIRED =20;
	    INT_ACQUIRED =20;
	    STR_ACQUIRED =60;
	    LUK_ACQUIRED =20;
	    escape = 0;//�{�׺�
		boom =20;//���κ�
		BoomAttackRate=0.3;//���
		Hit = 20; //�R��
		
		
		HP+=60;//�ͩR
		MP+=60;//�]�O
		attack=90;//�Z����
		STR+=20;//�O�q
		INT+=20;//���z
		LUK+=20;//���B
		AGI+=20;//�ӱ�
		sellPrice =10000;
		buyPrice =50000;
		dropChance=10;
	}
}
