package GUI;

import java.net.URL;

import java.util.ArrayList;

import com.sun.glass.ui.EventLoop.State;

import Entities.Players;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class imageChange{
	private Players player;
	private Thread tsetName;
	private Stage stage2;
	public imageChange(Players player,Thread tsetName,Stage stage2) {
		this.player = player;
		this.stage2 = stage2;
		this.tsetName = tsetName;
	}
	public void start() throws Exception {
		Stage stage = new Stage();
		ArrayList<Label> labels = new ArrayList<>();

		ImageView iV = new ImageView();
		ImageView human = new ImageView();
		FadeTransition labelFadeTransition = new FadeTransition();
		FadeTransition fadeTransition = new FadeTransition();
		FadeTransition humanFadeTransition = new FadeTransition();
		human.setFitHeight(400);
		human.setFitWidth(300);
		human.setLayoutX(570);
		human.setLayoutY(70);
		iV.setFitHeight(540);
		iV.setFitWidth(960);
		iV.setImage(new Image("Images/�c���.jpg"));
		human.setImage(new Image("Images/oldman.png"));
		human.setVisible(false);
		Label l1 = new Label("                      2021�~4��15�����T�I�����_�G��...\n");
		Label l2 = new Label(
				"                      �A���b�Q��k�����{�]�Ҵ����M�D��CODE�A�b�X���W��L�G�����p�U�A\n                      �f�����A�M�w������ۤv�A\n                      �ҥH���Ѥ��ܤ��A�Q�U�h�ӤU�c������I�ܪ��C");
		Label l3 = new Label("                      ����A����c����e...\n");
		Label l4 = new Label("                      ���ѭn�ܤ���n�O?\n" + "                      �ܭө@�ش������n�F...\n");

		Label l5 = new Label("                      �A�ۤU���l���_���ơA�o�o�{�⤤���۪����O�A�Q�������@�ءA\n                      �ӬO�@�����۩_�S�����~\n");
		Label l6 = new Label(
				"                      �_��...\n                      �o���O�@�ت�...\n                      �O�޲z������F��?\n");
		Label l7 = new Label("                      ����A�o��Q�ɡA�@�}�G���§Aŧ�ӡC\n");
		Label l8 = new Label("                      ��M�����T�I�ܦ��F�j�դ�...\n");
		Label l9 = new Label("                      �A�b�@�ӥ|�P���L�H���˪L�Ŧa�����ۡA\n                      �A���}�U���@���J�ª��d�g�A�ƬO�����C\n");
		Label l10 = new Label("                      �o�O���@�ɥl���???\n");
		Label l11 = new Label("                      �ݦV�⤤�����ө_�S�y�������ơA\n                      ���ɤ@�����۩_�S���ߤl�A�§A�o�ĤF�L�ӡC\n");
		Label l12 = new Label("                      �o�쩳�O����...\n");
		Label l13 = new Label(
				"                      �A�]���F�ߤl�l�A�ߤl���t�פ���A\n                      ����L����F�A�H��A�A�^���b�a�W�A�y�ɷPı�����z�F���֡A\n                      ���ߤl�o��M���F�U�ӡA���O�b���ݤ���C\n");
		Label l14 = new Label(
				"                      �A�ݵۥL�A�e�ݵۧA�A\n                      �N�b�A�ٷd���M�����p�ɡA�A�S�ݨ�F�@�s�H�q�˪L���Y�@�B�§A���F�L��...\n");
		Label l15 = new Label(
				"                      �H�s�e�����ӱa�Y���ѤH�A���̬�۵ۤ��j�@���ڬw������A�A\n                      �N���A�H���ҬݹL�����󲧥@����ͧ@�~���ˡC\n");
		Label l16 = new Label("                      �ѤH����A���e�A�}�f�D:\n");
		Label l17 = new Label(
				"                      �z�O���@�ɪ��~���B�i�ȤH�j�a?\n                      �o�y���l�����w�����A�a�̭��{�e�A�ѤW�|���U�@�D�����p�A\n                      �t�d�ɤޡi�ȤH�j�Ӧ��@�ϻa�͡C\n");
		Label l18 = new Label("                      ������...�O��?");
		Label l19 = new Label(
				"                      �o�O�������N�A\n                      �S���H���D�����Q�k�O����A\n                      �J�M�A���ӤF�A�N��A�Q���襤�F�C\n");
		Label l20 = new Label("                      ����ҩ��ڴN�O�Q���襤�O?\n");
		Label l21 = new Label(
				"                      �Ĥ@�A�����B���Ӧa�観�@���J�¡A���O�����p���U���a��A�o����]�u���z�@�ӤH�C\n                      �ĤG�A�z����ۭ��椣�O�o�ӥ@�ɷ|�����C\n");
		Label l22 = new Label("                      �٦��̭��n���@�I�A\n                      �z���o�{�b�z�e�誺�ߤl�@�ʤ]���ʶ�?\n");
		Label l23 = new Label("                      �o�O�����[�@�A�i�԰�������j���ĪG�C\n");
		Label l24 = new Label(
				"                      �ǻ����A�u���Q���l�ꪺ�H�άO�Z���n�p�y���B��G�������H�~�|�֦��A\n                      �q�j�ܤ������������L�T�H�A�z�O�ĥ|�ӡA\n                      �ӲĤ@��O�W�j�ɴ��j���|�謰�H���ѱo�@���͸����^�����C\n");
		Label l25 = new Label("                      �A�ӫK�ҬO�g�ѯ��A�z�L�l��ᤩ�ޯ઺�i�ȤH�j�̡A\n                      �i�԰�������j���X�ӮĪG:\n");
		Label l26 = new Label(
				"                      �Ĥ@�B�ޯ൴��o�ʡA�o�ʫ���󪺤H�ƪ��K����A�z�A�԰��C\n                      �ĤG�B����ѱz�}�l�i���ʡC\n                      �ĤT�B��z���ķN���ͪ��άO�z�Q�������ͪ��A�ҷ|�Q�o�ӻ�쵹����A\n                         �ĪG�O��ʪ����@��b��ʫ�|���U�A�åB���ݥt�@��i���ʡC\n");
		Label l27 = new Label(
				"                      ��M�z�]�i�H��ܰk�]�A�u�O�p�G�k�]���ѫK�|�������@����ʪ����|�A\n                      �ҿת���ʥ]�A�|��: �����B�ϥΧޯ�B�D��H�ΰk�]�C\n");
		Label l28 = new Label("                      �ڪ��D�F...���M�ܲV�áA\n                      ���ڤj���F�ѤF�A���o�ӬO����?\n");
		Label l29 = new Label(
				"                      �ڤ]���M���A\n                      ����ť���L�i�ȤH�j���F�|��o�i�԰�������j���ޯ�~�A�ٷ|��o�����ػP�����~�A\n                      �p�G���M���A�ϥάݬݫK���D�F�C\n");
		Label l30 = new Label(
				"                      (�o���H�K����...)\n                      �ڪ��D�F�A���ڧ�e�ܱ��a�C\n                      (���}��ܱ��F�A�Ѥf���u�n�A����]�P����W�κZ)\n");
		Label l31 = new Label("                      �o�ˤ]��O�@����ʳ�!\n");
		Label l32 = new Label("                      ��!!!\n                      (�ߤl��A�ļ�)\n");
		Label l33 = new Label(
				"                      �n���S�����Q������h�F...\n                      �ӥB����̭��P��@�ѷx�y�b�y«�ۡA�ӵκZ�F...\n");
		Label l34 = new Label("                      �����e�a�C\n");
		Label l35 = new Label("                      ���C\n");
		Label l36 = new Label("                      �����԰���A�A��ۦѤH�^����l���C\n");
		Label l37 = new Label(
				"                      �i�ȤH�j���A��������D�λݭn����V�ڴ��X�A\n                      �ڷ|�ɥ��O�����A���ݨD�A�Ь��a�͸ѨM�Y�N���{���a�̧a�C\n");
		Label l38 = new Label("                      (��������D�i�H�I�������߰�)");

		labels.add(l1);
		labels.add(l2);
		labels.add(l3);
		labels.add(l4);
		labels.add(l5);
		labels.add(l6);
		labels.add(l7);
		labels.add(l8);
		labels.add(l9);
		labels.add(l10);
		labels.add(l11);
		labels.add(l12);
		labels.add(l13);
		labels.add(l14);
		labels.add(l15);
		labels.add(l16);
		labels.add(l17);
		labels.add(l18);
		labels.add(l19);
		labels.add(l20);
		labels.add(l21);
		labels.add(l22);
		labels.add(l23);
		labels.add(l24);
		labels.add(l25);
		labels.add(l26);
		labels.add(l27);
		labels.add(l28);
		labels.add(l29);
		labels.add(l30);
		labels.add(l31);
		labels.add(l32);
		labels.add(l33);
		labels.add(l34);
		labels.add(l35);
		labels.add(l36);
		labels.add(l37);
		labels.add(l38);

		Label name1 = new Label("��");
		name1.setTextFill(Color.BLACK);
		name1.setStyle("-fx-font-weight: bold;");
		Label name2 = new Label("����");
		name2.setTextFill(Color.BLACK);
		name2.setStyle("-fx-font-weight: bold;");
		name1.setVisible(false);
		name2.setVisible(false);
		name1.setLayoutX(185);
		name1.setLayoutY(325);
		name2.setLayoutX(185);
		name2.setLayoutY(325);
		name1.setFont(new Font(20));
		name2.setFont(new Font(20));
		l1.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l2.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l3.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l4.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l5.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l6.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l7.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l8.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l9.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l10.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l11.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l12.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l13.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l14.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l15.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l16.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l17.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l18.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l19.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l20.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l21.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l22.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l23.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l24.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l25.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l26.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l27.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l28.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l29.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l30.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l31.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l32.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l33.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l34.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l35.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l36.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l37.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");
		l38.setStyle(
				"-fx-background-image: url(\"/Images/��ܮ�2.png\");" + "-fx-font-weight: bold;" + "-fx-font-size: 16px;");

		for (Label label : labels) {
			if (label.equals(l1)) {
				continue;
			}
			label.setVisible(false);
		}

		l1.setOnMouseClicked(e -> {
			l1.setVisible(false);
			l2.setVisible(true);
		});
		l2.setOnMouseClicked(e -> {
			l2.setVisible(false);
			l3.setVisible(true);
		});
		l3.setOnMouseClicked(e -> {
			l3.setVisible(false);
			l4.setVisible(true);
			name1.setVisible(true);
		});
		l4.setOnMouseClicked(e -> {
			l4.setVisible(false);
			l5.setVisible(true);
			name1.setVisible(false);
		});
		l5.setOnMouseClicked(e -> {
			l5.setVisible(false);
			l6.setVisible(true);
			name1.setVisible(true);
		});
		l6.setOnMouseClicked(e -> {
			l6.setVisible(false);
			l7.setVisible(true);
			name1.setVisible(false);
		});
		l7.setOnMouseClicked(e -> {

			l7.setVisible(false);
			makefadeout(iV);
			makefadein(l8);
			l8.setVisible(true);

		});
		l8.setOnMouseClicked(e -> {

			l8.setVisible(false);
			iV.setImage(new Image("Images/forest.jpg"));
			makefadein(iV);
			l9.setVisible(true);
			makefadein(l9);
		});
		l9.setOnMouseClicked(e -> {

			l9.setVisible(false);
			l10.setVisible(true);
			name1.setVisible(true);
			shakinglabel(l10);
			shakinglabel(name1);
		});
		l10.setOnMouseClicked(e -> {

			l10.setVisible(false);
			l11.setVisible(true);
			name1.setVisible(false);
			iV.setImage(new Image("Images/rabit.jpg"));

		});
		l11.setOnMouseClicked(e -> {

			l11.setVisible(false);
			l12.setVisible(true);
			name1.setVisible(true);

		});
		l12.setOnMouseClicked(e -> {

			l12.setVisible(false);
			l13.setVisible(true);
			name1.setVisible(false);
		});
		l13.setOnMouseClicked(e -> {
			l13.setVisible(false);
			l14.setVisible(true);
			iV.setImage(new Image("Images/village.png"));
		});
		l14.setOnMouseClicked(e -> {
			l14.setVisible(false);
			l15.setVisible(true);
			human.setVisible(true);
			humanfadein(human);
		});
		l15.setOnMouseClicked(e -> {

			l15.setVisible(false);
			l16.setVisible(true);

		});
		l16.setOnMouseClicked(e -> {

			l16.setVisible(false);
			l17.setVisible(true);
			shakingImage(human);
			name2.setVisible(true);
		});
		l17.setOnMouseClicked(e -> {
			l17.setVisible(false);
			l18.setVisible(true);
			human.setOpacity(0.8);
			name2.setVisible(false);
			name1.setVisible(true);
			shakinglabel(l18);
			shakinglabel(name1);
		});
		l18.setOnMouseClicked(e -> {
			l18.setVisible(false);
			l19.setVisible(true);
			human.setOpacity(1);
			name2.setVisible(true);
			name1.setVisible(false);
		});
		l19.setOnMouseClicked(e -> {
			l19.setVisible(false);
			l20.setVisible(true);
			human.setOpacity(0.8);
			name2.setVisible(false);
			name1.setVisible(true);

		});
		l20.setOnMouseClicked(e -> {
			l20.setVisible(false);
			l21.setVisible(true);
			human.setOpacity(1);
			name2.setVisible(true);
			name1.setVisible(false);
		});
		l21.setOnMouseClicked(e -> {
			l21.setVisible(false);
			l22.setVisible(true);
		});
		l22.setOnMouseClicked(e -> {
			l22.setVisible(false);
			l23.setVisible(true);
			iV.setImage(new Image("Images/war.jpg"));
			humanfadein(human);
			makefadein(iV);
		});
		l23.setOnMouseClicked(e -> {
			l23.setVisible(false);
			l24.setVisible(true);
		});
		l24.setOnMouseClicked(e -> {
			l24.setVisible(false);
			l25.setVisible(true);
		});
		l25.setOnMouseClicked(e -> {
			l25.setVisible(false);
			l26.setVisible(true);
			humanFadeTransition.setNode(human);
			humanFadeTransition.setDuration(Duration.millis(2000));
			humanFadeTransition.setFromValue(1);
			humanFadeTransition.setToValue(0);
			humanFadeTransition.setAutoReverse(true);
			humanFadeTransition.setCycleCount(2);
			humanFadeTransition.play();
			fadeTransition.setNode(iV);
			fadeTransition.setDuration(Duration.millis(2000));
			fadeTransition.setFromValue(1);
			fadeTransition.setToValue(0);
			fadeTransition.play();
		});
		l26.setOnMouseClicked(e -> {
			l26.setVisible(false);
			l27.setVisible(true);
			fadeTransition.stop();
			humanFadeTransition.stop();
			iV.setImage(null);
			iV.setOpacity(1);
			human.setOpacity(1);
		});
		l27.setOnMouseClicked(e -> {
			l27.setVisible(false);
			l28.setVisible(true);
			name1.setVisible(true);
			name2.setVisible(false);
			human.setOpacity(0.8);
			iV.setImage(new Image("Images/�_���Ĥ�.png"));
			iV.setFitHeight(300);
			iV.setFitWidth(610);
			iV.setLayoutX(168);
			iV.setLayoutY(20);
		});
		l28.setOnMouseClicked(e -> {
			human.setOpacity(1);
			l28.setVisible(false);
			l29.setVisible(true);
			name1.setVisible(false);
			name2.setVisible(true);

		});
		l29.setOnMouseClicked(e -> {
			human.setOpacity(0.8);
			l29.setVisible(false);
			l30.setVisible(true);
			name1.setVisible(true);
			name2.setVisible(false);
			iV.setImage(new Image("Images/��_��.png"));

		});
		l30.setOnMouseClicked(e -> {
			l30.setVisible(false);
			l31.setVisible(true);
			name1.setVisible(false);
			name2.setVisible(true);
			human.setOpacity(1);
			shakingImage(human);
		});
		l31.setOnMouseClicked(e -> {
			human.setOpacity(0.8);
			l31.setVisible(false);
			l32.setVisible(true);
			name1.setVisible(true);
			name2.setVisible(false);
			shakinglabel(l32);
			shakinglabel(name1);
			iV.setImage(new Image("Images/��_��.png"));
		});
		l32.setOnMouseClicked(e -> {
			human.setOpacity(0.8);
			l32.setVisible(false);
			l33.setVisible(true);
		});
		l33.setOnMouseClicked(e -> {
			human.setOpacity(1);
			l33.setVisible(false);
			l34.setVisible(true);
			name1.setVisible(false);
			name2.setVisible(true);
		});
		l34.setOnMouseClicked(e -> {
			l34.setVisible(false);
			l35.setVisible(true);
			name1.setVisible(true);
			name2.setVisible(false);
		});
		l35.setOnMouseClicked(e -> {
			l36.setVisible(true);
			l35.setVisible(false);
			name1.setVisible(false);
			fadeTransition.setDuration(Duration.millis(2000));
			fadeTransition.play();
			humanFadeTransition.setDuration(Duration.millis(2000));
			humanFadeTransition.setAutoReverse(false);
			humanFadeTransition.setCycleCount(1);
			humanFadeTransition.play();
			labelFadeTransition.setNode(l36);
			labelFadeTransition.setDuration(Duration.millis(4000));
			labelFadeTransition.setFromValue(0);
			labelFadeTransition.setToValue(1);
			labelFadeTransition.play();

		});
		l36.setOnMouseClicked(e -> {
			fadeTransition.stop();
			humanFadeTransition.stop();
			labelFadeTransition.stop();
			iV.setImage(new Image("Images/village.png"));
			iV.setOpacity(0);
			iV.setFitHeight(540);
			iV.setFitWidth(960);
			iV.setLayoutX(0);
			iV.setLayoutY(0);
			makefadein(human);
			makefadein(iV);
			human.setOpacity(0);
			l36.setVisible(false);
			l37.setVisible(true);
			name2.setVisible(true);
		});
		l37.setOnMouseClicked(e -> {
			l37.setVisible(false);
			l38.setVisible(true);
			name2.setVisible(false);
		});
		l38.setOnMouseClicked(e -> {
			l38.setVisible(false);
			makefadeout(human);
			makefadeout(iV);
			player.heal();
			player.mpHeal();
			tsetName.start();
			
			stage.close();
		});

		for (Label label : labels) {
			label.setPrefSize(800, 145);
			label.setLayoutX(75);
			label.setLayoutY(325);
		}

		AnchorPane ap = new AnchorPane();
		ap.getChildren().addAll(iV, human);
		for (Label label : labels) {
			ap.getChildren().add(label);
		}

		ap.getChildren().addAll(name1, name2);
		Scene scene = new Scene(ap);
		stage.setScene(scene);
		stage.setHeight(540);
		stage.setWidth(960);
		stage.setResizable(false);
		stage.setTitle("�ǳ�");
		stage.show();
	}

	private void makefadeout(ImageView imageView) {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(2000));
		fadeTransition.setNode(imageView);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.play();
	}

	private void makefadeout2(ImageView imageView) {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(3500));
		fadeTransition.setNode(imageView);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.play();
	}

	private void tempfadein(ImageView imageView) {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(0));
		fadeTransition.setNode(imageView);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
	}

	private void makefadein(Label label) {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(4000));
		fadeTransition.setNode(label);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
	}

	private void tempfadeinhuman(ImageView imageView) {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(0));
		fadeTransition.setNode(imageView);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
	}

	private void humanfadein(ImageView imageView) {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(800));
		fadeTransition.setNode(imageView);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
	}

	private void makefadein(ImageView imageView) {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(2000));
		fadeTransition.setNode(imageView);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
	}

	private void shakinglabel(Label label) {
		TranslateTransition translateTransition = new TranslateTransition(Duration.millis(50), label);
		translateTransition.setByX(10f);
		translateTransition.setCycleCount(4);
		translateTransition.setAutoReverse(true);
		translateTransition.playFromStart();
	}

	private void shakingImage(ImageView imageView) {
		TranslateTransition translateTransition = new TranslateTransition(Duration.millis(50), imageView);
		translateTransition.setByX(5f);
		translateTransition.setCycleCount(4);
		translateTransition.setAutoReverse(true);
		translateTransition.playFromStart();
	}

}
