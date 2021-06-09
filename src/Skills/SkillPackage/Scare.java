package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beEscapeDebuffed;
import Skills.beFired;
import Skills.beIced;

public class Scare extends Skills{
	public Scare(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 16;
		Name = "���~";
		Note = "100%���v�������{�׭ȤU���ĪG(���v2)7�^�X";
		Damage = 0;//���v
		isMagic = false;
		isPhysic = false;
		MpCost = 300;
		skillHit = 9999;
		Cooldown = 7;
	}
	@Override
	public void getEffect(Mobs mob) {
		beEscapeDebuffed bf = new beEscapeDebuffed();
		bf.setNeedCount(7);
		bf.setRate(2);
		bf.statusRefresh(mob);
		if(bf.isStatusExist(mob)==-1) {
			mob.getBuffs().add(bf);
		}
	}
}
