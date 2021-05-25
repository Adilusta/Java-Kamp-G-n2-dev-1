package day5Homework.business.abstracts;


import day5Homework.GoogleAccountSystem.GoogleAccountManager;
import day5Homework.core.concretes.GoogleAccountAdapter;
import day5Homework.entities.concretes.User;

public interface UserService 
{
void addUser(User user);
void addGoogleUser(GoogleAccountAdapter googleAccountAdapter);


}
