package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Armor07 extends Objects{
	public Armor07(Players player) {
		super(player);
		ID = 40029;
		QUALITY = "�v��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="ARMOR";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�s���Z��";
		Note = "�Q�s�һ{�i���H�ڡA\n�s��O�N�|�û����@�ۧA...";
		Image = makeBG("/Images/����07.png");
		strength = 0;//�j�Ƶ���
		Armor=305;//�@�ҭ�
		LV_ACQUIRED = 67;//���ŭ���335
		AGI_ACQUIRED =60;
	    INT_ACQUIRED =60;
	    STR_ACQUIRED =80;
	    LUK_ACQUIRED =60;
	    
	    escape = 15;//�{�׺�
		boom = 15;//���κ�
		BoomAttackRate=0.3;//���
		Hit = 15; //�R��
		
		HP+=1065;//�ͩR
		MP+=450;//�]�O
		STR+=65;//�O�q
		INT+=65;//���z
		LUK+=65;//���B
		AGI+=65;//�ӱ�
		
		sellPrice =100000;
		buyPrice =1000000;
		dropChance=3;
	}

}
