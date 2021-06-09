package GUI;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

import com.sun.javafx.tk.Toolkit.Task;

import Datas.DataCommander;
import Datas.Datas;
import Entities.Mobs;
import Entities.Players;
import Events.BattleEvent;
import Events.DamageEvent;
import Events.DeathEvent;
import Events.GetExpEvent;
import Events.LevelChangeEvent;
import Events.SkillsDischargeEvents;
import Events.damageAndMoveDisplayEvent;
import Events.judgeWearingEvent;
import Events.setNameEvent;
import Events.statusUpdateEvent;
import Lottery.Lottery;
import Main.RPGgame;
import Objects.Objects;
import Objects.PropsPackage.*;
import Objects.WearingPackage.*;
import Skills.*;
import Skills.SkillPackage.*;
import Stores.store;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.ScheduledService;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Pagination;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.Duration;

public class GUI extends Application{
	private static Rectangle health;
	private static Rectangle mana;
	private static Background skillg;
	private static Background propg;
	private static Label healthCount;
	private static Label ManaCount;
	private static AnchorPane statusp;
	private static AnchorPane lotteryp= new AnchorPane();
	private static AnchorPane houseBuy = new AnchorPane();
	private static AnchorPane houseSell = new AnchorPane();
	private static TabPane tp;
	private static int CombatingCount;//�^�X��
	
	private static VBox drop = new VBox();
	private static AnchorPane pane2;
	private static AnchorPane combatp;
	private static MenuBar menuBar;
	private static Button statusBack;
	private static AnchorPane pagePane;
	private static AnchorPane combating;
	private static double originLabelX1;
	private static double originLabelX2;
	private static BattleEvent battle;
	private Label warning;
	private static Scene statuss;
	private TextField userName;
	private PasswordField passWord;
	private static Mobs mob;
	private static Players player;
	private Datas userData;
	private Label friend;
	private static Label enemy;
	private Scene combats;
	private Scene combatings;
	private static Label damage1;
	private static Label damage2;
	private static DataCommander data = new DataCommander();
	private static Skills Fb;
	private static Skills dfb;
	private static Skills ex;
	private static Label nameL;
	private static Label moneyL;
	private static Label diamondL;
	private static Label escapeL;
	private static Label boomL;
	private static Label boolAttackL;
	private static Label defenseL;
	private static Label hitL;
	private static Label magicDamageL;
	private static Label levelL;
	private static Label HealthL;
	private static Label MpL;
	private static Label damageL;
	private static Label expL;
	private static ImageView iv;
	
	private boolean isNamed = false;
	private static VBox skiStatus;
	private static VBox mobSkiStatus;

	private static Stage stage;
	public static void Main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		Image ima = new Image("/Images/icon.png");
		stage.getIcons().add(ima);
		stage.setOnCloseRequest(e->{
			System.out.println("�t������");
			System.exit(0);
		});
		Button back1 = new Button("");
		Button combat1 = new Button("");
		Button combat2 = new Button("");
		Button combat3 = new Button("");
		Button combat4 = new Button("");
		Button combat5 = new Button("");
		Button combat6 = new Button("");
		Button combat7 = new Button("");
		Button combat8 = new Button("");
		Button combatTest = new Button("");
		Button start = new Button("�}�l�C��");
		Button combat = new Button("");
		combat.setFont(new Font(26));
		Button status1 = new Button("�d�ݪ��A");
		Button house = new Button("");
		house.setFont(new Font(16));
		Button lottery = new Button("");
		lottery.setFont(new Font(16));
		Button exit = new Button("");
		Button attack = new Button("���q����");
		Button skills = new Button("�ϥΧޯ�");
		Button props = new Button("�ϥιD��");
		Button back2 = new Button("���}�p��");
		Button status2 = new Button("");
		status2.setFont(new Font(16));
		Button inventory = new Button("");
		inventory.setFont(new Font(16));
		Button wearings = new Button("");
		wearings.setFont(new Font(16));
		Button run = new Button("�k�]");
		
		damage1 = new Label("");
		damage2 = new Label("");
		friend = new Label();
		enemy = new Label();
		//���U���O
		if(!data.dataExist(0)) {
			System.out.println("�]���Ĥ@���ɮפ��s�b�A�ҥH�t�Φ۰ʳЫؤ@��");
			System.out.println("�b��:Admin , �K�X: Admin");
			System.out.println("****�����޲z���b��****");
			data.dataCreate("Admin","Admin");
			Players admin = new Players();
			Datas adminData = new Datas(admin);
			admin.getProps().add(new Weapons(admin));
			admin.getProps().add(new Armor(admin));
			admin.getProps().add(new Helmet(admin));
			admin.getProps().add(new Pants(admin));
			admin.getProps().add(new Shoes(admin));
			admin.getProps().add(new healer(admin));
			admin.getProps().add(new healer2(admin));
			admin.getProps().add(new mpHealer(admin));
			admin.getSkills().add(Skills.getDataSkillsCreate(admin, 0));
			admin.getSkills().add(Skills.getDataSkillsCreate(admin, 1));
			admin.getSkills().add(Skills.getDataSkillsCreate(admin, 2));
			adminData.setIndex(0);
			adminData.setUsername("Admin");
			adminData.setPassword("Admin");
			admin.setLevel(999);
			admin.setPlayer("�޲z��");
			admin.heal();
			data.dataSave(admin,adminData);
		}
		userData = new Datas(player);
		Label regUser = new Label("�b��: ");
		Label regPass = new Label("�K�X: ");
		Label regDPass = new Label("�T�{�K�X: ");
		TextField regu = new TextField();
		PasswordField regp = new PasswordField();
		PasswordField regdp = new PasswordField();
		GridPane regPane = new GridPane();
		Scene regScene = new Scene(regPane);
		Button regConfirm = new Button("���U");
		Stage regStage = new Stage();
		regStage.initOwner(stage);
		regStage.initModality(Modality.APPLICATION_MODAL);
		regStage.setTitle("���a���U");
		regStage.setHeight(500);
		regStage.setWidth(500);
		regConfirm.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				boolean isRegistered= false;
				for(int index = 0; index<=data.getDataCount() ; index ++) {
					if(data.dataChecker(regu.getText(), index)==1) {
						isRegistered =true;
					}
				}
				if(!isRegistered&&regp.getText().equals(regdp.getText())) {
					data.dataCreate("12345","12345");
					player = new Players();
					userData.setUsername(regu.getText());
					userData.setPassword(regp.getText());
					userData.setIndex(data.getDataCount());
					//data.dataIndexSave(userData);
					//System.out.println("name: " + userData.getUsername() +  "pass: " + userData.getPassword() + "index: " +userData.getIndex());
					Objects.addDataPropsCreate(player, 1, 5);
					Objects.addDataPropsCreate(player, 3, 5);
					data.dataSave(player, userData);
					System.out.println("���U���\");
					regStage.close();
				}else{
					if(isRegistered) {
					System.out.println("�b���w���H�ϥιL�A�д��@�ӱb��!");
					}else if(!regp.getText().equals(regdp.getText())) {
					System.out.println("�K�X�P�T�{�K�X�����ۦP!");
					}
				}
			}
			
		});
		Button regCancel = new Button("����");
		regPane.add(regUser, 0, 0);
		regPane.add(regPass, 0, 1);
		regPane.add(regDPass, 0, 2);
		regPane.add(regu, 1, 0);
		regPane.add(regp, 1, 1);
		regPane.add(regdp, 1, 2);
		regPane.add(regConfirm, 0, 3);
		regConfirm.setPrefWidth(50);
		regPane.setMargin(regCancel, new Insets(0,0,0,120));
		regCancel.setPrefWidth(50);
		regPane.add(regCancel, 1, 3);
		regPane.setAlignment(Pos.CENTER);
		regPane.setHgap(10);
		regPane.setVgap(10);
		regStage.setHeight(200);
		regStage.setWidth(350);
		regStage.setX(600);
		regStage.setY(300);
		regStage.setResizable(false);
		regStage.setScene(regScene);
		regCancel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				regStage.close();
			}
			
		});
		
		//�n�J���O
		GridPane entPane = new GridPane();
		Scene entScene = new Scene(entPane);
		userName = new TextField();
		passWord = new PasswordField();
		
		Button entButton = new Button("�n�J");
		Button regButton = new Button("���U");
		regButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				regStage.show();
			}
			
		});
		
		Label user = new Label("�b��: ");
		Label pass = new Label("�K�X: ");
		warning = new Label("�b���αK�X���~!");
		warning.setOpacity(0);
		user.setFont(new Font(12));
		pass.setFont(new Font(12));
		entPane.setAlignment(Pos.CENTER);
		entPane.add(user, 0, 0);
		entPane.add(pass, 0, 1);
		entPane.add(userName, 1, 0);
		entPane.add(passWord, 1, 1);
		entPane.add(entButton, 0, 2);
		entPane.add(regButton, 1, 2);
		entPane.add(warning, 0, 3);
		entPane.setHgap(-50);
		entPane.setVgap(10);		
		entPane.setMargin(regButton, new Insets(0,0,0,120));
		//�I�]���O
		AnchorPane packp = new AnchorPane();
		Scene packs = new Scene(packp);
		
		//�԰����O
		combating = new AnchorPane();
		statusp = new AnchorPane();
		statuss = new Scene(statusp);
		
		GridPane pane = new GridPane();
		Scene scene = new Scene(pane);
		pane.setAlignment(Pos.CENTER);
		//pane.getChildren().add(v3);
		
		start.setPrefWidth(200);
		start.setPrefHeight(100);
		combat.setPrefWidth(240);
		combat.setPrefHeight(210);
		exit.setPrefWidth(100);
		exit.setPrefHeight(100);
		wearings.setPrefHeight(100);
		wearings.setPrefWidth(100);
		status2.setPrefHeight(100);
		status2.setPrefWidth(100);

		lottery.setPrefHeight(100);
		lottery.setPrefWidth(100);
		inventory.setPrefHeight(100);
		inventory.setPrefWidth(100);
		house.setPrefHeight(100);
		house.setPrefWidth(100);
 		//pane.getChildren().add(start);
		stage.setX(500);
		stage.setY(300);
		stage.setWidth(400);
		stage.setHeight(200);
		stage.setTitle("�n�J�C��");
		stage.setResizable(false);

		
		
		stage.setScene(entScene);
		player = new Players();
		data.dataLoad(player,userData);
		
		player.updataPlayerStatus();

		
		System.out.println("�C���Ұʦ��\!");
		
		
		//�D�����D��

		pane2 = new AnchorPane();
		Scene starts = new Scene(pane2);
		//�D���e��
		Background mbg = backgroundCreate("/Images/�I���G.png");
		//���ǰϰ�e��
		Background cbg = backgroundCreate("/Images/�a��.png");
		//�j�Y��
		Background hg = backgroundCreate("/Images/�j�Y��.jpg");
		//�ݩʭ��O
		Background stg = backgroundCreate("/Images/�ݩʭ��O��.png");
		//�ޯ�e�����O
		skillg = backgroundCreate("/Images/�ޯ�e��.png");
		//�԰����O
		Background cbtg = backgroundCreate("/Images/�I���T.png");
		//�԰��e�����}��Ϥ�
		Background frig = backgroundCreate("/Images/�D���h.png");//�D��
		Background enig = backgroundCreate("/Images/�ߤl.png");//�Ǫ�
		//���U�P�n�J�e�����O
		//��q�M�]�O��
		Label ht = new Label("�ͩR��:");
		ht.setStyle("-fx-font-weight: bold;");
		ht.setFont(new Font(18));
		ht.setLayoutX(120);
		ht.setLayoutY(507);
		Label mt = new Label("�]�O��:");
		mt.setStyle("-fx-font-weight: bold;");
		mt.setFont(new Font(18));
		mt.setLayoutX(120);
		mt.setLayoutY(597);
		healthCount = new Label("           " + (int)player.getHealth() + " / " + (int)player.getMaxHealth());
		ManaCount = new Label("           "+ (int)player.getMana() + " / " + (int)player.getMaxMana());
		healthCount.setLayoutX(150);
		healthCount.setLayoutY(507);
		healthCount.setStyle("-fx-font-weight: bold;");
		healthCount.setAlignment(Pos.CENTER_RIGHT);
		healthCount.setFont(new Font(18));
		

		healthCount.setTextFill(Color.WHITE);
		ManaCount.setLayoutX(150);
		ManaCount.setLayoutY(597);
		ManaCount.setAlignment(Pos.CENTER_RIGHT);
		ManaCount.setStyle("-fx-font-weight: bold;");

		ManaCount.setFont(new Font(18));
		ManaCount.setTextFill(Color.WHITE);
		health = new Rectangle();
		Rectangle health2 = new Rectangle();
		Rectangle mp = new Rectangle();
		mana = new Rectangle();
		health.setStyle("-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 15, 0.0 , 0 , 1)");
		health.setLayoutX(185);
		health.setLayoutY(505);
		health2.setLayoutX(185);//�©�
		health2.setLayoutY(505);
		mp.setLayoutX(185);
		mp.setLayoutY(595);
		mana.setLayoutX(185);
		mana.setLayoutY(595);
		health.setFill(Color.RED);//����W��
		health.setWidth(180);
		health.setHeight(30);
		health2.setWidth(180);
		health2.setStrokeWidth(5);
		health2.setHeight(30);
		health2.setFill(Color.BLACK);
		health2.setStroke(Color.BLACK);
		mp.setStrokeWidth(5);
		mp.setFill(Color.BLACK);
		mana.setFill(Color.BLUE);
		mp.setWidth(180);
		mp.setHeight(30);
		mana.setWidth(180);
		mana.setHeight(30);
		mp.setStroke(Color.BLACK);
		
		mana.setSmooth(true);
		health2.setSmooth(true);
		health.setSmooth(true);
		mp.setSmooth(true);
		//�]�w����
		Button gearb = new Button("");	
		gearb.setLayoutX(1105);
		gearb.setLayoutY(550);
		gearb.setStyle("-fx-background-radius: 400mm;");
		gearb.setFont(new Font(16));
		gearb.setPrefHeight(100);
		gearb.setPrefWidth(100);

		//�t��Ū���M���}�]�w
		AnchorPane gearp = new AnchorPane();
		Button gearpExit = new Button("X");
		Button load = new Button("�n�X�C��");
		load.setPrefHeight(50);
		load.setPrefWidth(100);
		load.setLayoutX(50);
		load.setLayoutY(60);
		gearpExit.setOnAction(new EventHandler<ActionEvent>(){//�����]�w����
			
			@Override
			public void handle(ActionEvent event) {
				pane2.getChildren().remove(gearp);
				combat.setDisable(false);
				status2.setDisable(false);
				inventory.setDisable(false);
				wearings.setDisable(false);
				house.setDisable(false);
				gearb.setDisable(false);
				lottery.setDisable(false);
			}
		});
		load.setOnAction(new EventHandler<ActionEvent>(){//�n�X�C���åBŪ���}����
			
			@Override
			public void handle(ActionEvent event) {
				data.dataSave(player,userData);
				System.out.println("�C������");
				stage.close();
			}
		});
		gearp.setPrefHeight(300);
		gearp.setPrefWidth(200);
		gearp.setLayoutX(350+stage.getWidth()/2);
		gearp.setLayoutY(75+stage.getHeight()/2);
		gearp.setStyle("-fx-background-color:lightgray;"
					  +"-fx-border-color: darkgray;"
					  +"-fx-border-width: 1mm;");
		gearpExit.setLayoutX(160);
		gearpExit.setLayoutY(10);
		gearpExit.setPrefHeight(10);
		gearpExit.setPrefWidth(30);
		Button gearpThank = new Button("�s�@�H��");
