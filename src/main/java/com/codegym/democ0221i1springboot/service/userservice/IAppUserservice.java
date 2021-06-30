package com.codegym.democ0221i1springboot.service.userservice;

import com.codegym.democ0221i1springboot.model.AppUser;

public interface IAppUserservice {
    AppUser getUserByName(String name);
}
