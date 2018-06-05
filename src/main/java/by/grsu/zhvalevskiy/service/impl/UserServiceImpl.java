package by.grsu.zhvalevskiy.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import by.grsu.zhvalevskiy.dataaccess.impl.UserCredentialsDao;
import by.grsu.zhvalevskiy.dataaccess.impl.UserProfileDao;
import by.grsu.zhvalevskiy.datamodel.UserCredentials;
import by.grsu.zhvalevskiy.datamodel.UserProfile;
import by.grsu.zhvalevskiy.service.UserService;

public class UserServiceImpl implements UserService {
	private UserProfileDao userProfileDao;

	private UserCredentialsDao userCredentialsDao;

	
	public UserServiceImpl(String rootFolderPath) {
		super();
		this.userProfileDao = new UserProfileDao(rootFolderPath);
		this.userCredentialsDao = new UserCredentialsDao(rootFolderPath);
	}

	@Override
	public void register(UserProfile profile, UserCredentials userCredentials) {
		userCredentialsDao.saveNew(userCredentials);
		profile.setCredentials(userCredentials);
		profile.setCreated(new Date());
		userProfileDao.saveNew(profile);
	}

	@Override
	public UserProfile getProfile(Long id) {
		return userProfileDao.get(id);
	}

	@Override
	public UserCredentials getCredentials(Long id) {
		return userCredentialsDao.get(id);
	}

	@Override
	public UserCredentials getByNameAndPassword(String userName, String password) {
		return userCredentialsDao.find(userName, password);
	}

	@Override
	public Collection<? extends String> resolveRoles(Long id) {
		UserCredentials userCredentials = userCredentialsDao.get(id);
		return Collections.singletonList(userCredentials.getRole().name());
	}

	@Override
	public List<UserProfile> getAll() {
		return userProfileDao.getAll();
	}
}
