package Events;

import Entities.Mobs;
import GUI.GUI;
import Skills.skillStatus;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class mobStatusThread implements Runnable{
	private Label damage1;
	private int times;
	private double distance;
	private int sleepMilis;
	private Mobs mob;
	private skillStatus ss;
	public mobStatusThread(Mobs mob ,Label damage1,int times,double distance,skillStatus ss) {
		this.damage1= damage1;
		this.times = times;
		this.distance = distance;
		this.mob = mob ;
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
			damage1.setText("(�`�N)-" + (int)(ss.getRate()*GUI.getPlayer().getMagicDamage()));
		}else if(ss.getName().equals("�v��")){
			damage1.setTextFill(Color.LIGHTGREEN);
			damage1.setText("(�v��)+" + (int)(ss.getRate()*mob.getDamage()));
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
