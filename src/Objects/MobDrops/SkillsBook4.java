package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook4 extends Objects{//�]����
	public SkillsBook4(Players player) {
		super(player);
		ID=9994;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="�����}";
		Note="50%�������U�N3�^�X�ĪG,�U�N���v1.25�A������誫�z����*275%";
		sellPrice = 0;
		buyPrice = 100;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
