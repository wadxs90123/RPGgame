package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons008 extends Objects{

	public Weapons008(Players player) {
		super(player);
		ID= 10017;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�ǻ�";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�]������";
		Note = "�]���j���W�̺�¤��O�A���񯫤��N��";
		Image = makeBG("/Images/�]��08.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 80;//���ŭ���
		AGI_ACQUIRED =40;
	    INT_ACQUIRED =200;
	    STR_ACQUIRED =40;
	    LUK_ACQUIRED =40;
		escape = 0;//�{�׺�
		boom =75;//���κ�
		BoomAttackRate=1;//���
		Hit = 75; //�R��
		
		
		HP+=250;//�ͩR
		MP+=1000;//�]�O
		magicAttack = 800;
		STR+=60;//�O�q
		INT+=65;//���z
		LUK+=60;//���B
		AGI+=60;//�ӱ�
		sellPrice =1500000;
		buyPrice =7500000;
		dropChance=2;
	}
}
