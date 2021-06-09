package Skills;

import java.util.Comparator;

import Entities.Mobs;
import Entities.Players;
import Events.BattleEvent;
import Events.displayPlayer;
import GUI.GUI;
import Objects.Objects;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

public class skillStatus {

	protected int ID;
	protected Background buffBG;
	protected double rate;//���v
	protected int nowCount;//��e�Ʀ^�X
	protected int needCount;//�n�F�쪺�^�X�]�N�O�ޯ઺�N�o��
	protected String name;//�W��
	protected String note;//�ĪG�ԭz
	
	private static Label statusL = new Label();
	private static Label mobStatusL = new Label();
	
	private static int damageTemp = GUI.getPlayer().getDamage();
	private static int magicDamageTemp = GUI.getPlayer().getMagicDamage();
	private static int armorTemp = GUI.getPlayer().getArmor();
	private static int hitTemp = GUI.getPlayer().getHit();
	private static int escapeTemp = GUI.getPlayer().getEscape();
	private static int boomTemp = GUI.getPlayer().getBoom();
	private static double boomAttackTemp = GUI.getPlayer().getBoomAttackRate();
	
	private static int mobDamageTemp;
	private static int mobArmorTemp;
	private static int mobEscapeTemp;
	
	
	public skillStatus(){
	}
	public int getID() {
		return this.ID;
	}
	public static void playerStatusRecovery() {
//		for(int i = 0 ; i < GUI.getPlayer().getSkills().size() ; i ++) {
//			GUI.getPlayer().getSkills().get(i).setCanBeApply(true);
//		}
		GUI.getPlayer().setDamage(damageTemp);
		GUI.getPlayer().setMagicDamage(magicDamageTemp);

		GUI.getPlayer().setArmor(armorTemp);
		GUI.getPlayer().setHit(hitTemp);
		GUI.getPlayer().setEscape(escapeTemp);
		GUI.getPlayer().setBoom(boomTemp);
		GUI.getPlayer().setBoomAttackRate(boomAttackTemp);
	}
	public static void mobStatusRecovery() {
		if(BattleEvent.getMob()!=null) {
		BattleEvent.getMob().setDamage(mobDamageTemp);
		System.err.println(BattleEvent.getMob().getName() + " : " + BattleEvent.getMob().getDamage());
//		BattleEvent.getMob().setMagicDamage(magicDamageTemp);
		BattleEvent.getMob().setArmor(mobArmorTemp);
//		BattleEvent.getMob().setHit(hitTemp);
		BattleEvent.getMob().setEscape(mobEscapeTemp);
//		BattleEvent.getMob().setBoom(boomTemp);
//		BattleEvent.getMob().setBoomAttackRate(boomAttackTemp);
		}
	}
	public static void originPlayerStatusRecord() {
		damageTemp = GUI.getPlayer().getDamage();
		magicDamageTemp = GUI.getPlayer().getMagicDamage();
		armorTemp = GUI.getPlayer().getArmor();
		hitTemp = GUI.getPlayer().getHit();
		escapeTemp = GUI.getPlayer().getEscape();
		boomTemp = GUI.getPlayer().getBoom();
		boomAttackTemp = GUI.getPlayer().getBoomAttackRate();
	}
	public static void originMobStatusRecord() {
		mobDamageTemp = BattleEvent.getMob().getDamage();
		mobArmorTemp = BattleEvent.getMob().getArmor();
		mobEscapeTemp = BattleEvent.getMob().getEscape();
		
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getName() {
		return this.name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Background getBuffBG() {
		return buffBG;
	}
	public void setBuffBG(Background buffBG) {
		this.buffBG = buffBG;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getNowCount() {
		return nowCount;
	}
	public void setNowCount(int count) {
		this.nowCount = count;
	}
	public int getNeedCount() {
		return needCount;
	}
	public void setNeedCount(int count) {
		this.needCount = count;
	}

	public void countPlus() {
		this.setNowCount(this.getNowCount()+1);//��{�b�ƹD���^�M��+1 �ڭ̬ݨ쪺�^�M�Ƶ��� �ݭn�^�M��-�{�b�^�M��
	}
	public boolean isActive() {//�]���ҥΩΤ��ҥ� ���F���T���W���Ҧb�W��
		if(this.nowCount < this.needCount){
			return true;
		}else {
			return false;
		}
	}

	public static void setLabel(Mobs mob) {
		VBox result = new VBox();
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				result.setLayoutX(750);
				result.setLayoutY(200);
				skillStatusSort(mob);

				for(int i = 0 ; i < mob.getBuffs().size() ; i ++) {
					skillStatus ss = mob.getBuffs().get(i);
					Label temp = new Label();
					Tooltip ttp = new Tooltip();
					ttp.setText(ss.getName() + " �Ѿl " + (ss.getNeedCount()-ss.getNowCount()) + " �^�X\n" + ss.getNote());
					ttp.setFont(new Font(13));
					ttp.setShowDelay(new Duration(50));
					temp.setPrefSize(32,32);
					temp.setText(Integer.toString(ss.getNeedCount()-ss.getNowCount()));
					temp.setAlignment(Pos.BOTTOM_RIGHT);
					temp.setBackground(ss.getBuffBG());
					temp.setTooltip(ttp);
					result.getChildren().add(temp);
				}
				if(GUI.getCombating().getChildren().contains(GUI.getMobSkiStatus())) {
					GUI.getCombating().getChildren().remove(GUI.getMobSkiStatus());
				}
				GUI.setMobSkiStatus(result);
				GUI.getCombating().getChildren().add(GUI.getMobSkiStatus());
			}
		});
	}
	public static void skillStatusSort(Mobs mob) {
		mob.getBuffs().sort(new buffSort());
	}
	public static void skillStatusSort(Players player) {
		player.getBuffs().sort(new buffSort());
	}
	public static void statusCountUpdate(Mobs mob) {
		int max = mob.getBuffs().size();
		skillStatusSort(mob);
		for(int i = 0 ; i < mob.getBuffs().size() ; i ++) {
		     mob.getBuffs().get(i).countPlus();
		}
		for(int i = 1 ; i <= max ; i ++) {
			for(int j = 0 ; j < mob.getBuffs().size() ; j ++) {
				if(!mob.getBuffs().get(j).isActive()) {
			    	  mob.getBuffs().remove(j);
			      }
			}
		}
	
		setLabel(mob);
	}
	public static void statusCountUpdate(Players player) {
		int max = player.getBuffs().size();
		skillStatusSort(player);
		for(int i = 0 ; i < player.getBuffs().size() ; i ++) {
		      player.getBuffs().get(i).countPlus();
		      
		}
		for(int i = 1 ; i <= max ; i ++) {
			for(int j = 0 ; j < player.getBuffs().size() ; j ++) {
				if(!player.getBuffs().get(j).isActive()) {
			    	  player.getBuffs().remove(j);
			      }
			}
		}
	
		setLabel(player);
	}
	public static void statusDischarge(Mobs mob,Players player) {
		for(int i = 0 ; i < player.getBuffs().size() ; i ++) {
			if(player.getBuffs().get(i).getName().equals("�`�N")) {
				player.setHealth(player.getHealth()- (int)(player.getBuffs().get(i).getRate()*mob.getDamage()));
			}if(player.getBuffs().get(i).getName().equals("�v��")) {
				player.setHealth(player.getHealth()+(int)(player.getBuffs().get(i).getRate()*player.getMagicDamage()));
				if(player.getHealth()>player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				}
			}if(player.getBuffs().get(i).getName().equals("�W�[�]��")||player.getBuffs().get(i).getName().equals("����]��")) {
				player.setMagicDamage((int)(player.getBuffs().get(i).getRate()*magicDamageTemp));

			}if(player.getBuffs().get(i).getName().equals("�W�[�{����")) {
				player.setEscape((int)(player.getEscape()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("��ְ{����")) {
				player.setEscape((int)(player.getEscape()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("�W�[���z�ˮ`")) {
				player.setDamage((int)(player.getDamage()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("���C���z�ˮ`")) {
				player.setDamage((int)(player.getDamage()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("�W�[�@�ҭ�")) {
				player.setArmor((int)(player.getArmor()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("����@�ҭ�")) {
				player.setArmor((int)(player.getArmor()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("�W�[�����ˮ`")) {
				player.setBoomAttackRate((int)(player.getBoomAttackRate()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("��ּ����ˮ`")) {
				player.setBoomAttackRate((int)(player.getBoomAttackRate()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("�W�[�����v")) {
				player.setBoom((int)(player.getBoom()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("���C�����v")) {
				player.setBoom((int)(player.getBoom()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("�W�[�R��")) {
				player.setHit((int)(player.getHit()*player.getBuffs().get(i).getRate()));
			}if(player.getBuffs().get(i).getName().equals("���C�R��")) {
				player.setHit((int)(player.getHit()*player.getBuffs().get(i).getRate()));
			}
		}
	}
	public static void statusDischarge(Players player,Mobs mob) {
		for(int i = 0 ; i < mob.getBuffs().size() ; i ++) {
			
			if(mob.getBuffs().get(i).getName().equals("�`�N")) {
			
				mob.setHealth(mob.getHealth()-(int)(mob.getBuffs().get(i).getRate()*player.getMagicDamage()));
			}if(mob.getBuffs().get(i).getName().equals("�v��")) {
				mob.setHealth(mob.getHealth()+(int)(mob.getBuffs().get(i).getRate()*mob.getDamage()));
				if(mob.getHealth()>mob.getMaxHealth()) {
					mob.setHealth(mob.getMaxHealth());
				}
			}if(mob.getBuffs().get(i).getName().equals("�B��")) {
				mob.setIsIced(true);
				System.err.println("�B��: " + mob.getIsIced());
			}if(mob.getBuffs().get(i).getName().equals("�W�[�{����")) {
				mob.setEscape((int)(mob.getEscape()*mob.getBuffs().get(i).getRate()));
			}if(mob.getBuffs().get(i).getName().equals("��ְ{����")) {
				mob.setEscape((int)(mob.getEscape()*mob.getBuffs().get(i).getRate()));
			}if(mob.getBuffs().get(i).getName().equals("�W�[���z�ˮ`")) {
				mob.setDamage((int)(mob.getDamage()*mob.getBuffs().get(i).getRate()));
			}if(mob.getBuffs().get(i).getName().equals("���C���z�ˮ`")) {
				mob.setDamage((int)(mob.getDamage()*mob.getBuffs().get(i).getRate()));
			}if(mob.getBuffs().get(i).getName().equals("�W�[�@�ҭ�")) {
				mob.setArmor((int)(mob.getArmor()*mob.getBuffs().get(i).getRate()));
			}if(mob.getBuffs().get(i).getName().equals("����@�ҭ�")) {
				mob.setArmor((int)(mob.getArmor()*mob.getBuffs().get(i).getRate()));
			}
		}
	}
//}else if(ss.getName().equals("�W�[�R��")){
//	damage1.setText("�R���v����!");
//	damage1.setTextFill(Color.AQUA);
//}else if(ss.getName().equals("���C�R��")){
//	damage1.setText("�R���v�U��!");
//	damage1.setTextFill(Color.RED);
//}else if(ss.getName().equals("�W�[�{����")){
//	damage1.setText("�{���ȴ���!");
//	damage1.setTextFill(Color.AQUA);
//}else if(ss.getName().equals("��ְ{����")){
//	damage1.setText("�{���ȤU��!");
//	damage1.setTextFill(Color.RED);
//}else if(ss.getName().equals("�W�[���z�ˮ`")){
//	damage1.setText("�ˮ`����!");
//	damage1.setTextFill(Color.AQUA);
//}else if(ss.getName().equals("���C���z�ˮ`")){
//	damage1.setText("�ˮ`�U��!");
//	damage1.setTextFill(Color.RED);
//}else if(ss.getName().equals("�W�[�@�ҭ�")){
//	damage1.setText("�@�Ҵ���!");
//	damage1.setTextFill(Color.AQUA);
//}else if(ss.getName().equals("����@�ҭ�")){
//	damage1.setText("�@�ҤU��!");
//	damage1.setTextFill(Color.RED);
//}
	public static void setLabel(Players player) {
		VBox result = new VBox();
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				result.setLayoutX(150);
				result.setLayoutY(200);
				skillStatusSort(player);

				for(int i = 0 ; i < player.getBuffs().size() ; i ++) {
					skillStatus ss = player.getBuffs().get(i);
					
					Label temp = new Label();
					Tooltip ttp = new Tooltip();
					ttp.setText(ss.getName() + " �Ѿl " + (ss.getNeedCount()-ss.getNowCount()) + " �^�X\n" + ss.getNote());
					ttp.setFont(new Font(13));
					ttp.setShowDelay(new Duration(50));
					temp.setPrefSize(32,32);
					temp.setText(Integer.toString(ss.getNeedCount()-ss.getNowCount()));
					temp.setAlignment(Pos.BOTTOM_RIGHT);
					temp.setBackground(ss.getBuffBG());
					temp.setTooltip(ttp);
					result.getChildren().add(temp);
				}
				if(GUI.getCombating().getChildren().contains(GUI.getSkiStatus())) {
					GUI.getCombating().getChildren().remove(GUI.getSkiStatus());
				}
				GUI.setSkiStatus(result);
				GUI.getCombating().getChildren().add(GUI.getSkiStatus());
			}
		});
		
	}
	public int isStatusExist(Players player) {
		for(int i = 0 ; i < player.getBuffs().size() ; i ++) {
			if(this.getID()==player.getBuffs().get(i).getID()) {
				return i;
			}
		}
		return -1;
	}
	public int isStatusExist(Mobs mob) {
		for(int i = 0 ; i < mob.getBuffs().size() ; i ++) {
			if(this.getID()==mob.getBuffs().get(i).getID()) {
				return i;
			}
		}
		return -1;
	}

	public void statusRefresh(Players player) {
		int index = this.isStatusExist(player);
		
		if(index!=-1) {
			player.getBuffs().get(index).setNowCount(0);
			if(this.getRate()>player.getBuffs().get(index).getRate()) {
				player.getBuffs().get(index).setRate(this.getRate());
			}
			if(this.getNeedCount()>player.getBuffs().get(index).getNeedCount()) {
				player.getBuffs().get(index).setNeedCount(this.getNeedCount());
			}
		}
			
	}
	public boolean statusRefresh(Mobs mob) {
		int index = this.isStatusExist(mob);
		
		if(index!=-1) {
			mob.getBuffs().get(index).setNowCount(0);
			if(this.getRate()>mob.getBuffs().get(index).getRate()) {
				mob.getBuffs().get(index).setRate(this.getRate());
			}
			if(this.getNeedCount()>mob.getBuffs().get(index).getNeedCount()) {
				mob.getBuffs().get(index).setNeedCount(this.getNeedCount());
			}
			return true;
		}else {
			return false;
		}
			
	}
	public static void setMobStatusL(Label l) {
		mobStatusL = l;
	}
	public static void setStatusL(Label l) {
		statusL = l;
	}

}
class buffSort implements Comparator<skillStatus>{

	@Override
	public int compare(skillStatus o1, skillStatus o2) {
		int c1 = o1.getNeedCount() - o1.getNowCount();
		int c2 = o2.getNeedCount() - o2.getNowCount();
		if(c1==c2) {
			return o1.getID()-o2.getID();
		}
		return c1-c2;
	}
}