//		gearpThank.setStyle(gearpExit.getStyle());
		gearpThank.setLayoutX(50);
		gearpThank.setLayoutY(150);
		gearpThank.setPrefHeight(50);
		gearpThank.setPrefWidth(100);
		Label lv = new Label("�ժ�: �{����");
		Label lv2= new Label("�խ�: �����R�A�d�R�e�A���˶{�A����{");
		Label lv3= new Label("�Ϥ����j�h�ƬҨӦۺ���");
		Label lv4= new Label("�P�©Ҧ��b�M�׻s�@�L�{���A\n���X��ĳ�M�Q�k���H");
		VBox vb = new VBox();
		vb.setStyle("-fx-background-color: lightgray;"
				   +"-fx-border-color: gray;"
				   +"-fx-border-width: 1mm;");

		vb.setPrefSize(300, 150);
		vb.setLayoutX(500);
		vb.setLayoutY(250);
		vb.getChildren().addAll(lv,lv2,lv3,lv4);
		gearpThank.setOnAction(e->{
			pane2.getChildren().add(vb);
		});
		vb.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				pane2.getChildren().remove(vb);
			}
		});
		gearp.getChildren().addAll(load,gearpExit,gearpThank);
		
		//�԰��e���]�w
		combating.setBackground(cbtg);
		
		Label test = new Label();
		test.setStyle("-fx-background-color:red;");
		test.setPrefSize(32,32);
		test.setLayoutX(150);
		test.setLayoutY(200);
		
		
		AnchorPane combatBG = new AnchorPane();
		combatBG.setPrefSize(1266, 300);
		combatBG.setLayoutX(0);
		combatBG.setLayoutY(460);
		combatBG.setStyle("-fx-background-color: gray;"
						 +"-fx-border-color: darkgray;"
						 +"-fx-border-width: 0.6mm;");
		AnchorPane combatBGhm = new AnchorPane();
		combatBGhm.setPrefSize(380, 190);
		combatBGhm.setLayoutX(65);
		combatBGhm.setLayoutY(15);
		combatBGhm.setStyle("-fx-background-color: silver;"
						 +"-fx-border-color: black;"
						 +"-fx-border-width: 0.6mm;");
		AnchorPane combatBGbt = new AnchorPane();
		combatBGbt.setPrefSize(700, 190);
		combatBGbt.setLayoutX(485);
		combatBGbt.setLayoutY(15);
		combatBGbt.setStyle("-fx-background-color: silver;"
						 +"-fx-border-color: black;"
						 +"-fx-border-width: 0.8mm;");
		combatBG.getChildren().addAll(combatBGhm,combatBGbt);
		combating.getChildren().addAll(combatBG,friend,enemy,damage1,damage2,attack,props,skills,run,health2,health,mp,mana);
		combating.getChildren().addAll(ht,mt,healthCount,ManaCount);//���}���F���n�⥦���Ӫ�ww
		skillStatus.setLabel(player);
		ArrayList<Button> combata = new ArrayList<Button>();
		combata.add(attack);
		combata.add(props);
		combata.add(skills);
		combata.add(run);
		int i=0;
		for(Button b : combata) {
			b.setStyle("-fx-background-radius: 0.8em;");
	   
			b.setFont(new Font(18)); 
			b.setPrefHeight(95);
			b.setPrefWidth(350);
			b.setStyle("-fx-border-color: black;"
					  +"-fx-border-width: 1mm;");
			if(i>=2) {
				b.setLayoutX(135+(i-1)*350);
				i++;
				b.setLayoutY(570);
			}else {
				b.setLayoutX(135+(i+1)*350);
				i++;
				b.setLayoutY(475);
			}
		}
	

		entButton.setOnAction(new EventHandler<ActionEvent>() {//�n�J�C��
			@Override
			public void handle(ActionEvent e) {
				int dataCount = data.getDataCount();
				boolean isEntered = false;//���n�J���A
				for(int i = 0 ;i <= dataCount ;i++) {
					if(data.userChecker(userName.getText(), passWord.getText(), i)){
						isEntered = true;
						userData.setIndex(i);
						System.out.println("�n�J���\!");
						break;
					}
				}
				if(isEntered) {
					
					
					
					
					
					stage.setTitle("����ڼ��]�����o�ܦ��i�̪��G��");

					player = new Players();
					data.dataLoad(player, userData);
					
					player.updataPlayerStatus();//��s��T
					setNameEvent set = new setNameEvent(player,data,isNamed,stage,starts,pane2);
					//System.out.println(player.getPlayer());�S���i�Jthread
					Thread tsetName = new Thread(set);
					if(player.getPlayer().equals("�w�]�W�r")) {
						stage.setOpacity(0);
						imageChange ic = new imageChange(player,tsetName,stage);
						//yourStage.show();
						try {
							ic.start();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}					
					
					player.updataPlayerStatus();

					//manuBarUpdata(pane2);

					for(int i = 0 ; i < player.getProps().size() ; i ++) {//��X�ʹN���Ӥ@�����|�[�Ƨ�
						amountUpdate(player);
					}
					
					
					
					status2.setLayoutX(355);
					status2.setLayoutY(550);
					status2.setStyle("-fx-background-radius: 400mm;"
							  +"-fx-background-image: url(\"Images/�H���h.png\");");
//							  +"-fx-background-color: #00000000;");
					status2.setOnMouseEntered(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							status2.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�H��2�h.png\");");
//									  +"-fx-background-color: #00000000;");
							status2.setPrefSize(status2.getPrefHeight()*1.1, status2.getPrefWidth()*1.1);
						}
					});
					status2.setOnMouseExited(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							status2.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�H���h.png\");");
//									  +"-fx-background-color: #00000000;");
							status2.setPrefSize(status2.getPrefHeight()/1.1, status2.getPrefWidth()/1.1);
						}
					});
					inventory.setLayoutX(505);
					inventory.setLayoutY(550);
					inventory.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�I�]�h.png\");");
//									  +"-fx-background-color: #00000000;");
					inventory.setOnMouseEntered(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							inventory.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�I�]2�h.png\");");
//									  +"-fx-background-color: #00000000;");
							inventory.setPrefSize(inventory.getPrefHeight()*1.1, inventory.getPrefWidth()*1.1);
						}
					});
					inventory.setOnMouseExited(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							inventory.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�I�]�h.png\");");
//									  +"-fx-background-color: #00000000;");
							inventory.setPrefSize(inventory.getPrefHeight()/1.1, inventory.getPrefWidth()/1.1);
						}
					});
					wearings.setLayoutX(655);
					wearings.setLayoutY(550);
					wearings.setStyle("-fx-background-radius: 400mm;"
									 +"-fx-background-image: url(\"Images/�˳ƥh.png\");");
//									 +"-fx-background-color: #00000000;");
					
					wearings.setOnMouseEntered(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							wearings.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�˳�2�h.png\");");
