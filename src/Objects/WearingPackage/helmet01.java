package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class helmet01 extends Objects{
	public helmet01(Players player) {
		super(player);
		ID = 40004;
		QUALITY = "�ʦH";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="HELMET";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�ʻs�ִU";
		Note = "���u�ʦH���ִU";
		Image = makeBG("/Images/�Y��01.png");
		strength = 0;//�j�Ƶ���
		Armor=8;//�@�ҭ�
		LV_ACQUIRED = 3;//���ŭ���
		AGI_ACQUIRED =2;
	    INT_ACQUIRED =4;
	    STR_ACQUIRED =3;
	    LUK_ACQUIRED =1;
	    
	    escape = 1;//�{�׺�
		boom =1;//���κ�
		BoomAttackRate=0.01;//���
		Hit = 2; //�R��
		
		HP+=17;//�ͩR
		MP+=12;//�]�O
		STR+=2;//�O�q
		INT+=1;//���z
		LUK+=2;//���B
		AGI+=3;//�ӱ�
		sellPrice =100;
		buyPrice =500;
		dropChance=10;
	}

}
