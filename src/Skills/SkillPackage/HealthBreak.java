package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beArmorDebuffed;
import Skills.beFired;
import Skills.beIced;

public class HealthBreak extends Skills{
	public HealthBreak(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 14;
		Name = "�˩R�@��";
		Note = "��h�ۨ�30%�ͩR�A�y��500%���z�ˮ`";
		Damage = 5;//���v
		isMagic = false;
		isPhysic = true;
		MpCost = 0;
		skillHit = 9999;
		Cooldown = 5;
	}
	@Override
	public void getEffect(Mobs mob) {
			System.out.println("���\");
			player.setHealth((int)(player.getHealth()*0.7));
	}
}
