package Objects.PropsPackage;

import Entities.Players;
import Objects.Objects;

public class healer3 extends Objects{
	
	private int HealAmount=1500;
	public healer3(Players player) {
		super(player);
		ID = 4;
		Image = makeBG("/Images/�����Ĥ�64.png");
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
		 				 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		Name = "��_��(�W��)";
		Note = "�W�Ū�HP��_�ľ��A�i�H��_ " + HealAmount + " �I�ͩR"; 
		isHeal = true;
		isMp= false;

		sellPrice=1000;
		buyPrice=2000;
		dropChance=10;
	}
	@Override
	public int getHealAmount() {
		return this.HealAmount; 
	}
	@Override
	public void Heal() {
		this.owner.setHealth(this.owner.getHealth()+HealAmount);
	}

}