//									  +"-fx-background-color: #00000000;");
							wearings.setPrefSize(wearings.getPrefHeight()*1.1, wearings.getPrefWidth()*1.1);
						}
					});
					wearings.setOnMouseExited(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							wearings.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�˳ƥh.png\");");
//									  +"-fx-background-color: #00000000;");
							wearings.setPrefSize(wearings.getPrefHeight()/1.1, wearings.getPrefWidth()/1.1);
						}
					});
					house.setLayoutX(805);
					house.setLayoutY(550);
					house.setStyle("-fx-background-radius: 400mm;"
							 +"-fx-background-image: url(\"Images/�ӫ��h.png\");");
//							 +"-fx-background-color: #00000000;");
			
					house.setOnMouseEntered(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							house.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�ӫ�2�h.png\");");
//									  +"-fx-background-color: #00000000;");
							house.setPrefSize(house.getPrefHeight()*1.1, house.getPrefWidth()*1.1);
						}
					});
					house.setOnMouseExited(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							house.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�ӫ��h.png\");");
//									  +"-fx-background-color: #00000000;");
							house.setPrefSize(house.getPrefHeight()/1.1, house.getPrefWidth()/1.1);
						}
					});
					lottery.setLayoutX(955);
					lottery.setLayoutY(550);
					lottery.setStyle("-fx-background-radius: 400mm;"
							 +"-fx-background-image: url(\"Images/��J�h.png\");");
//							 +"-fx-background-color: #00000000;");
			
					lottery.setOnMouseEntered(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							lottery.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/��J2�h.png\");");
//									  +"-fx-background-color: #00000000;");
							lottery.setPrefSize(lottery.getPrefHeight()*1.1, lottery.getPrefWidth()*1.1);
						}
					});
					lottery.setOnMouseExited(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							lottery.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/��J�h.png\");");
//									  +"-fx-background-color: #00000000;");
							lottery.setPrefSize(lottery.getPrefHeight()/1.1, lottery.getPrefWidth()/1.1);
						}
					});
					gearb.setStyle("-fx-background-radius: 400mm;"
							 +"-fx-background-image: url(\"Images/�t�Υh.png\");");
//							 +"-fx-background-color: #00000000;");
			
					gearb.setOnMouseEntered(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							gearb.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�t��2�h.png\");");
//									  +"-fx-background-color: #00000000;");
							gearb.setPrefSize(gearb.getPrefHeight()*1.1, gearb.getPrefWidth()*1.1);
						}
					});
					gearb.setOnMouseExited(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							gearb.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�t�Υh.png\");");
//									  +"-fx-background-color: #00000000;");
							gearb.setPrefSize(gearb.getPrefHeight()/1.1, gearb.getPrefWidth()/1.1);
						}
					});
					combat.setLayoutX(20);
					combat.setLayoutY(430);
					combat.setStyle("-fx-background-radius: 400mm;"
							 +"-fx-background-image: url(\"Images/�h�԰��h.png\");"
							 +"-fx-background-color: #00000000;");
			
					combat.setOnMouseEntered(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							combat.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�h�԰�2�h.png\");"
									  +"-fx-background-color: #00000000;");
							combat.setPrefSize(combat.getPrefWidth()*1.03, combat.getPrefHeight()*1.05);
						}
					});
					combat.setOnMouseExited(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							combat.setStyle("-fx-background-radius: 400mm;"
									  +"-fx-background-image: url(\"Images/�h�԰��h.png\");"
									  +"-fx-background-color: #00000000;");
							combat.setPrefSize(combat.getPrefWidth()/1.03, combat.getPrefHeight()/1.05);
						}
					});
					pane2.setBackground(mbg);
					
					manuBarUpdata(pane2);//�ݭn�Ыؤ@�ӷs�����
					
					pane2.setLayoutX(0);
					pane2.setLayoutY(0);

					
					
					pane2.getChildren().add(gearb);
					
					

					stage.setHeight(720);
					stage.setWidth(1280);
					stage.setX(0);
					stage.setY(0);
					gearb.setOnAction(new EventHandler<ActionEvent>(){//����

					@Override
					public void handle(ActionEvent event) {
							combat.setDisable(true);
							status2.setDisable(true);
							inventory.setDisable(true);
							wearings.setDisable(true);
							house.setDisable(true);
							gearb.setDisable(true);
							lottery.setDisable(true);
							pane2.getChildren().add(gearp);//�H��n�令�u�X����
					    }		
					});
					pane2.getChildren().addAll(house,combat);
					
					stage.setScene(starts);

									
				
						//�԰��e��
							combatp= new AnchorPane();//�԰��e�����O�l
							
							player.updataPlayerStatus();
							manuBarUpdata(pane2);
							manuBarUpdata(combatp);

							
							friend.setBackground(frig);
							enemy.setBackground(enig);
							friend.setPrefHeight(400);
							friend.setPrefWidth(400);
							enemy.setPrefHeight(400);
							enemy.setPrefWidth(400);
							friend.setLayoutX(138);
							friend.setLayoutY(125);
							enemy.setLayoutX(710);
							enemy.setLayoutY(155);
							originLabelX1 = friend.getLayoutX();
							originLabelX2 = enemy.getLayoutX();
							
							combatp.getChildren().add(combat1);//�԰�LV1~10
							combatp.getChildren().add(combat2);//�԰�LV11~20
							combatp.getChildren().add(combat3);//�԰�LV21~30
							combatp.getChildren().add(combat4);//�԰�LV31~40
							combatp.getChildren().add(combat5);//�԰�LV41~50
							combatp.getChildren().add(combat6);//�԰�LV51~60
							combatp.getChildren().add(combat7);//�԰�LV61~70
							combatp.getChildren().add(combat8);//�԰�LV71~80

							combatp.getChildren().add(combatTest);//�԰����զa��
							
							combatp.setBackground(cbg);
							combatp.getChildren().addAll(back1);//�^���l

							
							back1.setLayoutX(50);
							back1.setLayoutY(475);
							back1.setPrefSize(167, 167);
							back1.setOnMouseEntered(new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent arg0) {
									back1.setBackground(backgroundCreate("Images/�Τl�h.png"));
								}
							});
							back1.setOnMouseExited(new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent arg0) {
									back1.setBackground(backgroundCreate("Images/�Τl2�h.png"));
								}
							});
							back1.setBackground(backgroundCreate("Images/�Τl2�h.png"));
							
							combat1.setPrefSize(286, 140);
							combat1.setLayoutX(150);
							combat1.setLayoutY(55);
							
							combat1.setBackground(GUI.backgroundCreate("Images/�Ĥ@�ϥh.png"));
							combat1.setOpacity(0);
							
							Label name1 = new Label("�ϰ�: �Ѻ���");
							name1.setTextFill(Color.LIGHTGREEN);
							name1.setFont(new Font(25));
							Label mob1 = new Label("�D�n�Ǫ�: �����L�B�v�ܩi�B���T\n"
												 + "�A�X����: 1 ~ 10");
							mob1.setTextFill(Color.LIGHTSEAGREEN);
							mob1.setFont(new Font(20));
							VBox v1 = new VBox(name1,mob1);
							v1.setAlignment(Pos.CENTER);
							Tooltip t1 = new Tooltip();
							t1.setShowDelay(new Duration(20));
							t1.setGraphic(v1);
							combat1.setTooltip(t1);
							
							combat1.setOnMouseEntered(new EventHandler<Event>(){
								@Override
								public void handle(Event arg0) {
									combat1.setOpacity(1);
								}
							});
							combat1.setOnMouseExited(new EventHandler<Event>(){

								@Override
								public void handle(Event arg0) {
									combat1.setOpacity(0);									
								}
								
							});
			
							combat2.setPrefSize(320, 217);
							combat2.setLayoutX(280);
							combat2.setLayoutY(60);
							combat2.setBackground(GUI.backgroundCreate("Images/�ĤG�ϥh.png"));
							combat2.setOpacity(0);

							Label name2 = new Label("�ϰ�: �⭷�C��");
							name2.setTextFill(Color.LIGHTGREEN);
							name2.setFont(new Font(25));
							Label mob2 = new Label("�D�n�Ǫ�: �⭷즡B���������L�B�p�ֳ���\n"
												 + "�A�X����: 11 ~ 20");
							mob2.setTextFill(Color.LIGHTSEAGREEN);
							mob2.setFont(new Font(20));
							VBox v2 = new VBox(name2,mob2);
							v2.setAlignment(Pos.CENTER);
							Tooltip t2 = new Tooltip();
							t2.setShowDelay(new Duration(20));
							t2.setGraphic(v2);
							combat2.setTooltip(t2);
							
							combat2.setOnMouseEntered(new EventHandler<Event>(){
								@Override
								public void handle(Event arg0) {
									combat2.setOpacity(1);
								}
							});
							combat2.setOnMouseExited(new EventHandler<Event>(){

								@Override
								public void handle(Event arg0) {
									combat2.setOpacity(0);									
								}
								
							});
							combat3.setPrefSize(320, 191);
							combat3.setLayoutX(405);
							combat3.setLayoutY(50);
							combat3.setBackground(GUI.backgroundCreate("Images/�ĤT�ϥh.png"));
							combat3.setOpacity(0);

							Label name3 = new Label("�ϰ�: �g�b�˪L");
							name3.setTextFill(Color.LIGHTGREEN);
							name3.setFont(new Font(25));
							Label mob3 = new Label("�D�n�Ǫ�: ���F����B�𧯡B�g�ɸ��G\n"
												 + "�A�X����: 21 ~ 30");
							mob3.setTextFill(Color.LIGHTSEAGREEN);
							mob3.setFont(new Font(20));
							VBox v3 = new VBox(name3,mob3);
							v3.setAlignment(Pos.CENTER);
							Tooltip t3 = new Tooltip();
							t3.setShowDelay(new Duration(20));
							t3.setGraphic(v3);
							combat3.setTooltip(t3);
							
							combat3.setOnMouseEntered(new EventHandler<Event>(){
								@Override
								public void handle(Event arg0) {
									combat3.setOpacity(1);
								}
							});
							combat3.setOnMouseExited(new EventHandler<Event>(){

								@Override
								public void handle(Event arg0) {
									combat3.setOpacity(0);									
								}
								
							});
							combat4.setPrefSize(344, 225);
							combat4.setLayoutX(565);
							combat4.setLayoutY(70);
							combat4.setBackground(GUI.backgroundCreate("Images/�ĥ|�ϥh.png"));
							combat4.setOpacity(0);

							Label name4 = new Label("�ϰ�: �j�T�ը�");
							name4.setTextFill(Color.LIGHTGREEN);
							name4.setFont(new Font(25));
							Label mob4 = new Label("�D�n�Ǫ�: ���Ͱ��B����̡B�ը��u��\n"
												 + "�A�X����: 31 ~ 40");
							mob4.setTextFill(Color.LIGHTSEAGREEN);
							mob4.setFont(new Font(20));
							VBox v4 = new VBox(name4,mob4);
							v4.setAlignment(Pos.CENTER);
							Tooltip t4 = new Tooltip();
							t4.setShowDelay(new Duration(20));
							t4.setGraphic(v4);
							combat4.setTooltip(t4);
							
							combat4.setOnMouseEntered(new EventHandler<Event>(){
								@Override
								public void handle(Event arg0) {
									combat4.setOpacity(1);
								}
							});
							combat4.setOnMouseExited(new EventHandler<Event>(){

								@Override
								public void handle(Event arg0) {
									combat4.setOpacity(0);									
								}
								
							});
							combat5.setPrefSize(255, 158);
							combat5.setLayoutX(500);
							combat5.setLayoutY(280);
							combat5.setBackground(GUI.backgroundCreate("Images/�Ĥ��ϥh.png"));
							combat5.setOpacity(0);
							
							Label name5 = new Label("�ϰ�: �L�^���W");
							name5.setTextFill(Color.LIGHTGREEN);
							name5.setFont(new Font(25));
							Label mob5 = new Label("�D�n�Ǫ�: ���s�B�B�Ť����B�L�^���\n"
												 + "�A�X����: 41 ~ 50");
							mob5.setTextFill(Color.LIGHTSEAGREEN);
							mob5.setFont(new Font(20));
							VBox v5 = new VBox(name5,mob5);
							v5.setAlignment(Pos.CENTER);
							Tooltip t5 = new Tooltip();
							t5.setShowDelay(new Duration(20));
							t5.setGraphic(v5);
							combat5.setTooltip(t5);
							
							combat5.setOnMouseEntered(new EventHandler<Event>(){
								@Override
								public void handle(Event arg0) {
									combat5.setOpacity(1);
								}
							});
							combat5.setOnMouseExited(new EventHandler<Event>() {
								@Override
								public void handle(Event arg0) {
									combat5.setOpacity(0);									
								}
							});
							combat6.setPrefSize(366, 299);
							combat6.setLayoutX(680);
							combat6.setLayoutY(225);
							combat6.setBackground(GUI.backgroundCreate("Images/�Ĥ��ϥh.png"));
							combat6.setOpacity(0);
							
							Label name6 = new Label("�ϰ�: �H�]����");
							name6.setTextFill(Color.LIGHTGREEN);
							name6.setFont(new Font(25));
							Label mob6 = new Label("�D�n�Ǫ�: �]�ڽçL�B����y�H�B�]�����~\n"
												 + "�A�X����: 51 ~ 60");
							mob6.setTextFill(Color.LIGHTSEAGREEN);
							mob6.setFont(new Font(20));
							VBox v6 = new VBox(name6,mob6);
							v6.setAlignment(Pos.CENTER);
							Tooltip t6 = new Tooltip();
							t6.setShowDelay(new Duration(20));
							t6.setGraphic(v6);
							combat6.setTooltip(t6);
							
							combat6.setOnMouseEntered(new EventHandler<Event>(){
								@Override
								public void handle(Event arg0) {
									combat6.setOpacity(1);
								}
							});
							combat6.setOnMouseExited(new EventHandler<Event>() {
								@Override
								public void handle(Event arg0) {
									combat6.setOpacity(0);									
								}
							});
							combat7.setPrefSize(289, 377);
							combat7.setLayoutX(855);
							combat7.setLayoutY(150);
							combat7.setBackground(GUI.backgroundCreate("Images/�ĤC�ϥh.png"));
							combat7.setOpacity(0);
							
							Label name7 = new Label("�ϰ�: �ݦu���s�]");
							name7.setTextFill(Color.LIGHTGREEN);
							name7.setFont(new Font(25));
							Label mob7 = new Label("�D�n�Ǫ�: �]�����s�B�]�ڶ����B�]�����~\n"
												 + "�A�X����: 61 ~ 70");
							mob7.setTextFill(Color.LIGHTSEAGREEN);
							mob7.setFont(new Font(20));
							VBox v7 = new VBox(name7,mob7);
							v7.setAlignment(Pos.CENTER);
							Tooltip t7 = new Tooltip();
							t7.setShowDelay(new Duration(20));
							t7.setGraphic(v7);
							combat7.setTooltip(t7);
							
							combat7.setOnMouseEntered(new EventHandler<Event>(){
								@Override
								public void handle(Event arg0) {
									combat7.setOpacity(1);
								}
							});
							combat7.setOnMouseExited(new EventHandler<Event>() {
								@Override
								public void handle(Event arg0) {
									combat7.setOpacity(0);									
								}
							});
							combat8.setPrefSize(467, 218);
							combat8.setLayoutX(695);
							combat8.setLayoutY(420);
							combat8.setBackground(GUI.backgroundCreate("Images/�ĤK�ϥh.png"));
							combat8.setOpacity(0);
							
							Label name8 = new Label("�ϰ�: �]���`�B");
							name8.setTextFill(Color.LIGHTGREEN);
							name8.setFont(new Font(25));
							Label mob8 = new Label("�D�n�Ǫ�: ???\n"
												 + "�A�X����: 71 ~ 80");
							mob8.setTextFill(Color.LIGHTSEAGREEN);
							mob8.setFont(new Font(20));
							VBox v8 = new VBox(name8,mob8);
							v8.setAlignment(Pos.CENTER);
							Tooltip t8 = new Tooltip();
							t8.setShowDelay(new Duration(20));
							t8.setGraphic(v8);
							combat8.setTooltip(t8);
							
							combat8.setOnMouseEntered(new EventHandler<Event>(){
								@Override
								public void handle(Event arg0) {
									combat8.setOpacity(1);
								}
							});
							combat8.setOnMouseExited(new EventHandler<Event>() {
								@Override
								public void handle(Event arg0) {
									combat8.setOpacity(0);									
								}
							});
							
							

							combatTest.setPrefSize(100, 100);
							combatTest.setLayoutX(400);
							combatTest.setLayoutY(500);
