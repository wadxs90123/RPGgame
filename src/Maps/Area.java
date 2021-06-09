package Maps;
//The mobs in area1 must be level 1 ~ 10
//The mobs in area2 must be level 11 ~ 20
//The mobs in area3 must be level 21 ~ 30

public class Area {
	private static String[] names = {"�����L","���T","�v�ܩi","�⭷�","���������L","�p�ֳ���","���F���",
									 "��","�g�ɸ��G","���Ͱ�","�����","�ը��u��","���s","�B�Ť���",
									 "�L�^���","�]�ڽçL","����y�H","�]�����~","�]�����s","�]�ڶ���","�]�����~",
									 "�]�����","�]�����s","�]������","�]��"};
	public static int level(int areaNumber) {
		int result;
		do{
			result = (int)((Math.random()*10)+10*(areaNumber-1));
		}while(result==0);
		return result;
	}
	public static String name(int areaNumber) {
		return names[(int)((Math.random()*3)+3*(areaNumber-1))];
	}
}
