package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0008 extends Objects{

	public Weapons0008(Players player) {
		super(player);
		ID= 10026;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�v��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�K���]�C";
		Note = "�e�]�����ҫ�������(��J��o)";
		Image = makeBG("/Images/�Z��10.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 70;//���ŭ���
		AGI_ACQUIRED =35;
	    INT_ACQUIRED =35;
	    STR_ACQUIRED =200;
	    LUK_ACQUIRED =35;
		escape = 30;//�{�׺�
		boom =80;//���κ�
		BoomAttackRate=1.5;//���
		Hit = 80; //�R��
		
		
		HP+=800;//�ͩR
		MP+=800;//�]�O
		attack = 100;
		STR+=200;//�O�q
		INT+=45;//���z
		LUK+=45;//���B
		AGI+=45;//�ӱ�
		sellPrice =100;
		buyPrice =7500000;
		dropChance=0;
	}
}
