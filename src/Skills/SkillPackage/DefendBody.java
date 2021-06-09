package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beEscapeDebuffed;
import Skills.beFired;
import Skills.beIced;
import Skills.*;

public class DefendBody extends Skills{
	public DefendBody(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 20;
		Name = "�t���@��";
		Note = "��o�����@�ҭȡB�v¡�ĪG(���v2)�W�q7�^�X";
		Damage = 0;//���v
		isMyself = true;
		isMagic = false;
		isPhysic = false;
		MpCost = 500;
		skillHit = 9999;
		Cooldown = 7;
	}
	@Override
	public void getEffect(Players player) {
		beArmorBuffed bf = new beArmorBuffed();
		bf.setNeedCount(7);
		bf.setRate(2);
		bf.statusRefresh(player);
		beHealed bf2 = new beHealed();
		bf2.setNeedCount(7);
		bf2.setRate(2);
		bf2.statusRefresh(player);
		if(bf.isStatusExist(player)==-1) {
			player.getBuffs().add(bf);
		}
		if(bf2.isStatusExist(player)==-1) {
			player.getBuffs().add(bf2);
		}
	}
}
