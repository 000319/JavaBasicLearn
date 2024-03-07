package listener7;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SiHeYi0 implements ActionListener {

    //计算器界面声明的变量
    protected static String show = " ";
    JTextField  jTextField1;
    private int shu;
    int n;
    int y;
    double sum=0;
    String fu;

    // 登录界面类静态属性
    public static JFrame jFrame;
    public final String Username="登录界面";
    public final String Password="123456";

    //猜数字界面声明的全局变量
    static int count = 0;
    static int rightnumber = (int) ((Math.random() * 100 + 1));
    static int i;

    // 全局属性(登录界面)
    private JPanel loginPanel;
    // 全局属性(计算器)
    private JPanel calcPanel;
    // 全局属性(聊天框)
    private JPanel charPanel;
    // 全局属性(猜数字)
    private JPanel guessPanel;

    // 选项卡面板容器初始化
    public void initSelectPanel() {
        // 创建两个面板
        JPanel topPanel=new JPanel();
        JPanel centerPanel=new JPanel();
        topPanel.setBackground(Color.RED);
        centerPanel.setBackground(Color.blue);
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        // 创建一个卡片布局管理器
        CardLayout cardLayout=new CardLayout();
        centerPanel.setLayout(cardLayout);

        //给topPanel添加选项卡按钮;
        JButton loginBtn = new JButton("登录界面");
        JButton calcBtn = new JButton("计算器界面");
        JButton charBtn = new JButton("聊天框界面");
        JButton guessBtn = new JButton("猜数字界面");
        topPanel.add(loginBtn);
        topPanel.add(calcBtn);
        topPanel.add(charBtn);
        topPanel.add(guessBtn);
        // 给 centerPanel 添加选项卡面板
        loginPanel = new JPanel();
        calcPanel = new JPanel();
        charPanel = new JPanel();
        guessPanel = new JPanel();
        calcPanel.setBackground(Color.white);
        charPanel.setBackground(Color.yellow);
        guessPanel.setBackground(Color.green);

        // 1、登录界面
        initLoginPanel();
        // 2、计算器界面
        initCalcPanel();
        //3、聊天界面
        initCharPanel();
        //4、猜数字界面
        initGuessPanel();

        centerPanel.add("loginPanel", loginPanel);
        centerPanel.add("calcPanel", calcPanel);
        centerPanel.add("charPanel", charPanel);
        centerPanel.add("guessPanel", guessPanel);


        // 给按钮添加点击事件
        loginBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                cardLayout.show(centerPanel, "loginPanel");
                centerPanel.validate();
            }
        });
        calcBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                cardLayout.show(centerPanel, "calcPanel");
                centerPanel.validate();
            }
        });
        charBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                cardLayout.show(centerPanel, "charPanel");
                centerPanel.validate();
            }
        });
        guessBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                cardLayout.show(centerPanel, "guessPanel");
                centerPanel.validate();
            }
        });


        //面板添加至窗口
        jFrame.add(topPanel,BorderLayout.NORTH);
        jFrame.add(centerPanel,BorderLayout.CENTER);
    }


    // 1、登录面板初始化(构建）
    public void initLoginPanel() {

        //设置登录窗口initLoginPanel为边界式布局
        loginPanel.setLayout(new BorderLayout());
        //在loginPanel中创建titlePanel与contentPanel面板
        JPanel jtitlePanel = new JPanel();
        JPanel jcontentPanel = new JPanel();
        // titlePanel 添加组件
        JLabel jtitleLabel = new JLabel("登录界面");
        jtitlePanel.add(jtitleLabel);

        // 给 contentPanel创建、 添加组件
        jcontentPanel.setLayout(null);
        JLabel jusernameLabel = new JLabel("用户名");
        JTextField jusernameText = new JTextField(30);
        JLabel jpasswordLabel = new JLabel("密码");
        JPasswordField jpasswordText = new JPasswordField(30);
        JButton jsubmitBtn = new JButton("登录");
        jusernameLabel.setBounds(120, 60, 50, 30);
        jusernameText.setBounds(180, 60, 180, 30);
        jpasswordLabel.setBounds(120, 120, 50, 30);
        jpasswordText.setBounds(180, 120, 180, 30);
        jsubmitBtn.setBounds(225, 170, 70, 30);

        jcontentPanel.add(jusernameLabel);
        jcontentPanel.add(jusernameText);
        jcontentPanel.add(jpasswordLabel);
        jcontentPanel.add(jpasswordText);
        jcontentPanel.add(jsubmitBtn);

        // 将 titlePanel和contentPanel 添加到容器loginPanel中
        loginPanel.add(jtitlePanel, BorderLayout.NORTH);
        loginPanel.add(jcontentPanel, BorderLayout.CENTER);

        //对submitBtn进行监听
        jsubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO 自动生成的方法存根
                String str  = String.valueOf(jpasswordText.getPassword());
                if(str.length()>30)
                {
                    JOptionPane.showMessageDialog(jFrame, "您的密码长度超出长度范围，请重新输入密码");
                    jpasswordText.setText("");
                }
            }
        });
        jsubmitBtn.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO 自动生成的方法存根
                String username=jusernameText.getText();
                String password=String.valueOf(jpasswordText.getPassword());
                if(username.equals(Username)&&password.equals(Password))
                {
                    JOptionPane.showMessageDialog(jFrame, "登陆成功");
                    JFrame jmainframe=new JFrame();
                    jmainframe.setBounds(200, 300, 600, 600);
                    jmainframe.setVisible(true);
                }else
                    JOptionPane.showMessageDialog(jFrame, "账号或密码错误，请重新输入");
                jpasswordText.setText("");
                jusernameText.setText("");
            }
        });
    }
    // 2、计算器界面初始化
    public void initCalcPanel()
    {
        //创建面板并设置布局类型
        calcPanel.setLayout(new BorderLayout());
        //标题面板
        JPanel titlePanel1 = new JPanel();
        titlePanel1.setLayout(new BorderLayout());
        //中部面板
        JPanel centerPanel1 = new JPanel();
        centerPanel1.setLayout(new FlowLayout());
        //容纳按钮的主面板
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,1,15,15));
        //数字面板
        JPanel bottomPanel1 = new JPanel();
        bottomPanel1.setLayout(new GridLayout(4,3,10,10));
        //符号面板
        JPanel bottomPanel2 = new JPanel();
        bottomPanel2.setLayout(new GridLayout(5,1,10,10));
        //中部面板颜色
        centerPanel1.setBackground(Color.white);


        //创建组件
        //标题标签
        JLabel titleLabel1=new JLabel("                                          "
                + "                          计算器界面");
        //创建文本栏
        jTextField1=new JTextField(40);
        jTextField1.setPreferredSize(new Dimension(300, 80));
        //创建数字按钮
        String[] number=
                {"1","2","3","4","5","6","7","8","9","0","delete","<-"};
        JButton[] jbutton1=new JButton[12];
        //创建符号按钮
        String[] fuhao=
                {"+","-","*","/","="};
        JButton[] jbutton2=new JButton[5];


        //添加组件至各面板
        titlePanel1.add(titleLabel1);
        for (int i=0;i<12;i++)
        {
            jbutton1[i]= new JButton(number[i]);
            jbutton1[i].addActionListener(this);
            bottomPanel1.add(jbutton1[i]);
        }
        for (int i=0;i<5;i++)
        {
            jbutton2[i]= new JButton(fuhao[i]);
            jbutton2[i].addActionListener(this);
            bottomPanel2.add(jbutton2[i]);
        }
        centerPanel1.add(jTextField1);
        //将三面板添加至calcPanel面板中
        calcPanel.add(titleLabel1,BorderLayout.NORTH);
        calcPanel.add(centerPanel1,BorderLayout.CENTER);
        calcPanel.add(bottomPanel,BorderLayout.SOUTH);
        //将bottomPanel1、bottomPanel2面板添加至bottomPanel面板中
        bottomPanel.add(bottomPanel1);
        bottomPanel.add(bottomPanel2);

        //刷新组件
        calcPanel.validate();


        //监听按钮
        //(最底部)


    }
    //3、聊天界面面板初始化
    public void initCharPanel() {
        //创建面板，设置布局类型
        charPanel.setLayout(new BorderLayout());
        JPanel jtipPanel=new JPanel();
        jtipPanel.setLayout(new FlowLayout());
        jtipPanel.setBackground(Color.green);
        JPanel centerPanel=new JPanel();
        centerPanel.setLayout(new BorderLayout());
        JPanel bottomPanel=new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        //创建组件
        JLabel jtitlePLabel=new JLabel("聊天界面");
        JLabel jLabellist=new JLabel("聊天列表");
        JTextArea jTextArea=new JTextArea(20,50);
        //设置此文本区不可编辑
        jTextArea.setEditable(false);
        JLabel jLabel=new JLabel("编辑");
        JTextField jTextField=new JTextField(20);
        JButton jButton1=new JButton("发送");
        //设置文本区背景色
        jTextArea.setBackground(Color.YELLOW);

        // 创建下拉聊天对象选框
        JComboBox<String> jcombo = new JComboBox<String>();
        jcombo.addItem("伊欣");
        jcombo.addItem("乔娜");
        jcombo.addItem("泽凯");


        //添加组件至面板
        jtipPanel.add(jtitlePLabel);
        centerPanel.add(jTextArea,BorderLayout.CENTER);
        bottomPanel.add(jLabel);
        bottomPanel.add(jTextField);
        bottomPanel.add(jButton1);
        bottomPanel.add(jLabellist);
        bottomPanel.add(jcombo);
        //将面板添加至charPanel中
        charPanel.add(jtipPanel,BorderLayout.NORTH);
        charPanel.add(centerPanel,BorderLayout.CENTER);
        charPanel.add(bottomPanel,BorderLayout.SOUTH);
        //监听按钮
        jButton1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO 自动生成的方法存根
                String str=jTextField.getText();
                if(str!=null&&!str.trim().equals("")&&jTextField.getText().length()>20)
                {
                    JOptionPane.showMessageDialog(jFrame, "文本最大容量为20，请重新输入");
                }
                else
                {
                    ((JTextArea)jTextArea).append(str+"\n");
                }
                jTextField.setText(" ");
            }
        });
        //刷新组件
        charPanel.validate();
    }

    //4、猜数字界面面板初始化
    public void initGuessPanel() {
        //创建面板，设置布局类型
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new FlowLayout());
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.green);
        jPanel2.setLayout(new GridLayout(1,3,70,70));

        // 创建组件
        JLabel jLabel = new JLabel("请输入数字");
        JLabel result = new JLabel();
        JTextField jTextField = new JTextField(20);
        JLabel tip = new JLabel("你已经猜了" + count + "次");// 次数
        JButton jButtonone = new JButton("确认");
        JButton jButtontwo = new JButton("重新开始");
        JButton jButtonthree = new JButton("退出");

        //添加组件至面板
        jPanel1.add(jLabel, "LEFT");
        jPanel1.add(jTextField);
        jPanel1.add(tip);
        jPanel1.add(result);
        jPanel2.add(jButtonone);
        jPanel2.add(jButtontwo);
        jPanel2.add(jButtonthree);

        //将面板添加至guessPanel中
        guessPanel.add(jPanel1, BorderLayout.CENTER);
        guessPanel.add(jPanel2, BorderLayout.SOUTH);

        // 监听按钮

