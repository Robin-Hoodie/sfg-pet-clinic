package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.BaseEntity;

import java.util.*;

import static java.util.Optional.ofNullable;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public Optional<T> findById(ID id) {
        return ofNullable(map.get(id));
    }

    public T save(T entity) {
        if (entity != null) {
            if (entity.getId() == null) {
                entity.setId(getNextId());
            }
            map.put(entity.getId(), entity);
        }
        return entity;
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T entity) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
    }

    private Long getNextId() {
        Long nextId;
        if (map.size() == 0) {
            nextId = 1L;
        } else {
            nextId = Collections.max(map.keySet()) + 1;
        }
        return nextId;
    }
}
