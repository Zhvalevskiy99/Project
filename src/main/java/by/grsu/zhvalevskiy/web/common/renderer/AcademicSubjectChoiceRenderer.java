package by.grsu.zhvalevskiy.web.common.renderer;

import org.apache.wicket.markup.html.form.ChoiceRenderer;

import by.grsu.zhvalevskiy.datamodel.AcademicSubject;

public class AcademicSubjectChoiceRenderer extends ChoiceRenderer<AcademicSubject> {

		public static final AcademicSubjectChoiceRenderer INSTANCE = new AcademicSubjectChoiceRenderer();

		private AcademicSubjectChoiceRenderer() {
			super();
		}

		@Override
		public Object getDisplayValue(AcademicSubject object) {
			return String.format("%s", object.getName());
		}

		@Override
		public String getIdValue(AcademicSubject object, int index) {
			return String.valueOf(object.getId());
		}
		
}
