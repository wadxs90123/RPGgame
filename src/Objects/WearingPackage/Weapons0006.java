package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0006 extends Objects{

	public Weapons0006(Players player) {
		super(player);
		ID= 10024;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�v��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�K���]��";
		Note = "�e�]�����ҫ�������(��J��o)";
		Image = makeBG("/Images/�]��10.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 70;//���ŭ���
		AGI_ACQUIRED =35;
	    INT_ACQUIRED =200;
	    STR_ACQUIRED =35;
	    LUK_ACQUIRED =35;
		escape = 30;//�{�׺�
		boom =80;//���κ�
		BoomAttackRate=1.5;//���
		Hit = 80; //�R��
		
		
		HP+=800;//�ͩR
		MP+=800;//�]�O
		magicAttack = 250;
		STR+=45;//�O�q
		INT+=200;//���z
		LUK+=45;//���B
		AGI+=45;//�ӱ�
		sellPrice =100;
		buyPrice =7500000;
		dropChance=0;
	}
}
