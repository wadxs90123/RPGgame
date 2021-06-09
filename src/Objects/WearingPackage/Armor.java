package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;

public class Armor extends Objects{
	public Armor(Players player) {
		super(player);
		ID=40001;
		WEARING_TYPE="ARMOR";
		QUALITY = "���q";
		Name = "�@��";
		Note = "���q���@��";
		Image = makeBG("/Images/�@��64.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 10;//���ŭ���
		STR_ACQUIRED = 0;
		
		escape = 3;//�{�׺�
		boom =3;//���κ�
		BoomAttackRate=0.02;//���
		Hit = 4; //�R��
		
		
		HP+=15;//�ͩR
		MP+=8;//�]�O
		Armor=35;//�@�ҭ�
		STR+=2;//�O�q
		INT+=3;//���z
		LUK+=2;//���B
		AGI+=4;//�ӱ�

		dropChance=25;
	}

}
