package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Shoes09 extends Objects{
	public Shoes09(Players player) {
		super(player);
		ID = 40039;
		QUALITY = "����";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="SHOES";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�`�W�Թu";
		Note = "�H�ɪŤ����N���l�c���A����j�j";
		Image = makeBG("/Images/���u09.png");
		strength = 0;//�j�Ƶ���
		Armor=800;//�@�ҭ�
		LV_ACQUIRED = 84;//���ŭ���
		AGI_ACQUIRED =100;
	    INT_ACQUIRED =100;
	    STR_ACQUIRED =100;
	    LUK_ACQUIRED =100;
	    
	    escape = 50;//�{�׺�
		boom =50;//���κ�
		BoomAttackRate=1;//���
		Hit = 50; //�R��
		
		HP+=1200;//�ͩR
		MP+=900;//�]�O
		STR+=130;//�O�q
		INT+=130;//���z
		LUK+=130;//���B
		AGI+=130;//�ӱ�
		
		sellPrice =1000000;
		buyPrice =100000000;
		dropChance=1;
	}

}
