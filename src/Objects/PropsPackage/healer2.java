package Objects.PropsPackage;

import Entities.Players;
import Objects.Objects;

public class healer2 extends Objects{
	
	private int HealAmount=500;
	public healer2(Players player) {
		super(player);
		ID = 2;
		Image = makeBG("/Images/�����Ĥ�64.png");
		QUALITY = "�}�n";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
		 				 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		Name = "��_��(����)";
		Note = "���Ū�HP��_�ľ��A�i�H��_ " + HealAmount + " �I�ͩR"; 
		isHeal = true;
		isMp= false;

		sellPrice=250;
		buyPrice=500;
		dropChance=20;
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