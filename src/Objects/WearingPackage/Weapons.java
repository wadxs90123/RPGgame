package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons extends Objects{

	public Weapons(Players player) {
		super(player);
		ID= 10000;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "���q";
		Name = "�K�C";
		Note = "���q���K�C";
		Image = makeBG("/Images/�Z��64.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 15;//���ŭ���
		//��L�ݩʭ��� �ݶ}�o
		escape = 3;//�{�׺�
		boom =3;//���κ�
		BoomAttackRate=0.02;//���
		Hit = 4; //�R��
		
		
		HP+=15;//�ͩR
		MP+=8;//�]�O
		attack=15;//�Z����
		STR+=2;//�O�q
		INT+=3;//���z
		LUK+=2;//���B
		AGI+=4;//�ӱ�

		dropChance=25;
	}
}
