package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons009 extends Objects{

	public Weapons009(Players player) {
		super(player);
		ID= 10018;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "����";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�`�W���C";
		Note = "�H�ɪŤ����N���l�c���A����j�j";
		Image = makeBG("/Images/�]��09.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 90;//���ŭ���
		
		AGI_ACQUIRED =45;
	    INT_ACQUIRED =250;
	    STR_ACQUIRED =45;
	    LUK_ACQUIRED =45;

	    escape = 0;//�{�׺�
		boom =100;//���κ�
		BoomAttackRate=2;//���
		Hit = 100; //�R��
		
		
		HP+=500;//�ͩR
		MP+=1500;//�]�O
		magicAttack = 1500;
		STR+=80;//�O�q
		INT+=100;//���z
		LUK+=80;//���B
		AGI+=80;//�ӱ�
		sellPrice =5000000;
		buyPrice =100000000;
		dropChance=1;
	}
}
