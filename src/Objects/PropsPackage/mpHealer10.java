package Objects.PropsPackage;

import Entities.Players;
import Objects.Objects;

public class mpHealer10 extends Objects{
	
	private int HealAmount=150;
	
	public mpHealer10(Players player) {
		super(player);
		ID= 51;
		Image = makeBG("/Images/�����]�O�Ĥ�64.png");
		QUALITY = "�ǻ�";
		//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
		 			 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		Name = "�]�O��_��(����)";
		Note = "���Ū�MP��_�ľ��A�i�H�^���]�O"; 
		isHeal = true;
		HealAmount=owner.getMaxMana();
		isMp = true;
		Amount = (int)(Math.random()*99)%3+1;
		sellPrice=5000;

		dropChance=1;
	}
	@Override
	public int getHealAmount() {
		System.out.println(owner.getPlayer() +  " �^�_" + HealAmount);
		return this.owner.getMaxMana(); 
	}
	@Override
	public void Heal() {
		this.owner.setMana(this.owner.getMaxMana());//�O�o�[�Wthis ���M�|�줣��
		
	}
	
	
}