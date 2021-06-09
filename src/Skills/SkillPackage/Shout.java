package Skills.SkillPackage;

import Entities.Mobs;
import Entities.Players;
import Skills.Skills;
import Skills.beDamageBuffed;
import Skills.*;

public class Shout extends Skills{
	public Shout(Players player) {
		super(player);
		ID = 11;
		Name = "�q�s";
		Note = "100%���v�o�쪫�z�ˮ`(���v1.5)�W�q7�^�X";
		Damage = 1;
		MpCost = 100;
		skillHit = 9999;
		Cooldown = 7;
		isMyself = true;
	}
	@Override
	public void getEffect(Players player) {
			System.out.println("���\");
			beDamageBuffed bf = new beDamageBuffed();
			bf.setNeedCount(7);
			bf.statusRefresh(player);
			if(bf.isStatusExist(player)==-1) {
				player.getBuffs().add(bf);
			}
		}
}
