package pers.syljoy.view;

import pers.syljoy.service.UserService;
import pers.syljoy.vo.Admin;
import pers.syljoy.vo.Student;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	private JPanel jp1,jp2,jp3,jp4,jp5,jp6;
	private JLabel jlb1,jlb2;//标签
	private JButton jb1,jb2;//按钮
	private JTextField jtf;
	private JPasswordField jpf;
	private JRadioButton jrb1,jrb3;
	private ButtonGroup bg;
	private String password;
	private UserService service;
	private Student student;
	private Admin admin;
	public Login(){
		password = "";
		service = new UserService();
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		jp5 = new JPanel();
		jp6 = new JPanel();
		jlb1 = new JLabel("用户名：");
		jlb2 = new JLabel("密    码：");
		jrb1 = new JRadioButton("学生");
		jrb3 = new JRadioButton("管理员");
		bg = new ButtonGroup();
		jb1 = new JButton("登录");
		jb2 = new JButton("重置");
		jb1.setIcon(new ImageIcon("image/001.png"));
		jb2.setIcon(new ImageIcon("image/002.png"));
		jtf= new JTextField(10);
		jpf = new JPasswordField(10);
		this.setLayout(new GridLayout(6,1));//6行 1列
		jrb1.setSelected(true);
		bg.add(jrb1);
		bg.add(jrb3);
		jp2.add(jlb1);
		jp2.add(jtf);
		jp3.add(jlb2);
		jp3.add(jpf);
		jp4.add(jrb1);
		jp4.add(jrb3);
		jp5.add(jb1);
		jp5.add(jb2);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		this.add(jp5);
		this.add(jp6);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		this.setIconImage(this.getToolkit().getImage("image/003.png"));
		this.setResizable(false);									//不可改变大小
		this.setLocation(660, 340);									//设置位置
		this.setTitle("用户登录");									//设置标题
		this.setSize(400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand()=="登录"){
			if(jrb1.isSelected()){
				student = new Student();
				student = null;
				student = service.queryStudent(jtf.getText());
				if(student != null)
					password = student.getStuPassword();
				System.out.println(student);
			}
			else{
				admin = new Admin();
				admin = service.queryAdmin(jtf.getText());
				if(admin != null)
					password = admin.getPasswword();
			}
			if(jtf.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"请输入用户名！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jpf.getPassword().length == 0){
				JOptionPane.showMessageDialog(null,"请输入密码！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jrb1.isSelected() && password.equals(String.valueOf(jpf.getPassword()))){
				this.setIconImage(this.getToolkit().getImage("image/Login.png"));
				JOptionPane.showMessageDialog(null,"登录成功！","提示消息",JOptionPane.PLAIN_MESSAGE);
				this.dispose();//销毁
				new StuGUI(student);
			}

			else if(jrb3.isSelected() && password.equals(String.valueOf(jpf.getPassword()))){
				this.setIconImage(this.getToolkit().getImage("image/Login.png"));
				JOptionPane.showMessageDialog(null,"登录成功！","提示消息",JOptionPane.PLAIN_MESSAGE);
				this.dispose();
				new AdminGUI(admin);
			}
			else{

				JOptionPane.showMessageDialog(null,"用户名或者密码错误！\n请重新输入","提示消息",JOptionPane.WARNING_MESSAGE);
				clear();
			}
		}
		else if(e.getActionCommand()=="重置") {
			clear();
		}
	}
	public void clear() {
		jtf.setText("");
		jpf.setText("");
	}
	public static void main(String[] args) {
		new Login();
	}
}
