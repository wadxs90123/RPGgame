package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0009 extends Objects{

	public Weapons0009(Players player) {
		super(player);
		ID= 10027;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�ǻ�";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�O�s�̤���(��)";
		Note = "���g����L�L���s�ڤ��H�ҤۤƤ���(��J��o)";
		Image = makeBG("/Images/�]��08.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 80;//���ŭ���
		AGI_ACQUIRED =40;
	    INT_ACQUIRED =250;
	    STR_ACQUIRED =40;
	    LUK_ACQUIRED =40;
		escape = 40;//�{�׺�
		boom =100;//���κ�
		BoomAttackRate=2;//���
		Hit = 100; //�R��
		
		
		HP+=1200;//�ͩR
		MP+=1200;//�]�O
		magicAttack = 300;
		STR+=60;//�O�q
		INT+=250;//���z
		LUK+=60;//���B
		AGI+=60;//�ӱ�
		sellPrice =100;
		buyPrice =7500000;
		dropChance=0;
	}
}
