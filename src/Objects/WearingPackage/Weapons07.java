package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Weapons07 extends Objects{

	public Weapons07(Players player) {
		super(player);
		ID= 10007;//�˳Ʊq4XX�}�l �Z���q1XX�}�l
		WEARING_TYPE="WEAPON";
		QUALITY = "�v��";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
						 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�	
		Name = "�s����C";
		Note = "�Q�s�һ{�i���H�ڡA\n�s��O�N�|�û����@�ۧA...";
		Image = makeBG("/Images/�Z��07.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 70;//���ŭ���
		AGI_ACQUIRED =35;
	    INT_ACQUIRED =35;
	    STR_ACQUIRED =150;
	    LUK_ACQUIRED =35;
		escape = 0;//�{�׺�
		boom =50;//���κ�
		BoomAttackRate=0.7;//���
		Hit = 50; //�R��
		
		
		HP+=120;//�ͩR
		MP+=120;//�]�O
		attack=205;//�Z����
		STR+=45;//�O�q
		INT+=45;//���z
		LUK+=45;//���B
		AGI+=45;//�ӱ�
		sellPrice =150000;
		buyPrice =750000;
		dropChance=3;
	}
}
