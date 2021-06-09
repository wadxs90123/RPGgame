package Maps;
//The mobs in area1 must be level 1 ~ 10
//The mobs in area2 must be level 11 ~ 20
//The mobs in area3 must be level 21 ~ 30

public class Area {
	private static String[] names = {"­ô¥¬ªL","¯ó­ì¯T","¥vµÜ©i","»â­·ì¦","¥¨­¹­ô¥¬ªL","«p¥Ö³¥½Þ","ºëÆF«è©À",
									 "¾ð§¯","¨g¼É¸¼°G","­¹«Í°­","ª¦¦æªÌ","«Õ¨¦¦u½Ã","®üµs","¯BªÅ¤ô¥À",
									 "µL¦^·àªê","Å]±Ú½Ã§L","½àª÷Ây¤H","Å]·½¥®Ã~","Å]·½¥®Às","Å]±Ú¶¤ªø","Å]·½¥¨Ã~",
									 "Å]¤ýªñ½Ã","Å]·½¥¨Às","Å]¤ý¤À¨­","Å]¤ý"};
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
