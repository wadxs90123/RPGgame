package Datas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Scanner;

import Entities.Players;
import Events.judgeWearingEvent;
import Objects.Objects;
import Objects.PropsPackage.healer;
import Objects.PropsPackage.mpHealer;
import Skills.Skills;
import javafx.application.Platform;
import javafx.scene.control.Label;

public class DataCommander {
	private int i = 0;
	private int index;
	public DataCommander() {
		
	}
	public void dataIndexSave(Datas data) {
		data.setIndex(getDataCount()-1);
	}
	public void dataCreate(String username, String password) {
		try {
			Players playerTemp = new Players();
			
			FileWriter writer = new FileWriter("Datas/Player" + (getDataCount()+1) +".txt");
			writer.write("�b��: \n");
			writer.write(username);
			writer.write("\n");
			writer.write("�K�X: \n");
			writer.write(password);
			writer.write("\n");
			writer.write("�W��: \n");//�g�J
			writer.write(playerTemp.getPlayer());//�g�J
			writer.write("\n");
			writer.write("����: \n");
			writer.write(String.valueOf(playerTemp.getLevel()));//�g�J
			writer.write("\n");
			writer.write("�ثe��q: \n");
			writer.write(String.valueOf((int)playerTemp.getHealth()));//�g�J
			writer.write("\n");
			writer.write("�ثe�]�O: \n");
			writer.write(String.valueOf((int)playerTemp.getMana()));//�g�J
			writer.write("\n");
			writer.write("�g���: \n");
			writer.write(String.valueOf((int)playerTemp.getExp()));//�g�J
			writer.write("\n");
			writer.write("����: \n");
			writer.write(String.valueOf((int)playerTemp.getMoney()));//�g�J
			writer.write("\n"); 
			writer.write("�]����: \n");
			writer.write(String.valueOf((int)playerTemp.getDiamond()));//�g�J
			writer.write("\n"); 
			writer.write("�ݩ�: \n");
			writer.write(String.valueOf((int)playerTemp.getSTR()) +","+ String.valueOf((int)playerTemp.getINT()) +","+ String.valueOf((int)playerTemp.getAGI()) +","+ String.valueOf((int)playerTemp.getLUK()));//�g�J
			writer.write("\n");
			writer.write(String.valueOf(playerTemp.getStatusPoint()));
			writer.write("\n");
			writer.write("�D��: \n");
			for(int i = 0 ; i < playerTemp.getProps().size() ; i ++) {
				if(i==playerTemp.getProps().size()-1) {
					writer.write(String.valueOf((int)playerTemp.getProps().get(i).getID()));//�g�J
				}else if(i!=playerTemp.getProps().size()-1) {
					writer.write(String.valueOf((int)playerTemp.getProps().get(i).getID()+","));//�g�J
				}	
			}
			writer.write("\n");
			writer.write("�D��ƶq: \n");
			for(int i = 0 ; i < playerTemp.getProps().size() ; i ++) {
				if(i==playerTemp.getProps().size()-1) {
					writer.write(String.valueOf((int)playerTemp.getProps().get(i).getAmount()));//�g�J
				}else if(i!=playerTemp.getProps().size()-1) {
					writer.write(String.valueOf((int)playerTemp.getProps().get(i).getAmount()+","));//�g�J
				}	
			}
			writer.write("\n");

			writer.write("�ޯ�: \n");//�ݭn�g�@�ӹ�����
			if(playerTemp.getSkills().size()==0) {
				writer.write("0");
				playerTemp.getSkills().add(((Skills.getDataSkillsCreate(playerTemp, 0))));
			}
			for(int i = 0 ; i < playerTemp.getSkills().size() ; i ++) {
				if(i==playerTemp.getSkills().size()-1) {
					
					writer.write(String.valueOf((int)playerTemp.getSkills().get(i).getID()));//�g�J
				}else if(i!=playerTemp.getSkills().size()-1) {
					writer.write(String.valueOf((int)playerTemp.getSkills().get(i).getID() + ","));//�g�J
				}
			}
			writer.write("\n");
			writer.write("�˳�: \n");
			writer.write("�Z��: \n");
			writer.write("�L\n");
			writer.write("�Y��: \n");
			writer.write("�L\n");
			writer.write("��A: \n");
			writer.write("�L\n");
			writer.write("�Ǥl: \n");
			writer.write("�L\n");
			writer.write("�c�l: \n");
			writer.write("�L\n");
			writer.write("�q��: \n");
			writer.write("false\n");
			
			writer.close();//����
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void dataSave(Players player,Datas data) {//noFirst yes = 1 ,no = 0;
		try {
			//System.out.println(data.getUsername());
			//System.out.println(data.getPassword());�ˬd�O�_Ū�J���T�b���K�X
			FileWriter writer = new FileWriter("Datas/Player" + data.getIndex() +".txt");
			amountUpdate(player);
			writer.write("�b��: \n");
			writer.write(data.getUsername());
			writer.write("\n");
			writer.write("�K�X: \n");
			writer.write(data.getPassword());
			writer.write("\n");
			writer.write("�W��: \n");//�g�J
			writer.write(player.getPlayer());//�g�J
			writer.write("\n");
			writer.write("����: \n");
			writer.write(String.valueOf(player.getLevel()));//�g�J
			writer.write("\n");
			writer.write("�ثe��q: \n");
			writer.write(String.valueOf((int)player.getHealth()));//�g�J
			writer.write("\n");
			writer.write("�ثe�]�O: \n");
			writer.write(String.valueOf((int)player.getMana()));//�g�J
			writer.write("\n");
			writer.write("�g���: \n");
			writer.write(String.valueOf((int)player.getExp()));//�g�J
			writer.write("\n");
			writer.write("����: \n");
			writer.write(String.valueOf((int)player.getMoney()));//�g�J
			writer.write("\n");
			writer.write("�]����: \n");
			writer.write(String.valueOf((int)player.getDiamond()));//�g�J
			writer.write("\n");
			writer.write("�ݩ�: \n");
			writer.write(String.valueOf((int)player.getSTR()) +","+ String.valueOf((int)player.getINT()) +","+ String.valueOf((int)player.getAGI()) +","+ String.valueOf((int)player.getLUK()));//�g�J
			writer.write("\n");
			writer.write(String.valueOf(player.getStatusPoint()));
			writer.write("\n");
			writer.write("�D��: \n");
			if(player.getProps().size()==0) {
				writer.write("�L");
			}else {
				for(int i = 0 ; i < player.getProps().size() ; i ++) {
					if(i==player.getProps().size()-1) {
						writer.write(String.valueOf((int)player.getProps().get(i).getID()));//�g�J
					}else if(i!=player.getProps().size()-1) {
						writer.write(String.valueOf((int)player.getProps().get(i).getID()+","));//�g�J
					}	
				}
			}
			writer.write("\n");
			writer.write("�D��ƶq: \n");
			if(player.getProps().size()==0) {
				writer.write("�L");
			}else {
				for(int i = 0 ; i < player.getProps().size() ; i ++) {
					if(i==player.getProps().size()-1) {
						writer.write(String.valueOf((int)player.getProps().get(i).getAmount()));//�g�J
					}else if(i!=player.getProps().size()-1) {
						writer.write(String.valueOf((int)player.getProps().get(i).getAmount()+","));//�g�J
					}	
				}
			}
			writer.write("\n");

			writer.write("�ޯ�: \n");//�ݭn�g�@�ӹ�����
			if(player.getSkills().size()==0) {
				writer.write("0");
				player.getSkills().add(((Skills.getDataSkillsCreate(player, 0))));
			}else {
				for(int i = 0 ; i < player.getSkills().size() ; i ++) {
					if(i==player.getSkills().size()-1) {
						writer.write(String.valueOf((int)player.getSkills().get(i).getID()));//�g�J
					}else if(i!=player.getSkills().size()-1) {
						writer.write(String.valueOf((int)player.getSkills().get(i).getID() + ","));//�g�J
					}
				}
			}
			writer.write("\n");
			writer.write("�˳�: \n");
			writer.write("�Z��: \n");
			if(player.getWearingByPart("WEAPON")==null) {
				writer.write("�L\n");
			}else {
				writer.write("ID: \n");
				writer.write(String.valueOf(player.getWearingByPart("WEAPON").getID()));
				writer.write("\n");
				writer.write("�j�Ƶ���: \n");
				writer.write(String.valueOf(player.getWearingByPart("WEAPON").getStrength()));
				writer.write("\n");
			}
			writer.write("�Y��: \n");
			if(player.getWearingByPart("HELMET")==null) {
				writer.write("�L\n");
			}else {
				writer.write("ID: \n");
				writer.write(String.valueOf(player.getWearingByPart("HELMET").getID()));
				writer.write("\n");
				writer.write("�j�Ƶ���: \n");
				writer.write(String.valueOf(player.getWearingByPart("HELMET").getStrength()));
				writer.write("\n");
			}
			writer.write("��A: \n");
			if(player.getWearingByPart("ARMOR")==null) {
				writer.write("�L\n");
			}else {
				writer.write("ID: \n");
				writer.write(String.valueOf(player.getWearingByPart("ARMOR").getID()));
				writer.write("\n");
				writer.write("�j�Ƶ���: \n");
				writer.write(String.valueOf(player.getWearingByPart("ARMOR").getStrength()));
				writer.write("\n");
			}
			writer.write("�Ǥl: \n");
			if(player.getWearingByPart("PANTS")==null) {
				writer.write("�L\n");
			}else {
				writer.write("ID: \n");
				writer.write(String.valueOf(player.getWearingByPart("PANTS").getID()));
				writer.write("\n");
				writer.write("�j�Ƶ���: \n");
				writer.write(String.valueOf(player.getWearingByPart("PANTS").getStrength()));
				writer.write("\n");
			}
			writer.write("�c�l: \n");
			if(player.getWearingByPart("SHOES")==null) {
				writer.write("�L\n");
			}else {
				writer.write("ID: \n");
				writer.write(String.valueOf(player.getWearingByPart("SHOES").getID()));
				writer.write("\n");
				writer.write("�j�Ƶ���: \n");
				writer.write(String.valueOf(player.getWearingByPart("SHOES").getStrength()));
				writer.write("\n");
			}

			writer.write("�q��: \n");
			writer.write(String.valueOf(player.isEnd()));//�g�J
			writer.write("\n");

			writer.close();//����
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public int dataChecker(String User,int index) {//�T�{�ɮפ����S���o�ӪF��
		try {
			File reader = new File("Datas/Player" + index + ".txt");
			Scanner scan = new Scanner(reader);
			if(!reader.exists()) {
				return 0;//case 0 = �S���F��
			}else {
				String userTitle = scan.nextLine();
				//System.out.println("userti" + userTitle);�o�O�b�T�{���S���ۦP���b��
				
				String user = scan.nextLine();
				//System.out.println("user" + user);

				if(userTitle.equals("�b��: ")) {
					if(user.equals(User)) {
						return 1;//case 1 = ���H���U�L
					}
				}
				return 2;//case 2 = �i�H���U
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 3;
	}
	public int getDataCount() {//����ثe�ɮ׳̤j������index
		int count=0;
		File reader = new File("Datas/Player" + count + ".txt");//�ܤ֭n���@���ɮ�..�i�o�g�P�_
		
		while(reader.exists()) {
			count++;
			reader = new File("Datas/Player" + count + ".txt");//�ܤ֭n���@���ɮ�..�i�o�g�P�_
		}
		return count-1;
	}
	public boolean userChecker(String User,String Pass,int index) {//�q�s�}�l��즳�b���������ɮסA�M���index�ȱa�^�h
		try {
			File reader = new File("Datas/Player" + index + ".txt");
			Scanner scan = new Scanner(reader);
			if(!reader.exists()) {
				System.out.println("�b���K�X���~!");//case 0 = �S���F��
				return false;
			}else {
				String userTitle = scan.nextLine();
				String user = scan.nextLine();
				String passTitle = scan.nextLine();
				String pass = scan.nextLine();
				if(userTitle.equals("�b��: ")) {
					if(user.equals(User)&&pass.equals(Pass)) {
						return true;
					}else {
						return false;
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ū�����~!");
		return false;
	}
	public void dataLoad(Players player,Datas data) {				
			try {
			File reader = new File("Datas/Player" + data.getIndex() + ".txt");
			Scanner scan = new Scanner(reader);
			
			String[] propRecord = null;
			String[] propAmountRecord = null;
			String[] skillRecord = null;
			String[] wearingRecord = null;
			String wearing = null;
			
			String usertitle = scan.nextLine();
			String username = null;
			String passtitle = null;
			String password = null;
			
			String moneyTitle = null;
			String diamondTitle = null;
			String propTitle = null;
			String skillTitle = null;
			
			String mptitle = null;
			String nametitle = null;
			String propAmountTitle = null;
			String leveltitle = null;
			String hptitle = null;
			String exptitle = null;
			String name = null;
			
			String weaponTitle = null;
			String helmetTitle = null;
			String armorTitle = null;
			String pantsTitle = null;
			String shoesTitle = null;
			
			String weapon = null;
			String weaponStr = null;
			
			String helmet = null;
			String helmetStr = null;

			String armor = null;
			String armorStr = null;
		
			String pants = null;
			String pantsStr = null;
			
			String shoes = null;
			String shoesStr = null;
			
			String propAmount=null;
			String level=null;
			String maxhp=null;
			String minhp=null;
			String mp=null;
			String hp=null;
			String exp=null;
			String money=null;
			String diamond=null;
			String prop=null;
			String skill=null;
			String statusTitle = null;
			String status = null;
			String statusPoint = null;
			String[] statusNowPoint = null;
			String wearingTitle = null;
			String endTitle = null;
			String end = null;
				//System.out.println(scan.nextLine());
				if(usertitle.equals("�b��: ")) {
			        username = scan.nextLine();
					data.setUsername(username);
			        passtitle = scan.nextLine();
				}if(passtitle.equals("�K�X: ")) {
			        password = scan.nextLine();
					data.setPassword(password);
			        nametitle = scan.nextLine();
				}if(nametitle.equals("�W��: ")) {
			        name = scan.nextLine();
					player.setPlayer(name);
			        leveltitle = scan.nextLine();
				}if(leveltitle.equals("����: ")) {
					level = scan.nextLine();
					player.setLevel(Integer.parseInt(level));
					hptitle = scan.nextLine();
				}if(hptitle.equals("�ثe��q: ")) {
					hp=scan.nextLine();
					player.setHealth(Integer.parseInt(hp));
					mptitle=scan.nextLine();
				}if(mptitle.equals("�ثe�]�O: ")) {
					mp=scan.nextLine();
					player.setMana(Integer.parseInt(mp));
					exptitle=scan.nextLine();
				}if(exptitle.equals("�g���: ")) {
					exp=scan.nextLine();
					player.setExp(Double.parseDouble(exp));
					moneyTitle = scan.nextLine();
				}if(moneyTitle.equals("����: ")) {
					money = scan.nextLine();
					player.setMoney(Integer.parseInt(money));
					diamondTitle=scan.nextLine();
				}if(diamondTitle.equals("�]����: ")) {
					diamond = scan.nextLine();
					player.setDiamond(Integer.parseInt(diamond));
					statusTitle = scan.nextLine();
				}if(statusTitle.equals("�ݩ�: ")) {
					status = scan.nextLine();//�ݩʮ�
					statusNowPoint = status.split(",");//�ݩʥثe�I�� STR INT AGI LUK
					statusPoint = scan.nextLine();//�Ѿl�I��
					propTitle = scan.nextLine();
				}if(propTitle.equals("�D��: ")) {
					prop = scan.nextLine();
					propRecord = prop.split(",");
					propAmountTitle = scan.nextLine();	
				}if(propAmountTitle.equals("�D��ƶq: ")) {
					propAmount = scan.nextLine();
					propAmountRecord = propAmount.split(",");
					skillTitle = scan.nextLine();
				}if(skillTitle.equals("�ޯ�: ")) {
					skill=scan.nextLine();
					skillRecord = skill.split(",");
					wearingTitle = scan.nextLine();
				}if(wearingTitle.equals("�˳�: ")) {
					weaponTitle = scan.nextLine();
				}if(weaponTitle.equals("�Z��: ")) {
					weapon = scan.nextLine();
						if(weapon.equals("ID: ")) {
							String ID = scan.nextLine();
							String nowStr = scan.nextLine();
							if(nowStr.equals("�j�Ƶ���: ")) {
								String str = scan.nextLine();
								if(!(Integer.parseInt(ID)==1000||Integer.parseInt(ID)==4000||Integer.parseInt(ID)==4001||Integer.parseInt(ID)==4002||Integer.parseInt(ID)==4003)) {
									player.setWearings("WEAPON", Objects.getDataWearingsCreate(player,Integer.parseInt(ID),Integer.parseInt(str)));
								}
							}
						}
					helmetTitle = scan.nextLine();
				}if(helmetTitle.equals("�Y��: ")) {
					helmet = scan.nextLine();
					if(!helmet.equals("�L")) {
						if(helmet.equals("ID: ")) {
							String ID = scan.nextLine();
							String nowStr = scan.nextLine();
							if(nowStr.equals("�j�Ƶ���: ")) {
								String str = scan.nextLine();
								if(!(Integer.parseInt(ID)==1000||Integer.parseInt(ID)==4000||Integer.parseInt(ID)==4001||Integer.parseInt(ID)==4002||Integer.parseInt(ID)==4003)) {
									player.setWearings("HELMET", Objects.getDataWearingsCreate(player,Integer.parseInt(ID),Integer.parseInt(str)));
								}
							}
					
						}
					}
					armorTitle = scan.nextLine();
					
				}if(armorTitle.equals("��A: ")) {
					armor = scan.nextLine();
					if(!armor.equals("�L")) {
						if(armor.equals("ID: ")) {
							String ID = scan.nextLine();
							String nowStr = scan.nextLine();
							if(nowStr.equals("�j�Ƶ���: ")) {
								String str = scan.nextLine();
								if(!(Integer.parseInt(ID)==1000||Integer.parseInt(ID)==4000||Integer.parseInt(ID)==4001||Integer.parseInt(ID)==4002||Integer.parseInt(ID)==4003)) {
									player.setWearings("ARMOR", Objects.getDataWearingsCreate(player,Integer.parseInt(ID),Integer.parseInt(str)));
								}
							}
					
						}
					}
					pantsTitle = scan.nextLine();
				}if(pantsTitle.equals("�Ǥl: ")) {
					pants = scan.nextLine();
					if(!pants.equals("�L")) {
						if(pants.equals("ID: ")) {
							String ID = scan.nextLine();
							String nowStr = scan.nextLine();
							if(nowStr.equals("�j�Ƶ���: ")) {
								String str = scan.nextLine();
								if(!(Integer.parseInt(ID)==1000||Integer.parseInt(ID)==4000||Integer.parseInt(ID)==4001||Integer.parseInt(ID)==4002||Integer.parseInt(ID)==4003)) {
									player.setWearings("PANTS", Objects.getDataWearingsCreate(player,Integer.parseInt(ID),Integer.parseInt(str)));
								}
							}
					
						}
					}
					shoesTitle = scan.nextLine();
				}if(shoesTitle.equals("�c�l: ")) {
					shoes = scan.nextLine();
					if(!shoes.equals("�L")) {
						if(shoes.equals("ID: ")) {
							String ID = scan.nextLine();
							String nowStr = scan.nextLine();
							if(nowStr.equals("�j�Ƶ���: ")) {
								String str = scan.nextLine();
								if(!(Integer.parseInt(ID)==1000||Integer.parseInt(ID)==4000||Integer.parseInt(ID)==4001||Integer.parseInt(ID)==4002||Integer.parseInt(ID)==4003)) {
									player.setWearings("SHOES", Objects.getDataWearingsCreate(player,Integer.parseInt(ID),Integer.parseInt(str)));
								}
							}
					
						}
					}
					endTitle = scan.nextLine();
				}if(endTitle.equals("�q��: ")) {
					end = scan.nextLine();
					player.setIsEnd(Boolean.valueOf(end));
				}
				Label wtemp = new Label();
				judgeWearingEvent.areaLabel(wtemp,player.getWearingByPart("WEAPON"));
				player.getArea().put(0,wtemp);
				Label htemp = new Label();
				judgeWearingEvent.areaLabel(htemp,player.getWearingByPart("HELMET"));
				player.getArea().put(1,htemp);
				Label atemp = new Label();
				judgeWearingEvent.areaLabel(atemp,player.getWearingByPart("ARMOR"));
				player.getArea().put(2,atemp);
				Label ptemp = new Label();
				judgeWearingEvent.areaLabel(ptemp,player.getWearingByPart("PANTS"));
				player.getArea().put(3,ptemp);
				Label stemp = new Label();
				judgeWearingEvent.areaLabel(stemp,player.getWearingByPart("SHOES"));
				player.getArea().put(4,stemp);
				
				
				if(!prop.equals("�L")&&!propAmount.equals("�L")) {
					for(int i = 0 ; i < propRecord.length ; i ++) {
//						System.out.println(i+"." +player.getPlayer()+" "+propRecord[i] + " �ӧO�ƶq: " + propAmountRecord[i] + " �ƶq�`�@: " + propRecord.length);
						player.getProps().add(Objects.getDataPropsCreate(player, Integer.parseInt(propRecord[i]),Integer.parseInt(propAmountRecord[i])));
					}	
				}
				if(!skill.equals("�L")) {
					for(int i = 0 ; i < skillRecord.length ; i ++) {
						player.getSkills().add(Skills.getDataSkillsCreate(player,Integer.parseInt(skillRecord[i])));
					}
				}
				player.setStatusPoint(Integer.parseInt(statusPoint));
				for(int i = 0 ; i < 4 ; i ++) {
					player.setStatus(i,Integer.parseInt(statusNowPoint[i]));
				}
				
			}catch (FileNotFoundException e) {
				e.printStackTrace();
		}
	}
//	public void dataOutput(Players player,String URL) {//�o�O��ӾǨ쪺2021.4.27
//		try {
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(URL));
//			oos.writeObject(player);
//			oos.close();
//		
//		
//		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	public void dataInput(Players player,String URL) {
//		try {
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(URL));
//			try {
//				player = (Players)ois.readObject();
//				
//				
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			}		
//		
//		
//		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
	public boolean dataExist(int index) {
		try {
			File reader = new File("Datas/Player" + index + ".txt");
			Scanner scan = new Scanner(reader);
			if(reader.exists()) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
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
	}
}
class propsUpSort implements Comparator<Objects> 
{ 
	//�Hprops��ID�ɧǱƦC
	public int compare(Objects a, Objects b) 
	{ 
		return a.getID() - b.getID(); 
	} 
} 
