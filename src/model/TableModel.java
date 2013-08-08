package model;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel
{

  private String[] columnNames = {"First Name", "Second Name", "Playing?", "Rating"};
  private Object[][] data = {{"David", "Anderson", "Y", "50"}};
  
  
  public Object[][] getData()
  {
    return data;
  }

  public void setData(Object[][] data)
  {
    this.data = data;
  }

  @Override
  public int getColumnCount()
  {
    // TODO Auto-generated method stub
    return columnNames.length;
  }
  
  @Override
  public String getColumnName(int index) {
      return columnNames[index];
  }

  @Override
  public int getRowCount()
  {
    if(data!=null)
      return data.length;
      else
        return 0;
  }

  @Override
  public Object getValueAt(int row, int col)
  {
    if(data!=null)
      return data[row][col];
      else
        return 0;
  }
  
  public void setValueAt(Object value, int row, int col){
    data[row][col] = value;
    fireTableCellUpdated(row,col);
  }

}
