package Proxy;

import java.util.Arrays;
import java.util.LinkedList;

public class Row implements IRow {
	private int columns;
	private String[] row;
	public Row(String[] theValues) {
		this.columns = theValues.length;
		this.row = theValues;
	}
	@Override
	public Row getRow(){
		return this;
	}
	@Override
	public String toString(){
		return Arrays.toString(row);
	}
}
