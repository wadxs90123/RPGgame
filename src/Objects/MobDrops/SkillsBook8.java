package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook8 extends Objects{//�]����
	public SkillsBook8(Players player) {
		super(player);
		ID=9900;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="�����ާ@";
		Note="���ɦۨ��]�k�ˮ`(���v1.5)�W�q7�^�X";
		isDiamond = true;
		sellPrice = 500;
		buyPrice = 1000;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
