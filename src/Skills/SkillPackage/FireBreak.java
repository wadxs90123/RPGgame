package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Events.BattleEvent;
import Skills.Skills;
import Skills.beFired;

public class FireBreak extends Skills{
	public FireBreak(Players player) {
		super(player);
		ID = 8;
		Name = "�����}";
		Note = "70%�������U�N(���v1.5)3�^�X�ĪG,\n�õ������275%���z�ˮ`";
		Damage = 2.75;//���v250%
		isPhysic = true;
		isMagic = false;
		MpCost = 750;
		skillHit = 9999;
		Cooldown = 3;
	}
	@Override
	public void getEffect(Mobs mob) {
		if((int)(Math.random()*99)<=70) {
			System.out.println("���\");
			beFired bf = new beFired();
			bf.setRate(1.5);
			bf.setNeedCount(3);
			bf.statusRefresh(mob);
			if(bf.isStatusExist(mob)==-1) {
				mob.getBuffs().add(bf);
			}
		}
	}
}
