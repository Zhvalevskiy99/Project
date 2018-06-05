package by.grsu.zhvalevskiy.web.page.faculty;

import org.apache.wicket.authorization.Action;
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeAction;
import org.apache.wicket.markup.html.link.Link;

import by.grsu.zhvalevskiy.datamodel.Faculty;
import by.grsu.zhvalevskiy.web.component.extensions.NotificationPanel;
import by.grsu.zhvalevskiy.web.page.AbstractPage;
import by.grsu.zhvalevskiy.web.page.faculty.panel.FacultyListPanel;

public class FacultiesPage extends AbstractPage {
	
	public FacultiesPage() {
		super();
		add(new FacultyListPanel("faculty-list-panel", "XMLDatabase"));

		add(new InvisibleLink("create") {
			@Override
			public void onClick() {
				setResponsePage(new FacultyEditPage(new Faculty()));
			}
		});

		add(new NotificationPanel("feedback"));
	}

	
	@AuthorizeAction(roles = { "admin" }, action = Action.RENDER)
	private class InvisibleLink extends Link {

		public InvisibleLink(String id) {
			super(id);
		}

		@Override
		public void onClick() {
		}
	}
}
