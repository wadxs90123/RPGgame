package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class tooth1 extends Objects{

	public tooth1(Players player) {
		super(player);
		ID=500;//�����q500�}�l
		Image = makeBG("/Images/�]���֤�64.png");
		QUALITY="���q";
		Name="�]���֤�(�p)";
		Note="�q�Ǫ����W��o�]���֤ߡA�Pı�浹�ӤH�|�����������J";
		sellPrice = 50;
		Amount = (int)(Math.random()*99)%5+1;
		dropChance = 30;//1-100
	}
	
	
}
