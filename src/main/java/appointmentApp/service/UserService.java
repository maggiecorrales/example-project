package appointmentApp.service;

import java.util.List;

import appointmentApp.Model.User;

public interface UserService {

	public List<User> getListUser();
	
	public void saveOrUpdate(User user);
	
	public void deleteUser(int id);
	
	public User findUserById(int id);
}
