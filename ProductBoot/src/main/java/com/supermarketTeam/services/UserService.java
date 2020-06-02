
package com.supermarketTeam.services;

import com.supermarketTeam.entities.User;


public interface UserService {
    void save(User user);
    
    User findByUsername(String username);
    User findByEmail(String email);

}
