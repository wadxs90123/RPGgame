package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beFired;
import Skills.beIced;

public class MagicBoom extends Skills{
	public MagicBoom(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 6;
		Name = "�]���Y��";
		Note = "20%�������ᵲ3�^�X�ĪG,20%�������`�N(���v1.5)3�^�X�ĪG,\n�������300%���z�ˮ`��300%�]�k�ˮ`";
		Damage = 3;//���v
		isMagic = true;
		isPhysic = true;
		MpCost = 2500;
		skillHit = 9999;
		Cooldown = 5;
	}
	@Override
	public void getEffect(Mobs mob) {
		if((int)(Math.random()*99)<=20) {
			System.out.println("���\");
			beFired bf = new beFired();
			bf.setNeedCount(3);
			bf.setRate(1.5);
			bf.statusRefresh(mob);
			if(bf.isStatusExist(mob)==-1) {
				mob.getBuffs().add(bf);
			}
		}if((int)(Math.random()*99)<=20) {
			System.out.println("���\");
			beIced bf = new beIced();
			bf.setNeedCount(3);
			bf.statusRefresh(mob);
			if(bf.isStatusExist(mob)==-1) {
				mob.getBuffs().add(bf);
			}
		}
	}
}
