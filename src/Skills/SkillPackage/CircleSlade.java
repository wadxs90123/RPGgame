package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.*;

public class CircleSlade extends Skills{
	public CircleSlade(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 23;
		Name = "��R�y�q";
		Note = "��o���ɰ{�סB�v¡�B�ɶˮĪG(���v2)5�^�X�A�åB�������375%���z�ˮ`";
		Damage = 3.75;//���v
		isMagic = false;
		isPhysic = true;
		MpCost = 2000;
		skillHit = 9999;
		Cooldown = 10;
	}
	@Override
	public void getEffect(Mobs mob) {
		beHealed bf = new beHealed();
		bf.setRate(2);
		bf.setNeedCount(5);
		beEscapeBuffed bf2 = new beEscapeBuffed();
		bf2.setRate(2);
		bf2.setNeedCount(5);
		beBoomDamageBuffed bf3 = new beBoomDamageBuffed();
		bf3.setRate(2);
		bf3.setNeedCount(5);
		bf.statusRefresh(player);
		bf2.statusRefresh(player);
		bf3.statusRefresh(player);
		if(bf.isStatusExist(player)==-1) {
			player.getBuffs().add(bf);
		}if(bf2.isStatusExist(player)==-1) {
			player.getBuffs().add(bf2);
		}if(bf3.isStatusExist(player)==-1) {
			player.getBuffs().add(bf3);
		}
	}
}
