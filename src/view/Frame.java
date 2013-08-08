package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame
{
  private Panel p = new Panel();
  private Frame frame;
  
  public Frame(){
      setVisible(true);
      setSize(new Dimension(550,250));
      setPreferredSize(new Dimension(550,250));
      setResizable(false);
      add(p);
      setContentPane(p);
      pack();
      this.frame = this;
      createJMenuBar();
  }
  
  private void createJMenuBar(){
    JMenuBar mainMenu = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem close = new JMenuItem("Close");
    close.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        frame.dispose();
      }
    });
    fileMenu.add(close);
    mainMenu.add(fileMenu);
    setJMenuBar(mainMenu);
  }
}