//							combat8.setBackground(GUI.backgroundCreate("Images/�ĤK�ϥh.png"));
//							combat8.setOpacity(0);
							
							Label name9 = new Label("�ϰ�: �ɪŲ`�W");
							name9.setTextFill(Color.LIGHTGREEN);
							name9.setFont(new Font(25));
							Label mob9 = new Label("�D�n�Ǫ�: ???\n"
												 + "�A�X����: 80�H�W");
							mob9.setTextFill(Color.LIGHTSEAGREEN);
							mob9.setFont(new Font(20));
							VBox v9 = new VBox(name9,mob9);
							v9.setAlignment(Pos.CENTER);
							Tooltip t9 = new Tooltip();
							t9.setShowDelay(new Duration(20));
							t9.setGraphic(v9);
							combatTest.setTooltip(t9);
							combatTest.setStyle("-fx-background-radius: 40mm;"
									  		   +"-fx-border-radius: 40mm;"
											   +"-fx-background-image: url(\"/Images/�ɪŲ`�W.png\");");
							
//							combat8.setOnMouseEntered(new EventHandler<Event>(){
//								@Override
//								public void handle(Event arg0) {
//									combat8.setOpacity(1);
//								}
//							});
//							combat8.setOnMouseExited(new EventHandler<Event>() {
//								@Override
//								public void handle(Event arg0) {
//									combat8.setOpacity(0);									
//								}
//							});
							
							combats = new Scene(combatp);
							combatings = new Scene(combating);
							Tab houseExit = new Tab("���}�ӫ�");
							houseExit.setClosable(false);
							tp = new TabPane();
							tp.setPrefHeight(500);
							tp.setPrefWidth(1100);
							tp.setLayoutX(50);
							tp.setLayoutY(100);
							tp.setStyle("-fx-background-color: lightgray;"
										   +"-fx-border-color: gray;"
										   +"-fx-border-width: 1mm;");//�ӫ�
							
							
							houseExit.setOnSelectionChanged(new EventHandler<Event>() {
								@Override
								public void handle(Event e) {
									combat.setDisable(false);
									status2.setDisable(false);
									inventory.setDisable(false);
									wearings.setDisable(false);
									house.setDisable(false);
									gearb.setDisable(false);
									lottery.setDisable(false);
									pane2.getChildren().remove(tp);
									tp.getTabs().clear();
								}
							});
								
							house.setOnAction(new EventHandler<ActionEvent>() {
								@Override
								public void handle(ActionEvent evnet) {
									combat.setDisable(true);
									status2.setDisable(true);
									inventory.setDisable(true);
									wearings.setDisable(true);
									house.setDisable(true);
									gearb.setDisable(true);
									lottery.setDisable(true);
									store buy = new store(houseBuy);
									buy.toBuy();
									store sell = new store(houseSell);
									sell.toSell();
									Tab tbuy = new Tab();
									tbuy.setOnSelectionChanged(new EventHandler<Event>() {

										@Override
										public void handle(Event e) {
											buy.toBuy();
										}
									});									
									tbuy.setText("   �ʶR   ");
									tbuy.setClosable(false);
									Tab tsell = new Tab();
									tsell.setText("   �c��   ");
									tsell.setClosable(false);
									tsell.setOnSelectionChanged(new EventHandler<Event>() {

										@Override
										public void handle(Event e) {
											sell.toSell();
										}
									});
									
									tp.getTabs().addAll(tbuy,tsell,houseExit);
									tbuy.setContent(houseBuy);
									tsell.setContent(houseSell);
									pane2.getChildren().add(tp);
								}
							});
							
							Button lotteryExit = new Button("X");
							lotteryExit.setLayoutX(1120);
							lotteryExit.setLayoutY(10);
							lotteryp.setStyle("-fx-background-color: gray;");//���
							lotteryExit.setOnAction(new EventHandler<ActionEvent>(){
								@Override
								public void handle(ActionEvent event) {
									if(pane2.getChildren().contains(lotteryp)) {
										pane2.getChildren().remove(lotteryp);
										GUI.manuBarUpdata(GUI.getPane2());
										GUI.manuBarUpdata(GUI.getCombatPane());
										combat.setDisable(false);
										status2.setDisable(false);
										inventory.setDisable(false);
										wearings.setDisable(false);
										house.setDisable(false);
										gearb.setDisable(false);
										lottery.setDisable(false);
									}
								}
							});
							lotteryp.getChildren().add(lotteryExit);
							lotteryp.setPrefSize(1100, 500);
							lotteryp.setStyle("-fx-border-width: 1mm;"
											 +"-fx-border-color: gray;"
									         +"-fx-background-color: lightgray;");
							lotteryp.setLayoutX(50);
							lotteryp.setLayoutY(100);
							
							lottery.setOnAction(new EventHandler<ActionEvent>(){								
								@Override
								public void handle(ActionEvent event) {
									combat.setDisable(true);
									status2.setDisable(true);
									inventory.setDisable(true);
									wearings.setDisable(true);
									house.setDisable(true);
									gearb.setDisable(true);
									lottery.setDisable(true);
									Lottery lo = new Lottery(lotteryp);
									lotteryp.getChildren().clear();
									lotteryp.getChildren().add(lotteryExit);
									lo.normal();
									lo.rare();
									lo.legend();
									pane2.getChildren().add(lotteryp);
									
								}
							});
							combat.setOnAction(new EventHandler<ActionEvent>(){//�԰��ϰ�(�ǰe�I)

								@Override
								public void handle(ActionEvent event) {
									if(player.getLevel()<80) {
										combatTest.setVisible(false);
										combatTest.setDisable(true);
									}else {
										combatTest.setVisible(true);
										combatTest.setDisable(false);
									}
									player.updataPlayerStatus();
									GUI.manuBarUpdata(GUI.getPane2());
									GUI.manuBarUpdata(GUI.getCombatPane());
									
									stage.setScene(combats);

									combat1.setOnAction(new EventHandler<ActionEvent>() {//�i�J1-10���ϰ�԰�					
										@Override
										public void handle(ActionEvent arg0) {
											battle = new BattleEvent(1,1,health,combating, damage1,damage2,friend,enemy,userData,stage,combats,player,combata);	
										    Thread tbattle = new Thread(battle);
										    stage.setScene(combatings);
										    tbattle.start();
										
										}
										
									});
									combat2.setOnAction(new EventHandler<ActionEvent>() {//�i�J11-20���ϰ�԰�					
										@Override
										public void handle(ActionEvent arg0) {
											battle = new BattleEvent(2,2,health,combating,damage1,damage2,friend,enemy,userData,stage,combats,player,combata);	
										    Thread tbattle = new Thread(battle);
										    stage.setScene(combatings);
										    tbattle.start();
										
										}
										
									});
									combat3.setOnAction(new EventHandler<ActionEvent>() {//�i�J21-30���ϰ�԰�					
										@Override
										public void handle(ActionEvent arg0) {
											battle = new BattleEvent(3,3,health,combating,damage1,damage2,friend,enemy,userData,stage,combats,player,combata);	
										    Thread tbattle = new Thread(battle);
										    stage.setScene(combatings);
										    tbattle.start();
										
										}
										
									});
									combat4.setOnAction(new EventHandler<ActionEvent>() {//�i�J21-30���ϰ�԰�					
										@Override
										public void handle(ActionEvent arg0) {
											battle = new BattleEvent(4,4,health,combating,damage1,damage2,friend,enemy,userData,stage,combats,player,combata);	
										    Thread tbattle = new Thread(battle);
										    stage.setScene(combatings);
										    tbattle.start();
										
										}
										
									});
									combat5.setOnAction(new EventHandler<ActionEvent>() {//�i�J21-30���ϰ�԰�					
										@Override
										public void handle(ActionEvent arg0) {
											battle = new BattleEvent(5,5,health,combating,damage1,damage2,friend,enemy,userData,stage,combats,player,combata);	
										    Thread tbattle = new Thread(battle);
										    stage.setScene(combatings);
										    tbattle.start();
										
										}
										
									});
									combat6.setOnAction(new EventHandler<ActionEvent>() {//�i�J21-30���ϰ�԰�					
										@Override
										public void handle(ActionEvent arg0) {
											battle = new BattleEvent(6,6,health,combating,damage1,damage2,friend,enemy,userData,stage,combats,player,combata);	
										    Thread tbattle = new Thread(battle);
										    stage.setScene(combatings);
										    tbattle.start();
										
										}
										
									});
									combat7.setOnAction(new EventHandler<ActionEvent>() {//�i�J21-30���ϰ�԰�					
										@Override
										public void handle(ActionEvent arg0) {
											battle = new BattleEvent(7,7,health,combating,damage1,damage2,friend,enemy,userData,stage,combats,player,combata);	
										    Thread tbattle = new Thread(battle);
										    stage.setScene(combatings);
										    tbattle.start();
										
										}
										
									});
									combat8.setOnAction(new EventHandler<ActionEvent>() {//�i�J21-30���ϰ�԰�					
										@Override
										public void handle(ActionEvent arg0) {
											battle = new BattleEvent(8,8,health,combating,damage1,damage2,friend,enemy,userData,stage,combats,player,combata);	
										    Thread tbattle = new Thread(battle);
										    stage.setScene(combatings);
										    tbattle.start();
										
										}
										
									});
									combatTest.setOnAction(new EventHandler<ActionEvent>() {//�i�J���հϰ�԰�					
										@Override
										public void handle(ActionEvent arg0) {
											battle = new BattleEvent(9,9,health,combating,damage1,damage2,friend,enemy,userData,stage,combats,player,combata);	
										    Thread tbattle = new Thread(battle);
										    stage.setScene(combatings);
										    tbattle.start();
										
										}
										
									});
									back1.setOnAction(new EventHandler<ActionEvent>() {
										
										@Override
										public void handle(ActionEvent arg0) {
											manuBarUpdata(pane2);
											manuBarUpdata(combatp);
											stage.setScene(starts);
										}
									});
								}
							});
							iv = new ImageView();

							iv.setLayoutX(800);
							iv.setLayoutY(80);
							iv.setImage(new Image("/Images/oldman.png"));
							VBox vb2 = new VBox();
							
							Label quest1 = new Label("��: �]���۬O����?");
							Label answer1 = new Label("��: �]���۬O�j���W�D�`�öQ�����Y�A\n�q�`�i�H�q(����)�Ǫ����W��o�A"
													+ "�άO�q�ӫ������o�A\n�D�n�γ~����J�άO�q�ӫ��ʶR�õ}���~�C");
							Label quest2 = new Label("\n��: ������˳Ƥ����?");
							Label answer2 = new Label("��: �b�ϥθ˳ƫe�A\n�Х��ˬd�ۨ����ݩʩM���Ŧ��S���W�L�˳ƭn�D�A"
													+ "\n�ݩʫh�O�h�u�H���v���O���ɡA\n�C�ɤ@���|��o���I�ݩ��I�A\n"
													+ "�Цn�n�Q�ΨåB�t�W�A���ݩ��I�C");
							Label quest3 = new Label("\n��: �̤j���ŬO�X���O?");
							Label answer3 = new Label("��: ��h�W�@���u��80~90�������]����N�����F\n�A"
													+ "��M�Y�O�Q�~���٬O�i�H��\n"
													+ "�̤j���ŬO�S���W������~(�p�G�A���Ťj�췸��N�t��O��)");
							Label quest4 = new Label("\n��: �˳ƭn�����?");
							Label answer4 = new Label("��: �u�n��Ԩ�A���˳���N�i�H��W�o~\n"
													  +"���O�]�o�����ݩʩM���Ť~��A�˳ƤW�g�o�ܲM����~");
							Label quest5 = new Label("\n��: ������ޯ�ѥΤF�S����?");
							Label answer5 = new Label("��: �]���A�w�g�֦��o�ӧޯ�F~\n"
													  +"�p�G���h���ޯ�ѡA�N�u����ө��o~");
							Label exitL = new Label("(�I������)");
							exitL.setFont(new Font(25));
							vb2.getChildren().addAll(quest1,answer1,quest2,answer2,quest3,answer3,quest4,answer4,quest5,answer5,exitL);
							Button q1 = new Button("�V�����ба��D");
							Button q2 = new Button("�V�v¡�k����ë�AHPMP��_����(�ݪ�O100����)");
							Label l1 = new Label("�ͩR�M��q���w�g�O�����F!!\n(�I������)");
							l1.setPrefSize(300,200);
							l1.setLayoutY(200);
							l1.setLayoutX(500);

							l1.setStyle("-fx-background-color:lightgray;"
									   +"-fx-border-color:gray;"
									   +"-fx-border-width: 1mm;"
									   +"-fx-font-size: 20px;"
									   +"-fx-font-weight: bold;");
							l1.setVisible(false);
							l1.setOnMouseClicked(new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent arg0) {
									l1.setVisible(false);
								}
							});
							Label l2 = new Label("��������!!\n(�I������)");
							l2.setPrefSize(300,200);
							l2.setLayoutY(200);
							l2.setLayoutX(500);

							l2.setStyle("-fx-background-color:lightgray;"
									   +"-fx-border-color:gray;"
									   +"-fx-border-width: 1mm;"
									   +"-fx-font-size: 20px;"
									   +"-fx-font-weight: bold;");
							l2.setVisible(false);
							l2.setOnMouseClicked(new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent arg0) {
									l2.setVisible(false);
								}
							});
							q1.setStyle("-fx-background-color:lightgray;"
									   +"-fx-border-color:gray;"
									   +"-fx-border-width: 1mm;"
									   +"-fx-font-size: 20px;"
									   +"-fx-font-weight: bold;");
							q2.setStyle("-fx-background-color:lightgray;"
									   +"-fx-border-color:gray;"
									   +"-fx-border-width: 1mm;"
									   +"-fx-font-size: 20px;"
									   +"-fx-font-weight: bold;");
							q2.setOnAction(new EventHandler<ActionEvent>(){

								@Override
								public void handle(ActionEvent arg0) {
									if(player.getHealth()==player.getMaxHealth()&&player.getMana()==player.getMaxMana()) {
										l1.setVisible(true);
										return;
									}else {
										if(player.getMoney()>=100) {
											player.setHealth(player.getMaxHealth());
											player.setMana(player.getMaxMana());
											player.setMoney(player.getMoney()-100);
											manuBarUpdata(pane2);
											manuBarUpdata(combatp);
											return;
										}else {
											l2.setVisible(true);
											return;
										}
									}
								}
								
							});
							q1.setOnAction(new EventHandler<ActionEvent>() {
								@Override
								public void handle(ActionEvent arg0) {
									vb2.setVisible(true);
								}
								
							});
							vb2.setLayoutX(450);
							vb2.setLayoutY(100);
							vb2.setPadding(new Insets(5));
							vb2.setStyle("-fx-background-color: lightgray;"
									   +"-fx-border-color: gray;"
									   +"-fx-border-width: 1mm;");
							vb2.setOnMouseClicked(new EventHandler<MouseEvent>() {

								@Override
								public void handle(MouseEvent arg0) {
									vb2.setVisible(false);
								}
								
							});
							vb2.setVisible(false);
							q1.setLayoutX(510);
							q1.setLayoutY(250);
							q2.setLayoutX(350);
							q2.setLayoutY(350);
							pane2.getChildren().addAll(iv,q1,q2,vb2,l1,l2,back2,status2,inventory,wearings,lottery);
							

							
							statusBack = new Button("X");
							statusBack.prefHeight(10);
							statusBack.prefWidth(10);
							statusBack.setLayoutX(1210);
							statusBack.setLayoutY(10);
							statusBack.setOnAction(new EventHandler<ActionEvent>(){//��^�p��
									
								@Override
								public void handle(ActionEvent event) {
									manuBarUpdata(pane2);
									manuBarUpdata(combatp);
									stage.setScene(starts);
								}
							});
							statusp.setBackground(stg);
							ArrayList<Label> status = new ArrayList<>();
							
			
							nameL = new Label("���a:    " + player.getPlayer());
							Label fsym = new Label("�ݩ��`��");
							fsym.setFont(new Font(35));
							fsym.setTextFill(Color.BLUE);
							fsym.setStyle("-fx-background-color: darkgray;");
							levelL = new Label("����:    " + player.getLevel()); 
							HealthL= new Label("��q:    " + (int)player.getHealth() + " / " + (int)player.getMaxHealth());
							MpL = new Label("�]�O:    " + (int)player.getMana() + " / " + (int)player.getMaxMana());
							defenseL = new Label("���m�O:    " + player.getArmor());
							damageL = new Label("���z�����O:    " + (int)player.getDamage());
							magicDamageL = new Label("�]�k�����O:    " + (int)player.getMagicDamage());
							hitL = new Label("�R���v:    " + player.getHit() + " %");
							boomL = new Label("�����v:    " + player.getBoom() + " %");
							boolAttackL = new Label("�����ˮ`:    " + (int)(player.getBoomAttackRate()*100) + " %");
							escapeL = new Label("�{�ײv:    " + player.getEscape() + " %");
							moneyL = new Label("����:    " + player.getMoney() + " ��");
							diamondL = new Label("�]����:    " + player.getDiamond() +  " ��");
							expL = new Label("�g���:    " + (int)player.getExp() + " / " + (int)player.getMaxExp());
							Label headp = new Label();
							status.add(fsym);
							status.add(nameL);
							status.add(levelL);
							status.add(HealthL);
							status.add(MpL);
							status.add(defenseL);
							status.add(damageL);
							status.add(magicDamageL);
							status.add(hitL);
							status.add(boomL);
							status.add(boolAttackL);
							status.add(escapeL);
							status.add(moneyL);
							status.add(diamondL);
							status.add(expL);
						

							headp.setBackground(hg);
							statusp.getChildren().add(headp);
							statusp.getChildren().addAll(fsym,levelL,nameL,HealthL,MpL,defenseL,damageL,magicDamageL,hitL,boomL,boolAttackL,escapeL,moneyL,diamondL,expL,statusBack);//�⦨���[�i�h
							
							headp.setPrefSize(500, 500);
							headp.setLayoutX(51);
							headp.setLayoutY(47);
							int x = 0;
							for(Label lab: status) 
							{
								lab.setTextFill(Color.AQUA);
								lab.setLayoutY(100+35*x++);
								lab.setLayoutX(350);
								lab.setFont(new Font(19));
								if(lab.equals(nameL)) {
									lab.setLayoutX(61);

									lab.setLayoutY(300);
									lab.setFont(new Font(28));
								}
								if(lab.equals(fsym)) {
									lab.setTextFill(Color.ALICEBLUE);
									lab.setFont(new Font(35));
									lab.setLayoutX(350);
									lab.setLayoutY(90);
								}
								
							}
					
							statusUpdateEvent sue = new statusUpdateEvent();

							
									back2.setOnAction(new EventHandler<ActionEvent>() {//���}�p��
										
										@Override
										public void handle(ActionEvent arg0) {
											
											player.updataPlayerStatus();
											statusPaneUpdata();											
											player.getWearing();
											manuBarUpdata(pane2);
											manuBarUpdata(combatp);

											stage.setScene(starts);
										}
										
									});

									status2.setOnAction(new EventHandler<ActionEvent>() {//�ݩʭ��O
										@Override
										public void handle(ActionEvent arg0) {
											sue.statusUpdata();

											player.updataPlayerStatus();
											statusPaneUpdata();
											//sue.setOnPane();
											
											if(!statusp.getChildren().contains(statusBack)) {
												statusp.getChildren().add(statusBack);
											}
											statusPaneUpdata();
											stage.setScene(statuss);
											System.out.println("hi");
										}
									});
									inventory.setOnAction(new EventHandler<ActionEvent>() {//�I�]���O
										@Override
										public void handle(ActionEvent arg0) {
											player.updataPlayerStatus();
											Pagination page = new Pagination();
											packUpdata(page);
											if(!packp.getChildren().isEmpty()) {
												packp.getChildren().clear();
											}
											packp.getChildren().add(page);
											if(!packp.getChildren().contains(statusBack)) {
												packp.getChildren().add(statusBack);
											}
											stage.setScene(packs);
										}
									});
									wearings.setOnAction(new EventHandler<ActionEvent>() {//�˳ƭ��O
										@Override
										public void handle(ActionEvent arg0) {
											player.updataPlayerStatus();
											AnchorPane wearingp = new AnchorPane();
											judgeWearingEvent jwe = new judgeWearingEvent(player,wearingp);
											
											
											jwe.wearingOnUpdata(player,wearingp);
											
											
											
											jwe.wearingsUpdata();
											jwe.createAreaOfWearings(wearingp);		

											if(!wearingp.getChildren().contains(statusBack)) {
												wearingp.getChildren().add(statusBack);
											}
											wearingp.setBackground(backgroundCreate("/Images/�˳���.png"));
											stage.setScene(new Scene(wearingp));
										}
									});
							
				}else {
					warning.setOpacity(100);
				}
			}
		});
		stage.show();
}
public static Button getStatusBack() {
	return statusBack;
}
public static void recover(Stage stage,Scene scene) {//�]�m�^�_
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
			stage.setScene(scene);
			}
		});
	}	
