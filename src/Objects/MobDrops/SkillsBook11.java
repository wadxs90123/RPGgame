package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook11 extends Objects{//�]����
	public SkillsBook11(Players player) {
		super(player);
		ID=9903;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="�I�z�@��";
		Note="�������Ҧ��t���ĪG(���v1.5)�A�åB�������75%���z�ˮ`";
		sellPrice = 3000;
		buyPrice = 5000;
		isDiamond = true;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
