package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beFired;
import Skills.beIced;

public class FusionSlade extends Skills{
	public FusionSlade(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 15;
		Name = "�ĦX����";
		Note = "�������175%���z�ˮ`�H��175%�]�k�ˮ`";
		Damage = 1.75;//���v
		isMagic = true;
		isPhysic = true;
		MpCost = 500;
		skillHit = 9999;
		Cooldown = 5;
	}
	@Override
	public void getEffect(Mobs mob) {
	}
}
