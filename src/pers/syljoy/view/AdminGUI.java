package pers.syljoy.view;

import pers.syljoy.vo.Admin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdminGUI extends JFrame implements ActionListener{
	private JPanel jp1,jp2,jp3,jp4,jp;
	private JLabel jlb1,jlb2;
	private JMenuBar jmb;
	private JMenu jm1,jm2;
	private JMenuItem jmi1,jmi2,jmi3,jmi4;
	private StuManage stumanage;
	public AdminGUI(Admin admin){
		stumanage = new StuManage();
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		jp = new JPanel();
		jlb1 = new JLabel("欢迎"+admin.getId()+"登陆学生管理系统");
		jlb1.setFont(new Font("楷体", Font.BOLD, 80));
		jlb1.setForeground(new Color(250, 255, 240));
		jlb2 = new JLabel("菜单");
		jlb2.setHorizontalAlignment(JLabel.CENTER);//居中
		jlb2.setFont(new Font("楷体", Font.BOLD, 40));
		jlb2.setForeground(new Color(255, 255, 255));
		jmb = new JMenuBar();
		jm1 = new JMenu("系统");
		jm1.setFont(new Font("宋体", Font.BOLD, 15));
		jm1.setPreferredSize(new Dimension(100, 15));
		jmi1 = new JMenuItem("首页");
		jmi2 = new JMenuItem("关于");
		jm2 = new JMenu("退出");
		jmi3 = new JMenuItem("退出账号");
		jmi4 = new JMenuItem("退出系统");
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		jmi3.addActionListener(this);
		jmi4.addActionListener(this);
		jm2.add(jmi3);
		jm2.add(jmi4);
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jm2);
		jmb.add(jm1);
		this.setJMenuBar(jmb);
		//学生管理
		JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
		JPanel jp7 = new JPanel();
		jtp.add(jp7,"学生管理");
		JButton stujb1 = new JButton("增加学生    ");
		stujb1.setIcon(new ImageIcon("image/add.png"));
		stujb1.setPreferredSize(new Dimension(190, 45));
		stujb1.setFont(new Font("楷体",Font.BOLD, 20));
		JButton stujb2 = new JButton("删除学生    ");
		stujb2.setIcon(new ImageIcon("image/delete.png"));
		stujb2.setPreferredSize(new Dimension(190, 45));
		stujb2.setFont(new Font("楷体",Font.BOLD, 20));
		JButton stujb3 = new JButton("查询学生信息");
		stujb3.setIcon(new ImageIcon("image/query.png"));
		stujb3.setPreferredSize(new Dimension(190, 45));
		stujb3.setFont(new Font("楷体",Font.BOLD, 20));
		JButton stujb4 = new JButton("修改学生信息");
		stujb4.setIcon(new ImageIcon("image/revise.png"));
		stujb4.setPreferredSize(new Dimension(190, 45));
		stujb4.setFont(new Font("楷体",Font.BOLD, 20));
		JButton stujb5 = new JButton("查询学生成绩");
		stujb5.setIcon(new ImageIcon("image/score.png"));
		stujb5.setPreferredSize(new Dimension(190, 45));
		stujb5.setFont(new Font("楷体",Font.BOLD, 20));
		JButton stujb6 = new JButton("录入学生成绩");
		stujb6.setIcon(new ImageIcon("image/entry score.png"));
		stujb6.setPreferredSize(new Dimension(190, 45));
		stujb6.setFont(new Font("楷体",Font.BOLD, 20));
		stujb1.addActionListener(this);
		stujb2.addActionListener(this);
		stujb3.addActionListener(this);
		stujb4.addActionListener(this);
		stujb5.addActionListener(this);
		stujb6.addActionListener(this);
		jp7.add(stujb1);
		jp7.add(stujb2);
		jp7.add(stujb3);
		jp7.add(stujb4);
		jp7.add(stujb5);
		jp7.add(stujb6);
		//教师管理
//		JPanel jp8 = new JPanel();
//		jtp.add(jp8,"教师管理");
//		JButton tchjb1 = new JButton("增加教师    ");
//		tchjb1.setIcon(new ImageIcon("image/add.png"));
//		tchjb1.setPreferredSize(new Dimension(190, 45));
//		tchjb1.setFont(new Font("楷体",Font.BOLD, 20));
//		JButton tchjb2 = new JButton("删除教师    ");
//		tchjb2.setIcon(new ImageIcon("image/delete.png"));
//		tchjb2.setPreferredSize(new Dimension(190, 45));
//		tchjb2.setFont(new Font("楷体",Font.BOLD, 20));
//		JButton tchjb3 = new JButton("查询教师信息");
//		tchjb3.setIcon(new ImageIcon("image/query.png"));
//		tchjb3.setPreferredSize(new Dimension(190, 45));
//		tchjb3.setFont(new Font("楷体",Font.BOLD, 20));
//		JButton tchjb4 = new JButton("修改教师信息");
//		tchjb4.setIcon(new ImageIcon("image/revise.png"));
//		tchjb4.setPreferredSize(new Dimension(190, 45));
//		tchjb4.setFont(new Font("楷体",Font.BOLD, 20));
//		tchjb1.addActionListener(this);
//		tchjb2.addActionListener(this);
//		tchjb3.addActionListener(this);
//		tchjb4.addActionListener(this);
//		jp8.add(tchjb1);
//		jp8.add(tchjb2);
//		jp8.add(tchjb3);
//		jp8.add(tchjb4);

		JPanel jp6 = new JPanel();
		jp6.setLayout(new BorderLayout());
		jp6.add(jtp,BorderLayout.CENTER);

		jp1.add(jlb1);
		jp2.setLayout(new BorderLayout(100,10));
		jp2.add(jlb2,BorderLayout.NORTH);
		jp2.add(jp6,BorderLayout.CENTER);
		jp2.setPreferredSize(new Dimension(190, 10));
		jp2.add(jp6);
		JLabel jlb = new JLabel("欢迎进入系统！");
		jlb.setFont(new Font("楷体", Font.BOLD, 90));
		jlb.setForeground(new Color(0, 0, 0));
		jp.add(jlb, BorderLayout.CENTER);

		jp1.setBackground(new Color(128, 138, 135));
		jp2.setBackground(new Color(128, 138, 135));
		jp3.setBackground(new Color(100, 100, 100));
		jp4.setBackground(new Color(150, 150, 150));
		jp.setBackground(new Color(245, 245, 245));

		this.setLayout(new BorderLayout(5,5));
		this.add(jp1,"North");
		this.add(jp2,"West");
		this.add(jp,"Center");
		this.setTitle("学生教师管理系统");
		this.setIconImage(this.getToolkit().getImage("image/Login.png"));
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="增加学生    "){
			jp.removeAll();
			jp.add(stumanage.addStudent());
			jp.repaint();
			jp.validate();
		}
		else if(e.getActionCommand()=="删除学生    "){
			jp.removeAll();
			jp.add(stumanage.delStudent());
			jp.repaint();
			jp.validate();
		}
		else if(e.getActionCommand()=="查询学生信息"){
			jp.removeAll();
			jp.add(stumanage.queryAll());
			jp.repaint();
			jp.validate();
		}
		else if(e.getActionCommand() == "修改学生信息"){
			jp.removeAll();
			jp.add(stumanage.updateStudent());
			jp.repaint();
			jp.validate();
		}
		else if(e.getActionCommand() == "查询学生成绩"){
			jp.removeAll();
			jp.add(stumanage.queryAllScore());
			jp.repaint();
			jp.validate();
		}
		else if(e.getActionCommand() == "录入学生成绩"){
			jp.removeAll();
			jp.add(stumanage.updateAllScore());
			jp.repaint();
			jp.validate();
		}
