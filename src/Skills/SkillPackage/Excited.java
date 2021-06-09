package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beFired;
import Skills.beMagicDamageBuffed;

public class Excited extends Skills{
	public Excited(Players player) {
		super(player);
		ID = 3;
		Name = "����";
		Note = "���ۨ��]�k�ˮ`����";
		Damage = 1;
		MpCost = 150;
		skillHit = 9999;
		Cooldown = 3;
		isMyself = true;
	}
	@Override
	public void getEffect(Players player) {
		if((int)(Math.random()*99)<=100) {
			System.out.println("���\");
			beMagicDamageBuffed bf = new beMagicDamageBuffed();
			bf.setNeedCount(10);
			bf.statusRefresh(player);
			if(bf.isStatusExist(player)==-1) {
				player.getBuffs().add(bf);
			}
		}
	}
}
