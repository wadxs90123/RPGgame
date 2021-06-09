package Events;

import java.util.ArrayList;
import java.util.Comparator;

import Datas.DataCommander;
import Datas.Datas;
import Entities.Mobs;
import Entities.Players;
import GUI.GUI;
import GUI.GUI.propsUpSort;
import GUI.imageChange2;
import Objects.Objects;
import Skills.skillStatus;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BattleEvent implements Runnable{
	public static int pages = 0;
	public static int temp = 1;
	private static int combatTotalCount = 0;
	private static int combatCount=  0;//�^�X��
	private static int combatTimes =0;//�԰�����->�i�@�����N��
	
	private static Mobs mob;
	private static Label mobCount = new Label();//��q�p��
	private static Label combatCountL =new Label("�� " + combatCount + " �^�X");
	private static Label mobStatus = new Label();//�Ǫ��ݩʵ��� �W��
	private static ProgressBar pbar = new ProgressBar();//�Ǫ���q���
	private static ArrayList<Label> dropRecord = new ArrayList<>();

	private static Players player;
	private Button attack;
	private Button propb;
	private Button skills;
	private Button run;
	private Stage stage;
	private Thread t1;
	private Scene scene;
	private Datas data;
	private Label friends;
	private Label enemys;
	private Label damage1;
	private Label damage2;
	private static AnchorPane combating;
	private Thread att;
	private Thread skill;
	private Thread propt;
	private int round=0;
	private ScrollPane spane = new ScrollPane();
	private ScrollPane skia = new ScrollPane();
	private int index=0;
	private Rectangle health;
	private AnchorPane prop = new AnchorPane();
	private AnchorPane skip = new AnchorPane();
	private FlowPane ski = new FlowPane();
	private ArrayList<Button> skis;
	private ArrayList<Button> props;
	private FlowPane propv = new FlowPane();		
	public BattleEvent(int areaLevel , int areaName,Rectangle health,AnchorPane combating,Label damage1 ,Label damage2 ,Label friends, Label enemys, Datas data,Stage stage,Scene combats,Players player,ArrayList<Button> a) {
		if(areaLevel==0&&areaName==0) {
			mob = new Mobs();
			mob = mob.mobTest("���թǪ�");	
		}else {
			mob = new Mobs(areaLevel,areaName);
		}
		this.player = player;
		this.attack = a.get(0);
		this.propb=a.get(1);
		this.skills=a.get(2);
		this.run=a.get(3);
		this.stage = stage;
		this.scene = combats;
		this.data = data;
		this.friends = friends;
		this.enemys = enemys;
		this.damage1 = damage1;
		this.damage2 = damage2;
		this.health =health;
		this.combating = combating;

	}
	@Override
	public void run() {
		attack.setDisable(false);
		propb.setDisable(false);
		skills.setDisable(false);
		run.setDisable(false);
		addPbar();
		combatCount=0;
		for(int i = 1 ; i < GUI.getPlayer().getSkills().size() ; i ++) {
			player.getSkills().get(i).setCanBeApply(true);
			player.getSkills().get(i).setNowCooldown(-1);
		}
		skillStatus.originMobStatusRecord();
		skillStatus.originPlayerStatusRecord();//�����쥻��T
		
		BattleEvent.updateCombatCount();
		player.updataPlayerStatus();
		MobBarUpdateEvent mbuv = new MobBarUpdateEvent(player,mob,mobCount,mobStatus,pbar);
		mbuv.mobBarUpdate();
		
		t1= Thread.currentThread();
		health.setWidth(((double)player.getHealth()/(double)player.getMaxHealth()*180));
		GUI.HPMPUpdate(player);
		GUI.HPMPLoaderUpdata(player);
		

		
		DataCommander dataCommand = new DataCommander();
		
		player.updataPlayerStatus();//��s���A
		BattleMoveEvent move = new BattleMoveEvent(combating,health,damage1,damage2,attack,propb,skills,run,player,mob,friends,250,enemys,-250);
		runDamageEvent runMove = new runDamageEvent(combating,attack,propb,skills,run,damage1,damage2,player, mob,friends,enemys,250,-250, 1,10,20);
		
		attack.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent event) {	
				att = new Thread(move);
				att.start();
			}
		});
		
		
		propb.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				combatingInventory();
				
				Button proback = new Button("��^");
				
				proback.setLayoutX(625);
				proback.setLayoutY(135);
				proback.setPrefSize(60, 40);
				prop.getChildren().add(proback);

				proback.setOnAction(e->{
					combating.getChildren().remove(prop);					
					
				});

				
			
			}
	});

		
		skills.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				skis = new ArrayList<Button>();
			
				Button skiback = new Button("��^");
				
				skia= new ScrollPane();
				
				skip = new AnchorPane();
				skia.setLayoutX(15);
				skia.setLayoutY(15);
				
				
				ski = new FlowPane();
				
				skia.setStyle("-fx-background-color: silver;");
				ski.setStyle("-fx-background-color: silver;");
				skip.setPrefSize(600, 150);
				skia.setContent(ski);
				skip.setLayoutX(485);
				skip.setLayoutY(475);
				
				skip.setPrefSize(700, 190);
				skip.setStyle("-fx-background-color: silver;"
								 +"-fx-border-color: black;"
								 +"-fx-border-width: 1mm;");
				
				ski.setPrefSize(600, 150);
