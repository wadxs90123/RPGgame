package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.*;

public class Decay extends Skills{
	public Decay(Players player) {
		super(player);
		System.out.println("�ޯ�H��:" + player.getPlayer());

		ID = 22;
		Name = "�I�z�@��";
		Note = "�������Ҧ��t���ĪG(���v1.5)3�^�X�A�åB�������75%���z�ˮ`";
		Damage = 0.75;//���v
		isMagic = false;
		isPhysic = true;
		MpCost = 800;
		skillHit = 9999;
		Cooldown = 5;
	}
	@Override
	public void getEffect(Mobs mob) {
		beArmorDebuffed bf = new beArmorDebuffed();
		bf.setRate(0.75);
		bf.setNeedCount(3);
		beDamageDebuffed bf2 = new beDamageDebuffed();
		bf2.setRate(0.75);
		bf2.setNeedCount(3);
		beEscapeDebuffed bf3 = new beEscapeDebuffed();
		bf3.setRate(0.75);
		bf3.setNeedCount(3);
		bf.statusRefresh(mob);
		bf2.statusRefresh(mob);
		bf3.statusRefresh(mob);
		if(bf.isStatusExist(mob)==-1) {
			mob.getBuffs().add(bf);
		}if(bf2.isStatusExist(mob)==-1) {
			mob.getBuffs().add(bf2);
		}if(bf3.isStatusExist(mob)==-1) {
			mob.getBuffs().add(bf3);
		}
	}
}
