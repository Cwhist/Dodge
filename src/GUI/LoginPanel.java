package GUI;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.GameCharacter;
import core.GameManager;
//TODO
//	GamePanel���� �����Ǵ� GameCharacter ���⼭ �������� changePanel�� �����ֱ�
public class LoginPanel extends JPanel {
	private JLabel gameTitleLabel = new JLabel("�����ϱ�");
	private JLabel loginLabel = new JLabel("username : ");
	private JTextField usernameField = new JTextField();
	private JButton loginButton = new JButton("login");
	private GameCharacter gameCharacter = new GameCharacter();
	
	public LoginPanel() {
		setDefaultPanel();
		setLayout(null);

		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = usernameField.getText();
				if(username.trim().length() == 0) {
					System.exit(0);//�ӽ÷� ���α׷� ������ ���߿� ��ġ���� (�̸� ������ �Է��ؾߵ�)
				}
				try {
					GameManager.loadUser(username, gameCharacter);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				GameFrame.changePanel(MainPanel.class.getName(), gameCharacter);
			}
		});
		
		add(gameTitleLabel);
		add(loginButton);
		add(loginLabel);
		add(usernameField);
	}
	
	private void setDefaultPanel() {
		gameTitleLabel.setSize(400, 100);
		gameTitleLabel.setLocation(300, 100);
		gameTitleLabel.setFont(new Font("�ü�ü", Font.BOLD, 48));
		
		loginButton.setSize(100, 25);
		loginButton.setLocation(550, 350);
		loginButton.setFont(new Font("consolas", Font.BOLD, 20));
		
		usernameField.setSize(200, 25);
		usernameField.setLocation(300, 350);
		
		loginLabel.setSize(200, 25);
		loginLabel.setLocation(150, 350);
		loginLabel.setFont(new Font("consolas", Font.PLAIN, 20));
	}
}