//		else if(e.getActionCommand() == "增加教师    "){
//			jp.removeAll();
//			jp.add(tchmanage.addTeacher());
//			jp.repaint();
//			jp.validate();
//		}
//		else if(e.getActionCommand() == "删除教师    "){
//			jp.removeAll();
//			jp.add(tchmanage.delTeacher());
//			jp.repaint();
//			jp.validate();
//		}
//		else if(e.getActionCommand() == "查询教师信息"){
//			jp.removeAll();
//			jp.add(tchmanage.queryAll());
//			jp.repaint();
//			jp.validate();
//		}
//		else if(e.getActionCommand() == "修改教师信息"){
//			jp.removeAll();
//			jp.add(tchmanage.updateTeacher());
//			jp.repaint();
//			jp.validate();
//		}
		else if(e.getActionCommand() == "首页"){
			jp.removeAll();
			JLabel jlb = new JLabel("欢迎进入系统！");
			jlb.setFont(new Font("楷体", Font.BOLD, 90));
			jlb.setForeground(new Color(0, 0, 0));
			jp.add(jlb, BorderLayout.CENTER);
			jp.repaint();
			jp.validate();
		}
		else if(e.getActionCommand() == "关于"){
			ImageIcon ic = new ImageIcon("image/logo.png");
			JOptionPane.showMessageDialog(null,"Student Management\n\nVersion:1.1.0\n(c)Copyright ShiYunlong\n\n","About",JOptionPane.WARNING_MESSAGE,ic);
		}
		else if(e.getActionCommand() == "退出账号"){
			this.dispose();
			new Login();
		}
		else if(e.getActionCommand() == "退出系统"){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new AdminGUI(new Admin());
	}
}
