package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Shoes07 extends Objects{
	public Shoes07(Players player) {
		super(player);
		ID = 40031;
		QUALITY = "�v��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="SHOES";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�s����u";
		Note = "�Q�s�һ{�i���H�ڡA\n�s��O�N�|�û����@�ۧA...";
		Image = makeBG("/Images/���u07.png");
		strength = 0;//�j�Ƶ���
		Armor=150;//�@�ҭ�
		LV_ACQUIRED = 64;//���ŭ���
		AGI_ACQUIRED =70;
	    INT_ACQUIRED =60;
	    STR_ACQUIRED =60;
	    LUK_ACQUIRED =60;
	    
	    escape = 10;//�{�׺�
		boom =10;//���κ�
		BoomAttackRate=0.15;//���
		Hit = 15; //�R��
		
		HP+=500;//�ͩR
		MP+=350;//�]�O
		STR+=50;//�O�q
		INT+=50;//���z
		LUK+=50;//���B
		AGI+=50;//�ӱ�
		
		sellPrice =100000;
		buyPrice =1000000;
		dropChance=3;
	}

}
