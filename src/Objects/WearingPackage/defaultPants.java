package Objects.WearingPackage;

import Entities.Players;
import Objects.Objects;
 
public class defaultPants extends Objects{//�w�]�˳�
	public defaultPants(Players player) {
		super(player);
		ID = 4002;
		WEARING_TYPE="PANTS";
		Name = "�|���˳�!";
		Note = "";
		Image = makeBG("/Images/�˳ƹw�]3.png");
		strength = 0;//�j�Ƶ���
		LV_ACQUIRED = 0;//���ŭ���
		AGI_ACQUIRED =0;
		HP+=0;//�ͩR
		MP+=0;//�]�O
		Armor=0;//�@�ҭ�
		STR+=0;//�O�q
		INT+=0;//���z
		LUK+=0;//���B
		AGI+=0;//�ӱ�
	}

}
