package appointmentApp.dao;

import java.util.List;

import appointmentApp.Model.User;

public interface UserDao {

	public List<User> getListUser();
	
	public void saveOrUpdate(User user);
	
	public void deleteUser(int id);
	
	public User findUserById(int id);
}
