package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook5 extends Objects{//�]����
	public SkillsBook5(Players player) {
		super(player);
		ID=9993;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="��������";
		Note="100%�������Ҧ��t���ĪG(���F�ᵲ�M�`�N)�A���v�Ҭ�2";
		sellPrice = 0;
		buyPrice = 100;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
