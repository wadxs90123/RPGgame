package Events;

import Entities.Mobs;
import Entities.Players;
import GUI.GUI;
import Objects.Objects;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class damageDisplayEvent implements Runnable{
	private Label damage1 = new Label();
	private Label damage2 = new Label();

	private Players player = GUI.getPlayer();
	private AnchorPane ap;
	private String index;
	private int damage;
	
	public damageDisplayEvent(AnchorPane ap,String index,int damage) {
		this.ap = ap;
		this.index = index;
		this.damage = damage;
	}
	@Override
	public void run() {
		if(index.equals("playerDamage")) {//���a�ˮ`
				displayPlayer();
		}else if(index.equals("playerHeal")) {//���a�v¡
				displayPlayerHeal();
		}else if(index.equals("playerMpHeal")) {//���aMP�v¡
				displayPlayerMpHeal();
		}else if(index.equals("mobDamage")) {//�Ǫ��ˮ`
				displayMob();			 
		}else if(index.equals("mobMiss")) {//�Ǫ�MISS
				displayMobMiss();
		}else if(index.equals("playerMiss")) {//���aMISS
				displayPlayerMiss();
		}else if(index.equals("playerBoom")) {//���a����
				displayPlayerBoom();
		}else {//���~
			System.err.println("damageDisplayEvent ���~ "+index + " ���ˬd�{���X");
		}
	}
	public void displayMobMiss() {//���a���ˮ`���
		double originY= 30+((int)(Math.random()*20));

		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				
				damage2 = new Label();
				ap.getChildren().add(damage2);
				damage2.setText("MISS!!");
				damage2.setPrefHeight(200);
				damage2.setPrefWidth(500);
				damage2.setLayoutX(200+((int)(Math.random()*20)));
				damage2.setLayoutY(originY);
				damage2.setFont(new Font(25+((int)(Math.random()*5-2))));
				damage2.setTextFill(Color.RED);
				
			}
		});
		for(int i = 0 ; i < 25 ; i ++) {
			damage2.setLayoutY(originY-i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Platform.runLater(()->{
			ap.getChildren().remove(damage2);
		});
		
	}
	public void displayPlayerBoom(){//���a���ˮ`���
		double originY= 50+((int)(Math.random()*20));
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				damage1 = new Label();
				ap.getChildren().add(damage1);
				damage1.setText("(����!!) -" + damage);
				damage1.setPrefHeight(200);
				damage1.setPrefWidth(500);
				damage1.setLayoutX(980+((int)(Math.random()*20)));
				damage1.setLayoutY(originY);//980 50 200 30
				damage1.setFont(new Font(30+((int)(Math.random()*5-2))));
				damage1.setTextFill(Color.RED);

			}
		});
		for(int i = 0 ; i < 25 ; i ++) {
			damage1.setLayoutY(originY-i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}

		Platform.runLater(()->{
			ap.getChildren().remove(damage1);
		});
}
	 		
	public void displayPlayerMiss() {//���a���ˮ`���
		double originY= 50+((int)(Math.random()*20));
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				damage1 = new Label();
				ap.getChildren().add(damage1);
		
				damage1.setText("MISS!!");
				damage1.setPrefHeight(200);
				damage1.setPrefWidth(500);
				damage1.setLayoutX(980+((int)(Math.random()*20)));
				damage1.setLayoutY(originY);//980 50 200 30
				damage1.setFont(new Font(25+((int)(Math.random()*5-2))));
				damage1.setTextFill(Color.RED);
		 		
			
			}
		});
		for(int i = 0 ; i < 25 ; i ++) {
			damage1.setLayoutY(originY-i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Platform.runLater(()->{
			ap.getChildren().remove(damage1);
		});
		
	}
	public void displayPlayer()  {//���a���ˮ`���
		double originY= 50+((int)(Math.random()*20));
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				damage1 = new Label();	
				ap.getChildren().add(damage1);
				damage1.setText("-" + damage);
				damage1.setPrefHeight(200);
				damage1.setPrefWidth(500);
				damage1.setLayoutX(980+((int)(Math.random()*20)));
				damage1.setLayoutY(originY);//980 50 200 30
				damage1.setFont(new Font(25+((int)(Math.random()*5-2))));
				damage1.setTextFill(Color.RED);
		 		

			}
		});
		for(int i = 0 ; i < 25 ; i ++) {
			damage1.setLayoutY(originY-i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Platform.runLater(()->{
			ap.getChildren().remove(damage1);
		});

	}
	public void displayMob() {//�Ǫ����ˮ`���
		double originY= 30+((int)(Math.random()*20));

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				
			damage2 = new Label();	
			ap.getChildren().add(damage2);
	
			damage2.setText("- " + damage);
			damage2.setPrefHeight(200);
			damage2.setPrefWidth(500);
			damage2.setLayoutX(200+((int)(Math.random()*20)));
			damage2.setLayoutY(originY);
			damage2.setFont(new Font(25+((int)(Math.random()*5-2))));
			damage2.setTextFill(Color.RED);
	 
	
			}
		});
		for(int i = 0 ; i < 25 ; i ++) {
			damage2.setLayoutY(originY-i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Platform.runLater(()->{
			ap.getChildren().remove(damage2);
		});
	}
	public void displayPlayerHeal() {//���a���v¡�ˮ`���
		double originY= 60+((int)(Math.random()*20));

		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				damage1 = new Label();
				ap.getChildren().add(damage1);

				damage1.setText("+" + damage);
				damage1.setPrefHeight(200);
				damage1.setPrefWidth(500);
				damage1.setLayoutX(200+((int)(Math.random()*20)));
				damage1.setLayoutY(originY);
				damage1.setFont(new Font(25+((int)(Math.random()*5-2))));
				damage1.setStyle("-fx-font-weight: bold;");
				damage1.setTextFill(Color.LIGHTGREEN);
				damage1.setText("+" + damage);
			}
		});
		for(int i = 0 ; i < 25 ; i ++) {
			damage1.setLayoutY(originY-i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Platform.runLater(()->{
			ap.getChildren().remove(damage1);
		});
	}
	public void displayPlayerMpHeal() {//���a���v¡�ˮ`���
		double originY= 60+((int)(Math.random()*20));

		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				damage1 = new Label();
				ap.getChildren().add(damage1);
				damage1.setText("+" + damage);
				damage1.setPrefHeight(200);
				damage1.setPrefWidth(500);
				damage1.setLayoutX(170+((int)(Math.random()*20)));
				damage1.setLayoutY(originY);
				damage1.setFont(new Font(25+((int)(Math.random()*5-2))));
				damage1.setStyle("-fx-font-weight: bold;");
				damage1.setTextFill(Color.BLUE);
				damage1.setText("+" + damage);
		

			}
		});
		for(int i = 0 ; i < 25 ; i ++) {
			damage1.setLayoutY(originY-i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Platform.runLater(()->{
			ap.getChildren().remove(damage1);
		});
	}
	

}
