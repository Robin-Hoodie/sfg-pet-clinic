package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.BaseEntity;

import java.util.*;

import static java.util.Optional.ofNullable;

public abstract class AbstractMapService<T extends BaseEntity, ID> {
    protected Map<ID, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public Optional<T> findById(ID id) {
        return ofNullable(map.get(id));
    }

    public T save(ID id, T entity) {
        map.put(id, entity);
        return entity;
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T entity) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
    }
}
