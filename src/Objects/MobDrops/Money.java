package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class Money extends Objects{//�]����
	public Money(Players player) {
		super(player);
		ID=9998;//�����q500�}�l
		Image = makeBG("/Images/����64.png");
		QUALITY="����";
		Name="����";
		Note="����Ϊ�����";
		sellPrice = 0;
		buyPrice = 100;
		Amount = 1;
		dropChance = 0;//1-100
	}
}
