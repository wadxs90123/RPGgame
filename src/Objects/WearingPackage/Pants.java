package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;

public class Pants extends Objects{
	public Pants(Players player) {
		super(player);
		ID=40002;
		WEARING_TYPE="PANTS";
		QUALITY = "�v��";
		Name = "�Ǥl";
		Note = "���q���@��";
		Image = makeBG("/Images/�Ǥl64.jpg");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 10;//���ŭ���
		INT_ACQUIRED = 0;
		
		escape = 3;//�{�׺�
		boom =3;//���κ�
		BoomAttackRate=0.02;//���
		Hit = 4; //�R��
		
		
		HP+=25;//�ͩR
		MP+=8;//�]�O
		Armor=25;//�@�ҭ�
		STR+=2;//�O�q
		INT+=3;//���z
		LUK+=2;//���B
		AGI+=4;//�ӱ�
		dropChance=25;
	}

}
