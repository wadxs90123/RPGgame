package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook3 extends Objects{//�]����
	public SkillsBook3(Players player) {
		super(player);
		ID=9995;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="�j�ᵲ�N";
		Note="30%�������ᵲ3�^�X�ĪG,�åB�I�����225%�]�k�����ˮ`";
		sellPrice = 0;
		buyPrice = 100;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