// 监听jButtonone
        jButtonone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 猜测正确
                    if (Integer.parseInt(jTextField.getText()) == rightnumber) {
                        // 设置文本框不可编辑
                        jTextField.setEditable(false);
                        // 设置确认按钮不可点击
                        jButtonone.setEnabled(false);
                        // 提示猜测次数+1
                        tip.setText("你已经猜了" + (++count) + "次");
                        // 显示猜测结果
                        result.setText("猜对啦");
                        jPanel1.setBackground(Color.green);
                    } else if (Integer.parseInt(jTextField.getText()) < rightnumber) {
                        jPanel1.setBackground(Color.pink);
                        tip.setText("你已经猜了" + (++count) + "次");
                        result.setText("太小");
                    } else {
                        jPanel1.setBackground(Color.red);
                        tip.setText("你已经猜了" + (++count) + "次");
                        result.setText("太大");
                    }
                } catch (Exception EventDispatchThread) {
                    JOptionPane.showMessageDialog(jFrame, "请检查后输入100以内的数字");
                }
            }
        });
// 监听jButtontwo
        jButtontwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO 自动生成的方法存根
                // 猜测次数置0

                // 重新开始
                if (e.getSource() == jButtontwo) {
                    // 清除文本框内容
                    jTextField.setText("");
                    // 设置文本框可编辑
                    jTextField.setEditable(true);
                    // 设置确认按钮可点击
                    jButtonone.setEnabled(true);
                    // 清除原猜测结果
                    result.setText("");
                    //猜测次数重置为空
                    count = 0;
                    // 调整背景色为默认背景色
                    jPanel1.setBackground(Color.YELLOW);
                    // 提示猜测次数
                    tip.setText("你已经猜了" + count + "次");

                }
            }

        });
        // 监听jButtonthree
        jButtonthree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO 自动生成的方法存根
                // 退出则关闭窗口
                if (e.getSource() == jButtonthree) {
                    jFrame.setVisible(false);
                }
            }
        });
        guessPanel.validate();
    }
    //   框架

    // 窗口框架建设
    public static void main(String[] args) {
        // 搭建选项卡框架
        SiHeYi0 form=new SiHeYi0();
        // 创建窗口容器
        jFrame=new JFrame("四合一");
        // 给窗口容器设置属性
        jFrame.setBounds(100, 100, 500,400);
        // 让窗口显示
        jFrame.setVisible(true);
        // 设置窗口容器边界式布局
        jFrame.setLayout(new BorderLayout());

        // 搭建选项卡框架
        form.initSelectPanel();
        //给窗口设置关闭功能
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 刷新窗口容器中的组件
        jFrame.validate();
    }

    //计算器界面的事件监听
    public void actionPerformed(ActionEvent e) {
        String content=e.getActionCommand();
        //jTextField1.setText(content);
        if(content.matches("[1234567890]")) {
            show=show+content;
            jTextField1.setText(show);
            shu=Integer.parseInt(show);
        }

        //加法
        else if(content=="+") {
            y=shu;
            show="";
            jTextField1.setText("");
            n=1;
        }
        //减法
        else if(content=="-") {
            y=shu;
            show="";
            jTextField1.setText("");
            n=2;
        }
        //乘法
        else if(content=="*") {
            y=shu;
            show="";
            jTextField1.setText("");
            n=3;
        }
        //除法
        else if(content=="/") {
            y=shu;
            show="";
            jTextField1.setText("");
            if(shu==0){
                jTextField1.setText("error");
            }
            else{n=4;}
        }
        //计算
        else if(content=="=") {
            show="";
            switch (n) {
                case 1:
                    sum=y+shu;
                    jTextField1.setText(""+sum);
                    break;
                case 2:
                    sum=y-shu;
                    jTextField1.setText(""+sum);
                    break;
                case 3:
                    sum=y*shu;
                    jTextField1.setText(""+sum);
                    break;
                case 4:
                    sum=y/shu;
                    jTextField1.setText(""+sum);
                    break;
            }
        }
        //清空
        else if(content=="delete") {
            jTextField1.setText("");
            sum=0;
            shu=0;
            y=0;
            fu="";
            show="";
        }
    }

}
