package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beArmorDebuffed;
import Skills.beFired;
import Skills.beIced;

public class ArmorDownBreak extends Skills{
	public ArmorDownBreak(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 13;
		Name = "�}������";
		Note = "50%��������@�ҭȤU��(���v1.5)�ĪG3�^�X�A�ìI��250%���z�ˮ`";
		Damage = 2.5;//���v
		isMagic = false;
		isPhysic = true;
		MpCost = 150;
		skillHit = 9999;
		Cooldown = 3;
	}
	@Override
	public void getEffect(Mobs mob) {
		if((int)(Math.random()*99)<=49) {
			System.out.println("���\");
			beArmorDebuffed bf = new beArmorDebuffed();
			bf.setNeedCount(3);
			bf.setRate(1.5);
			bf.statusRefresh(mob);
			if(bf.isStatusExist(mob)==-1) {
				mob.getBuffs().add(bf);
			}
		}
	}
}
