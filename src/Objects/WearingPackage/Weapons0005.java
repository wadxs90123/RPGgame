package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0005 extends Objects{

	public Weapons0005(Players player) {
		super(player);
		ID= 10023;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�L�^�Ҥ��]��";
		Note = "�L�^���a�`�B���u�@�̩ҽ礩����(��J��o)";
		Image = makeBG("/Images/�]��06.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 60;//���ŭ���
		AGI_ACQUIRED =30;
	    INT_ACQUIRED =150;
	    STR_ACQUIRED =30;
	    LUK_ACQUIRED =30;
		escape = 20;//�{�׺�
		boom =60;//���κ�
		BoomAttackRate=1;//���
		Hit = 60; //�R��
		
		
		HP+=300;//�ͩR
		MP+=300;//�]�O
		magicAttack = 100;
		STR+=30;//�O�q
		INT+=150;//���z
		LUK+=30;//���B
		AGI+=30;//�ӱ�
		sellPrice =100;
		buyPrice =250000;
		dropChance=0;
	}
}
