package Objects.PropsPackage;

import Entities.Players;
import Objects.Objects;

public class weardDrink extends Objects{
	
	private int HealAmount=150;
	
	public weardDrink(Players player) {
		super(player);
		ID= 52;
		Image = makeBG("/Images/�����]�O�Ĥ�64.png");
		QUALITY = "����";
		//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
		 			 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		Name = "�_�Ǫ��Ĥ�";
		Note = "�q�c������쪺�_���Ĥ��C"; 
		isHeal = true;
		HealAmount=owner.getMaxHealth();
		isMp = true;
		Amount = (int)(Math.random()*99)%3+1;
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