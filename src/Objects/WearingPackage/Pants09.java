package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Pants09 extends Objects{
	public Pants09(Players player) {
		super(player);
		ID = 40038;
		QUALITY = "����";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="PANTS";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�`�W����";
		Note = "�H�ɪŤ����N���l�c���A����j�j";
		Image = makeBG("/Images/�H��09.png");
		strength = 0;//�j�Ƶ���
		Armor=1200;//�@�ҭ�
		LV_ACQUIRED = 85;//���ŭ���
		AGI_ACQUIRED =100;
	    INT_ACQUIRED =100;
	    STR_ACQUIRED =100;
	    LUK_ACQUIRED =100;
	    
	    escape = 50;//�{�׺�
		boom =50;//���κ�
		BoomAttackRate=1;//���
		Hit = 50; //�R��
		
		HP+=3000;//�ͩR
		MP+=1500;//�]�O
		STR+=140;//�O�q
		INT+=140;//���z
		LUK+=140;//���B
		AGI+=140;//�ӱ�
		
		sellPrice =1000000;
		buyPrice =100000000;
		dropChance=1;
	}

}
