package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons002 extends Objects{

	public Weapons002(Players player) {
		super(player);
		ID= 10011;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�_�I���]��";
		Note = "�_�I�̱`�Ϊ��]��";
		Image = makeBG("/Images/�]��02.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 20;//���ŭ���
		AGI_ACQUIRED =10;
	    INT_ACQUIRED =30;
	    STR_ACQUIRED =10;
	    LUK_ACQUIRED =10;
		escape = 0;//�{�׺�
		boom =10;//���κ�
		BoomAttackRate=0.1;//���
		Hit = 10; //�R��
		
		
		HP+=30;//�ͩR
		MP+=100;//�]�O

		magicAttack = 100;
		STR+=10;//�O�q
		INT+=15;//���z
		LUK+=10;//���B
		AGI+=10;//�ӱ�
		sellPrice =1000;
		buyPrice =5000;
		dropChance=15;
	}
}
