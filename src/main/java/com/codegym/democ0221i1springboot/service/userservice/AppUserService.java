package com.codegym.democ0221i1springboot.service.userservice;

import com.codegym.democ0221i1springboot.model.AppUser;
import com.codegym.democ0221i1springboot.repo.IAppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserService implements IAppUserservice, UserDetailsService {
    @Autowired
    private IAppUserRepo appUserRepo;

    @Override
    public AppUser getUserByName(String name) {
        return appUserRepo.findByUsername(name);
    }


    //chuyen doi tuong thuoc lop AppUser sang dt thuoc lop UserDetails
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //lay doi tuong thuoc lop AppUser
        AppUser appUser = this.getUserByName(username);
        //lay quyen cua doi tuong do
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(appUser.getRole());

        //Chuyen doi tuong do sang UserDetail
        UserDetails userDetails = new User(
                appUser.getUsername(),
                appUser.getPassword(),
                authorities
        );

        return userDetails;
    }
}
