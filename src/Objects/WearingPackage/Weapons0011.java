package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0011 extends Objects{

	public Weapons0011(Players player) {
		super(player);
		ID= 10029;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�ǻ�";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�O�s�̤���(�C)";
		Note = "���g����L�L���s�ڤ��H�ҤۤƤ���(��J��o)";
		Image = makeBG("/Images/�Z��08.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 80;//���ŭ���
		AGI_ACQUIRED =40;
	    INT_ACQUIRED =40;
	    STR_ACQUIRED =250;
	    LUK_ACQUIRED =40;
		escape = 40;//�{�׺�
		boom =100;//���κ�
		BoomAttackRate=2;//���
		Hit = 100; //�R��
		
		
		HP+=1200;//�ͩR
		MP+=1200;//�]�O
		attack = 200;
		STR+=250;//�O�q
		INT+=60;//���z
		LUK+=60;//���B
		AGI+=60;//�ӱ�
		sellPrice =100;
		buyPrice =7500000;
		dropChance=0;
	}
}
