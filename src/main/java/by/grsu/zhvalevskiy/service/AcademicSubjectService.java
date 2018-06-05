package by.grsu.zhvalevskiy.service;

import java.util.List;

import by.grsu.zhvalevskiy.datamodel.AcademicSubject;

public interface AcademicSubjectService {

	void saveNew(AcademicSubject entity);

	void update(AcademicSubject entity);

	AcademicSubject get(Long id);

	List<AcademicSubject> getAll();

	void delete(Long id);

	void saveOrUpdate(AcademicSubject entity);

}