public static void move1(Label l,double moveDistance) {//�԰��e���]�m����
	 
				l.setLayoutX(138 + moveDistance);//���a
//				friend.setLayoutX(138);
//				friend.setLayoutY(125);
//				enemy.setLayoutX(810);
//				enemy.setLayoutY(300);
	 
	}	
public static void move2(Label l,double moveDistance) {//�԰��e���]�m����
				l.setLayoutX(710 +moveDistance);//�Ǫ�

	}	
public static void HPMPLoaderUpdata(Players player) {
		health.setWidth(((double)player.getHealth()/(double)player.getMaxHealth())*180);
		mana.setWidth(((double)player.getMana()/(double)player.getMaxMana())*180);
	}
public static void HPMPUpdate(Players player) {
		Platform.runLater(new Runnable() {
		
			@Override
			public void run() {
				GUI.getHealthCount().setText("           "+ player.getHealth()+ " / " + player.getMaxHealth());
				GUI.getManaCount().setText("           " + player.getMana()+ " / " + player.getMaxMana());
		}
		});
	}
public static void afterCombatNote(Players player,Mobs mob) {
		
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
 
				Label Level = new Label("�z��o " + (int)mob.getExp() + " �I�g���!! \n\n" +"�ثe����: " + player.getLevel() + "\n�ثe�g��Ȭ� " + (int)(player.getExp())+ " / " + (int)player.getMaxExp());
				//Level.setLayoutY(50);
				Level.setFont(new Font(14));
				Level.setAlignment(Pos.CENTER);
				Level.setTextAlignment(TextAlignment.CENTER);
				Level.setPadding(new Insets(10));
				
				Label Health = new Label("\n�z��o " + mob.getMoney() + " ��!! �ثe�A�֦� " + (player.getMoney()+mob.getMoney()) + " ��!");
				player.setMoney(mob.getMoney()+player.getMoney());//�o�����
				Health.setAlignment(Pos.CENTER);

				Health.setTextAlignment(TextAlignment.CENTER);
				//Health.setLayoutY(150);
				Health.setFont(new Font(14));
				Health.setPadding(new Insets(10));

				Label Health2 = new Label("\n***���߱z��o " + mob.getDiamond() + " �]����!! �ثe�A�֦� " + (player.getDiamond()+mob.getDiamond()) + " ��!***");
				player.setDiamond(mob.getDiamond()+player.getDiamond());//�o�����
				Health2.setAlignment(Pos.CENTER);
				//Health.setLayoutY(150);
				Health2.setTextFill(Color.LIGHTSALMON);
				Health2.setFont(new Font(14));
				Health2.setPadding(new Insets(10));
					
				
				Label l4 = new Label("\n(�ƹ��I������)");
				l4.setFont(new Font(14));
				l4.setPadding(new Insets(10));

				drop.setAlignment(Pos.TOP_CENTER);
				
				VBox levelvb = new VBox();
				
				if(mob.getDiamond()>0) {
					levelvb.getChildren().addAll(Level,Health,drop,Health2,l4);
					levelvb.setAlignment(Pos.TOP_CENTER);
				}else {
					levelvb.getChildren().addAll(Level,Health,drop,l4);
					levelvb.setAlignment(Pos.TOP_CENTER);
				}
				
				AnchorPane ap = new AnchorPane(levelvb);
				levelvb.setStyle("-fx-background-color: lightgray;"
						        +"-fx-border-color: gray;"
								+"-fx-border-width: 1mm;");
				ap.setLayoutX(450);
				ap.setLayoutY(200);
//				ap.setPrefSize(500, 500);
				combatp.getChildren().addAll(ap);
				ap.setOnMouseEntered(e->{
					levelvb.setStyle("-fx-background-color: antiquewhite;"
					        +"-fx-border-color: gray;"
							+"-fx-border-width: 1mm;");
				});
				ap.setOnMouseExited(e->{
					levelvb.setStyle("-fx-background-color: lightgray;"
					        +"-fx-border-color: gray;"
							+"-fx-border-width: 1mm;");
				});
				ap.setOnMouseClicked(e->{
					GUI.getCombatPane().getChildren().remove(ap);
				});
				
			}
		});
	}
