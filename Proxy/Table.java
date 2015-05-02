package Proxy;

public class Table implements ITable {
	private IRow[] table;
	private int rows;
	private int columns;
	public Table(int rows) {
		this.rows = rows;
		//this.columns = columns;
		table = new Row[rows];
	}

	@Override
	public int numOfRows() {
		// TODO Auto-generated method stub
		return rows;
	}

	@Override
	public IRow getRow(int rowNum) {
		// TODO Auto-generated method stub
	return table[rowNum];
		
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		// TODO Auto-generated method stub
		if (rowNum < rows) {
            table[rowNum] = row;
        }
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		// TODO Auto-generated method stub
		if (rowNum < rows) {
            table[rowNum] = row;
        }
	}

	@Override
	public void deleteRow(int rowNum) {
		// TODO Auto-generated method stub
		if (rowNum < rows) {
            for (int i = rowNum; i < table.length; i++) {
                table[i] = table[i++];
            }
            rows--;
        }
    }
	}
