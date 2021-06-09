package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beEscapeDebuffed;
import Skills.beFired;
import Skills.beIced;
import Skills.*;

public class RuneOprate extends Skills{
	public RuneOprate(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 19;
		Name = "�����ާ@";
		Note = "���ɦۨ��]�k�ˮ`(���v1.5)�W�q7�^�X";
		Damage = 0;//���v
		isMyself = true;
		isMagic = false;
		isPhysic = false;
		MpCost = 250;
		skillHit = 9999;
		Cooldown = 7;
	}
	@Override
	public void getEffect(Players player) {
		beMagicDamageBuffed bf = new beMagicDamageBuffed();
		bf.setNeedCount(7);
		bf.setRate(1.5);
		bf.statusRefresh(player);
		if(bf.isStatusExist(player)==-1) {
			player.getBuffs().add(bf);
		}
	}
}
