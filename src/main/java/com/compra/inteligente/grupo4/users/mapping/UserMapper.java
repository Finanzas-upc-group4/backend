package com.compra.inteligente.grupo4.users.mapping;


import com.compra.inteligente.grupo4.shared.mapping.EnhancedModelMapper;
import com.compra.inteligente.grupo4.users.domain.entity.User;
import com.compra.inteligente.grupo4.users.resource.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class UserMapper implements Serializable {

    @Autowired
    EnhancedModelMapper mapper = new EnhancedModelMapper();

    public UserResource toResource(User model) {
        return mapper.map(model, UserResource.class);
    }

    public Page<UserResource> modelListPage(List<User> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, UserResource.class), pageable, modelList.size());
    }

    public List<UserResource> modelListPage(List<User> modelList) {
        return mapper.mapList(modelList, UserResource.class);


    }
    public User toModel(UserResource resource) {
        return mapper.map(resource, User.class);
    }


}
