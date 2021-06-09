package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beFired;
import Skills.beIced;

public class MagicQuake extends Skills{
	public MagicQuake(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 12;
		Name = "�]���_��";
		Note = " 5%�������ᵲ1�^�X�ĪG,5%�������`�N(���v1.5)1�^�X�ĪG,\n�������180%�]�k�ˮ`";
		Damage = 1.8;//���v
		isMagic = true;
		isPhysic = false;
		MpCost = 500;
		skillHit = 9999;
		Cooldown = 3;
	}
	@Override
	public void getEffect(Mobs mob) {
		if((int)(Math.random()*99)<=5) {
			System.out.println("���\");
			beFired bf = new beFired();
			bf.setNeedCount(1);
			bf.setRate(1.5);
			bf.statusRefresh(mob);
			if(bf.isStatusExist(mob)==-1) {
				mob.getBuffs().add(bf);
			}
		}if((int)(Math.random()*99)<=5) {
			System.out.println("���\");
			beIced bf = new beIced();
			bf.setNeedCount(1);
			bf.statusRefresh(mob);
			if(bf.isStatusExist(mob)==-1) {
				mob.getBuffs().add(bf);
			}
		}
	}
}
