package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons004 extends Objects{

	public Weapons004(Players player) {
		super(player);
		ID= 10013;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�}�n";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�ը�����";
		Note = "�L�L���F��q���B�X�A\\n�O�Q���a����ҥ��|�X�Ӫ���";
		Image = makeBG("/Images/�]��04.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 40;//���ŭ���
		AGI_ACQUIRED =20;
	    INT_ACQUIRED =60;
	    STR_ACQUIRED =20;
	    LUK_ACQUIRED =20;
		escape = 0;//�{�׺�
		boom =20;//���κ�
		BoomAttackRate=0.3;//���
		Hit = 20; //�R��
		
		
		HP+=60;//�ͩR
		MP+=200;//�]�O
		magicAttack = 200;
		STR+=20;//�O�q
		INT+=25;//���z
		LUK+=20;//���B
		AGI+=20;//�ӱ�
		sellPrice =10000;
		buyPrice =50000;
		dropChance=10;
	}
}
