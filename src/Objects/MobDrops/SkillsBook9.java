package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook9 extends Objects{//�]����
	public SkillsBook9(Players player) {
		super(player);
		ID=9901;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="�t���@��";
		Note="��o�����@�ҭȡB�v¡�ĪG(���v2)�W�q7�^�X";
		isDiamond = true;
		sellPrice = 1000;
		buyPrice = 5000;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
