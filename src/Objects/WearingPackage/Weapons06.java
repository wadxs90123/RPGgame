package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons06 extends Objects{

	public Weapons06(Players player) {
		super(player);
		ID= 10006;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "���ɪ��C";
		Note = "�b�H�]���ɤ������ԻP�ӷl���A\n�@�p���]�����O�ҥ��|���C";
		Image = makeBG("/Images/�Z��06.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 60;//���ŭ���
		AGI_ACQUIRED =30;
	    INT_ACQUIRED =30;
	    STR_ACQUIRED =90;
	    LUK_ACQUIRED =30;
	    escape = 0;//�{�׺�
		boom =30;//���κ�
		BoomAttackRate=0.5;//���
		Hit = 30; //�R��
		
		
		HP+=90;//�ͩR
		MP+=90;//�]�O
		attack=125;//�Z����
		STR+=30;//�O�q
		INT+=30;//���z
		LUK+=30;//���B
		AGI+=30;//�ӱ�
		sellPrice =50000;
		buyPrice =250000;
		dropChance=5;
	}
}
