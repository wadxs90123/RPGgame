package Objects.PropsPackage;

import Entities.Players;
import Objects.Objects;

public class mpHealer extends Objects{
	
	private int HealAmount=150;
	public mpHealer(Players player) {
		super(player);
		ID= 3;
		Image = makeBG("/Images/�Ŧ��Ĥ�64.png");
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
		 			 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		Name = "�]�O��_��(�C��)";
		Note = "�C�Ū�MP��_�ľ��A�i�H��_ " + HealAmount + " �I�]�O"; 
		isHeal = true;
		isMp = true;

		sellPrice=50;
		buyPrice=100;
		Amount = (int)(Math.random()*99)%3+1;
		dropChance=20;
	}
	@Override
	public int getHealAmount() {
		return this.HealAmount; 
	}
	@Override
	public void Heal() {
		this.owner.setMana(this.owner.getMana()+HealAmount);//�O�o�[�Wthis ���M�|�줣��
		
	}
	
	
}