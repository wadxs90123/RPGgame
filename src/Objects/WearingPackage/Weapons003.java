package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons003 extends Objects{

	public Weapons003(Players player) {
		super(player);
		ID= 10012;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�]�F����";
		Note = "�ǻ��Q�]�����F�ұH�J�L����";
		Image = makeBG("/Images/�]��03.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 30;//���ŭ���
		AGI_ACQUIRED =15;
	    INT_ACQUIRED =45;
	    STR_ACQUIRED =15;
	    LUK_ACQUIRED =15;
		escape = 0;//�{�׺�
		boom =15;//���κ�
		BoomAttackRate=0.2;//���
		Hit = 15; //�R��
		
		
		HP+=45;//�ͩR
		MP+=150;//�]�O

		magicAttack = 150;
		STR+=15;//�O�q
		INT+=20;//���z
		LUK+=15;//���B
		AGI+=15;//�ӱ�
		sellPrice =6000;
		buyPrice =30000;
		dropChance=15;
	}
}
