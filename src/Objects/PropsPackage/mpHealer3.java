package Objects.PropsPackage;

import Entities.Players;
import Objects.Objects;

public class mpHealer3 extends Objects{
	
	private int HealAmount=1500;
	public mpHealer3(Players player) {
		super(player);
		ID= 6;
		Image = makeBG("/Images/�Ŧ��Ĥ�64.png");
		QUALITY = "�}��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
		 			 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		Name = "�]�O��_��(�W��)";
		Note = "�C�Ū�MP��_�ľ��A�i�H��_ " + HealAmount + " �I�]�O"; 
		isHeal = true;
		isMp = true;
		Amount = (int)(Math.random()*99)%3+1;
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
		this.owner.setMana(this.owner.getMana()+HealAmount);//�O�o�[�Wthis ���M�|�줣��
		
	}
	
	
}