//				ski.setPrefSize(560, 240);
				ski.setOrientation(Orientation.VERTICAL); 
				
		
				skiback.setLayoutX(625);
				skiback.setLayoutY(135);
				skiback.setPrefSize(60, 40);
				skiback.setOnAction(e->{
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							combating.getChildren().remove(skip);//��skip����
						}
					});
				});
				
				skip.getChildren().add(skiback);
				
				for(int i = 1 ; i < player.getSkills().size() ; i ++) {
					skis.add(new Button(i+"." +player.getSkills().get(i).getName()+" MP: "+player.getSkills().get(i).getMpCost()));
				}
				for(int i = 0 ; i< skis.size(); i ++) {
					ski.getChildren().add(skillSet(skis, i));
				}

				skip.getChildren().add(ski);
				skip.getChildren().add(skia);
				combating.getChildren().add(skip);
		
			}
		});
		
		run.setOnAction(new EventHandler<ActionEvent>(){//�k�]

			@Override
			public void handle(ActionEvent event) {
				int rand = ((int)(Math.random()*10+1))%2;
				if(rand==0) {
					System.out.println("�k�]���\!");
					combatCount=0;
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							skillStatus.playerStatusRecovery();
							player.getBuffs().clear();
							mob.getBuffs().clear();
							skillStatus.statusCountUpdate(player);//�o�O�n��s���A�^�X�N�Ϊ�
							skillStatus.statusCountUpdate(mob);
							GUI.manuBarUpdata(GUI.getCombatPane());
							GUI.recover(stage,scene);
							t1.stop();
						}
					});	
				}else {
					Thread runTh = new Thread(runMove);
					runTh.start();
					System.out.println("�k�]����!");
				}
			}
		});
		while(!DeathEvent.mobDeath(mob)) {
			skillStatus.setLabel(mob);
			skillStatus.setLabel(player);
			mbuv.mobBarUpdate();
			GUI.HPMPUpdate(player);
			GUI.HPMPLoaderUpdata(player);
//			System.out.println("�ڦb�o�̣�");
			if(DeathEvent.playerDeath(player)) {
				GetExpEvent.lostExp(player);
				player.setHealth((int)(player.getMaxHealth()*0.1));
				GUI.recover(stage, scene);					
				LevelChangeEvent.judgeLevelUp(player,data,mob);
				dataCommand.dataSave(player,data);
				GUI.manuBarUpdata(GUI.getCombatPane());
				GUI.afterCombatDeadNote(player,mob);
				skillStatus.playerStatusRecovery();
				player.getBuffs().clear();
				mob.getBuffs().clear();
				skillStatus.statusCountUpdate(player);
				skillStatus.statusCountUpdate(mob);
				t1.stop();
			}
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			if(DeathEvent.mobDeath(mob)&&!DeathEvent.playerDeath(player)) {
				
				Platform.runLater(new Runnable() {
					
					@Override
					public void run() {
						if(mob.getName().equals("�]��")&&player.isEnd()==false) {
							imageChange2 ic = new imageChange2(player,new Stage());
							try {
								Thread.sleep(300);
								ic.start();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							player.setIsEnd(true);
						}
					}
				});	
			mbuv.mobBarUpdate();

			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GetExpEvent.combatGetExp(player, mob);
			GUI.recover(stage, scene);		

			combatTotalCount+=combatCount;
			combatTimes++;
			System.out.println("�԰�����: "+combatTimes);
			GUI.setDropVbox(getMobDrops(player, mob));
			
			
			LevelChangeEvent.judgeLevelUp(player,data,mob);
			amountUpdate(player);
			dataCommand.dataSave(player,data);
			
			GUI.afterCombatNote(player,mob);	//�]�����]�M�����ɳ��O�b�o�ɭԥ[�i�h�� �ҥHmenubar����s�n�b�L�᭱
			GUI.manuBarUpdata(GUI.getCombatPane());
			skillStatus.playerStatusRecovery();
			player.getBuffs().clear();
			mob.getBuffs().clear();
			t1.stop();
		}
	}
 
	public ArrayList<Label> getMobDrops(Players player,Mobs mob) {
		dropRecord.clear();
		for(int i = 0 ; i < mob.getDrops().size() ; i ++) {
			if((int)(Math.random()*99)<mob.getDrops().get(i).getDropChance()) {
				player.getProps().add(mob.getDrops().get(i));
				System.out.println("���a��o " + mob.getDrops().get(i).getName() + " ���~");
				Label temp = new Label("***��o���~ " + mob.getDrops().get(i).getName() + " x" + mob.getDrops().get(i).getAmount()+"***");
				temp.setTextFill(Color.SEAGREEN);
				temp.setFont(new Font(14));
				//temp.setPadding(new Insets(3));
				dropRecord.add(temp);
			}
		}
		return dropRecord;
	}
	public static Mobs getMob() {
		return mob;
	}
	public void attack() {
		DamageEvent.damageTo(player, mob,false);
	}
	public void eattack() {
		DamageEvent.damageTo(mob, player);
	}
	public Button propsSet(ArrayList<Button> a,int index) {
		//BattleSkillMoveEvent skillMove = new BattleSkillMoveEvent(player.getSkills().get(index+1),health,damage1,damage2,attack,props,skills,run,player,mob,friends,150,enemys,-150);
		//runDamageEvent move = new runDamageEvent(attack, attack, attack, attack, damage1, damage1, player, mob, damage1, damage1, index, index, index, index, index);
		propsEvent move = new propsEvent(combating,player.getProps().get(index),attack,propb,skills,run,damage1,damage2,player, mob,friends,enemys,250,-250, 1,10,20);
		Button bu = a.get(index); 
		a.get(index).setPrefHeight(10);
		a.get(index).setPrefWidth(160);
		Label name = new Label(player.getProps().get(index).getName() +" x"+player.getProps().get(index).getAmount());
		Label lore = new Label(player.getProps().get(index).getNote());
		name.setFont(new Font(16));
		name.setTextFill(Color.LIGHTGREEN);
		lore.setFont(new Font(14));
		lore.setTextFill(Color.LIGHTBLUE);
		VBox v = new VBox(name,lore);
		Tooltip tt = new Tooltip();
		tt.setShowDelay(new Duration(200));
		tt.setGraphic(v);
		bu.setTooltip(tt);
		if(player.getProps().get(index).getName().equals("��_��(�C��)")&&player.getProps().get(index).getAmount()>=1){
			bu.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						
					player.getProps().get(index).setAmount((player.getProps().get(index).getAmount()-1));
					if(player.getProps().get(index).getAmount()<1) {
						player.getProps().remove(index);//�n�O�o�R��list�̭������� ���M�|�줣��M���exception
					}
					combating.getChildren().remove(prop);//��prop����
						
					propt = new Thread(move);
					propt.start();
					}
				});
			}
		});
			return bu;
		}else if(player.getProps().get(index).getName().equals("��_��(����)")&&player.getProps().get(index).getAmount()>=1){
			bu.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							
						player.getProps().get(index).setAmount((player.getProps().get(index).getAmount()-1));
						if(player.getProps().get(index).getAmount()<1) {
							player.getProps().remove(index);//�n�O�o�R��list�̭������� ���M�|�줣��M���exception
						}
						combating.getChildren().remove(prop);//��prop����
								
						propt = new Thread(move);
						propt.start();
						}
					});
				}
			});
			return bu;
		}else if(player.getProps().get(index).getName().equals("��_��(�W��)")&&player.getProps().get(index).getAmount()>=1){
			bu.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							
						player.getProps().get(index).setAmount((player.getProps().get(index).getAmount()-1));
						if(player.getProps().get(index).getAmount()<1) {
							player.getProps().remove(index);//�n�O�o�R��list�̭������� ���M�|�줣��M���exception
						}
						combating.getChildren().remove(prop);//��prop����
								
						propt = new Thread(move);
						propt.start();
						}
					});
				}
			});
			return bu;
		}else if(player.getProps().get(index).getName().equals("�]�O��_��(�C��)")&&player.getProps().get(index).getAmount()>=1){
			bu.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							
						player.getProps().get(index).setAmount((player.getProps().get(index).getAmount()-1));
						if(player.getProps().get(index).getAmount()<1) {
							player.getProps().remove(index);//�n�O�o�R��list�̭������� ���M�|�줣��M���exception
						}
						combating.getChildren().remove(prop);//��prop����
							
						propt = new Thread(move);
						propt.start();
						}
					});
				}
			});
			return bu;
		}else if(player.getProps().get(index).getName().equals("�]�O��_��(����)")&&player.getProps().get(index).getAmount()>=1){
			bu.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							
						player.getProps().get(index).setAmount((player.getProps().get(index).getAmount()-1));
						if(player.getProps().get(index).getAmount()<1) {
							player.getProps().remove(index);//�n�O�o�R��list�̭������� ���M�|�줣��M���exception
						}
						combating.getChildren().remove(prop);//��prop����
								
						propt = new Thread(move);
						propt.start();
						}
					});
				}
			});
			return bu;
		}else if(player.getProps().get(index).getName().equals("�]�O��_��(�W��)")&&player.getProps().get(index).getAmount()>=1){
			bu.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							
						player.getProps().get(index).setAmount((player.getProps().get(index).getAmount()-1));
						if(player.getProps().get(index).getAmount()<1) {
							player.getProps().remove(index);//�n�O�o�R��list�̭������� ���M�|�줣��M���exception
						}
						combating.getChildren().remove(prop);//��prop����
								
						propt = new Thread(move);
						propt.start();
						}
					});
				}
			});
			return bu;
		}else if(player.getProps().get(index).getName().equals("��_��(����)")&&player.getProps().get(index).getAmount()>=1){
			bu.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							
						player.getProps().get(index).setAmount((player.getProps().get(index).getAmount()-1));
						if(player.getProps().get(index).getAmount()<1) {
							player.getProps().remove(index);//�n�O�o�R��list�̭������� ���M�|�줣��M���exception
						}
						combating.getChildren().remove(prop);//��prop����
								
						propt = new Thread(move);
						propt.start();
						}
					});
				}
			});
			return bu;
		}else if(player.getProps().get(index).getName().equals("�]�O��_��(����)")&&player.getProps().get(index).getAmount()>=1){
			bu.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							
						player.getProps().get(index).setAmount((player.getProps().get(index).getAmount()-1));
						if(player.getProps().get(index).getAmount()<1) {
							player.getProps().remove(index);//�n�O�o�R��list�̭������� ���M�|�줣��M���exception
						}
						combating.getChildren().remove(prop);//��prop����
							
						propt = new Thread(move);
						propt.start();
						}
					});
				}
			});
			return bu;
		}else if(player.getProps().get(index).getName().equals("�_�Ǫ��Ĥ�")&&player.getProps().get(index).getAmount()>=1){
			bu.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							
						player.getProps().get(index).setAmount((player.getProps().get(index).getAmount()-1));
						if(player.getProps().get(index).getAmount()<1) {
							player.getProps().remove(index);//�n�O�o�R��list�̭������� ���M�|�줣��M���exception
						}
						combating.getChildren().remove(prop);//��prop����
							
						propt = new Thread(move);
						propt.start();
						}
					});
				}
			});
			return bu;
		}
		return null;
	}
	
	public Button skillSet(ArrayList<Button> a ,int index) {
		BattleSkillMoveEvent skillMove = new BattleSkillMoveEvent(index+1,combating,player.getSkills().get(index+1),health,damage1,damage2,attack,propb,skills,run,player,mob,friends,250,enemys,-250);
		Button bu = a.get(index); 

		Label name = new Label(player.getSkills().get(index+1).getName());
		Label lore = new Label(player.getSkills().get(index+1).getNote());
		name.setFont(new Font(17));
		name.setTextFill(Color.LIGHTGREEN);
		lore.setFont(new Font(14));
		lore.setTextFill(Color.LIGHTBLUE);
		VBox v = new VBox(name,lore);
		Tooltip tt = new Tooltip();
		tt.setShowDelay(new Duration(200));
		tt.setGraphic(v);
		bu.setTooltip(tt);
		if(player.getSkills().get(index+1).isCanBeApply()==false) {
			if(!player.getSkills().get(index+1).isCanBeApply()) {
				bu.setText((index+1) + "." + player.getSkills().get(index+1).getName() +" MP: "+  player.getSkills().get(index+1).getMpCost() + "->�ޯ�|�b�N�o��,�|�l " + (player.getSkills().get(index+1).getCool()-player.getSkills().get(index+1).getNowCooldown()) + " �^�X");
				bu.setDisable(true);
			}
			return bu;
		}
		if(player.getMana()<player.getSkills().get(index+1).getMpCost()) {
			bu.setText((index+1) + "." + player.getSkills().get(index+1).getName() +" MP: "+  player.getSkills().get(index+1).getMpCost() + "->�]�O����");
			bu.setDisable(true);						
			return bu;
		}
		bu.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
					player.setMana(player.getMana()-player.getSkills().get(index+1).getMpCost());
					player.getSkills().get(index+1).setCanBeApply(false);
					player.getSkills().get(index+1).setNowCooldown(-1);
					
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							combating.getChildren().remove(skip);//��skip����
						}
					});
					skill = new Thread(skillMove);
					skill.start();
				}
			});
		return bu;
	}
	public void combatingInventory() {
		Platform.runLater(new Runnable() {
		
		@Override
		public void run() { 				
			props= new ArrayList<Button>(); 
			propv = new FlowPane();
			amountUpdate(player);
//			Label invisible = new Label();
//			invisible.setPrefSize(0, 0);
//			invisible.setVisible(false);
//			propv.getChildren().add(invisible);
			propv.setOrientation(Orientation.VERTICAL);
			//propv.setLayoutX(30);
			//propv.setLayoutY(30);
			propv.setPrefHeight(150);
			//propv.setOrientation();
			propv.setPrefWidth(600);
			propv.setStyle("-fx-background-color: silver;");
			prop.setPrefSize(700, 190);
			prop.setLayoutX(485);
			prop.setLayoutY(475);
			prop.setStyle("-fx-background-color: silver;"
							 +"-fx-border-color: black;"
							 +"-fx-border-width: 1mm;");
			
			for(int i = 0 ; i < player.getProps().size() ; i ++) {//�[�Wbutton
				props.add(new Button((i+1)+"." +player.getProps().get(i).getName()+" : "+player.getProps().get(i).getAmount()+ " ��"));
			
			}
			
			
			for(int i = 0 ; i < getIndex(player)  ;i ++) {//�[��flowpane�̭�,�O�oindex �O���F�˳ƩΨ�L�����H�~���̰��W��
				propv.getChildren().add(propsSet(props, i));	
			}
			spane = new ScrollPane();
			spane.setLayoutX(15);
			spane.setLayoutY(15);
			spane.setPrefSize(600, 150);
			spane.setStyle("-fx-background-color: silver;");
//			spane.setPrefViewportHeight(propv.getHeight());
//			spane.setPrefViewportWidth(propv.getWidth());
//			propv.getChildren().remove(invisible);
			spane.setContent(propv);
			prop.getChildren().add(spane);
			
			combating.getChildren().add(prop);

		}
	});
	}
 
	public static Label getMobCount() {
		return mobCount;
	}
	public static Label getMobStatus() {
		return mobStatus;
	}
	public static ProgressBar getPbar() {
		return pbar;
	}
	class propsUpSort implements Comparator<Objects> 
	{ 
		//�Hprops��ID�ɧǱƦC
		public int compare(Objects a, Objects b) 
		{ 
			return a.getID() - b.getID(); 
		} 
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
	
	public void addPbar() {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				if(!combating.getChildren().contains(mobStatus)) {
					combating.getChildren().addAll(pbar,mobCount,mobStatus);
				}
			}
		});
	}
	
	public int getIndex(Players player) {
		int index=0;
		while(index < player.getProps().size()&&player.getProps().get(index).getID()<100) {
			index++;
		}
		return index;
	}
	public int getCombatCount() {
		return BattleEvent.combatCount;
	}
	public void setCombatCount(int combatCount) {
		BattleEvent.combatCount = combatCount;
	}
	public static void updateCombatCount() {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {

				skillStatus.playerStatusRecovery();
				skillStatus.mobStatusRecovery();
				if(combatCount>1) {
					skillStatus.statusDischarge(player,mob);
					skillStatus.statusDischarge(mob,player);
				}
				if(!combating.getChildren().contains(combatCountL)) {
					combating.getChildren().add(combatCountL);
				}
				combatCount++;
				combatCountL.setPrefSize(300, 100);
				combatCountL.setLayoutX(480);
//				combatCountL.setLayoutY(-20);
				
				//combatCountL.setTextAlignment(TextAlignment.CENTER);
				combatCountL.setAlignment(Pos.CENTER);

				combatCountL.setStyle("-fx-background-color:gray;"
									 +"-fx-border-color: black;"
									 +"-fx-border-width: 0.6mm;"
									 +"-fx-border-radius: 30em;"
									 +"-fx-background-radius: 30em;"
									 +"-fx-font-size: 25px;"
									 +"-fx-font-weight: bold;");
				combatCountL.setText("�� " + combatCount + " �^�X");
				if(combatCount>1) {
					skillStatus.statusCountUpdate(player);
					skillStatus.statusCountUpdate(mob);
				}
			}
		});
	}

}
