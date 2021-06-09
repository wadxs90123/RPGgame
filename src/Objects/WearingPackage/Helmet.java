package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Helmet extends Objects{
	public Helmet(Players player) {
		super(player);
		ID = 40000;
		QUALITY = "���q";
		WEARING_TYPE="HELMET";
		Name = "�Y��";
		Note = "���q���Y��";
		Image = makeBG("/Images/�Y��64.png");
		strength = 0;//�j�Ƶ���
		Armor=15;//�@�ҭ�
		LV_ACQUIRED = 5;//���ŭ���
		AGI_ACQUIRED =0;
	    INT_ACQUIRED =0;
	    STR_ACQUIRED =0;
	    LUK_ACQUIRED =0;
	    
	    escape = 3;//�{�׺�
		boom =3;//���κ�
		BoomAttackRate=0.02;//���
		Hit = 4; //�R��
		
		HP+=35;//�ͩR
		MP+=8;//�]�O
		STR+=2;//�O�q
		INT+=1;//���z
		LUK+=2;//���B
		AGI+=3;//�ӱ�

		dropChance=25;
	}

}
