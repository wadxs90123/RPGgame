package Objects.MobDrops;

import Entities.Players;
import Objects.Objects;

public class magicStone extends Objects{//臸方ホ
	public magicStone(Players player) {
		super(player);
		ID=9999;//眖500秨﹍
		Image = makeBG("/Images/臸方ホ64.png");
		QUALITY="ぃ防";
		Name="臸方ホ";
		Note="臸方嘲ホ繷伐ㄤ禥";
		sellPrice = 0;
		buyPrice = 100;
		Amount = (int)(Math.random()*99)%5+1;
		dropChance = 0;//1-100
	}
}
