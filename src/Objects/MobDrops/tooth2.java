package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class tooth2 extends Objects{

	public tooth2(Players player) {
		super(player);
		ID=501;//�����q500�}�l
		Image = makeBG("/Images/�]���֤�64.png");
		QUALITY="�}��";
		Name="�]���֤�(��)";
		Note="�q�Ǫ����W��o�]���֤ߡA�Pı�浹�ӤH�|�����������J";
		sellPrice = 500;
		Amount = (int)(Math.random()*99)%5+1;
		dropChance = 10;//1-100
	}
	
	
}