public static void afterCombatDeadNote(Players player,Mobs mob) {
		
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				Label Level = new Label("�z�Q " + mob.getName() + " ����L�k�����F!!");
				Level.setFont(new Font(14));
				Level.setAlignment(Pos.CENTER);
				Level.setPadding(new Insets(10));
				Label Level2 = new Label("�÷l�� " + (int)(player.getMaxExp()*0.05) + " �I�g��");
				Level2.setFont(new Font(14));
				Level2.setAlignment(Pos.CENTER);
				Level2.setPadding(new Insets(10));
				Label Level3 = new Label("�ثe�g��Ȭ� " + (int)(player.getExp())+ " / " + (int)player.getMaxExp());
				Level3.setFont(new Font(14));
				Level3.setAlignment(Pos.CENTER);
				Level3.setPadding(new Insets(10));
				Label Health = new Label("\nĵ�i!!�Աѫ��q�N�ѤU10%���k!! ");
				Health.setAlignment(Pos.CENTER);
				Health.setTextFill(Color.RED);
 				Health.setFont(new Font(14));
				Health.setPadding(new Insets(10));
  
				
				
				Label l4 = new Label("\n(�ƹ��I������)");
				l4.setFont(new Font(14));
				l4.setPadding(new Insets(10));

				
				VBox levelvb = new VBox();
				
					levelvb.getChildren().addAll(Level,Level2,Level3,Health,l4);
					levelvb.setAlignment(Pos.TOP_CENTER);
				
				
				AnchorPane ap = new AnchorPane(levelvb);
				levelvb.setStyle("-fx-background-color: lightgray;"
						        +"-fx-border-color: gray;"
								+"-fx-border-width: 1mm;");
				ap.setLayoutX(450);
				ap.setLayoutY(200);
//				ap.setPrefSize(500, 500);

				combatp.getChildren().addAll(ap);
				ap.setOnMouseEntered(e->{
					levelvb.setStyle("-fx-background-color: antiquewhite;"
					        +"-fx-border-color: gray;"
							+"-fx-border-width: 1mm;");
				});
				ap.setOnMouseExited(e->{
					levelvb.setStyle("-fx-background-color: lightgray;"
					        +"-fx-border-color: gray;"
							+"-fx-border-width: 1mm;");
				});
				ap.setOnMouseClicked(e->{
					GUI.getCombatPane().getChildren().remove(ap);
				});
				
				
			}
		});
	}
