package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook extends Objects{//�]����
	public SkillsBook(Players player) {
		super(player);
		ID=9997;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="��������";
		Note="������誫�z��������";
		sellPrice = 0;
		buyPrice = 100;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
