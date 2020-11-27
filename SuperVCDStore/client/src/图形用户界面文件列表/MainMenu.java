package ͼ���û������ļ��б�;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
public class MainMenu extends JMenuBar
{
    public MainMenu()
    {
        add(createFileMenu());    //��ӡ��ļ����˵�
        add(createEditMenu());    //��ӡ��༭���˵�
        setVisible(true);
    }
    //���塰�ļ����˵�
    private JMenu createFileMenu()
    {
        JMenu menu=new JMenu("�ļ�(F)");
        menu.setMnemonic(KeyEvent.VK_F);    //���ÿ��ٷ��ʷ�
        JMenuItem item=new JMenuItem("�½�(N)",KeyEvent.VK_N);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        menu.add(item);
        item=new JMenuItem("��(O)",KeyEvent.VK_O);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        menu.add(item);
        item=new JMenuItem("����(S)",KeyEvent.VK_S);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        menu.add(item);
        menu.addSeparator();
        item=new JMenuItem("�˳�(E)",KeyEvent.VK_E);
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
        menu.add(item);
        return menu;
    }
    //���塰�༭���˵�
    private JMenu createEditMenu()
    {
        JMenu menu=new JMenu("�༭(E)");
        menu.setMnemonic(KeyEvent.VK_E);
        JMenuItem item=new JMenuItem("����(U)",KeyEvent.VK_U);
        item.setEnabled(false);
        menu.add(item);
        menu.addSeparator();
        item=new JMenuItem("����(T)",KeyEvent.VK_T);
        menu.add(item);
        item=new JMenuItem("����(C)",KeyEvent.VK_C);
        menu.add(item);
        menu.addSeparator();
        JCheckBoxMenuItem cbMenuItem=new JCheckBoxMenuItem("�Զ�����");
        menu.add(cbMenuItem);
        return menu;
    }
}