public static void LevelUpNote(Players player) {
		Platform.runLater(new Runnable() {
		
			@Override
			public void run() {
				Label Level = new Label("���ߧA�ɯŤF!!,�z�ثe�� " + player.getLevel() + " ��!!");
				
				//Level.setLayoutY(50);
				Level.setFont(new Font(14));
				Level.setAlignment(Pos.CENTER);
				Level.setPadding(new Insets(10));
				
				Label Health = new Label("��q�w�����^�_�A�ثe��q�� " + (int)player.getHealth() + " / " + (int)player.getMaxHealth());
				Health.setAlignment(Pos.CENTER);
				//Health.setLayoutY(150);
				Health.setFont(new Font(14));
				Health.setPadding(new Insets(10));
				
				Label Mana = new Label("�]�O�w�����^�_�A�ثe�]�O�� " + player.getMana() + " / " + player.getMaxMana());
				Mana.setAlignment(Pos.CENTER);
				//Mana.setLayoutY(250);
				Mana.setPadding(new Insets(10));
				Mana.setFont(new Font(14));
				
				
				String returnSkill = checkIfSkillAdd(player);
				Label skill = new Label("�ޯ� " + player.getMana() + " / " + player.getMaxMana());
				skill.setAlignment(Pos.CENTER);
				//Mana.setLayoutY(250);
				skill.setPadding(new Insets(10));
				skill.setFont(new Font(14));
				
				Label l4 = new Label("\n(�ƹ��I������)");
				l4.setFont(new Font(14));
				l4.setPadding(new Insets(10));

				drop.setAlignment(Pos.TOP_CENTER);
				
				VBox levelvb = new VBox();
				
				
				if(!returnSkill.equals("�L")) {
					skill.setTextFill(Color.BLUEVIOLET);
					skill.setText("������o�ޯ�:  " + returnSkill);
					levelvb.getChildren().addAll(Level,Health,Mana,skill,l4);
					levelvb.setAlignment(Pos.TOP_CENTER);

				}else {
					levelvb.getChildren().addAll(Level,Health,Mana,l4);
					levelvb.setAlignment(Pos.TOP_CENTER);

				}
				
				
				AnchorPane ap = new AnchorPane(levelvb);
				levelvb.setStyle("-fx-background-color: lightgray;"
						        +"-fx-border-color: gray;"
								+"-fx-border-width: 1mm;");
				ap.setLayoutX(450);
				ap.setLayoutY(200);
//				ap.setPrefSize(500, 500);

				combatp.getChildren().addAll(ap);
				ap.setOnMouseEntered(e->{
					levelvb.setStyle("-fx-background-color: antiquewhite;"
					        +"-fx-border-color: gray;"
							+"-fx-border-width: 1mm;");
				});
				ap.setOnMouseExited(e->{
					levelvb.setStyle("-fx-background-color: lightgray;"
					        +"-fx-border-color: gray;"
							+"-fx-border-width: 1mm;");
				});
				ap.setOnMouseClicked(e->{
					GUI.getCombatPane().getChildren().remove(ap);
				});
				
				
			}
		});
	}
public static void LevelDownNote(Players player) {
		Platform.runLater(new Runnable() {
		
			@Override
			public void run() {
				Label Level = new Label("�A���ŤF!!,�z�ثe�� " + player.getLevel() + " ��!!");
				//Level.setLayoutY(50);
				Level.setFont(new Font(14));
				Level.setAlignment(Pos.CENTER);
				Level.setPadding(new Insets(10));
				
				Label Health = new Label("��q�w�����^�_�A�ثe��q�� " + (int)player.getHealth() + " / " + (int)player.getMaxHealth());
				Health.setAlignment(Pos.CENTER);
				//Health.setLayoutY(150);
				Health.setFont(new Font(14));
				Health.setPadding(new Insets(10));
				
				Label Mana = new Label("�]�O�w�����^�_�A�ثe�]�O�� " + player.getMana() + " / " + player.getMaxMana());
				Mana.setAlignment(Pos.CENTER);
				//Mana.setLayoutY(250);
				Mana.setPadding(new Insets(10));
				Mana.setFont(new Font(14));
				VBox levelvb = new VBox();
				levelvb.getChildren().addAll(Level,Health,Mana);
				AnchorPane ap = new AnchorPane(levelvb);
				levelvb.setAlignment(Pos.TOP_CENTER);
				levelvb.setStyle("-fx-background-color: lightgray;"
						        +"-fx-border-color: gray;"
								+"-fx-border-width: 1mm;");
				ap.setLayoutX(450);
				ap.setLayoutY(200);
//				ap.setPrefSize(500, 500);

				combatp.getChildren().addAll(ap);
				ap.setOnMouseEntered(e->{
					levelvb.setStyle("-fx-background-color: antiquewhite;"
					        +"-fx-border-color: gray;"
							+"-fx-border-width: 1mm;");
				});
				ap.setOnMouseExited(e->{
					levelvb.setStyle("-fx-background-color: lightgray;"
					        +"-fx-border-color: gray;"
							+"-fx-border-width: 1mm;");
				});
				ap.setOnMouseClicked(e->{
					GUI.getCombatPane().getChildren().remove(ap);
				});
			}
		});
	}
public static void setName(Players player,DataCommander data,boolean isNamed,Stage stage,Scene scene) {//�]�m�W��
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				stage.setOpacity(1);

				TextField snt = new TextField();
				snt.setLayoutX(100);
				snt.setLayoutY(200);
				Label snL2 = new Label("���Ӧn�W�r�a~");
				Label snL = new Label("�W�r :");
				snL2.setLayoutX(50);
				snL2.setLayoutY(150);
				snL2.setFont(new Font(16));
				snL.setLayoutX(50);
				snL.setLayoutY(200);
				snL.setFont(new Font(14));
				
				stage.setX(0);
				stage.setY(0);
				Button snConfirm = new Button("�N�M�w�O�o�ӦW�r�F!!");
				snConfirm.setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent arg0) {
						
						
						player.setPlayer(snt.getText());
						//System.out.println("t" +player.getPlayer());���i�Jthread
						manuBarUpdata(pane2);//�b�Ыطs���⤧�ᰨ�W��s���
						manuBarUpdata(combatp);
						stage.setScene(scene);
						stage.setHeight(720);
						stage.setWidth(1280);		
						stage.setX(0);
						stage.setY(0);
					}
					
				});
				snConfirm.setLayoutX(100);
				snConfirm.setLayoutY(240);
				AnchorPane setNamep = new AnchorPane();
				setNamep.getChildren().addAll(snt,snL2,snL,snConfirm);
				Scene setName = new Scene(setNamep);
				stage.setHeight(500);
				stage.setWidth(500);
				stage.setScene(setName);
				
				
				}
		});		
	}
public static Background backgroundCreate(String URL) {
		Image cb = new Image(URL);
		BackgroundImage cbb= new BackgroundImage(cb, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT); 
		Background cbg = new Background(cbb);
		return cbg;
	}
public static AnchorPane getCombating() {
		return combating;
	}
public static Label getHealthCount() {
		return healthCount;
	}
public static Label getManaCount() {
		return ManaCount;
	}
public static Background getBackground() {
		return skillg;
	}
public static void setMobCombating(Players player,Mobs mob,Label mobCount ,Label mobStatus,ProgressBar pbar) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				
				mobCount.setText((int)mob.getHealth() + " / " + (int)mob.getMaxHealth());
				mobStatus.setText("[LV." + mob.getLevel() + "] "+ mob.getName());

				mob.setPBar(pbar);
				mobCount.setPrefSize(150, 10);
				mobCount.setLayoutX(825);
				mobCount.setLayoutY(170);
				mobCount.setAlignment(Pos.CENTER);
				mobCount.setStyle("-fx-font-weight: bold;");
				mobCount.setTextFill(Color.BLACK);
				mobStatus.setStyle("-fx-font-weight: bold;"
								  +"-fx-background-color: skyblue;");
				mobStatus.setAlignment(Pos.CENTER);
				//mobStatus.setStyle("-fx-background-color: red;"); 
				mobStatus.setFont(new Font((int)(18-mobStatus.getText().length()*0.30)));
				mobStatus.setPrefSize(150, 25);
				mobStatus.setLayoutX(825);
				mobStatus.setLayoutY(140);
				pbar.setLayoutX(825);
				pbar.setStyle("-fx-accent: red;"); 
				pbar.setLayoutY(165);
				pbar.setPrefHeight(25);
				pbar.setPrefWidth(150);
				
				if(mob.getLevel()-player.getLevel()>-5&&mob.getLevel()-player.getLevel()<=5) {
					mobStatus.setTextFill(Color.WHITE);
				}else if(mob.getLevel()-player.getLevel()>5&&mob.getLevel()-player.getLevel()<=10) {
					mobStatus.setTextFill(Color.ORANGE);	
				}else if(mob.getLevel()-player.getLevel()>10&&mob.getLevel()-player.getLevel()<=20) {
					mobStatus.setTextFill(Color.RED);
				}else if(mob.getLevel()-player.getLevel()>20){
					mobStatus.setTextFill(Color.BLACK);
				}else if(player.getLevel()-mob.getLevel()>=5) {
					mobStatus.setTextFill(Color.GRAY);
				}
				
		}
	});
		//private static Label mobCount;//��q�p��
		//private static Label mobStatus;//�Ǫ��ݩʵ��� �W��
		//private static ProgressBar pbar;//�Ǫ���q���

	}
