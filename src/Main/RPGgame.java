package Main;
import java.util.Scanner;

import Datas.DataCommander;
import Entities.Mobs;
import Entities.Players;
import Events.DamageEvent;
import Events.DeathEvent;
import Events.GetExpEvent;
import Events.LevelChangeEvent;
import GUI.GUI;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RPGgame{
	public static Button b1 ;
	public static Button b2 ;
	public static Button b3 ;
	public static Button start;

	public static void main(String[] args) {
		GUI myGUI = new GUI();
		myGUI.Main(args);
	}
	
}
