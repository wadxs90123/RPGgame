package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons05 extends Objects{

	public Weapons05(Players player) {
		super(player);
		ID= 10005;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�L�^���C";
		Note = "�q�L�^�Ҧa�^�Ӫ��H�ҳQ�ᤩ���C";
		Image = makeBG("/Images/�Z��05.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 50;//���ŭ���
		AGI_ACQUIRED =25;
	    INT_ACQUIRED =25;
	    STR_ACQUIRED =75;
	    LUK_ACQUIRED =25;
	    escape = 0;//�{�׺�
		boom =25;//���κ�
		BoomAttackRate=0.4;//���
		Hit = 25; //�R��
		
		
		HP+=75;//�ͩR
		MP+=75;//�]�O
		attack=105;//�Z����
		STR+=25;//�O�q
		INT+=25;//���z
		LUK+=25;//���B
		AGI+=25;//�ӱ�
		sellPrice =50000;
		buyPrice =250000;
		dropChance=10;
	}
}
