package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook10 extends Objects{//�]����
	public SkillsBook10(Players player) {
		super(player);
		ID=9902;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="�]����";
		Note="�������225%���z�ˮ`�H��225%�]�k�ˮ`";
		sellPrice = 3000;
		buyPrice = 5000;
		isDiamond = true;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
