package com.example.demo.common;

import java.util.List;

public interface CommonInterface<Entity> {

    List<Entity> findAll();

    Entity findById(Long id);

    void remove(Long id);

    Entity save(Entity entity);

}
