package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beFired;
import Skills.beIced;

public class BigIce extends Skills{
	public BigIce(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 4;
		Name = "�j�ᵲ�N";
		Note = "30%�������ᵲ3�^�X�ĪG,�åB�I�����225%�]�k�����ˮ`";
		Damage = 2.25;//���v
		
		MpCost = 100;
		skillHit = 9999;
		Cooldown = 3;
	}
	@Override
	public void getEffect(Mobs mob) {
		if((int)(Math.random()*99)<=30) {
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
