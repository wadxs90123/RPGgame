package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0004 extends Objects{

	public Weapons0004(Players player) {
		super(player);
		ID= 10022;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "��ߪ̪��C";
		Note = "��ߪ̷̳R�Ϊ����C(��J��o)";
		Image = makeBG("/Images/�Z��03.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 35;//���ŭ���
		AGI_ACQUIRED =15;
	    INT_ACQUIRED =15;
	    STR_ACQUIRED =50;
	    LUK_ACQUIRED =15;
		escape = 5;//�{�׺�
		boom =30;//���κ�
		BoomAttackRate=0.5;//���
		Hit = 30; //�R��
		
		
		HP+=200;//�ͩR
		MP+=200;//�]�O

		attack = 25;
		STR+=50;//�O�q
		INT+=15;//���z
		LUK+=15;//���B
		AGI+=15;//�ӱ�
		sellPrice =100;
		buyPrice =500000;
		dropChance=0;
	}
}
