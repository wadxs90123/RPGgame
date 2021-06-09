package Events;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import com.sun.glass.ui.Window.Level;

import Entities.Players;
import GUI.GUI;
import Objects.Objects;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.NodeOrientation;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.control.Tooltip;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Callback;
import javafx.util.Duration;


public class judgeWearingEvent {
	private AnchorPane indexPane;//�D�npanel
	private AnchorPane pagePane = new AnchorPane();
	private Players player = GUI.getPlayer();
	
	public judgeWearingEvent(Players player,AnchorPane indexPane) {
		this.player = player;
		this.indexPane = indexPane;
	}
	Objects Wearing;
	Background image =null;
	String TYPE = null;
	Label area;
	HashMap<Integer,Label> Area = player.getArea();
	String[] TYPE_AREA = {"WEAPON","HELMET","ARMOR","PANTS","SHOES"};
	public void createAreaOfWearings(AnchorPane pane) {
		Platform.runLater(new Runnable() {
			int j = 0;
			@Override
			public void run() {
				for(int i = 0 ; i < 5; i ++) {
					String type = TYPE_AREA[i];
					Label area = Area.get(i);
					
					area.setOnMouseDragEntered(new EventHandler<MouseDragEvent>() {

						@Override
						public void handle(MouseDragEvent event) {
							
							System.out.println("�A�i�J��" + type + "���ϰ�");
						}
					});
					
					area.setOnMouseDragReleased(new EventHandler<MouseDragEvent>() {

						@Override
						public void handle(MouseDragEvent event) {
							//�˳ƴ���
								if(!(event.getGestureSource().equals(Area.get(0))||event.getGestureSource().equals(Area.get(1))||event.getGestureSource().equals(Area.get(2))||event.getGestureSource().equals(Area.get(3))||event.getGestureSource().equals(Area.get(4)))
										&&TYPE.equals(type)&&player.getWearingByPart(type)!=null&&player.getLevel()>=Wearing.getLevelAqu()
										&&player.getAGI()>=Wearing.getAGIAqu()&&player.getLUK()>=Wearing.getLUKAqu()&&player.getINT()>=Wearing.getINTAqu()&&player.getSTR()>=Wearing.getSTRAqu()){
									if(player.getWearingByPart(Wearing.getWearType()).getID()!=1000&&player.getWearingByPart(Wearing.getWearType()).getID()!=4000&&player.getWearingByPart(Wearing.getWearType()).getID()!=4001&&player.getWearingByPart(Wearing.getWearType()).getID()!=4002&&player.getWearingByPart(Wearing.getWearType()).getID()!=4003) {
										player.getProps().add(player.getWearingByPart(Wearing.getWearType()));
										player.setWearings(Wearing.getWearType(), Wearing);
									}
									area.setBackground(Wearing.getImage());
									player.setWearings(TYPE, Wearing);
									player.getProps().remove(Wearing);
									//player.getProps().add(player.getWearingByPart(type));

									System.out.println("��F���e");
									areaLabel(area, Wearing);
									
									System.out.println("��F����");
									
									wearingsUpdata();
									player.updataPlayerStatus();
//									player.getWearing();
								}

							System.out.println("����");
						}
					});
					
					AreaLabelMaker(area, i);
					
					area.setPrefHeight(64);
					area.setPrefWidth(64);
					
					if(i==0) {
						area.setLayoutX(330);//Helmet Pant100
						area.setLayoutY(200);//Armor  Shoes	
					}else {
						area.setLayoutX(90+(i-1)%2*450);//Helmet Pant100
						area.setLayoutY(100+j*200);//Armor  Shoes
						if(i>=2) {j=1;}
					}
					//�Z��:0 �U�l:1 ��A:2 �Ǥl:3 �c�l:4
					if(!pane.getChildren().contains(area)) {
						pane.getChildren().add(area);
					}
				}
			}
		});
	}
	public class propsUpSort implements Comparator<Objects> 
	{ 
		//�Hprops��ID�ɧǱƦC
		public int compare(Objects a, Objects b) 
		{ 
			return a.getID() - b.getID(); 
		} 
	} 
	public void wearingsUpdata() {
		//amountUpdate(player);
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				indexPane.getChildren().clear();
				if(!indexPane.getChildren().contains(GUI.getStatusBack())) {
					indexPane.getChildren().add(GUI.getStatusBack());
				}
				createAreaOfWearings(indexPane);
				for(int i = 0 ; i < player.getProps().size() ; i ++) {
					player.getProps().sort(new propsUpSort());
				}
				Pagination page = new Pagination();
				indexPane.getChildren().add(page);
				page.setPageCount(20);//�ܮw����
				page.setMaxPageIndicatorCount(5);
				page.setPrefHeight(625);
				page.setPrefWidth(450);
				page.setLayoutX(745);
				page.setLayoutY(35);
				page.setStyle("-fx-background-color:#00000000;");
				

				page.setPageFactory(new Callback<Integer, Node>(){//�I�]���O
					int index = getIndex(player);
					@Override
					public Node call(Integer param) {
						pagePane = new AnchorPane();
						
						index = getIndex(player);
						index+=30*(param);
						
						for(int i = 0 ; i < 5 ; i ++) {//�j�����I�]���@�b
							for(int j  = 0 ; j < 6; j ++) {
								
								Label la = new Label();
	 
								if(index < player.getProps().size()) {
									//System.out.println("i: "+i+"j: " + j + "if�� index: "+index+"name: " + player.getProps().get(index).getName());
									la.setBackground(player.getProps().get(index).getImage());
									
								
									
									Objects wearing = player.getProps().get(index);
									Label l1 = new Label(wearing.getName());
									if(wearing.getStrength()>0) {
										l1.setText(wearing.getName() +" +"+ wearing.getStrength());
									}
									Label l2 = new Label(wearing.getNote());
									
									Label quality = new Label(wearing.getQuality());
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
										//�ʦH ���q �}�n �}�� �v�� �ǻ� ����
										 //�Ǧ� �զ� ��� �Ŧ� ���� ��� �¦�
									Label Type = new Label("");
									
									if(wearing.getWearType().equals("WEAPON")) {
										Type.setText("�˳�����: �Z��");
									}else if(wearing.getWearType().equals("HELMET")){
										Type.setText("�˳�����: �Y��");
									}else if(wearing.getWearType().equals("ARMOR")){
										Type.setText("�˳�����: ��A");
									}else if(wearing.getWearType().equals("PANTS")){
										Type.setText("�˳�����: �Ǥl");
									}else if(wearing.getWearType().equals("SHOES")){
										Type.setText("�˳�����: �c�l");
									}

									Label attack = new Label("�����O: " + wearing.getAttack());
									Label magicAttack = new Label("�]�k�����O: " + wearing.getMagicAttack());
									Label armor = new Label("���m�O: " + wearing.getArmor());
									Label LevelAqu = new Label("���ŭn�D: " + wearing.getLevelAqu());
									Label INTAqu = new Label("���z�n�D: "+ wearing.getINTAqu());
									Label STRAqu = new Label("�O�q�n�D: "+ wearing.getSTRAqu());
									Label AGIAqu = new Label("�ӱ��n�D: "+ wearing.getAGIAqu());
									Label LUKAqu = new Label("���B�n�D: "+ wearing.getLUKAqu());
									Label note = new Label("(�즲�ܸ˳����W�˳�)");//�˳ƭܮw�̭�
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
									
									l2.setTextFill(Color.DARKGRAY);
									l1.setFont(new Font(17));
									l2.setFont(new Font(14));
									
									
									
									Label statusBonus = new Label();
									statusBonus.setText( "�ͩR +" + wearing.getHealthPlus() + " �]�O +" + wearing.getManaPlus()+"\n"
											+"�O�q +" + wearing.getSTR() + " ���z +" + wearing.getINT()+"\n"
											+"�ӱ� +" + wearing.getAGI() + " ���B +" + wearing.getLUK()+"\n"
											+"�R�� +" + wearing.getHit() +" �{�� +" + wearing.getEscape() +"\n"
											+"���� +" +wearing.getBoom() +" �ɶ� +" + (int)(wearing.getBoomAttackRate()*100) + "%" + "\n");
			
									
									statusBonus.setTextFill(Color.LIGHTBLUE);

									statusBonus.setFont(new Font(13));
									LevelAqu.setFont(new Font(13));
									INTAqu.setFont(new Font(13));
									STRAqu.setFont(new Font(13));
									AGIAqu.setFont(new Font(13));
									LUKAqu.setFont(new Font(13));
							
									if(player.getLevel()<wearing.getLevelAqu()) {
										LevelAqu.setTextFill(Color.RED);
									}if(player.getAGI()<wearing.getAGIAqu()) {
										AGIAqu.setTextFill(Color.RED);
									}if(player.getSTR()<wearing.getSTRAqu()) {
										STRAqu.setTextFill(Color.RED);
									}if(player.getINT()<wearing.getINTAqu()) {
										INTAqu.setTextFill(Color.RED);
									}if(player.getLUK()<wearing.getLUKAqu()) {
										LUKAqu.setTextFill(Color.RED);
									}if(LevelAqu.getTextFill().equals(Color.RED)||STRAqu.getTextFill().equals(Color.RED)||AGIAqu.getTextFill().equals(Color.RED)||LUKAqu.getTextFill().equals(Color.RED)||INTAqu.getTextFill().equals(Color.RED)) {
										 note2.setVisible(true);
									}else {
										 note2.setVisible(false);
									}
									
									
									VBox v = new VBox();
									HBox h = new HBox();
									HBox h2 = new HBox();
									h.getChildren().addAll(STRAqu,INTAqu);
									h2.getChildren().addAll(LUKAqu,AGIAqu);
									if(wearing.getAttack()>0&&wearing.getMagicAttack()==0&&wearing.getArmor()==0) {
										v.getChildren().addAll(l1,quality,attack,Type,LevelAqu,h,h2,statusBonus,l2,note,note2);
									}else if(wearing.getMagicAttack()>0&&wearing.getAttack()==0&&wearing.getArmor()==0) {
										v.getChildren().addAll(l1,quality,magicAttack,Type,LevelAqu,h,h2,statusBonus,l2,note,note2);	
									}else {
										v.getChildren().addAll(l1,quality,armor,Type,LevelAqu,h,h2,statusBonus,l2,note,note2);
									}
									Tooltip tt = new Tooltip();
									tt.setMaxSize(400, 400);
									tt.setWrapText(true);
									tt.setGraphic(v);
									tt.showDelayProperty().set(new Duration(250));
									
									la.setTooltip(tt);
									
									la.setPrefHeight(64);
									la.setPrefWidth(64);
					
									la.setLayoutX(15+i*90);
									la.setLayoutY(15+j*100);
									
									LabelMaker(la,index);
																	
									//la.setOpacity(0.5);
									pagePane.getChildren().addAll(la);
									
									index++;

//									if(index==player.getProps().size()) {
//										index--;
//										break;
//									}
//									System.out.println("final index: " + index);
									
								}else {
									break;
								}
							}
						}
						return pagePane;
						
						//pane.getChildren().add(statusBack);
						
						}
					
				});

			}
		});
	}
	public void wearingOnUpdata(Players player,AnchorPane pane) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				for(int i = 0 ; i < 5; i ++) {
					String type = TYPE_AREA[i];
					Label area = Area.get(i);
					
					area.setBackground(player.getWearingByPart(type).getImage());
				}
			}
		});
	}
	public int getIndex(Players player) {
		int index=0;
		while(index < player.getProps().size()&&(player.getProps().get(index).getID()<10000)) {
			index++;
		}
		return index;
	}
	public void judgeLabel() {
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
			for(int i = 0 ; i < 5 ; i ++) {
				Label input = Area.get(i);
				String type = TYPE_AREA[i];
	
				Tooltip area_tip = new Tooltip();
				Label area_label = new Label("�|�L�˳�!!");
				area_label.setFont(new Font(15));
				area_label.setTextFill(Color.GRAY);
				area_tip.setGraphic(area_label);
				area_tip.setShowDelay(new Duration(200));
					
				if(player.getWearingByPart(type).getID()==1000) {
						Objects temp = Objects.getDataPropsCreate(player, 1000, 1);
						player.setWearings(type, temp);
						input.setBackground(temp.getImage());
						input.setTooltip(area_tip);
				}else if(player.getWearingByPart(type).getID()==4000) {
						Objects temp = Objects.getDataPropsCreate(player, 4000, 1);
						player.setWearings(type, temp);
						input.setBackground(temp.getImage());
						input.setTooltip(area_tip);
				}else if(player.getWearingByPart(type).getID()==4001) {
						Objects temp = Objects.getDataPropsCreate(player, 4001, 1);
						player.setWearings(type, temp);
						input.setBackground(temp.getImage());
						input.setTooltip(area_tip);
				}else if(player.getWearingByPart("PANTS").getID()==4002) {
						Objects temp = Objects.getDataPropsCreate(player, 4002, 1);
						player.setWearings("PANTS", temp);
						input.setBackground(temp.getImage());
						input.setTooltip(area_tip);
		
				}else if(player.getWearingByPart(type).getID()==4003) {
						Objects temp = Objects.getDataPropsCreate(player, 4003, 1);
						player.setWearings(type, temp);
						input.setBackground(temp.getImage());
						input.setTooltip(area_tip);
					}
				player.updataPlayerStatus();
				}
			}
		});
	}	
	public static void areaLabel(Label Areainput,Objects wearing) {
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				
				Label l1 = new Label(wearing.getName());
				Label l2 = new Label(wearing.getNote());
				Label quality = new Label(wearing.getQuality());
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
				
				if(wearing.getWearType().equals("WEAPON")) {
					Type.setText("�˳�����: �Z��");
				}else if(wearing.getWearType().equals("HELMET")){
					Type.setText("�˳�����: �Y��");
				}else if(wearing.getWearType().equals("ARMOR")){
					Type.setText("�˳�����: ��A");
				}else if(wearing.getWearType().equals("PANTS")){
					Type.setText("�˳�����: �Ǥl");
				}else if(wearing.getWearType().equals("SHOES")){
					Type.setText("�˳�����: �c�l");
				}
				Label attack = new Label("�����O: " + wearing.getAttack());
				Label magicAttack = new Label("�]�k�����O: " + wearing.getMagicAttack());
				Label armor = new Label("���m�O: " + wearing.getArmor());
				Label LevelAqu = new Label("���ŭn�D: " + wearing.getLevelAqu());
				Label INTAqu = new Label("���z�n�D: "+ wearing.getINTAqu()+" ");
				Label STRAqu = new Label("�O�q�n�D: "+ wearing.getSTRAqu()+" ");
				Label AGIAqu = new Label("�ӱ��n�D: "+ wearing.getAGIAqu()+" ");
				Label LUKAqu = new Label("���B�n�D: "+ wearing.getLUKAqu()+" ");
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
				
				if(wearing.getStrength()>0) {
					l1.setText(wearing.getName() +" +"+ wearing.getStrength());
				}
				
				//l1.setTextFill(Color.LIGHTGREEN);
				l2.setTextFill(Color.DARKGRAY);
				l1.setFont(new Font(17));
				l2.setFont(new Font(14));
				
				Label statusBonus = new Label();
				
				
				statusBonus.setText( "�ͩR +" + wearing.getHealthPlus() + " �]�O +" + wearing.getManaPlus()+"\n"
									+"�O�q +" + wearing.getSTR() + " ���z +" + wearing.getINT()+"\n"
									+"�ӱ� +" + wearing.getAGI() + " ���B +" + wearing.getLUK()+"\n"
									+"�R�� +" + wearing.getHit() +" �{�� +" + wearing.getEscape() +"\n"
									+"���� +" +wearing.getBoom() +" �ɶ� +" + (int)(wearing.getBoomAttackRate()*100) + "%" + "\n");
	
				statusBonus.setTextFill(Color.LIGHTBLUE);
				statusBonus.setFont(new Font(13));
				LevelAqu.setFont(new Font(13));
				INTAqu.setFont(new Font(13));
				STRAqu.setFont(new Font(13));
				AGIAqu.setFont(new Font(13));
				LUKAqu.setFont(new Font(13));
				Players player = GUI.getPlayer();
				if(player!=null) {
					if(player.getLevel()<wearing.getLevelAqu()) {
						LevelAqu.setTextFill(Color.RED);
					}if(player.getAGI()<wearing.getAGIAqu()) {
						AGIAqu.setTextFill(Color.RED);
					}if(player.getSTR()<wearing.getSTRAqu()) {
						STRAqu.setTextFill(Color.RED);
					}if(player.getINT()<wearing.getINTAqu()) {
						INTAqu.setTextFill(Color.RED);
					}if(player.getLUK()<wearing.getLUKAqu()) {
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
				if(wearing.getAttack()>0&&wearing.getMagicAttack()==0&&wearing.getArmor()==0) {
					v.getChildren().addAll(l1,quality,attack,Type,LevelAqu,h,h2,statusBonus,l2,note,note2);
				}else if(wearing.getMagicAttack()>0&&wearing.getAttack()==0&&wearing.getArmor()==0) {
					v.getChildren().addAll(l1,quality,magicAttack,Type,LevelAqu,h,h2,statusBonus,l2,note,note2);	
				}else {
					v.getChildren().addAll(l1,quality,armor,Type,LevelAqu,h,h2,statusBonus,l2,note,note2);
				}
				Tooltip tt = new Tooltip();
				tt.setMaxSize(400, 400);
				tt.setWrapText(true);
				tt.setGraphic(v);
				tt.showDelayProperty().set(new Duration(250));
				
				
				Tooltip noW = new Tooltip();
				Label noWL = new Label("�|���˳�!!");
				noWL.setTextFill(Color.GRAY);
				noWL.setFont(new Font(15));
				noW.setGraphic(noWL);
				noW.setShowDelay(new Duration(200));
				
				String type = wearing.getWearType();
				if(player.getWearingByPart(type).getID()==1000||player.getWearingByPart(type).getID()==4000||player.getWearingByPart(type).getID()==4001||player.getWearingByPart(type).getID()==4002||player.getWearingByPart(type).getID()==4003) {
					Areainput.setTooltip(noW);
				}else {
					Areainput.setTooltip(tt);
				}
			}
		});	
	}
	public void LabelMaker(Label input,int index) {
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				double oriX = input.getLayoutX();
				double oriY = input.getLayoutY();
				input.setOnDragDetected(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						input.startFullDrag();
						image=input.getBackground();
						TYPE = player.getProps().get(index).getWearType();
						Wearing = player.getProps().get(index);

					}
					
				});	
				
				input.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent event) {
						if(event.getButton().name().equals("SECONDARY"))
							System.out.println("�I���F");
					}
				});	

			}
		});
	}
	public void AreaLabelMaker(Label input,int index) {
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				
				Tooltip area_tip = new Tooltip();
				Label area_label = new Label("�|�L�˳�!!");
				area_label.setFont(new Font(15));
				area_label.setTextFill(Color.GRAY);
				area_tip.setGraphic(area_label);
				area_tip.setShowDelay(new Duration(200));
				
				
				input.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent event) {
						if(event.getButton().name().equals("SECONDARY")){
							if(input.equals(Area.get(0))) {//�Z��
								if(player.getWearingByPart("WEAPON").getID()!=1000) {
									Objects temp = Objects.getDataPropsCreate(player, 1000, 1);
									player.getProps().add(player.getWearingByPart("WEAPON"));
									player.setWearings("WEAPON", temp);
									input.setBackground(temp.getImage());
									input.setTooltip(area_tip);
								}
							}else if(input.equals(Area.get(1))) {//�Y��
								if(player.getWearingByPart("HELMET").getID()!=4000) {
									Objects temp = Objects.getDataPropsCreate(player, 4000, 1);
									player.getProps().add(player.getWearingByPart("HELMET"));
									player.setWearings("HELMET", temp);
									input.setBackground(temp.getImage());
									input.setTooltip(area_tip);
								}		
							}else if(input.equals(Area.get(2))) {//�@��
								if(player.getWearingByPart("ARMOR").getID()!=4001) {
									Objects temp = Objects.getDataPropsCreate(player, 4001, 1);
									player.getProps().add(player.getWearingByPart("ARMOR"));
									player.setWearings("ARMOR", temp);
									input.setBackground(temp.getImage());
									input.setTooltip(area_tip);
								}								
							}else if(input.equals(Area.get(3))) {//�w�l
								if(player.getWearingByPart("PANTS").getID()!=4002) {
									Objects temp = Objects.getDataPropsCreate(player, 4002, 1);
									player.getProps().add(player.getWearingByPart("PANTS"));
									player.setWearings("PANTS", temp);
									input.setBackground(temp.getImage());
									input.setTooltip(area_tip);

								}
							}else if(input.equals(Area.get(4))) {//�c�l
								if(player.getWearingByPart("SHOES").getID()!=4003) {
									Objects temp = Objects.getDataPropsCreate(player, 4003, 1);
									player.getProps().add(player.getWearingByPart("SHOES"));
									player.setWearings("SHOES", temp);
									input.setBackground(temp.getImage());
									input.setTooltip(area_tip);

								}
							}
							
							wearingsUpdata();
							player.updataPlayerStatus();
						}
					}
					
				});
				
				input.setOnDragDetected(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent event) {
						input.startFullDrag();
						image=input.getBackground();						
						player.getWearing();

					}
					
				});	

			}
		});
	}
	public HashMap<Integer, Label> getArea(){
		return Area;
	}
}
