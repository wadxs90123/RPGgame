package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;

public class Shoes extends Objects{
	public Shoes(Players player) {
		super(player);
		ID=40003;
		WEARING_TYPE="SHOES";
		QUALITY = "���q";
		Name = "�c�l";
		Note = "���q���@��";
		Image = makeBG("/Images/�c�l64.jpg");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 10;//���ŭ���
		LUK_ACQUIRED = 0;
		
		escape = 3;//�{�׺�
		boom =3;//���κ�
		BoomAttackRate=0.02;//���
		Hit = 4; //�R��
		
		
		HP+=65;//�ͩR
		MP+=8;//�]�O
		Armor=15;//�@�ҭ�
		STR+=2;//�O�q
		INT+=3;//���z
		LUK+=2;//���B
		AGI+=4;//�ӱ�

		dropChance=25;
	}

}
