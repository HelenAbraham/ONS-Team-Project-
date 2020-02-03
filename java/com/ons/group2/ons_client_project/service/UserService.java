package com.ons.group2.ons_client_project.service;


import com.ons.group2.ons_client_project.model.User;
import com.ons.group2.ons_client_project.model.dto.account.UpdateUserInfoDto;
import com.ons.group2.ons_client_project.web.dto.UserRegistrationDto;
import javassist.NotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.util.Optional;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    Optional<User> findById(Long id);

    User updateUser(UpdateUserInfoDto userInfoDto) throws NotFoundException;

    User newUser(UserRegistrationDto registration);

    URI changeProfilePicture(User user, MultipartFile newImg);

    void updatePassword(String password, Long userId);

}