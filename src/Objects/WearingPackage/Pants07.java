package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Pants07 extends Objects{
	public Pants07(Players player) {
		super(player);
		ID = 40030;
		QUALITY = "�v��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="PANTS";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�s�����";
		Note = "�Q�s�һ{�i���H�ڡA\n�s��O�N�|�û����@�ۧA...";
		Image = makeBG("/Images/�H��07.png");
		strength = 0;//�j�Ƶ���
		Armor=200;//�@�ҭ�
		LV_ACQUIRED = 65;//���ŭ���
		AGI_ACQUIRED =60;
	    INT_ACQUIRED =60;
	    STR_ACQUIRED =60;
	    LUK_ACQUIRED =70;
	    
	    escape = 10;//�{�׺�
		boom =10;//���κ�
		BoomAttackRate=0.2;//���
		Hit = 15; //�R��
		
		HP+=500;//�ͩR
		MP+=300;//�]�O
		STR+=55;//�O�q
		INT+=55;//���z
		LUK+=55;//���B
		AGI+=55;//�ӱ�
		
		sellPrice =100000;
		buyPrice =1000000;
		dropChance=3;
	}

}
