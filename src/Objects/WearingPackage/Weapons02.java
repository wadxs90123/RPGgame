package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons02 extends Objects{

	public Weapons02(Players player) {
		super(player);
		ID= 10002;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�_�I���K�C";
		Note = "�_�I�̱`�Ϊ��K�C";
		Image = makeBG("/Images/�Z��02.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 20;//���ŭ���
		
		AGI_ACQUIRED =10;
	    INT_ACQUIRED =10;
	    STR_ACQUIRED =30;
	    LUK_ACQUIRED =10;
	    
	    escape = 0;//�{�׺�
		boom =10;//���κ�
		BoomAttackRate=0.1;//���
		Hit = 10; //�R��
		
		
		HP+=30;//�ͩR
		MP+=30;//�]�O
		attack=50;//�Z����
		STR+=10;//�O�q
		INT+=10;//���z
		LUK+=10;//���B
		AGI+=10;//�ӱ�
		sellPrice =1000;
		buyPrice =5000;
		dropChance=15;
	}
}
