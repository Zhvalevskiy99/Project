package by.grsu.zhvalevskiy.service;

import java.util.List;

import by.grsu.zhvalevskiy.datamodel.Student;

public interface StudentService {

	void saveNew(Student entity);

	void update(Student entity);

	Student get(Long id);

	List<Student> getAll();

	void delete(Long id);

	void saveOrUpdate(Student entity);

}
