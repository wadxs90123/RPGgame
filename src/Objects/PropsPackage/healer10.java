package Objects.PropsPackage;

import Entities.Players;
import Objects.Objects;
import javafx.scene.image.ImageView;

public class healer10 extends Objects{
	
	private int HealAmount=150;
	public healer10(Players player) {
		super(player);
		Image = makeBG("/Images/�����Ĥ�64.png");
		ID = 50;
		QUALITY="�ǻ�";
		//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
	    //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�		
		Name = "��_��(����)";
		Note = "���Ū�HP��_�ľ��A�i�H�^���ͩR"; 
		isHeal = true;
		isMp = false;
		Amount = (int)(Math.random()*99)%3+1;
		HealAmount=super.owner.getMaxHealth();
		sellPrice=5000;
		dropChance=1;
	}
	@Override
	public int getHealAmount() {
		return this.owner.getMaxHealth(); 
	}
	@Override
	public void Heal() {
		System.out.println(this.owner.getPlayer()+" 19");
		this.owner.setHealth(this.owner.getMaxHealth());
	}
	
}