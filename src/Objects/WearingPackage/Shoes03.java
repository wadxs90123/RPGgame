package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class Shoes03 extends Objects{
	public Shoes03(Players player) {
		super(player);
		ID = 40015;
		QUALITY = "���q";//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
					 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
		WEARING_TYPE="SHOES";//HELMET ARMOR PANTS SHOES WEAPON
		Name = "�]�F�u�u";
		Note = "�ǻ��Q�]�����F�ұH�J�L���u�l";
		Image = makeBG("/Images/���u03.png");
		strength = 0;//�j�Ƶ���
		Armor=39;//�@�ҭ�
		LV_ACQUIRED = 24;//���ŭ���
		AGI_ACQUIRED =18;
	    INT_ACQUIRED =15;
	    STR_ACQUIRED =21;
	    LUK_ACQUIRED =19;
	    
	    escape = 2;//�{�׺�
		boom =3;//���κ�
		BoomAttackRate=0.04;//���
		Hit = 3; //�R��
		
		HP+=117;//�ͩR
		MP+=88;//�]�O
		STR+=8;//�O�q
		INT+=9;//���z
		LUK+=8;//���B
		AGI+=10;//�ӱ�
		
		sellPrice =1000;
		buyPrice =5000;
		dropChance=10;
	}

}
