package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class helmet07 extends Objects{
	public helmet07(Players player) {
		super(player);
		ID = 40028;
		QUALITY = "�v��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="HELMET";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�s���Y��";
		Note = "�Q�s�һ{�i���H�ڡA\n�s��O�N�|�û����@�ۧA...";
		Image = makeBG("/Images/�Y��07.png");
		strength = 0;//�j�Ƶ���
		Armor=200;//�@�ҭ�
		LV_ACQUIRED = 63;//���ŭ���
		AGI_ACQUIRED =60;
	    INT_ACQUIRED =60;
	    STR_ACQUIRED =60;
	    LUK_ACQUIRED =60;
	    
	    escape = 10;//�{�׺�
		boom = 10;//���κ�
		BoomAttackRate=0.15;//���
		Hit = 15; //�R��
		
		HP+=500;//�ͩR
		MP+=250;//�]�O
		STR+=50;//�O�q
		INT+=50;//���z
		LUK+=50;//���B
		AGI+=50;//�ӱ�
		sellPrice =100000;
		buyPrice =1000000;
		dropChance=3;
	}

}
