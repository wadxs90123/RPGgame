package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons03 extends Objects{

	public Weapons03(Players player) {
		super(player);
		ID= 10003;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�]�F���C";
		Note = "�ǻ��Q�]�����F�ұH�J�L���C";
		Image = makeBG("/Images/�Z��03.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 30;//���ŭ���
		
		AGI_ACQUIRED =15;
	    INT_ACQUIRED =15;
	    STR_ACQUIRED =45;
	    LUK_ACQUIRED =15;
	    
	    escape = 0;//�{�׺�
		boom =15;//���κ�
		BoomAttackRate=0.2;//���
		Hit = 15; //�R��
		
		
		HP+=45;//�ͩR
		MP+=45;//�]�O
		attack=75;//�Z����
		STR+=15;//�O�q
		INT+=15;//���z
		LUK+=15;//���B
		AGI+=15;//�ӱ�
		sellPrice =6000;
		buyPrice =30000;
		dropChance=15;
	}
}
