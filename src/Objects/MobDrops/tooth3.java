package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class tooth3 extends Objects{

	public tooth3(Players player) {
		super(player);
		ID=502;//�����q500�}�l
		Image = makeBG("/Images/�]���֤�64.png");
		QUALITY="�ǻ�";
		Name="�]���֤�(�j)";
		Note="�q�Ǫ����W��o�]���֤ߡA�Pı�浹�ӤH�|�����������J";
		sellPrice = 5000;
		Amount = (int)(Math.random()*99)%5+1;
		dropChance = 5;//1-100
	}
	
	
}
