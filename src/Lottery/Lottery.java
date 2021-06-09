package Lottery;

import java.util.ArrayList;
import java.util.Comparator;

import Entities.Players;
import GUI.GUI;
import Objects.Objects;
import Objects.MobDrops.*;
import Objects.PropsPackage.*;
import Objects.WearingPackage.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

public class Lottery {
	ArrayList<Objects> temp = new ArrayList<Objects>();
	AnchorPane ap;
	Players player = GUI.getPlayer();
	public Lottery(AnchorPane ap){
		this.ap = ap;
	}

	public void normal() {//���q �}�n
		Label warning = new Label("�������]���ۤ���!!!");
		warning.setVisible(false);
		warning.setStyle("-fx-background-color: lightgray;"
				 	    +"-fx-border-color: darkgray;"
						+"-fx-border-width: 1mm;"
				 	    +"-fx-font-size: 20px;"
						+"-fx-font-weight: bold;");
		warning.setPrefSize(400, 200);
		warning.setAlignment(Pos.CENTER);
		warning.setLayoutX(400);
		warning.setLayoutY(150);
		warning.setOnMouseClicked(e->{
			warning.setVisible(false);
		});
		Label budget = new Label("�ݪ�O\n 1000 �T����");
		budget.setTextAlignment(TextAlignment.CENTER);
		budget.setTextFill(Color.LIGHTGOLDENRODYELLOW);
		Label budget2 = new Label("�ݪ�O\n 10000 �T����");
		budget2.setTextAlignment(TextAlignment.CENTER);
		budget2.setTextFill(Color.LIGHTGOLDENRODYELLOW);
		Label title = new Label("���q�_��");
		Text te1 = new Text("���q");
		Text te2 = new Text("�}�n");
		te1.setStyle("-fx-font-weight: bold");
		te2.setStyle("-fx-font-weight: bold");
		te1.setFill(Color.WHITE);
		te1.setFont(new Font(23));
		te2.setFill(Color.GREEN);
		te2.setFont(new Font(22));
		te1.setLayoutY(272);
		te1.setLayoutX(97);

		te2.setLayoutX(168);
		te2.setLayoutY(272);
		Label lore = new Label("�H���}�X"+"            ~           "+ "���˳ƩιD��");
		title.setStyle("-fx-background-color: lightgray;"
				  +"-fx-font-weight: bold;"
			      +"-fx-border-color: black;"
				  +"-fx-border-width: 0.5mm;");
		title.setTextFill(Color.FLORALWHITE);
		title.setFont(new Font(25));
		title.setLayoutX(117);
		title.setLayoutY(20);
		lore.setTextFill(Color.BLACK);
		lore.setStyle("-fx-background-color: lightgray;");
		lore.setFont(new Font(20));
		lore.setLayoutX(10);
		lore.setLayoutY(250);
		Button one = new Button("�@��");
		Button ten = new Button("�Q��");
		
		one.setOnAction(e->{
			if(player.getMoney()<1000) {
				if(!ap.getChildren().contains(warning)) {
					ap.getChildren().add(warning);
				}
				warning.setVisible(true);
				return;
			}else {
				if(ap.getChildren().contains(warning)) {
					ap.getChildren().remove(warning);
				}
				player.setMoney(player.getMoney()-1000);
			}
			Label title2 = new Label("���߱z���H�U���~:");
			title2.setLayoutX(10);
			title2.setLayoutY(10);
			title2.setFont(new Font(23));
			Label tip = new Label("(�I������)");
			tip.setLayoutX(110);
			tip.setLayoutY(150);
			tip.setFont(new Font(18));
			AnchorPane a = new AnchorPane();
			
			temp.add(choose(0));
			
			a.getChildren().add(tip);
			a.setLayoutX(450);
			a.setLayoutY(125);
			a.setStyle("-fx-background-color: lightgray;"
					  +"-fx-border-color: darkgray;"
					  +"-fx-border-width: 1mm;");
			a.setPrefSize(300, 200);
			for(int i = 0 ; i < temp.size() ; i ++) {
				Label ll = setLabel(temp.get(i));
				ll.setPrefSize(64, 64);
				ll.setLayoutX(120+(i)*50);
				ll.setLayoutY(60+(i%2)*50);
				ll.setStyle("-fx-border-color: black;"
					    +"-fx-border-width: 0.2mm;");
				a.getChildren().add(ll);
				player.getProps().add(temp.get(i));
			}
			a.getChildren().add(title2);
			ap.getChildren().add(a);
			if(!ap.getChildren().contains(warning)) {
				ap.getChildren().add(warning);
			}
			temp.clear();
			updata();
			a.setOnMouseClicked(new EventHandler<Event>(){

				@Override
				public void handle(Event arg0) {
					
					GUI.manuBarUpdata(GUI.getPane2());
					GUI.manuBarUpdata(GUI.getCombatPane());
					ap.getChildren().remove(a);
				}
			});
		});
		
		ten.setOnAction(e->{
			if(player.getMoney()<10000) {
				if(!ap.getChildren().contains(warning)) {
					ap.getChildren().add(warning);
				}
				warning.setVisible(true);
				return;
			}else {
				if(ap.getChildren().contains(warning)) {
					ap.getChildren().remove(warning);
				}
				player.setMoney(player.getMoney()-10000);
			}
			Label title2 = new Label("���߱z���H�U���~:");
			title2.setLayoutX(10);
			title2.setLayoutY(10);
			title2.setFont(new Font(25));
			Label tip = new Label("(�I������)");
			tip.setLayoutX(250);
			tip.setLayoutY(250);
			tip.setFont(new Font(18));
			AnchorPane a = new AnchorPane();
			for(int i = 0 ; i < 10 ; i ++) {
				temp.add(choose(0));
			}
			a.getChildren().add(tip);
			a.setLayoutX(250);
			a.setLayoutY(85);
			a.setStyle("-fx-background-color: lightgray;"
					  +"-fx-border-color: darkgray;"
					  +"-fx-border-width: 1mm;");
			a.setPrefSize(600, 300);
			int index = 0;
			int j =0;
			for(int i = 0 ; i < temp.size() ; i ++) {
				if(index==5) {
					index =0;
					j=1;
				}
				Label ll = setLabel(temp.get(i));
				ll.setPrefSize(64, 64);
				ll.setLayoutX(75+(index++)*95);
				ll.setLayoutY(75+(j)*80);
				ll.setStyle("-fx-border-color: black;"
						    +"-fx-border-width: 0.2mm;");
				a.getChildren().add(ll);
				System.out.println("name: " + temp.get(i).getName() + " amount: " + temp.get(i).getAmount());
				player.getProps().add(temp.get(i));//1235+90+60 1046+10+40
			}
			a.getChildren().add(title2);
//			amountUpdate(player);
			ap.getChildren().addAll(a);
			if(!ap.getChildren().contains(warning)) {
				ap.getChildren().add(warning);
			}
			temp.clear();
			updata();

			a.setOnMouseClicked(new EventHandler<Event>(){

				@Override
				public void handle(Event arg0) {
					GUI.manuBarUpdata(GUI.getPane2());
					GUI.manuBarUpdata(GUI.getCombatPane());
					ap.getChildren().remove(a);
				}
			});
		});
		budget.setLayoutX(65);
		budget.setLayoutY(300);
		budget.setPrefSize(100, 50);
		budget2.setLayoutX(210);
		budget2.setLayoutY(300);
		budget2.setPrefSize(100, 50);
		one.setLayoutX(50);
		one.setLayoutY(350);
		one.setPrefSize(100, 50);
		ten.setLayoutX(200);
		ten.setLayoutY(350);
		ten.setPrefSize(100, 50);
		AnchorPane nmp = new AnchorPane();
		ImageView iv = new ImageView();
		
		Image i = new Image("Images/���q�h.png");
		iv.setImage(i);
		iv.setLayoutX(70);
		iv.setLayoutY(30);
		nmp.setStyle("-fx-border-color: darkgray;"
				    +"-fx-border-width: 1mm;"
					+"-fx-background-color: tan;");
		nmp.setPrefSize(350, 450);
		nmp.setLayoutX(20);
		nmp.setLayoutY(25);		
		nmp.getChildren().addAll(title,lore,te1,te2,one,ten,budget,budget2,iv);
		ap.getChildren().add(nmp);
		
	}
	public void rare() {// �}�� �v�� 
		Label warning = new Label("�������]���ۤ���!!!");
		warning.setVisible(false);
		warning.setStyle("-fx-background-color: lightgray;"
				 	    +"-fx-border-color: darkgray;"
						+"-fx-border-width: 1mm;"
				 	    +"-fx-font-size: 20px;"
						+"-fx-font-weight: bold;");
		warning.setPrefSize(400, 200);
		warning.setAlignment(Pos.CENTER);
		warning.setLayoutX(400);
		warning.setLayoutY(150);
		warning.setOnMouseClicked(e->{
			warning.setVisible(false);
		});
		Label budget = new Label("�ݪ�O\n 100 ���]����");
		budget.setTextAlignment(TextAlignment.CENTER);
		budget.setTextFill(Color.MEDIUMBLUE);
		Label budget2 = new Label("�ݪ�O\n 1000 ���]����");
		budget2.setTextAlignment(TextAlignment.CENTER);
		budget2.setTextFill(Color.MEDIUMBLUE);
		Label title = new Label("�}���_��");
		Text te1 = new Text("�}��");
		Text te2 = new Text("�v��");
		te1.setStyle("-fx-font-weight: bold");
		te2.setStyle("-fx-font-weight: bold");
		te1.setFill(Color.BLUE);
		te1.setFont(new Font(23));
		te2.setFill(Color.MEDIUMPURPLE);
		te2.setFont(new Font(22));
		te1.setLayoutY(272);
		te1.setLayoutX(97);

		te2.setLayoutX(168);
		te2.setLayoutY(272);
		Label lore = new Label("�H���}�X"+"            ~           "+ "���˳ƩιD��");
		title.setStyle("-fx-background-color: lightgray;"
					  +"-fx-font-weight: bold;"
				      +"-fx-border-color: black;"
					  +"-fx-border-width: 0.5mm;");
		title.setTextFill(Color.BLUE);
		title.setFont(new Font(25));
		title.setLayoutX(117);
		title.setLayoutY(20);
		lore.setTextFill(Color.BLACK);
		lore.setStyle("-fx-background-color: lightgray;");
		lore.setFont(new Font(20));
		lore.setLayoutX(10);
		lore.setLayoutY(250);
		Button one = new Button("�@��");
		Button ten = new Button("�Q��");
		budget.setLayoutX(60);
		budget.setLayoutY(300);
		budget.setPrefSize(100, 50);
		budget2.setLayoutX(205);
		budget2.setLayoutY(300);
		budget2.setPrefSize(100, 50);
		one.setLayoutX(50);
		one.setLayoutY(350);
		one.setPrefSize(100, 50);
		ten.setLayoutX(200);
		ten.setLayoutY(350);
		ten.setPrefSize(100, 50);
		one.setOnAction(e->{
			if(player.getDiamond()<100) {
				if(!ap.getChildren().contains(warning)) {
					ap.getChildren().add(warning);
				}
				warning.setVisible(true);
				return;
			}else {
				if(ap.getChildren().contains(warning)) {
					ap.getChildren().remove(warning);
				}
				player.setDiamond(player.getDiamond()-100);
			}
			Label title2 = new Label("���߱z���H�U���~:");
			title2.setLayoutX(10);
			title2.setLayoutY(10);
			title2.setFont(new Font(23));
			Label tip = new Label("(�I������)");
			tip.setLayoutX(110);
			tip.setLayoutY(150);
			tip.setFont(new Font(18));
			AnchorPane a = new AnchorPane();
			
			temp.add(choose(1));
			
			a.getChildren().add(tip);
			a.setLayoutX(450);
			a.setLayoutY(125);
			a.setStyle("-fx-background-color: lightgray;"
					  +"-fx-border-color: darkgray;"
					  +"-fx-border-width: 1mm;");
			a.setPrefSize(300, 200);
			for(int i = 0 ; i < temp.size() ; i ++) {
				Label ll = setLabel(temp.get(i));
				ll.setPrefSize(64, 64);
				ll.setLayoutX(120+(i)*50);
				ll.setLayoutY(60+(i%2)*50);
				ll.setStyle("-fx-border-color: black;"
					    +"-fx-border-width: 0.2mm;");
				a.getChildren().add(ll);
				player.getProps().add(temp.get(i));
			}
			a.getChildren().add(title2);
			ap.getChildren().add(a);
			if(!ap.getChildren().contains(warning)) {
				ap.getChildren().add(warning);
			}
			temp.clear();
			updata();
			
			a.setOnMouseClicked(new EventHandler<Event>(){

				@Override
				public void handle(Event arg0) {
					GUI.manuBarUpdata(GUI.getPane2());
					GUI.manuBarUpdata(GUI.getCombatPane());
					ap.getChildren().remove(a);
				}
			});
		});
		
		ten.setOnAction(e->{
			if(player.getDiamond()<1000) {
				if(!ap.getChildren().contains(warning)) {
					ap.getChildren().add(warning);
				}
				warning.setVisible(true);
				return;
			}else {
				if(ap.getChildren().contains(warning)) {
					ap.getChildren().remove(warning);
				}
				player.setDiamond(player.getDiamond()-1000);
			}
			Label title2 = new Label("���߱z���H�U���~:");
			title2.setLayoutX(10);
			title2.setLayoutY(10);
			title2.setFont(new Font(25));
			Label tip = new Label("(�I������)");
			tip.setLayoutX(250);
			tip.setLayoutY(250);
			tip.setFont(new Font(18));
			AnchorPane a = new AnchorPane();
			for(int i = 0 ; i < 10 ; i ++) {
				temp.add(choose(1));
			}
			a.getChildren().add(tip);
			a.setLayoutX(250);
			a.setLayoutY(85);
			a.setStyle("-fx-background-color: lightgray;"
					  +"-fx-border-color: darkgray;"
					  +"-fx-border-width: 1mm;");
			a.setPrefSize(600, 300);
			int index = 0;
			int j =0;
			for(int i = 0 ; i < temp.size() ; i ++) {
				if(index==5) {
					index =0;
					j=1;
				}
				Label ll = setLabel(temp.get(i));
				ll.setPrefSize(64, 64);
				ll.setLayoutX(75+(index++)*95);
				ll.setLayoutY(75+(j)*80);
				ll.setStyle("-fx-border-color: black;"
						    +"-fx-border-width: 0.2mm;");
				a.getChildren().add(ll);
				System.out.println("name: " + temp.get(i).getName() + " amount: " + temp.get(i).getAmount());
				player.getProps().add(temp.get(i));//1235+90+60 1046+10+40
			}
//			amountUpdate(player);
			ap.getChildren().add(a);
			if(!ap.getChildren().contains(warning)) {
				ap.getChildren().add(warning);
			}
			temp.clear();
			updata();

			a.setOnMouseClicked(new EventHandler<Event>(){

				@Override
				public void handle(Event arg0) {
					GUI.manuBarUpdata(GUI.getPane2());
					GUI.manuBarUpdata(GUI.getCombatPane());
					ap.getChildren().remove(a);
				}
			});
		});
		AnchorPane nmp = new AnchorPane();
		ImageView iv = new ImageView();
		Image i = new Image("Images/�����h.png");
		iv.setImage(i);
		iv.setLayoutX(70);
		iv.setLayoutY(30);
		nmp.setStyle("-fx-border-color: darkgray;"
				    +"-fx-border-width: 1mm;"
					+"-fx-background-color: tan;");
		
		nmp.setPrefSize(350, 450);
		nmp.setLayoutX(390);
		nmp.setLayoutY(25);
		nmp.getChildren().addAll(title,lore,te1,te2,one,ten,budget,budget2,iv);
		ap.getChildren().add(nmp);
	}
	public void legend() {//�ǻ� ����
		Label warning = new Label("�������]���ۤ���!!!");
		warning.setVisible(false);
		warning.setStyle("-fx-background-color: lightgray;"
				 	    +"-fx-border-color: darkgray;"
						+"-fx-border-width: 1mm;"
				 	    +"-fx-font-size: 20px;"
						+"-fx-font-weight: bold;");
		warning.setPrefSize(400, 200);
		warning.setAlignment(Pos.CENTER);
		warning.setLayoutX(400);
		warning.setLayoutY(150);
		warning.setOnMouseClicked(e->{
			warning.setVisible(false);
		});
		Label budget = new Label("�ݪ�O\n 1000 ���]����");
		budget.setTextAlignment(TextAlignment.CENTER);
		budget.setTextFill(Color.MEDIUMBLUE);
		Label budget2 = new Label("�ݪ�O\n 10000 ���]����");
		budget2.setTextAlignment(TextAlignment.CENTER);
		budget2.setTextFill(Color.MEDIUMBLUE);
		Label title = new Label("�]���_��");
		Text te1 = new Text("�ǻ�");
		Text te2 = new Text("����");
		te1.setStyle("-fx-font-weight: bold");
		te2.setStyle("-fx-font-weight: bold");
		te1.setFill(Color.ORANGE);
		te1.setFont(new Font(23));
		te2.setFill(Color.BLACK);
		te2.setFont(new Font(22));
		te1.setLayoutY(272);
		te1.setLayoutX(97);

		te2.setLayoutX(168);
		te2.setLayoutY(272);
		Label lore = new Label("�H���}�X"+"            ~           "+ "���˳ƩιD��");
		title.setStyle("-fx-background-color: lightgray;"
				  +"-fx-font-weight: bold;"
			      +"-fx-border-color: black;"
				  +"-fx-border-width: 0.5mm;");
		title.setTextFill(Color.ORANGE);
		title.setFont(new Font(25));
		title.setLayoutX(117);
		title.setLayoutY(20);
		lore.setTextFill(Color.BLACK);
		lore.setStyle("-fx-background-color: lightgray;");
		lore.setFont(new Font(20));
		lore.setLayoutX(10);
		lore.setLayoutY(250);
		Button one = new Button("�@��");
		Button ten = new Button("�Q��");
		one.setOnAction(e->{
			if(player.getDiamond()<1000) {
				if(!ap.getChildren().contains(warning)) {
					ap.getChildren().add(warning);
				}
				warning.setVisible(true);
				return;
			}else {
				if(ap.getChildren().contains(warning)) {
					ap.getChildren().remove(warning);
				}
				player.setDiamond(player.getDiamond()-1000);
			}
			Label title2 = new Label("���߱z���H�U���~:");
			title2.setLayoutX(10);
			title2.setLayoutY(10);
			title2.setFont(new Font(23));
			Label tip = new Label("(�I������)");
			tip.setLayoutX(110);
			tip.setLayoutY(150);
			tip.setFont(new Font(18));
			AnchorPane a = new AnchorPane();
			
			temp.add(choose(2));
			
			a.getChildren().add(tip);
			a.setLayoutX(450);
			a.setLayoutY(125);
			a.setStyle("-fx-background-color: lightgray;"
					  +"-fx-border-color: darkgray;"
					  +"-fx-border-width: 1mm;");
			a.setPrefSize(300, 200);
			for(int i = 0 ; i < temp.size() ; i ++) {
				Label ll = setLabel(temp.get(i));
				ll.setPrefSize(64, 64);
				ll.setLayoutX(120+(i)*50);
				ll.setLayoutY(60+(i%2)*50);
				ll.setStyle("-fx-border-color: black;"
					    +"-fx-border-width: 0.2mm;");
				a.getChildren().add(ll);
				player.getProps().add(temp.get(i));
			}
			a.getChildren().add(title2);
			ap.getChildren().add(a);
			if(!ap.getChildren().contains(warning)) {
				ap.getChildren().add(warning);
			}
			temp.clear();
			updata();
			
			a.setOnMouseClicked(new EventHandler<Event>(){

				@Override
				public void handle(Event arg0) {
					GUI.manuBarUpdata(GUI.getPane2());
					GUI.manuBarUpdata(GUI.getCombatPane());
					ap.getChildren().remove(a);
				}
			});
		});
		
		ten.setOnAction(e->{
			if(player.getDiamond()<10000) {
				if(!ap.getChildren().contains(warning)) {
					ap.getChildren().add(warning);
				}
				warning.setVisible(true);
				return;
			}else {
				if(ap.getChildren().contains(warning)) {
					ap.getChildren().remove(warning);
				}
				player.setDiamond(player.getDiamond()-10000);
			}
			Label title2 = new Label("���߱z���H�U���~:");
			title2.setLayoutX(10);
			title2.setLayoutY(10);
			title2.setFont(new Font(25));
			Label tip = new Label("(�I������)");
			tip.setLayoutX(250);
			tip.setLayoutY(250);
			tip.setFont(new Font(18));
			AnchorPane a = new AnchorPane();
			for(int i = 0 ; i < 10 ; i ++) {
				temp.add(choose(2));
			}
			a.getChildren().add(tip);
			a.setLayoutX(250);
			a.setLayoutY(85);
			a.setStyle("-fx-background-color: lightgray;"
					  +"-fx-border-color: darkgray;"
					  +"-fx-border-width: 1mm;");
			a.setPrefSize(600, 300);
			int index = 0;
			int j =0;
			for(int i = 0 ; i < temp.size() ; i ++) {
				if(index==5) {
					index =0;
					j=1;
				}
				Label ll = setLabel(temp.get(i));
				ll.setPrefSize(64, 64);
				ll.setLayoutX(75+(index++)*95);
				ll.setLayoutY(75+(j)*80);
				ll.setStyle("-fx-border-color: black;"
						    +"-fx-border-width: 0.2mm;");
				a.getChildren().add(ll);
				System.out.println("name: " + temp.get(i).getName() + " amount: " + temp.get(i).getAmount());
				player.getProps().add(temp.get(i));//1235+90+60 1046+10+40
			}
//			amountUpdate(player);
			ap.getChildren().add(a);
			temp.clear();
			updata();

			a.setOnMouseClicked(new EventHandler<Event>(){

				@Override
				public void handle(Event arg0) {
					GUI.manuBarUpdata(GUI.getPane2());
					GUI.manuBarUpdata(GUI.getCombatPane());
					ap.getChildren().remove(a);
				}
			});
			
		});
		budget.setLayoutX(55);
		budget.setLayoutY(300);
		budget.setPrefSize(100, 50);
		budget2.setLayoutX(205);
		budget2.setLayoutY(300);
		budget2.setPrefSize(100, 50);
		one.setLayoutX(50);
		one.setLayoutY(350);
		one.setPrefSize(100, 50);
		ten.setLayoutX(200);
		ten.setLayoutY(350);
		ten.setPrefSize(100, 50);
		AnchorPane nmp = new AnchorPane();
		ImageView iv = new ImageView();
		Image i = new Image("Images/�����h.png");
	
		iv.setImage(i);
		iv.setLayoutX(70);
		iv.setLayoutY(30);
		nmp.setStyle("-fx-border-color: darkgray;"
				    +"-fx-border-width: 1mm;"
					+"-fx-background-color: tan;");
		nmp.setPrefSize(350, 450);
		nmp.setLayoutX(760);
		nmp.setLayoutY(25);
		nmp.getChildren().addAll(title,lore,te1,te2,one,ten,budget,budget2,iv);
		ap.getChildren().add(nmp);
	}
	public Objects choose(int code) {//0=���q 1=���� 2=����
		if(code<0||code>2) {
			System.err.println("�{���X���~!�����^����");
			return null;
		}
		int times = 0;
		while(true) {
			if(times>=5) {
				if(code==0) {
					Objects temp = new SkillsBook2(player);
					temp.setAmount(1);
					return temp;
				}else if(code==1){
					Objects temp = new SkillsBook4(player);
					temp.setAmount(1);
					return temp;
				}else {
					Objects temp = new SkillsBook6(player);
					temp.setAmount(1);
					return temp;
				}
			}
			double num = Math.random()*100;
			if(code==0) {
				double[] list = {1.0,2.0,7.0,12.0,22.0,32.0,46.0,60.0,80.0,100.0};
					for(int i = 0 ; i < list.length ; i++) {
						if(i==0&&list[i]>=num) {
							Objects temp = new SkillsBook(player);
							temp.setAmount(1);
							return temp;
						}else if(i==1&&list[i]>=num) {
							Objects temp = new SkillsBook2(player);
							temp.setAmount(1);
							return temp;	
						}else if(i==2&&list[i]>=num) {
							Objects temp = new Weapons0001(player);//1055 926 1056 11684 11677
							temp.setAmount(1);
							return temp;	
						}else if(i==3&&list[i]>=num) {
							Objects temp = new Weapons0003(player);
							temp.setAmount(1);
							return temp;	
						}else if(i==4&&list[i]>=num) {
							Objects temp = new healer2(player);//1055 926 1056 11684 11677
							temp.setAmount(10);
							return temp;	
						}else if(i==5&&list[i]>=num) {
							Objects temp = new mpHealer2(player);
							temp.setAmount(10);
							return temp;	
						}else if(i==6&&list[i]>=num) {
							Objects temp = new Weapons0002(player);//1055 926 1056 11684 11677
							temp.setAmount(1);
							return temp;	
						}else if(i==7&&list[i]>=num) {
							Objects temp = new Weapons0004(player);
							temp.setAmount(1);
							return temp;	
						}else if(i==8&&list[i]>=num) {
							Objects temp = new magicStone(player);//1055 926 1056 11684 11677
							temp.setAmount(10);
							return temp;	
						}else if(i==9&&list[i]>=num) {
							Objects temp = new magicStone(player);
							temp.setAmount(1);
							return temp;	
						}
					}
			}else if(code==1){
				double[] list = {1.0,2.0,7.0,12.0,22.0,32.0,46.0,60.0,80.0,100.0};
				for(int i = 0 ; i < list.length ; i++) {
					if(i==0&&list[i]>=num) {
						Objects temp = new SkillsBook3(player);
						temp.setAmount(1);
						return temp;
					}else if(i==1&&list[i]>=num) {
						Objects temp = new SkillsBook4(player);
						temp.setAmount(1);
						return temp;	
					}else if(i==2&&list[i]>=num) {
						Objects temp = new Weapons0006(player);//1055 926 1056 11684 11677
						temp.setAmount(1);
						return temp;	
					}else if(i==3&&list[i]>=num) {
						Objects temp = new Weapons0008(player);
						temp.setAmount(1);
						return temp;	
					}else if(i==4&&list[i]>=num) {
						Objects temp = new healer3(player);//1055 926 1056 11684 11677
						temp.setAmount(10);
						return temp;	
					}else if(i==5&&list[i]>=num) {
						Objects temp = new mpHealer3(player);
						temp.setAmount(10);
						return temp;	
					}else if(i==6&&list[i]>=num) {
						Objects temp = new Weapons0005(player);//1055 926 1056 11684 11677
						temp.setAmount(1);
						return temp;	
					}else if(i==7&&list[i]>=num) {
						Objects temp = new Weapons0007(player);
						temp.setAmount(1);
						return temp;	
					}else if(i==8&&list[i]>=num) {
						Objects temp = new magicStone(player);//1055 926 1056 11684 11677
						temp.setAmount(100);
						return temp;	
					}else if(i==9&&list[i]>=num) {
						Objects temp = new magicStone(player);
						temp.setAmount(10);
						return temp;	
					}
				}
			}else {
				double[] list = {1.0,2.0,3.0,6.0,11.0,21.0,31.0,45.0,59.0,79.0,100.0};
				for(int i = 0 ; i < list.length ; i++) {
					if(i==0&&list[i]>=num) {
						Objects temp = new SkillsBook5(player);
						temp.setAmount(1);
						return temp;
					}else if(i==1&&list[i]>=num) {
						Objects temp = new SkillsBook6(player);
						temp.setAmount(1);
						return temp;	
					}else if(i==2&&list[i]>=num) {
						Objects temp = new SkillsBook7(player);
						temp.setAmount(1);
						return temp;	
					}else if(i==3&&list[i]>=num) {
						Objects temp = new Weapons0010(player);//1055 926 1056 11684 11677
						temp.setAmount(1);
						return temp;	
					}else if(i==4&&list[i]>=num) {
						Objects temp = new Weapons0012(player);
						temp.setAmount(1);
						return temp;	
					}else if(i==5&&list[i]>=num) {
						Objects temp = new healer10(player);//1055 926 1056 11684 11677
						temp.setAmount(10);
						return temp;	
					}else if(i==6&&list[i]>=num) {
						Objects temp = new mpHealer10(player);
						temp.setAmount(10);
						return temp;	
					}else if(i==7&&list[i]>=num) {
						Objects temp = new Weapons0009(player);//1055 926 1056 11684 11677
						temp.setAmount(1);
						return temp;	
					}else if(i==8&&list[i]>=num) {
						Objects temp = new Weapons0011(player);
						temp.setAmount(1);
						return temp;	
					}else if(i==9&&list[i]>=num) {
						Objects temp = new magicStone(player);//1055 926 1056 11684 11677
						temp.setAmount(1000);
						return temp;	
					}else if(i==10&&list[i]>=num) {
						Objects temp = new magicStone(player);
						temp.setAmount(100);
						return temp;	
					}
				}	
			}
			times++;
		}
	}
	public Label setLabel(Objects ob) {
		Label output = new Label();
		output.setBackground(ob.getImage());
		System.err.println(ob.getID() + ob.getName());
		if(ob.getID()>=10000) {		
				Label l1 = new Label(ob.getName());
				Label l2 = new Label(ob.getNote());
				Label quality = new Label(ob.getQuality());
				if(quality.getText().equals("�ʦH")){
					quality.setTextFill(Color.GRAY);
				}else if(quality.getText().equals("���q")) {
					quality.setTextFill(Color.WHITE);
				}else if(quality.getText().equals("�}�n")) {
					quality.setTextFill(Color.GREEN);
				}else if(quality.getText().equals("�}��")) {
					quality.setTextFill(Color.BLUE);
				}else if(quality.getText().equals("�v��")) {
					quality.setTextFill(Color.MEDIUMPURPLE);
				}else if(quality.getText().equals("�ǻ�")) {
					quality.setTextFill(Color.ORANGE);
				}else if(quality.getText().equals("����")) {
					quality.setTextFill(Color.CADETBLUE);
				}
				l1.setTextFill(quality.getTextFill());
				quality.setFont(new Font(13));
				Label Type = new Label("");
				
				if(ob.getWearType().equals("WEAPON")) {
					Type.setText("�˳�����: �Z��");
				}else if(ob.getWearType().equals("HELMET")){
					Type.setText("�˳�����: �Y��");
				}else if(ob.getWearType().equals("ARMOR")){
					Type.setText("�˳�����: ��A");
				}else if(ob.getWearType().equals("PANTS")){
					Type.setText("�˳�����: �Ǥl");
				}else if(ob.getWearType().equals("SHOES")){
					Type.setText("�˳�����: �c�l");
				}
				Label attack = new Label("�����O: " + ob.getAttack());
				Label magicAttack = new Label("�]�k�����O: " + ob.getMagicAttack());
				Label armor = new Label("���m�O: " + ob.getArmor());
				Label LevelAqu = new Label("���ŭn�D: " + ob.getLevelAqu());
				Label INTAqu = new Label("���z�n�D: "+ ob.getINTAqu()+" ");
				Label STRAqu = new Label("�O�q�n�D: "+ ob.getSTRAqu()+" ");
				Label AGIAqu = new Label("�ӱ��n�D: "+ ob.getAGIAqu()+" ");
				Label LUKAqu = new Label("���B�n�D: "+ ob.getLUKAqu()+" ");
				Label note = new Label("(�k���I���˳Ʋ�U)");//�˳��椤
				Label note2 = new Label("(�ݩʩε��ť��F�˳ƻݨD)");

				attack.setFont(new Font(13));
				magicAttack.setFont(new Font(13));
				armor.setFont(new Font(13));
				//�[�J����
				Type.setFont(new Font(13));
				note.setFont(new Font(13));
				note.setTextFill(Color.LIGHTGREEN);
				note2.setFont(new Font(13));
				note2.setTextFill(Color.RED);
				
				if(ob.getStrength()>0) {
					l1.setText(ob.getName() +" +"+ ob.getStrength());
				}
				
				//l1.setTextFill(Color.LIGHTGREEN);
				l2.setTextFill(Color.DARKGRAY);
				l1.setFont(new Font(17));
				l2.setFont(new Font(14));
				
				Label statusBonus = new Label();
				
				
				statusBonus.setText( "�ͩR +" + ob.getHealthPlus() + " �]�O +" + ob.getManaPlus()+"\n"
									+"�O�q +" + ob.getSTR() + " ���z +" + ob.getINT()+"\n"
									+"�ӱ� +" + ob.getAGI() + " ���B +" + ob.getLUK()+"\n"
									+"�R�� +" + ob.getHit() +" �{�� +" + ob.getEscape() +"\n"
									+"���� +" +ob.getBoom() +" �ɶ� +" + (int)(ob.getBoomAttackRate()*100) + "%" + "\n");
	
				statusBonus.setTextFill(Color.LIGHTBLUE);
				statusBonus.setFont(new Font(13));
				LevelAqu.setFont(new Font(13));
				INTAqu.setFont(new Font(13));
				STRAqu.setFont(new Font(13));
				AGIAqu.setFont(new Font(13));
				LUKAqu.setFont(new Font(13));
				Players player = GUI.getPlayer();
				if(player!=null) {
					if(player.getLevel()<ob.getLevelAqu()) {
						LevelAqu.setTextFill(Color.RED);
					}if(player.getAGI()<ob.getAGIAqu()) {
						AGIAqu.setTextFill(Color.RED);
					}if(player.getSTR()<ob.getSTRAqu()) {
						STRAqu.setTextFill(Color.RED);
					}if(player.getINT()<ob.getINTAqu()) {
						INTAqu.setTextFill(Color.RED);
					}if(player.getLUK()<ob.getLUKAqu()) {
						LUKAqu.setTextFill(Color.RED);
					}if(LevelAqu.getTextFill().equals(Color.RED)||STRAqu.getTextFill().equals(Color.RED)||AGIAqu.getTextFill().equals(Color.RED)||LUKAqu.getTextFill().equals(Color.RED)||INTAqu.getTextFill().equals(Color.RED)) {
						 note2.setVisible(true);
					}else {
						 note2.setVisible(false);
					}
				}
				
				VBox v = new VBox();
				HBox h = new HBox();
				HBox h2 = new HBox();
				h.getChildren().addAll(STRAqu,INTAqu);
				h2.getChildren().addAll(LUKAqu,AGIAqu);
				if(ob.getAttack()>0&&ob.getMagicAttack()==0&&ob.getArmor()==0) {
					v.getChildren().addAll(l1,quality,attack,Type,LevelAqu,h,h2,statusBonus,l2,note,note2);
				}else if(ob.getMagicAttack()>0&&ob.getAttack()==0&&ob.getArmor()==0) {
					v.getChildren().addAll(l1,quality,magicAttack,Type,LevelAqu,h,h2,statusBonus,l2,note,note2);	
				}else {
					v.getChildren().addAll(l1,quality,armor,Type,LevelAqu,h,h2,statusBonus,l2,note,note2);
				}
				Tooltip tt = new Tooltip();
				tt.setMaxSize(400, 400);
				tt.setWrapText(true);
				tt.setGraphic(v);
				tt.showDelayProperty().set(new Duration(250));
				
				
				output.setTooltip(tt);
				
		}else {
			Label l1 = new Label(ob.getName() + " x"+ob.getAmount());
			Label l2 = new Label(ob.getNote());
			Label quality = new Label(ob.getQuality());
			quality.setFont(new Font(13));
			l1.setFont(new Font(15));
			l2.setFont(new Font(14));
			if(quality.getText().equals("�ʦH")){
				quality.setTextFill(Color.GRAY);
			}else if(quality.getText().equals("���q")) {
				quality.setTextFill(Color.WHITE);
			}else if(quality.getText().equals("�}�n")) {
				quality.setTextFill(Color.GREEN);
			}else if(quality.getText().equals("�}��")) {
				quality.setTextFill(Color.BLUE);
			}else if(quality.getText().equals("�v��")) {
				quality.setTextFill(Color.MEDIUMPURPLE);
			}else if(quality.getText().equals("�ǻ�")) {
				quality.setTextFill(Color.ORANGE);
			}else if(quality.getText().equals("����")) {
				quality.setTextFill(Color.CADETBLUE);
			}
			l1.setTextFill(quality.getTextFill());
			quality.setFont(new Font(13));
			VBox v = new VBox();
			Tooltip tt = new Tooltip();
			v.getChildren().addAll(l1,quality,l2);
			tt.setMaxSize(400, 400);
			tt.setWrapText(true);
			tt.setGraphic(v);
			tt.showDelayProperty().set(new Duration(250));
			output.setTooltip(tt);
		}
		return output;
	}
	public void amountUpdate(Players player) {
		player.getProps().sort(new propsSort());
		boolean flag = false;
		for(int i = 0 ; i < player.getProps().size() ; i ++) {
			flag = false;
			for(int j = i+1 ; j < player.getProps().size() ; j ++) {
				if(player.getProps().get(i).getID()<10000&&player.getProps().get(i).getID()==player.getProps().get(j).getID()) {
					flag = true;
					player.getProps().get(i).setAmount(player.getProps().get(i).getAmount()+player.getProps().get(j).getAmount());//��ۦPID�F�誺�ƶq�[�_��
					player.getProps().remove(j);	
				}
			}
			if(flag == false) {
				break;
			}
		}
		int times = player.getProps().size();
		int flag1=0;
		for(int j = 0 ; j < times&&flag1==0 ; j ++) {
			flag1=1;
			for(int i = 0 ; i < player.getProps().size() ; i ++) {
				if(player.getProps().get(i).getAmount()<=0) {
					player.getProps().remove(i);
					flag1=0;
				}
			}
		}
		int times2 = player.getProps().size();
		int flag2 = 0;
		for(int j = 0 ; j < times2&&flag2==0 ; j ++) {
			flag2 =1;
			for(int i = 0 ; i < player.getProps().size() ; i ++) {
				if(player.getProps().get(i).getID()==9999) {
					player.setDiamond(player.getDiamond()+player.getProps().get(i).getAmount());
					player.getProps().remove(i);
					flag2=0;
				}
			}
		}
		
	}
	public void updata() {
		amountUpdate(player);
		
			GUI.manuBarUpdata(GUI.getPane2());
			GUI.manuBarUpdata(GUI.getCombatPane());
	}
}
	class propsSort implements Comparator<Objects>{

		@Override
		public int compare(Objects o1, Objects o2) {
			return o1.getID() - o2.getID();
		}
		
	}

