package Objects.PropsPackage;

import Entities.Players;
import Objects.Objects;
import javafx.scene.image.ImageView;

public class healer extends Objects{
	
	private int HealAmount=150;
	public healer(Players player) {
		super(player);
		Image = makeBG("/Images/�����Ĥ�64.png");
		ID = 1;
		QUALITY="���q";
		//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
	    //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�		
		Name = "��_��(�C��)";
		Note = "�C�Ū�HP��_�ľ��A�i�H��_ " + HealAmount + " �I�ͩR"; 
		isHeal = true;
		isMp = false;
		Amount = (int)(Math.random()*99)%3+1;
		dropChance=20;
		sellPrice=50;
		buyPrice=100;
	}
	@Override
	public int getHealAmount() {
		return this.HealAmount; 
	}
	@Override
	public void Heal() {
		System.out.println(this.owner.getPlayer()+"   89");
		this.owner.setHealth(this.owner.getHealth()+HealAmount);
	}
	
}
