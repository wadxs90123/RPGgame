package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Shoes01 extends Objects{
	public Shoes01(Players player) {
		super(player);
		ID = 40007;
		QUALITY = "�ʦH";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="SHOES";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�ʻs�־c";
		Note = "���u�ʦH���־c";
		Image = makeBG("/Images/���u01.png");
		strength = 0;//�j�Ƶ���
		Armor=7;//�@�ҭ�
		LV_ACQUIRED = 4;//���ŭ���
		AGI_ACQUIRED =5;
	    INT_ACQUIRED =3;
	    STR_ACQUIRED =7;
	    LUK_ACQUIRED =2;
	    
	    escape = 1;//�{�׺�
		boom =2;//���κ�
		BoomAttackRate=0.02;//���
		Hit = 1; //�R��
		
		HP+=17;//�ͩR
		MP+=8;//�]�O
		STR+=1;//�O�q
		INT+=3;//���z
		LUK+=3;//���B
		AGI+=3;//�ӱ�
		
		sellPrice =100;
		buyPrice =500;
		dropChance=10;
	}

}
