package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0003 extends Objects{

	public Weapons0003(Players player) {
		super(player);
		ID= 10021;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�}�n";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "���A�̪��C";
		Note = "���g���A�j�����H�Ҿ֦������C�A\n���ٴ��o�X�]����(��J��o)";
		Image = makeBG("/Images/�Z��05.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 45;//���ŭ���
		AGI_ACQUIRED =25;
	    INT_ACQUIRED =25;
	    STR_ACQUIRED =65;
	    LUK_ACQUIRED =25;
		escape = 10;//�{�׺�
		boom =50;//���κ�
		BoomAttackRate=0.2;//���
		Hit = 50; //�R��
		
		
		HP+=250;//�ͩR
		MP+=250;//�]�O
		attack = 50;
		STR+=100;//�O�q
		INT+=20;//���z
		LUK+=20;//���B
		AGI+=20;//�ӱ�
		sellPrice =100;
		buyPrice =500000;
		dropChance=0;
	}
}
