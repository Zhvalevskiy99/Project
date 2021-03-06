package by.grsu.zhvalevskiy.table;

import java.util.ArrayList;
import java.util.List;

import by.grsu.zhvalevskiy.datamodel.Student;

public class StudentTable extends AbstractTable<Student> {

	private List<Student> rows;

	@Override
	public List<Student> getRows() {
		if (rows == null) {
			rows = new ArrayList<Student>();
		}
		return rows;
	}

	@Override
	public void setRows(List<Student> rows) {
		this.rows = rows;
	}

}