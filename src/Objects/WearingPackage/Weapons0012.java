package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons0012 extends Objects{

	public Weapons0012(Players player) {
		super(player);
		ID= 10030;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "����";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�`�W����-�C���Ƨ�";
		Note = "�ɪŲ`�W�̲`�I�N���A�]�Q����Ӽ����(��J��o)";
		Image = makeBG("/Images/�]��09.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 90;//���ŭ���
		
		AGI_ACQUIRED =45;
	    INT_ACQUIRED =45;
	    STR_ACQUIRED =300;
	    LUK_ACQUIRED =45;

	    escape = 50;//�{�׺�
		boom =150;//���κ�
		BoomAttackRate=3;//���
		Hit = 150; //�R��
		
		
		HP+=2000;//�ͩR
		MP+=2000;//�]�O
		attack = 800;
		STR+=300;//�O�q
		INT+=80;//���z
		LUK+=80;//���B
		AGI+=80;//�ӱ�
		sellPrice =100;
		buyPrice =100000000;
		dropChance=0;
	}
}
