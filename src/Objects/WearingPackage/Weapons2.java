package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;

public class Weapons2 extends Objects{

	public Weapons2(Players player) {
			super(player);
			ID= 30000;//�˳Ʊq40000�}�l �Z���q10000�}�l
			WEARING_TYPE="WEAPON";
			QUALITY = "����";
			Name = "***�W��-���***";
			Note = "����{�S�O�����A�@�����M�A\n�p�����I�R�o�Sĭ�í��i\n";
			Image = makeBG("/Images/�������64.png");
			strength = 15;//�j�Ƶ���
			LV_ACQUIRED = 0;//���ŭ���
			//��L�ݩʭ��� �ݶ}�o
			HP+=99999;//�ͩR
			MP+=99999;//�]�O
			attack=99999;//�Z����
			Hit=100;
			escape=100;
			boom=100;
			BoomAttackRate=10000;
			STR+=9999;//�O�q
			INT+=9999;//���z
			LUK+=9999;//���B
			AGI+=9999;//�ӱ�
			dropChance = 1;
		}
}
