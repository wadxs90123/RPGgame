package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beEscapeDebuffed;
import Skills.beFired;
import Skills.beIced;
import Skills.*;

public class MagicSlade extends Skills{
	public MagicSlade(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 21;
		Name = "�]����";
		Note = "�������225%���z�ˮ`�H��225%�]�k�ˮ`";
		Damage = 2.25;//���v
		isMagic = true;
		isPhysic = true;
		MpCost = 1000;
		skillHit = 9999;
		Cooldown = 7;
	}
	@Override
	public void getEffect(Players player) {
		 
	}
}
