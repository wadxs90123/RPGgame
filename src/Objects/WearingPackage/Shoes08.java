package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Shoes08 extends Objects{
	public Shoes08(Players player) {
		super(player);
		ID = 40035;
		QUALITY = "�ǻ�";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="SHOES";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�]���Թu";
		Note = "�]���j���W�̺�¤��O�A���񯫤��N��";
		Image = makeBG("/Images/���u08.png");
		strength = 0;//�j�Ƶ���
		Armor=300;//�@�ҭ�
		LV_ACQUIRED = 74;//���ŭ���
		AGI_ACQUIRED =75;
	    INT_ACQUIRED =75;
	    STR_ACQUIRED =75;
	    LUK_ACQUIRED =75;
	    
	    escape = 25;//�{�׺�
		boom =20;//���κ�
		BoomAttackRate=0.3;//���
		Hit = 30; //�R��
		
		HP+=900;//�ͩR
		MP+=650;//�]�O
		STR+=70;//�O�q
		INT+=70;//���z
		LUK+=70;//���B
		AGI+=70;//�ӱ�
		
		sellPrice =500000;
		buyPrice =5000000;
		dropChance=2;
	}

}
