package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0007 extends Objects{

	public Weapons0007(Players player) {
		super(player);
		ID= 10025;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�L�^�Ҥ��C";
		Note = "�L�^���a�`�B���u�@�̩ҽ礩����(��J��o)";
		Image = makeBG("/Images/�Z��06.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 60;//���ŭ���
		AGI_ACQUIRED =30;
	    INT_ACQUIRED =30;
	    STR_ACQUIRED =150;
	    LUK_ACQUIRED =30;
		escape = 20;//�{�׺�
		boom =60;//���κ�
		BoomAttackRate=1;//���
		Hit = 60; //�R��
		
		
		HP+=300;//�ͩR
		MP+=300;//�]�O
		attack = 50;
		STR+=150;//�O�q
		INT+=30;//���z
		LUK+=30;//���B
		AGI+=30;//�ӱ�
		sellPrice =100;
		buyPrice =250000;
		dropChance=0;
	}
}
