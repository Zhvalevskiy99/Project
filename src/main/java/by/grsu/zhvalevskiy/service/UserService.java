package by.grsu.zhvalevskiy.service;

import java.util.Collection;
import java.util.List;

import by.grsu.zhvalevskiy.datamodel.UserCredentials;
import by.grsu.zhvalevskiy.datamodel.UserProfile;

public interface UserService {

	void register(UserProfile profile, UserCredentials userCredentials);

	UserProfile getProfile(Long id);

	UserCredentials getCredentials(Long id);

	UserCredentials getByNameAndPassword(String userName, String password);

	Collection<? extends String> resolveRoles(Long id);

	List<UserProfile> getAll();
}