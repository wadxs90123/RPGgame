package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Events.BattleEvent;
import Skills.Skills;
import Skills.beFired;

public class DragonFireBall extends Skills{
	public DragonFireBall(Players player) {
		super(player);
		ID = 2;
		Name = "���s���u";
		Note = "�R����100%����観�`�N�A�åB�I��250%�]�k�ˮ`";
		Damage = 2.5;//���v250%
		MpCost = 150;
		skillHit = 9999;
		Cooldown = 3;
	}
	@Override
	public void getEffect(Mobs mob) {
		if((int)(Math.random()*99)<=100) {
			System.out.println("���\");
			beFired bf = new beFired();
			bf.setNeedCount(10);
			bf.statusRefresh(mob);
			if(bf.isStatusExist(mob)==-1) {
				mob.getBuffs().add(bf);
			}
		}
	}
}
