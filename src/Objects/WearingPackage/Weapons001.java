package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons001 extends Objects{

	public Weapons001(Players player) {
		super(player);
		ID= 10010;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�ʦH";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�ʻs���";
		Note = "���u�ʦH�����";
		Image = makeBG("/Images/�]��01.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 10;//���ŭ���
		AGI_ACQUIRED =5;
	    INT_ACQUIRED =15;
	    STR_ACQUIRED =5;
	    LUK_ACQUIRED =5;
		escape = 0;//�{�׺�
		boom =5;//���κ�
		BoomAttackRate=0.05;//���
		Hit = 5; //�R��
		
		
		HP+=15;//�ͩR
		MP+=50;//�]�O
		magicAttack = 50;
		STR+=5;//�O�q
		INT+=10;//���z
		LUK+=5;//���B
		AGI+=5;//�ӱ�
		sellPrice =500;
		buyPrice =2500;
		dropChance=25;
	}
}
