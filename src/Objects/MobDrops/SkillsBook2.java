package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook2 extends Objects{//�]����
	public SkillsBook2(Players player) {
		super(player);
		ID=9996;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="�����z�o";
		Note="��������]�k��������";
		sellPrice = 0;
		buyPrice = 100;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
