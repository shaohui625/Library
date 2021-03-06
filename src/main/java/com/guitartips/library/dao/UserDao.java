package com.guitartips.library.dao;

import com.guitartips.library.domain.Commit;
import com.guitartips.library.domain.User;

import java.util.List;

/**
 * Created by max on 16.02.15.
 * Have fun!
 */
public interface UserDao {

    public void addUser(User user);

    public User getUserByUsername(String username);

    public void updateUser(User user);

    public void removeUser(String username);

    public List<Commit> getUserCommits(String username);

    public void addBook(Commit commit);

}
