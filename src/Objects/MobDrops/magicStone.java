package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class magicStone extends Objects{//�]����
	public magicStone(Players player) {
		super(player);
		ID=9999;//�����q500�}�l
		Image = makeBG("/Images/�]����64.png");
		QUALITY="����";
		Name="�]����";
		Note="�]���j�������Y�A����öQ";
		sellPrice = 0;
		buyPrice = 100;
		Amount = (int)(Math.random()*99)%5+1;
		dropChance = 0;//1-100
	}
}
