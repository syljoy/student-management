package pers.syljoy.view;

import pers.syljoy.service.StudentService;
import pers.syljoy.vo.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

public class StuManage implements ActionListener{
	private StudentService service;
	private Student student;
	private JTextField jtf1, jtf2, jtf4, jtf5, jtf6, jtf7, jtf8;
	private JPasswordField jpf3;
	private JPanel jPanel;
	public Component addStudent() {
		service = new StudentService();
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout(10,10));
		JLabel jlb = new JLabel("增加学生");
		jlb.setFont(new Font("楷体", Font.BOLD, 60));
		jlb.setForeground(new Color(0, 0, 0));
		JLabel jlb1 = new JLabel("学号：");
		JLabel jlb2 = new JLabel("姓名：");
		JLabel jlb3 = new JLabel("密码：");
		JLabel jlb4 = new JLabel("生日：");
		JLabel jlb5 = new JLabel("年");
		JLabel jlb6 = new JLabel("月");
		JLabel jlb7 = new JLabel("日");
		JLabel jlb8 = new JLabel("电话：");
		JLabel jlb9 = new JLabel("地址：");
		jlb1.setFont(new Font("宋体", Font.BOLD, 40));
		jlb2.setFont(new Font("宋体", Font.BOLD, 40));
		jlb3.setFont(new Font("宋体", Font.BOLD, 40));
		jlb4.setFont(new Font("宋体", Font.BOLD, 40));
		jlb5.setFont(new Font("宋体", Font.BOLD, 40));
		jlb6.setFont(new Font("宋体", Font.BOLD, 40));
		jlb7.setFont(new Font("宋体", Font.BOLD, 40));
		jlb8.setFont(new Font("宋体", Font.BOLD, 40));
		jlb9.setFont(new Font("宋体", Font.BOLD, 40));
		jtf1 = new JTextField(20);
		jtf2 = new JTextField(20);
		jpf3 = new JPasswordField(20);
		jtf4 = new JTextField(6);
		jtf5 = new JTextField(3);
		jtf6 = new JTextField(3);
		jtf7 = new JTextField(20);
		jtf8 = new JTextField(20);
		jtf1.setMaximumSize(new Dimension(5, 10));
		jtf1.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf1.setPreferredSize(new Dimension(100, 40));
		jtf2.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf2.setPreferredSize(new Dimension(100, 40));
		jpf3.setFont(new Font("宋体", Font.PLAIN, 40));
		jpf3.setPreferredSize(new Dimension(100, 40));
		jtf4.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf4.setPreferredSize(new Dimension(100, 40));
		jtf5.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf5.setPreferredSize(new Dimension(100, 40));
		jtf6.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf6.setPreferredSize(new Dimension(100, 40));
		jtf7.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf7.setPreferredSize(new Dimension(100, 40));
		jtf8.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf8.setPreferredSize(new Dimension(100, 40));
		JButton jb1 = new JButton("提交");
		JButton jb2 = new JButton("重置");
		jb1.setIcon(new ImageIcon("image/001.png"));
		jb1.setFont(new Font("楷体", Font.BOLD, 25));
		jb2.setIcon(new ImageIcon("image/002.png"));
		jb2.setFont(new Font("楷体", Font.BOLD, 25));
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		JPanel jp6 = new JPanel();
		JPanel jp7 = new JPanel();
		JPanel jp8 = new JPanel();
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp2.add(jlb2);
		jp2.add(jtf2);
		jp3.add(jlb3);
		jp3.add(jpf3);
		jp4.add(jlb4);
		jp4.add(jtf4);
		jp4.add(jlb5);
		jp4.add(jtf5);
		jp4.add(jlb6);
		jp4.add(jtf6);
		jp4.add(jlb7);
		jp5.add(jlb8);
		jp5.add(jtf7);
		jp6.add(jlb9);
		jp6.add(jtf8);
		jp8.add(jb1);
		jp8.add(new JLabel("                      "));
		jp8.add(jb2);
		jp7.setLayout(new GridLayout(10, 1));
		jp7.add(new JPanel());
		jp7.add(jp1);
		jp7.add(jp2);
		jp7.add(jp3);
		jp7.add(jp4);
		jp7.add(jp5);
		jp7.add(jp6);
		jp7.add(new JPanel());
		jp7.add(jp8);
		jp.setLayout(new BorderLayout(10,10));
		jp.add(jlb, "North");
		jp.add(jp7,"Center");
		jp.setPreferredSize(new Dimension(1300, 800));
		return jp;
	}
	public Component delStudent() {
		service = new StudentService();
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout(10,10));
		JLabel jlb = new JLabel("删除学生");
		jlb.setFont(new Font("楷体", Font.BOLD, 60));
		jlb.setForeground(new Color(0, 0, 0));
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JLabel jlb1 = new JLabel("请输入要删除学生的学号：");
		jlb1.setFont(new Font("宋体", Font.BOLD, 40));
		jtf1 = new JTextField(20);
		jtf1.setMaximumSize(new Dimension(5, 10));
		jtf1.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf1.setPreferredSize(new Dimension(100, 40));
		JButton jb1 = new JButton("删除");
		JButton jb2 = new JButton("重置");
		jb1.setIcon(new ImageIcon("image/001.png"));
		jb1.setFont(new Font("楷体", Font.BOLD, 25));
		jb2.setIcon(new ImageIcon("image/002.png"));
		jb2.setFont(new Font("楷体", Font.BOLD, 25));
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jp2.setLayout(new GridLayout(10, 1));
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp3.add(jb1);
		jp3.add(new JLabel("                      "));
		jp3.add(jb2);
		jp2.add(new JPanel());jp2.add(new JPanel());
		jp2.add(jp1);
		jp2.add(new JPanel());
		jp2.add(new JPanel());
		jp2.add(new JPanel());
		jp2.add(new JPanel());
		jp2.add(new JPanel());
		jp2.add(jp3);
		jp.setLayout(new BorderLayout(10,10));
		jp.add(jlb, "North");
		jp.add(jp2,"Center");
		jp.setPreferredSize(new Dimension(1300, 800));
		return jp;
	}
	public Component queryAll() {
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout(10,10));
		JLabel jlb = new JLabel("全部的学生信息");
		jlb.setFont(new Font("楷体", Font.BOLD, 60));
		jlb.setForeground(new Color(0, 0, 0));
		service = new StudentService();
		String[] columnNames = {"Id","Name","Birthday","Phone","Address","Math","English","Java","C","PE"};
		List<Student> studentList = service.queryAll();
		String[][] date = new String[studentList.size()][10];
		for(int i=0;i<studentList.size();i++){
			student = studentList.get(i);
			date[i][0] = student.getStuId();
			date[i][1] = student.getStuName();
			date[i][2] = student.getStuBirthday();
			date[i][3] = student.getStuPhone();
			date[i][4] = student.getStuAddress();
			if(student.getStuMath() < 0)
				date[i][5] = "";
			else if(student.getStuMath() < 60)
				date[i][5] = Double.toString(student.getStuMath())+"(不及格)";
			else
				date[i][5] = Double.toString(student.getStuMath());
			if(student.getStuEnglish() < 0)
				date[i][6] = "";
			else if(student.getStuEnglish() < 60)
				date[i][6] = Double.toString(student.getStuEnglish())+"(不及格)";
			else
				date[i][6] = Double.toString(student.getStuEnglish());
			if(student.getStuJava() < 0)
				date[i][7] = "";
			else if(student.getStuJava() < 60)
				date[i][7] = Double.toString(student.getStuJava())+"(不及格)";
			else
				date[i][7] = Double.toString(student.getStuJava());
			if(student.getStuC() < 0)
				date[i][8] = "";
			else if(student.getStuC() < 60)
				date[i][8] = Double.toString(student.getStuC())+"(不及格)";
			else
				date[i][8] = Double.toString(student.getStuC());
			if(student.getStuPE() < 0)
				date[i][9] = "";
			else if(student.getStuPE() < 60)
				date[i][9] = Double.toString(student.getStuPE())+"(不及格)";
			else
				date[i][9] = Double.toString(student.getStuPE());
		}

		JTable jt = new JTable(date, columnNames);
		jt.setPreferredScrollableViewportSize(new Dimension(1000,500));//设置表格的大小
		jt.setRowHeight(20);//设置每行的高度为20
		jt.setRowHeight (0, 20);//设置第1行的高度为15
		jt.setRowMargin (5);//设置相邻两行单元格的距离
		jt.setRowSelectionAllowed (true);//设置可否被选择.默认为false
		jt.setSelectionBackground (Color.white);//设置所选择行的背景色
		jt.setSelectionForeground (Color.red);//设置所选择行的前景色
		jt.setGridColor (Color.black);//设置网格线的颜色
		jt.setShowHorizontalLines (true);//是否显示水平的网格线
		jt.setShowVerticalLines (true);//是否显示垂直的网格线
		jt.setEnabled(false);
		jt.setBounds(500, 500, 70, 20);
		DefaultTableCellRenderer r   = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		jt.setDefaultRenderer(Object.class, r);
		JScrollPane jsp = new JScrollPane (jt);
		jp.setLayout(new BorderLayout(10,10));
		if(date.length == 0){
			jlb.setText("没有学生！");
			jlb.setHorizontalAlignment(JLabel.CENTER);//居中
			jp.add(jlb, "Center");
			jp.setPreferredSize(new Dimension(1300, 800));
		}
		else{
			jp.add(jlb, "North");
			jp.add(jsp,"Center");
			jp.setPreferredSize(new Dimension(1300, 800));
		}
		return jp;
	}
	public Component queryStudent() {
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout(10,10));
		JLabel jlb = new JLabel("查");
		jlb.setFont(new Font("楷体", Font.BOLD, 60));
		jlb.setForeground(new Color(0, 0, 0));
		JPanel jp1 = new JPanel();


		jp.setLayout(new BorderLayout(10,10));
		jp.add(jlb, "North");
		jp.add(jp1,"Center");
		jp.setPreferredSize(new Dimension(1300, 800));
		return jp;
	}
	public Component updateStudent() {
		service = new StudentService();
		JPanel jp = new JPanel();
		jPanel = new JPanel();
		jp.setLayout(new BorderLayout(10,10));
		JLabel jlb = new JLabel("修改学生信息");
		jlb.setFont(new Font("楷体", Font.BOLD, 60));
		jlb.setForeground(new Color(0, 0, 0));
		JPanel jp1 = new JPanel();
		JLabel jlb1 = new JLabel("请输入要修改学生的学号：");
		jlb1.setFont(new Font("宋体", Font.BOLD, 40));
		jtf1 = new JTextField(20);
		jtf1.setMaximumSize(new Dimension(5, 10));
		jtf1.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf1.setPreferredSize(new Dimension(100, 40));
		JButton jb1 = new JButton("确定");
		jb1.setIcon(new ImageIcon("image/001.png"));
		jb1.setFont(new Font("楷体", Font.BOLD, 20));
		jb1.addActionListener(this);
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp1.add(new JLabel("         "));
		jp1.add(jb1);
		jPanel.add(new JLabel(""));
		JPanel jp2 = new JPanel();
		jp2.setLayout(new BorderLayout());
		jp2.add(jp1,"North");
		jp2.add(jPanel,"Center");
		jp.setLayout(new BorderLayout(10,10));
		jp.add(jlb, "North");
		jp.add(jp2,"Center");
		jp.setPreferredSize(new Dimension(1300, 800));
		return jp;
	}
	public Component updateOneStudent(Student student) {
		JPanel jp8 = new JPanel();
		JPanel jp = new JPanel();
		service = new StudentService();

		student = service.queryStudent(student.getStuId());
		JLabel jlb = new JLabel("修改我的信息");
		jlb.setFont(new Font("楷体", Font.BOLD, 60));
		jlb.setForeground(new Color(0, 0, 0));
		JLabel jlb1 = new JLabel("学号：");
		JLabel jlb2 = new JLabel("姓名：");
		JLabel jlb3 = new JLabel("密码：");
		JLabel jlb4 = new JLabel("生日：");
		JLabel jlb5 = new JLabel("电话：");
		JLabel jlb6 = new JLabel("地址：");
		jlb1.setFont(new Font("宋体", Font.BOLD, 40));
		jlb2.setFont(new Font("宋体", Font.BOLD, 40));
		jlb3.setFont(new Font("宋体", Font.BOLD, 40));
		jlb4.setFont(new Font("宋体", Font.BOLD, 40));
		jlb5.setFont(new Font("宋体", Font.BOLD, 40));
		jlb6.setFont(new Font("宋体", Font.BOLD, 40));
		jtf1 = new JTextField(20);
		jtf8 = new JTextField(20);
		jtf7 = new JTextField(20);
		jtf7.setText(student.getStuId());
		jtf7.setEnabled(false);
		jtf2 = new JTextField(20);
		jtf2.setText(student.getStuName());
		jpf3 = new JPasswordField(20);
		jpf3.setText(student.getStuPassword());
		jtf4 = new JTextField(20);
		jtf4.setText(student.getStuBirthday());
		jtf5= new JTextField(20);
		jtf5.setText(student.getStuPhone());
		jtf6= new JTextField(20);
		jtf6.setText(student.getStuAddress());
		jtf2.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf2.setPreferredSize(new Dimension(100, 40));
		jpf3.setFont(new Font("宋体", Font.PLAIN, 40));
		jpf3.setPreferredSize(new Dimension(100, 40));
		jtf4.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf4.setPreferredSize(new Dimension(100, 40));
		jtf5.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf5.setPreferredSize(new Dimension(100, 40));
		jtf6.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf6.setPreferredSize(new Dimension(100, 40));
		jtf7.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf7.setPreferredSize(new Dimension(100, 40));
		JButton jb1 = new JButton("修改");
		jb1.setIcon(new ImageIcon("image/001.png"));
		jb1.setFont(new Font("楷体", Font.BOLD, 25));
		jb1.addActionListener(this);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		JPanel jp6 = new JPanel();
		JPanel jp7 = new JPanel();

		jp1.add(jlb1);
		jp1.add(jtf7);
		jp2.add(jlb2);
		jp2.add(jtf2);
		jp3.add(jlb3);
		jp3.add(jpf3);
		jp4.add(jlb4);
		jp4.add(jtf4);
		jp5.add(jlb5);
		jp5.add(jtf5);
		jp6.add(jlb6);
		jp6.add(jtf6);
		jp7.add(jb1);

		jp.setLayout(new GridLayout(9,1));

		jp.add(jp1);
		jp.add(jp2);
		jp.add(jp3);
		jp.add(jp4);
		jp.add(jp5);
		jp.add(jp6);
		jp.add(new JPanel());
		jp.add(jp7);
		jp8.setLayout(new BorderLayout(10,10));
		jp8.add(jlb, "North");
		jp8.add(jp,"Center");
		jp8.setPreferredSize(new Dimension(1300, 800));
		return jp8;
	}
	private Component setJPanel(String stuId){
		JPanel jp = new JPanel();
		student = service.queryStudent(stuId);
		JLabel jlb = new JLabel("-----------------------------------------------");
		JLabel jlb1 = new JLabel("学号：");
		JLabel jlb2 = new JLabel("姓名：");
		JLabel jlb3 = new JLabel("密码：");
		JLabel jlb4 = new JLabel("生日：");
		JLabel jlb5 = new JLabel("电话：");
		JLabel jlb6 = new JLabel("地址：");
		jlb.setFont(new Font("宋体", Font.BOLD, 40));
		jlb1.setFont(new Font("宋体", Font.BOLD, 40));
		jlb2.setFont(new Font("宋体", Font.BOLD, 40));
		jlb3.setFont(new Font("宋体", Font.BOLD, 40));
		jlb4.setFont(new Font("宋体", Font.BOLD, 40));
		jlb5.setFont(new Font("宋体", Font.BOLD, 40));
		jlb6.setFont(new Font("宋体", Font.BOLD, 40));
		jtf7 = new JTextField(20);
		jtf7.setText(stuId);
		jtf7.setEnabled(false);
		jtf2 = new JTextField(20);
		jtf2.setText(student.getStuName());
		jpf3 = new JPasswordField(20);
		jpf3.setText(student.getStuPassword());
		jtf4 = new JTextField(20);
		jtf4.setText(student.getStuBirthday());
		jtf5= new JTextField(20);
		jtf5.setText(student.getStuPhone());
		jtf6= new JTextField(20);
		jtf6.setText(student.getStuAddress());
		jtf1.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf1.setPreferredSize(new Dimension(100, 40));
		jtf2.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf2.setPreferredSize(new Dimension(100, 40));
		jpf3.setFont(new Font("宋体", Font.PLAIN, 40));
		jpf3.setPreferredSize(new Dimension(100, 40));
		jtf4.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf4.setPreferredSize(new Dimension(100, 40));
		jtf5.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf5.setPreferredSize(new Dimension(100, 40));
		jtf6.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf6.setPreferredSize(new Dimension(100, 40));
		jtf7.setFont(new Font("宋体", Font.PLAIN, 40));
		jtf7.setPreferredSize(new Dimension(100, 40));
		JButton jb1 = new JButton("修改");
		jb1.setIcon(new ImageIcon("image/001.png"));
		jb1.setFont(new Font("楷体", Font.BOLD, 25));
		jb1.addActionListener(this);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		JPanel jp6 = new JPanel();
		JPanel jp7 = new JPanel();

		jp1.add(jlb1);
		jp1.add(jtf7);
		jp2.add(jlb2);
		jp2.add(jtf2);
		jp3.add(jlb3);
		jp3.add(jpf3);
		jp4.add(jlb4);
		jp4.add(jtf4);
		jp5.add(jlb5);
		jp5.add(jtf5);
		jp6.add(jlb6);
		jp6.add(jtf6);
		jp7.add(jb1);

		jp.setLayout(new GridLayout(9,1));
		jp.add(jlb);
		jp.add(jp1);
		jp.add(jp2);
		jp.add(jp3);
		jp.add(jp4);
		jp.add(jp5);
		jp.add(jp6);
		jp.add(new JPanel());
		jp.add(jp7);
		return jp;
	}
	public Component queryAllScore() {
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout(10,10));
		JLabel jlb = new JLabel("全部的学生的成绩");
		jlb.setFont(new Font("楷体", Font.BOLD, 60));
		jlb.setForeground(new Color(0, 0, 0));
		service = new StudentService();
		String[] columnNames = {"Id","Name","Math","English","Java","C","PE"};
		List<Student> studentList = service.queryAll();
		String[][] date = new String[studentList.size()][7];
		for(int i=0;i<studentList.size();i++){
			student = studentList.get(i);
			date[i][0] = student.getStuId();
			date[i][1] = student.getStuName();
			if(student.getStuMath() < 0)
				date[i][2] = "";
			else if(student.getStuMath() < 60)
				date[i][2] = Double.toString(student.getStuMath())+"(不及格)";
			else
				date[i][2] = Double.toString(student.getStuMath());
			if(student.getStuEnglish() < 0)
				date[i][3] = "";
			else if(student.getStuEnglish() < 60)
				date[i][3] = Double.toString(student.getStuEnglish())+"(不及格)";
			else
				date[i][3] = Double.toString(student.getStuEnglish());
			if(student.getStuJava() < 0)
				date[i][4] = "";
			else if(student.getStuJava() < 60)
				date[i][4] = Double.toString(student.getStuJava())+"(不及格)";
			else
				date[i][4] = Double.toString(student.getStuJava());
			if(student.getStuC() < 0)
				date[i][5] = "";
			else if(student.getStuC() < 60)
				date[i][5] = Double.toString(student.getStuC())+"(不及格)";
			else
				date[i][5] = Double.toString(student.getStuC());
			if(student.getStuPE() < 0)
				date[i][6] = "";
			else if(student.getStuPE() < 60)
				date[i][6] = Double.toString(student.getStuPE())+"(不及格)";
			else
				date[i][6] = Double.toString(student.getStuPE());
		}

		JTable jt = new JTable(date, columnNames);
		jt.setPreferredScrollableViewportSize(new Dimension(1000,500));//设置表格的大小
		jt.setRowHeight(20);//设置每行的高度为20
		jt.setRowHeight (0, 20);//设置第1行的高度为15
		jt.setRowMargin (5);//设置相邻两行单元格的距离
		jt.setRowSelectionAllowed (true);//设置可否被选择.默认为false
		jt.setSelectionBackground (Color.white);//设置所选择行的背景色
		jt.setSelectionForeground (Color.red);//设置所选择行的前景色
		jt.setGridColor (Color.black);//设置网格线的颜色
		//jt.selectAll ();//选择所有行
		jt.setShowHorizontalLines (true);//是否显示水平的网格线
		jt.setShowVerticalLines (true);//是否显示垂直的网格线
		jt.setEnabled(false);
		jt.setBounds(500, 500, 70, 20);
		DefaultTableCellRenderer r   = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		jt.setDefaultRenderer(Object.class, r);
		JScrollPane jsp = new JScrollPane (jt);
		jp.setLayout(new BorderLayout(10,10));
		if(date.length == 0){
			jlb.setText("没有学生！");
			jlb.setHorizontalAlignment(JLabel.CENTER);//居中
			jp.add(jlb, "Center");
			jp.setPreferredSize(new Dimension(1300, 800));
		}
		else{
			jp.add(jlb, "North");
			jp.add(jsp,"Center");
			jp.setPreferredSize(new Dimension(1300, 800));
		}
		return jp;
	}

	public Component updateAllScore() {
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout(10,10));
		JLabel jlb = new JLabel("录入学生的成绩");
		jlb.setFont(new Font("楷体", Font.BOLD, 60));
		jlb.setForeground(new Color(0, 0, 0));
		service = new StudentService();
		String[] columnNames = {"Id","Name","Math","English","Java","C","PE"};
		List<Student> studentList = service.queryAll();
		String[][] date = new String[studentList.size()][7];
		for(int i=0;i<studentList.size();i++){
			student = studentList.get(i);
			date[i][0] = student.getStuId();
			date[i][1] = student.getStuName();
			if(student.getStuMath() < 0)
				date[i][2] = "";
			else if(student.getStuMath() < 60)
				date[i][2] = Double.toString(student.getStuMath())+"(不及格)";
			else
				date[i][2] = Double.toString(student.getStuMath());
			if(student.getStuEnglish() < 0)
				date[i][3] = "";
			else if(student.getStuEnglish() < 60)
				date[i][3] = Double.toString(student.getStuEnglish())+"(不及格)";
			else
				date[i][3] = Double.toString(student.getStuEnglish());
			if(student.getStuJava() < 0)
				date[i][4] = "";
			else if(student.getStuJava() < 60)
				date[i][4] = Double.toString(student.getStuJava())+"(不及格)";
			else
				date[i][4] = Double.toString(student.getStuJava());
			if(student.getStuC() < 0)
				date[i][5] = "";
			else if(student.getStuC() < 60)
				date[i][5] = Double.toString(student.getStuC())+"(不及格)";
			else
				date[i][5] = Double.toString(student.getStuC());
			if(student.getStuPE() < 0)
				date[i][6] = "";
			else if(student.getStuPE() < 60)
				date[i][6] = Double.toString(student.getStuPE())+"(不及格)";
			else
				date[i][6] = Double.toString(student.getStuPE());
		}


		String[][] date1 = new String[studentList.size()][7];
		for(int i=0;i<studentList.size();i++){
			for(int j=0;j<7;j++){
				date1[i][j] = date[i][j];
			}
		}

		JTable jt = new JTable(date, columnNames);

		jt.setPreferredScrollableViewportSize(new Dimension(1000,500));//设置表格的大小
		jt.setRowHeight(20);//设置每行的高度为20
		jt.setRowMargin (5);//设置相邻两行单元格的距离
		jt.setRowSelectionAllowed (true);//设置可否被选择.默认为false
		jt.setSelectionBackground (Color.GREEN);//设置所选择行的背景色
		jt.setSelectionForeground (Color.red);//设置所选择行的前景色
		jt.setGridColor (Color.black);//设置网格线的颜色
		jt.setShowHorizontalLines (true);//是否显示水平的网格线
		jt.setShowVerticalLines (true);//是否显示垂直的网格线
		jt.isCellEditable(1, 1);
		jt.setBounds(500, 500, 70, 20);
		DefaultTableCellRenderer r   = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		jt.setDefaultRenderer(Object.class, r);
		JScrollPane jsp = new JScrollPane (jt);
		jp.setLayout(new BorderLayout(10,10));

		JButton jb1 = new JButton("保存");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean flag = true;
				for(int i=0;i<date.length;i++){
					for(int j=2;j<7;j++){
						try{
							if(!date1[i][j].equals(jt.getValueAt(i, j))){
								String s = new String();
								if(jt.getValueAt(i, j).equals(""))
									s = "-1";
								else
									s = jt.getValueAt(i, j).toString();
								switch(j){
									case 2:
										service.updateStuMath(date1[i][0], Double.parseDouble(s));
										break;
									case 3:
										service.updateStuEnglish(date1[i][0], Double.parseDouble(s));
										break;
									case 4:
										service.updateStuJava(date1[i][0], Double.parseDouble(s));
										break;
									case 5:
										service.updateStuC(date1[i][0], Double.parseDouble(s));
										break;
									case 6:
										service.updateStuPE(date1[i][0], Double.parseDouble(s));
										break;
								}
							}
						}
						catch(NumberFormatException e1){
							flag = false;
							String s = new String();
							s = jt.getColumnName(j);
							jt.setRowSelectionInterval(i,i);
							JOptionPane.showMessageDialog(null,"学号为"+date1[i][0]+"的"+s+"成绩输入有误！","提示消息",JOptionPane.PLAIN_MESSAGE);
						}
					}
				}
				if(flag)
					JOptionPane.showMessageDialog(null,"保存成功！","提示消息",JOptionPane.PLAIN_MESSAGE);
			}
		});
		jb1.setIcon(new ImageIcon("image/001.png"));
		jb1.setFont(new Font("楷体", Font.BOLD, 25));
		jb1.addActionListener(this);
		JPanel jp1 = new JPanel();
		jp1.add(jb1);
		if(date.length == 0){
			jlb.setText("没有学生！");
			jlb.setHorizontalAlignment(JLabel.CENTER);//居中
			jp.add(jlb, "Center");
			jp.setPreferredSize(new Dimension(1300, 800));
		}
		else{
			jp.add(jlb, "North");
			jp.add(jsp,"Center");
			jp.add(jp1,"South");
			jp.setPreferredSize(new Dimension(1300, 800));
		}
		return jp;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="提交"){
			if(jtf1.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"请输入学号！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jtf2.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"请输入姓名！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jpf3.getPassword().length == 0){
				JOptionPane.showMessageDialog(null,"请输入密码！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jtf4.getText().isEmpty() || jtf5.getText().isEmpty() || jtf6.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"请输入生日！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jtf7.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"请输入电话！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jtf8.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"请输入地址！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(service.queryStudent(jtf1.getText()) == null){
				student = new Student(jtf1.getText(),jtf2.getText(),String.valueOf(jpf3.getPassword()),jtf4.getText()+"-"+jtf5.getText()+"-"+jtf6.getText(),jtf7.getText(),jtf8.getText());
				service.addStudent(student);
				JOptionPane.showMessageDialog(null,"增加成功！","提示消息",JOptionPane.PLAIN_MESSAGE);
				clear();
			}
			else{
				JOptionPane.showMessageDialog(null,"已存在学号为"+jtf1.getText()+"的学生","提示消息",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(e.getActionCommand()=="重置") {
			clear();
		}
		else if(e.getActionCommand()=="删除"){
			if(jtf1.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"请输入要删除学生的学号！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(service.queryStudent(jtf1.getText()) == null){
				JOptionPane.showMessageDialog(null,"未找到学号为"+jtf1.getText()+"的学生","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else{
				int n = JOptionPane.showConfirmDialog(null,"确定删除学号为"+jtf1.getText()+"的学生吗？","提示消息",JOptionPane.YES_NO_OPTION);
				if(n == JOptionPane.YES_OPTION){
					service.delStudent(jtf1.getText());
					JOptionPane.showMessageDialog(null,"删除成功！","提示消息",JOptionPane.PLAIN_MESSAGE);
					clear();
				}
				else if(n == JOptionPane.NO_OPTION){
					clear();
				}
			}
		}
		else if(e.getActionCommand() == "确定"){
			if(jtf1.getText().isEmpty())
				JOptionPane.showMessageDialog(null,"请输入要修改学生的学号！","提示消息",JOptionPane.WARNING_MESSAGE);
			else if(service.queryStudent(jtf1.getText()) == null)
				JOptionPane.showMessageDialog(null,"未找到学号为"+jtf1.getText()+"的学生","提示消息",JOptionPane.WARNING_MESSAGE);
			else{
				jPanel.removeAll();
				jPanel.add(setJPanel(jtf1.getText()));
				jPanel.repaint();
				jPanel.validate();

			}
		}
		else if(e.getActionCommand() == "修改"){
			if(jtf2.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"姓名不能为空！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jpf3.getPassword().length == 0){
				JOptionPane.showMessageDialog(null,"密码不能为空！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jtf4.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"生日不能为空！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jtf5.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"电话不能为空！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else if(jtf6.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"地址不能为空！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else{
				student = new Student(jtf7.getText(),jtf2.getText(),String.valueOf(jpf3.getPassword()),jtf4.getText(),jtf5.getText(),jtf6.getText());
				service.updateStu(student);
				JOptionPane.showMessageDialog(null,"修改成功！","提示消息",JOptionPane.PLAIN_MESSAGE);
				clear();
			}
		}
	}
	public void clear() {
		jtf1.setText("");
		jtf2.setText("");
		jpf3.setText("");
		jtf4.setText("");
		jtf5.setText("");
		jtf6.setText("");
		jtf7.setText("");
		jtf8.setText("");
	}
}