package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook7 extends Objects{//�]����
	public SkillsBook7(Players player) {
		super(player);
		ID=9991;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="�]���Y��";
		Note="20%�������ᵲ3�^�X�ĪG,20%�������`�N3�^�X�ĪG,\n�������3�����z������3���]�k����";
		sellPrice = 0;
		buyPrice = 100;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
