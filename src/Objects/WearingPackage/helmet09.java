package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class helmet09 extends Objects{
	public helmet09(Players player) {
		super(player);
		ID = 40036;
		QUALITY = "����";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="HELMET";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�`�W�Y��";
		Note = "�H�ɪŤ����N���l�c���A����j�j";
		Image = makeBG("/Images/�Y��09.png");
		strength = 0;//�j�Ƶ���
		Armor=1000;//�@�ҭ�
		LV_ACQUIRED = 83;//���ŭ���
		AGI_ACQUIRED =100;
	    INT_ACQUIRED =100;
	    STR_ACQUIRED =100;
	    LUK_ACQUIRED =100;
	    
	    escape = 50;//�{�׺�
		boom = 50;//���κ�
		BoomAttackRate=1;//���
		Hit = 50; //�R��
		
		HP+=5000;//�ͩR
		MP+=1000;//�]�O
		STR+=120;//�O�q
		INT+=120;//���z
		LUK+=120;//���B
		AGI+=120;//�ӱ�
		sellPrice =1000000;
		buyPrice =100000000;
		dropChance=1;
	}

}
