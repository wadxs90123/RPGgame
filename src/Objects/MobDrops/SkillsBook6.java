package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook6 extends Objects{//�]����
	public SkillsBook6(Players player) {
		super(player);
		ID=9992;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="����s��";
		Note="100%�����ۨ��Ҧ�����buff 5�^�X";
		sellPrice = 0;
		buyPrice = 100;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
