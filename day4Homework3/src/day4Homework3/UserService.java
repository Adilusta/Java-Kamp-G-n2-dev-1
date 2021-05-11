package day4Homework3;

public interface UserService extends BaseService
{
	void add(User user);
	void update(User user);
	void delete(User user);
	void showInformation(User user);
}
