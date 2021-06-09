package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Events.BattleEvent;
import Skills.Skills;
import Skills.beFired;

public class Explosive extends Skills{
	public Explosive(Players player) {
		super(player);
		ID = 10;
		Name = "�����z�o";
		Note = "�������200%�]�k�ˮ`";
		Damage = 2;//���v250%
		isPhysic = false;
		isMagic = true;
		MpCost = 150;
		skillHit = 9999;
		Cooldown = 1;
	}
	@Override
	public void getEffect(Mobs mob) {
	}
}
