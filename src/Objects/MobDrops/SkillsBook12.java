package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class SkillsBook12 extends Objects{//�]����
	public SkillsBook12(Players player) {
		super(player);
		ID=9904;//�����q500�}�l
		Image = makeBG("/Images/�ޯ��.png");
		QUALITY="����";
		Name="��R�y�q";
		Note="��o���ɰ{�סB�v¡�B�ɶˮĪG(���v2)�A�åB�������375%���z�ˮ`";
		sellPrice = 8000;
		buyPrice = 10000;
		isDiamond = true;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
