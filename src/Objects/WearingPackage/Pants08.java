package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Pants08 extends Objects{
	public Pants08(Players player) {
		super(player);
		ID = 40034;
		QUALITY = "�ǻ�";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="PANTS";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�]������";
		Note = "�]���j���W�̺�¤��O�A���񯫤��N��";
		Image = makeBG("/Images/�H��08.png");
		strength = 0;//�j�Ƶ���
		Armor=500;//�@�ҭ�
		LV_ACQUIRED = 75;//���ŭ���
		AGI_ACQUIRED =70;
	    INT_ACQUIRED =70;
	    STR_ACQUIRED =70;
	    LUK_ACQUIRED =70;
	    
	    escape = 20;//�{�׺�
		boom =20;//���κ�
		BoomAttackRate=0.35;//���
		Hit = 35; //�R��
		
		HP+=1000;//�ͩR
		MP+=600;//�]�O
		STR+=70;//�O�q
		INT+=70;//���z
		LUK+=70;//���B
		AGI+=70;//�ӱ�
		
		sellPrice =500000;
		buyPrice =5000000;
		dropChance=2;
	}

}
