package Objects.PropsPackage;

import Entities.Players;
import Objects.Objects;

public class mpHealer2 extends Objects{
	
	private int HealAmount=500;
	public mpHealer2(Players player) {
		super(player);
		ID= 5;
		Image = makeBG("/Images/�Ŧ��Ĥ�64.png");
		QUALITY = "�}�n";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
		 			 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		Name = "�]�O��_��(����)";
		Note = "���Ū�MP��_�ľ��A�i�H��_ " + HealAmount + " �I�]�O"; 
		isHeal = true;
		isMp = true;

		sellPrice=250;
		buyPrice=500;
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