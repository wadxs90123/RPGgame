package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Shoes05 extends Objects{
	public Shoes05(Players player) {
		super(player);
		ID = 40023;
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="SHOES";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�L�^�u�u";
		Note = "�q�L�^�Ҧa�^�Ӫ��H�ҳQ�ᤩ���u�l";
		Image = makeBG("/Images/���u05.png");
		strength = 0;//�j�Ƶ���
		Armor=69;//�@�ҭ�
		LV_ACQUIRED = 44;//���ŭ���
		AGI_ACQUIRED =28;
	    INT_ACQUIRED =20;
	    STR_ACQUIRED =24;
	    LUK_ACQUIRED =24;
	    
	    escape = 4;//�{�׺�
		boom =5;//���κ�
		BoomAttackRate=0.08;//���
		Hit = 4; //�R��
		
		HP+=217;//�ͩR
		MP+=178;//�]�O
		STR+=23;//�O�q
		INT+=19;//���z
		LUK+=22;//���B
		AGI+=17;//�ӱ�
		
		sellPrice =10000;
		buyPrice =50000;
		dropChance=5;
	}

}
