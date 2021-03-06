package by.grsu.zhvalevskiy.table;

import java.util.ArrayList;
import java.util.List;

import by.grsu.zhvalevskiy.datamodel.TrainingList;

public class TrainingListTable extends AbstractTable<TrainingList> {

	private List<TrainingList> rows;

	@Override
	public List<TrainingList> getRows() {
		if (rows == null) {
			rows = new ArrayList<TrainingList>();
		}
		return rows;
	}

	@Override
	public void setRows(List<TrainingList> rows) {
		this.rows = rows;
	}

}