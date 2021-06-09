package Events;

import Entities.Mobs;
import Entities.Players;
import GUI.GUI;
import Skills.skillStatus;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class playerStatusThread implements Runnable{
	private Label damage1;
	private int times;
	private double distance;
	private int sleepMilis;
	private Players player;
	private skillStatus ss;
	public playerStatusThread(Players player ,Label damage1,int times,double distance,skillStatus ss) {
		this.damage1= damage1;
		this.times = times;
		this.distance = distance;
		this.player = player ;
		this.ss = ss;
	}	
	
	@Override
	public void run() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		Platform.runLater(()->GUI.getCombating().getChildren().add(damage1));
		damage1.setVisible(true);
		if(ss.getName().equals("�`�N")) {
			damage1.setTextFill(Color.ORANGERED);
			damage1.setText("(�`�N)-" + (int)(ss.getRate()*BattleEvent.getMob().getDamage()));
		}else if(ss.getName().equals("�v��")){
			damage1.setTextFill(Color.LIGHTGREEN);
			damage1.setText("(�v��)+" + (int)(ss.getRate()*player.getMagicDamage()));
		}else if(ss.getName().equals("�B��")){
			damage1.setText("(�ᵲ)");
			damage1.setTextFill(Color.LIGHTBLUE);
		}else if(ss.getName().equals("�W�[�R��")){
			damage1.setText("�R���v����!");
			damage1.setTextFill(Color.AQUA);
		}else if(ss.getName().equals("���C�R��")){
			damage1.setText("�R���v�U��!");
			damage1.setTextFill(Color.RED);
		}else if(ss.getName().equals("�W�[�{����")){
			damage1.setText("�{���ȴ���!");
			damage1.setTextFill(Color.AQUA);
		}else if(ss.getName().equals("��ְ{����")){
			damage1.setText("�{���ȤU��!");
			damage1.setTextFill(Color.RED);
		}else if(ss.getName().equals("�W�[���z�ˮ`")){
			damage1.setText("�ˮ`����!");
			damage1.setTextFill(Color.AQUA);
		}else if(ss.getName().equals("���C���z�ˮ`")){
			damage1.setText("�ˮ`�U��!");
			damage1.setTextFill(Color.RED);
		}else if(ss.getName().equals("�W�[�@�ҭ�")){
			damage1.setText("�@�Ҵ���!");
			damage1.setTextFill(Color.AQUA);
		}else if(ss.getName().equals("����@�ҭ�")){
			damage1.setText("�@�ҤU��!");
			damage1.setTextFill(Color.RED);
		}else if(ss.getName().equals("�W�[�]��")){
			damage1.setText("�]�˴���!");
			damage1.setTextFill(Color.AQUA);
		}else if(ss.getName().equals("����]��")){
			damage1.setText("�]�ˤU��!");
			damage1.setTextFill(Color.RED);
		}else if(ss.getName().equals("�W�[�����v")){
			damage1.setText("�����v����!");
			damage1.setTextFill(Color.AQUA);
		}else if(ss.getName().equals("��ּ����v")){
			damage1.setText("�����v�U��!");
			damage1.setTextFill(Color.RED);
		}else if(ss.getName().equals("�W�[�����ˮ`")){
			damage1.setText("�ɶ˴���!");
			damage1.setTextFill(Color.AQUA);
		}else if(ss.getName().equals("��ּ����ˮ`")){
			damage1.setText("�ɶˤU��!");
			damage1.setTextFill(Color.RED);
		}
		
		double origin=55;//�ˮ`���Ҫ��_�l��
		
		for(int i = 0 ; i < 25 ; i ++) {
			damage1.setLayoutY(origin-i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
				}
		}
		
		Platform.runLater(()->GUI.getCombating().getChildren().remove(damage1));
	}
}
