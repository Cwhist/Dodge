package core;

import java.awt.Point;

import javax.swing.ImageIcon;

public class GameCharacter {
	private Point currentPosition;
	private Point sizeRange;
	private ImageIcon characterImage = new ImageIcon("gamefiles/images/gamecharacter.png");
	private int highScore;//�ϴ� 100���� �����ھƳ��� ��ŷ��� �׽�Ʈ
	
	public GameCharacter() {
		currentPosition = new Point(400, 500);
		sizeRange = new Point(30,30);
		highScore = 0;
	}
	
	public Point getCurrentPosition() {
		return currentPosition;
	}
	
	public Point getSizeRange() {
		return sizeRange;
	}
	
	public ImageIcon getCharacterImage() {
		return characterImage;
	}
	
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
}
