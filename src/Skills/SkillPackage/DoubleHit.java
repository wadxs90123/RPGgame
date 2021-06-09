package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Events.BattleEvent;
import Skills.Skills;
import Skills.beFired;

public class DoubleHit extends Skills{
	public DoubleHit(Players player) {
		super(player);
		ID = 9;
		Name = "��������";
		Note = "�������200%���z�ˮ`";
		Damage = 2;//���v250%
		isPhysic = true;
		isMagic = false;
		MpCost = 50;
		skillHit = 9999;
		Cooldown = 1;
	}
	@Override
	public void getEffect(Mobs mob) {
	}
}
