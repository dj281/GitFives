package view;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableRowSorter;

import model.TableModel;

public class Panel extends JPanel
{
  private TableModel model = new TableModel();
  private TableRowSorter<TableModel> sorter;
  public Panel(){
  super(new GridLayout(1,0));
  JTable t = new JTable(model);
  sorter = new TableRowSorter<TableModel>(model);
  sorter.toggleSortOrder(2);
  t.setRowSorter(sorter);
  JScrollPane sp = new JScrollPane(t);
  add(sp);
}
}
