package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons006 extends Objects{

	public Weapons006(Players player) {
		super(player);
		ID= 10015;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "���ɪ���";
		Note = "�b�H�]���ɤ������ԻP�ӷl���A\n�@�p���]�����O�ҥ��|����";
		Image = makeBG("/Images/�]��06.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 60;//���ŭ���
		AGI_ACQUIRED =30;
	    INT_ACQUIRED =90;
	    STR_ACQUIRED =30;
	    LUK_ACQUIRED =30;
		escape = 0;//�{�׺�
		boom =30;//���κ�
		BoomAttackRate=0.5;//���
		Hit = 30; //�R��
		
		
		HP+=90;//�ͩR
		MP+=300;//�]�O
		magicAttack = 300;
		STR+=30;//�O�q
		INT+=35;//���z
		LUK+=30;//���B
		AGI+=30;//�ӱ�
		sellPrice =50000;
		buyPrice =250000;
		dropChance=5;
	}
}
