package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0002 extends Objects{

	public Weapons0002(Players player) {
		super(player);
		ID= 10020;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "��ߪ̪���";
		Note = "��ߪ̷̳R�Ϊ�����(��J��o)";
		Image = makeBG("/Images/�]��03.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 35;//���ŭ���
		AGI_ACQUIRED =15;
	    INT_ACQUIRED =50;
	    STR_ACQUIRED =15;
	    LUK_ACQUIRED =15;
		escape = 5;//�{�׺�
		boom =30;//���κ�
		BoomAttackRate=0.5;//���
		Hit = 30; //�R��
		
		
		HP+=200;//�ͩR
		MP+=200;//�]�O

		magicAttack = 25;
		STR+=15;//�O�q
		INT+=50;//���z
		LUK+=15;//���B
		AGI+=15;//�ӱ�
		sellPrice =100;
		buyPrice =500000;
		dropChance=0;
	}
}
