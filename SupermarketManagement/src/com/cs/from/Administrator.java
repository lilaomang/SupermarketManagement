package com.cs.from;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.cs.main.MainFrame;


/**
 * ϵͳ��¼����ģ�顪��login
 * ���ܣ�����ϵͳ�İ�ȫ�ԣ�����ֻ��ͨ��ϵͳ������֤���û�����ʹ�ñ�ϵͳ
 * @author MiracleWong
 *
 */
public class Administrator extends JDialog{
	//����
	JPanel jPanel1 = new JPanel();
	JTextField jTextField1 = new JTextField();
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	JPasswordField jPasswordField1 = new JPasswordField();
	
	public  Administrator(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//��Java���������ر�ʱ���ã�ͬʱ������������ڴ��������
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//���ڵĳ�ʼ������
			pack();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Administrator() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"����Ա��¼",false);
		this.setSize(400, 300);
		this.setLocationRelativeTo(getOwner());			//�������
		this.setVisible(true);							//��ʾ����
	}
	
	//jbInit()Ϊ�Զ���Ĵ���ʵ������������ʼ������
	private void jbInit() throws Exception{
		jPanel1.setLayout(null);	//ȥ������Ĭ�ϲ���
		//������ʾ����
		jTextField1.setBounds(new Rectangle(158, 87, 100, 25));
		jLabel1.setText("�û���");
		jLabel1.setBounds(new Rectangle(78, 87, 49, 25));
		jLabel2.setText("��    ��");
		jLabel2.setBounds(new Rectangle(76, 124, 49, 25));
//		jLabel3.setFont(new java.awt.Font("����", Font.PLAIN, 20));	//��������
		jLabel3.setText("����Ա��¼");
		jLabel3.setBounds(new Rectangle(145, 30, 113, 27));
		jButton1.setText("��    ¼");
		jButton1.setBounds(new Rectangle(75, 206, 83, 25));
		jButton1.addActionListener(new Administrator_jButton1_actionAdapter(this));		//ע�������
		jButton2.setText("ȡ    ��");
		jButton2.setBounds(new Rectangle(210, 206, 83, 25));
		jButton2.addActionListener(new Administrator_jButton1_actionAdapter(this));		//ע�������
		
		jPasswordField1.setBounds(new Rectangle(158, 125, 101, 25));
		//��ʼ��һ��������������jPanel1
		this.getContentPane().add(jPanel1);
		//��������ӵ�jpanel1��
		jPanel1.add(jLabel3);
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField1);
		jPanel1.add(jLabel2);
		jPanel1.add(jButton1);
		jPanel1.add(jButton2);
		jPanel1.add(jPasswordField1);
	}
	//jButton1�ļ����¼�
	public void jButton1_acactionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Vector user = new Vector();
        String name = jTextField1.getText();
        String password = jPasswordField1.getText();
//      user = find_goods_info.Select_User(name, password);
        if (user.size() != 0) {
            this.setVisible(false);		//��֤ͨ�����ص�ǰ����
            register zhuce = new register();
            zhuce.setVisible(true);		//����ע�ᴰ��
            zhuce.setTitle("ע���û�");
        }
        else {
            JOptionPane.showMessageDialog(this, "�û��������벻��ȷ,����������", "����",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
	}
	//jButton2�ļ����¼�
	public void jButton2_acactionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
	}
}

class Administrator_jButton1_actionAdapter implements ActionListener {
	private Administrator adaptee;
	Administrator_jButton1_actionAdapter(Administrator adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_acactionPerformed(e);
	}
}

class Administrator_jButton2_actionAdapter implements ActionListener {
	private Administrator adaptee;
	Administrator_jButton2_actionAdapter(Administrator adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton2_acactionPerformed(e);
	}
}