public void packUpdata(Pagination page) {
		GUI.manuBarUpdata(GUI.getPane2());
		GUI.manuBarUpdata(GUI.getCombatPane());
		for(int i = 0 ; i < player.getProps().size() ; i ++) {
			amountUpdate(player);
		}
		for(int j = 0 ; j < player.getProps().size() ; j ++) {
			System.out.println("Amount: "+ player.getProps().get(j).getAmount()+" index: "+j +" Name: " + player.getProps().get(j)+" ID: "+player.getProps().get(j).getID());
		}
		page.setPageCount(20);//�ܮw����
		page.setMaxPageIndicatorCount(5);
		page.setPrefHeight(570);
		page.setPrefWidth(1150);
		page.setLayoutX(50);
		page.setLayoutY(50);
		page.setStyle("-fx-background-color:lightgray;");
		
		page.setPageFactory(new Callback<Integer, Node>(){//�I�]���O
			int index = 0;

			@Override
			public Node call(Integer param) {
				index = 0;
				pagePane = new AnchorPane();
				player.getProps().sort(new propsUpSort());
				index+=55*(param);//�@����55��
			
				for(int i = 0 ; i < 11 ; i ++) {
					for(int j  = 0 ; j < 5; j ++) {
						
						Label la = new Label();
						Label adjla = new Label();
						
						adjla.setPrefHeight(8);
						adjla.setPrefWidth(46);
						adjla.setFont(new Font(10));
						//adjla.setTextAlignment(TextAlignment.LEFT);
					
						if(index < player.getProps().size()&&(player.getProps().get(index).getID()<10000)) {//�D���k�D��˳��k�˳�,�w�]�D��ID�֩�1000���ݭn�A�X�R
							//System.out.println("index : " + index);
							adjla.setText(String.valueOf(player.getProps().get(index).getAmount()));
							la.setBackground(player.getProps().get(index).getImage());
						
							Label l1 = new Label(player.getProps().get(index).getName() +"("+ player.getProps().get(index).getAmount()+")");
							//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
							 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
							Label qualityL = new Label(player.getProps().get(index).getQuality());
							String quality = qualityL.getText();
							qualityL.setFont(new Font(13));
							if(quality.equals("�ʦH")){
								qualityL.setTextFill(Color.GRAY);
							}else if(quality.equals("���q")) {
								qualityL.setTextFill(Color.WHITE);
							}else if(quality.equals("�}�n")) {
								qualityL.setTextFill(Color.LIGHTGREEN);
							}else if(quality.equals("�}��")) {
								qualityL.setTextFill(Color.BLUE);
							}else if(quality.equals("�v��")) {
								qualityL.setTextFill(Color.MEDIUMPURPLE);
							}else if(quality.equals("�ǻ�")) {
								qualityL.setTextFill(Color.ORANGE);
							}else if(quality.equals("����")) {
								qualityL.setTextFill(Color.ROYALBLUE);
							}
							
							
							
							l1.setTextFill(qualityL.getTextFill());
							l1.setFont(new Font(15));
							Label l2 = new Label(player.getProps().get(index).getNote());
							l2.setFont(new Font(14));
							
							VBox v = new VBox();
							Button confirm = new Button("�ϥ�");
							v.getChildren().addAll(l1,qualityL,l2);
							if(player.getProps().get(index).getID()<=9997&&player.getProps().get(index).getID()>=9900) {
								if(player.getProps().get(index).getID()==9991) {
									confirm.setOnAction(e->{
										Skills temp = new MagicBoom(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});	
								}else if(player.getProps().get(index).getID()==9992) {
									confirm.setOnAction(e->{
										Skills temp = new GodBody(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9993) {
									confirm.setOnAction(e->{
										Skills temp = new MaxLow(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9994) {
									confirm.setOnAction(e->{
										Skills temp = new FireBreak(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9995) {
									confirm.setOnAction(e->{
										Skills temp = new BigIce(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9996) {
									confirm.setOnAction(e->{
										Skills temp = new Explosive(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9997) {
									confirm.setOnAction(e->{
										Skills temp = new DoubleHit(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9900) {
									confirm.setOnAction(e->{
										Skills temp = new RuneOprate(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9901) {
									confirm.setOnAction(e->{
										Skills temp = new DefendBody(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9902) {
									confirm.setOnAction(e->{
										Skills temp = new MagicSlade(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9903) {
									confirm.setOnAction(e->{
										Skills temp = new Decay(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}else if(player.getProps().get(index).getID()==9904) {
									confirm.setOnAction(e->{
										Skills temp = new CircleSlade(player);
										for(int k = 0 ; k < player.getSkills().size() ; k ++) {
											if(player.getSkills().get(k).getName().equals(temp.getName())) {
												System.out.println("���a�w�����ޯ�!");
												return;
											}
										}
										player.getSkills().add(temp);
										if(player.getProps().get(index).getAmount()>1) {
											player.getProps().get(index).setAmount(player.getProps().get(index).getAmount()-1);		
										}else {
											player.getProps().remove(index);
										}
										packUpdata(page);
									});
								}
								v.getChildren().add(confirm);

							}
							Tooltip tt = new Tooltip();
							tt.setMaxSize(400, 400);
							tt.setWrapText(true);
							tt.setGraphic(v);
							tt.setAutoHide(false);
							tt.setHideDelay(new Duration(2000));
//							tt.setHideOnEscape(false);
							tt.showDelayProperty().set(new Duration(250));
							la.setTooltip(tt);
							
							adjla.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
							la.setPrefHeight(64);
							la.setPrefWidth(64);
							adjla.setLayoutX(60+(i)*96+15);
							adjla.setLayoutY(45+(j)*100+55);
							
							la.setLayoutX(60+i*96);
							la.setLayoutY(54+j*100);
							pagePane.getChildren().addAll(la,adjla);
							index++;
						}
					}
					}
				return pagePane;
								
				}
			
		});
	}
 
public void amountUpdate(Players player) {
	player.getProps().sort(new propsUpSort());
	for(int i = 0 ; i < player.getProps().size() ; i ++) {
		for(int j = i+1 ; j < player.getProps().size() ; j ++) {
			if(player.getProps().get(i).getID()<10000&&player.getProps().get(i).getID()==player.getProps().get(j).getID()) {
				player.getProps().get(i).setAmount(player.getProps().get(i).getAmount()+player.getProps().get(j).getAmount());//��ۦPID�F�誺�ƶq�[�_��
				player.getProps().remove(j);	
			}
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
public static MenuBar createMenu() {
		//�W����Ū�����
		MenuBar menubar = new MenuBar();
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {


			menubar.setStyle("-fx-background-color: lightgray;");
			menubar.setLayoutX(0);
			menubar.setLayoutY(0);
			
			Label PlayerName = new Label(player.getPlayer());
			PlayerName.setTooltip(new Tooltip("�z���H���W��"));
			PlayerName.getTooltip().setShowDelay(new Duration(100));
			Menu menu1 = new Menu("",PlayerName);
		
			Menu levelMenu = new Menu("LV. " + String.valueOf(player.getLevel()));
			
			ProgressBar healthBar = new ProgressBar();
			healthBar.setProgress((double)player.getHealth()/(double)player.getMaxHealth());
			healthBar.setStyle("-fx-accent: red;");
			healthBar.setTooltip(new Tooltip("�ͩR: (" + player.getHealth()+"/"+player.getMaxHealth()+")"));
			healthBar.getTooltip().setShowDelay(new Duration(100));
			Menu menu2 = new Menu("",healthBar);
			//MenuItem k = new MenuItem();
			//k.
			//menu2.getItems().add(healthBar);
			
			ProgressBar ManaBar = new ProgressBar();
			ManaBar.setStyle("-fx-accent: blue;");
			ManaBar.setProgress((double)player.getMana()/(double)player.getMaxMana());	
			ManaBar.setTooltip(new Tooltip("�]�O: (" + player.getMana()+"/"+player.getMaxMana()+")"));
			ManaBar.getTooltip().setShowDelay(new Duration(100));
			Menu menu3 = new Menu("",ManaBar);
			
			ProgressBar expBar = new ProgressBar();
			expBar.setStyle("-fx-accent: limegreen;");
			expBar.setProgress((double)player.getExp()/(double)player.getMaxExp());
			expBar.setTooltip(new Tooltip("�g���: (" + (int)player.getExp()+"/"+(int)player.getMaxExp()+")"));
			expBar.getTooltip().setShowDelay(new Duration(100));
			Menu menu4 = new Menu("",expBar);
			
			
			Menu menu5 = new Menu("   ����:    " + player.getMoney()+ "    ");			
			Menu menu6 = new Menu("   �]����:    " + player.getDiamond() + "    ");

			
			Menu space1 = new Menu("                     ");
			Menu space2 = new Menu("                     ");
			Menu space3 = new Menu("                     ");
			Menu space4 = new Menu("                     ");
			Menu space5 = new Menu("                     ");
			Menu space6 = new Menu("                     ");
			Menu space7 = new Menu("                     ");

			//menu2.setDisable(false);
			menubar.getMenus().addAll(menu1,levelMenu,menu2,menu3,menu4,space1,space2,space3,space6,space7,menu5,menu6);
			menubar.setPrefWidth(1280);
			menubar.setPrefHeight(15);
			}
		});
		return menubar;
	}
public static void manuBarUpdata(AnchorPane pane) {
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				menuBar = createMenu();//�Ыص��
				if(pane.getChildren().contains(menuBar)) {
					pane.getChildren().remove(menuBar);
				}
				pane.getChildren().add(menuBar);		
			}
		});
	}
public static Label getEnimy() {
	return enemy;
}
public static AnchorPane getCombatPane() {
		return combatp;
	}
public static AnchorPane getStatusPane() {
		return statusp;
	}
public class propsUpSort implements Comparator<Objects> 
	{ 
		//�Hprops��ID�ɧǱƦC
		public int compare(Objects a, Objects b) 
		{ 
			return a.getID() - b.getID(); 
		} 
	} 
class propsDownSort implements Comparator<Objects> 
	{ 
		//�Hprops��ID���ǱƦC
		public int compare(Objects a, Objects b) 
		{ 
			return b.getID() - a.getID(); 
		} 
	}
public static Players getPlayer() {
		// TODO Auto-generated method stub
		return player;
	} 
public static Scene getStatuss() {
		return statuss;
	}
public static void statusPaneUpdata() {
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				nameL.setText("���a:    " + player.getPlayer());
				levelL.setText("����:    " + player.getLevel()); 
				HealthL.setText("��q:    " + (int)player.getHealth() + " / " + (int)player.getMaxHealth());
				MpL.setText("�]�O:    " + (int)player.getMana() + " / " + (int)player.getMaxMana());
				defenseL.setText("���m�O:    " + player.getArmor());
				damageL.setText("���z�����O:    " + (int)player.getDamage());
				magicDamageL.setText("�]�k�����O:    " + (int)player.getMagicDamage());
				hitL.setText("�R���v:    " + player.getHit() +" %");
				boomL.setText("�����v:    " + player.getBoom() + " %");
				boolAttackL.setText("�����ˮ`:    " + (int)(player.getBoomAttackRate()*100) + " %");
				escapeL.setText("�{�ײv:    " + player.getEscape() + " %");
				moneyL.setText("����:    " + player.getMoney() + " ��");
				diamondL.setText("�]����:    " + player.getDiamond() +  " ��");
				expL.setText("�g���:    " + (int)player.getExp() + " / " + (int)player.getMaxExp());
			}
		});		
	}
public static boolean checkIfSkillExist(Players player,Skills skill) {
		for(int i = 0 ; i < player.getSkills().size() ; i ++) {
			if(skill.getName().equals(player.getSkills().get(i).getName())){
				return true;
			}
		}
		return false;
	}
public static String checkIfSkillAdd(Players player) {
		int level = player.getLevel();
		Skills st = new Shout(player);
		Skills mq = new MagicQuake(player); 
		Skills adb = new ArmorDownBreak(player);
		Skills hb = new HealthBreak(player);
		Skills fs = new FusionSlade(player);
		Skills sc = new Scare(player);
		Skills mo = new MagicOperate(player);
		Skills sg = new SwordGod(player);
		if(level>=10&&!checkIfSkillExist(player, st)) {
			player.getSkills().add(st);
			return st.getName();
		}else if(level>=20&&!checkIfSkillExist(player,mq)) {
			player.getSkills().add(mq);
			return mq.getName();
		}else if(level>=30&&!checkIfSkillExist(player,adb)) {
			player.getSkills().add(adb);
			return adb.getName();
		}else if(level>=40&&!checkIfSkillExist(player,hb)) {
			player.getSkills().add(hb);
			return hb.getName();
		}else if(level>=50&&!checkIfSkillExist(player,fs)) {
			player.getSkills().add(fs);
			return fs.getName();
		}else if(level>=60&&!checkIfSkillExist(player,sc)) {
			player.getSkills().add(sc);
			return sc.getName();
		}else if(level>=70&&!checkIfSkillExist(player,mo)) {
			player.getSkills().add(mo);
			return mo.getName();
		}else if(level>=80&&!checkIfSkillExist(player,sg)) {
			player.getSkills().add(sg);
			return sg.getName();
		}
		return "�L";
	}
public static AnchorPane getPane2() {
		return pane2;
	}
public static VBox getSkiStatus() {
		return skiStatus;
	}
public static void setSkiStatus(VBox vx) {
		skiStatus = vx;
	}
public static VBox getMobSkiStatus() {
		return mobSkiStatus;
	}
public static void setMobSkiStatus(VBox vx) {
		mobSkiStatus = vx;
	}
public static void setDropVbox(ArrayList<Label> drops) {
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				drop.getChildren().clear();
				for(int i = 0 ; i < drops.size() ; i ++) {
					drop.getChildren().add(drops.get(i));
				}
			}
		});
	}
}
