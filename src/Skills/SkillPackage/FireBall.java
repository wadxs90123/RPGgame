package Skills.SkillPackage;

import Entities.Players;
import Skills.Skills;

public class FireBall extends Skills{
	public FireBall(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 1;
		Name = "���y�N";
		Note = "���y����!!";
		Damage = 1.2;//���v
		MpCost = 10;
		skillHit = 80;
		Cooldown = 3;
	}
}
