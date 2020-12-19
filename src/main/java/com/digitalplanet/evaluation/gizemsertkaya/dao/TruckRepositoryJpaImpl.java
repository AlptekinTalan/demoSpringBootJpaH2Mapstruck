package com.digitalplanet.evaluation.gizemsertkaya.dao;

import com.digitalplanet.evaluation.gizemsertkaya.model.Car;
import com.digitalplanet.evaluation.gizemsertkaya.model.Truck;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("truckRepository")
public class TruckRepositoryJpaImpl implements TruckRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Truck findById(Long id) {
        return entityManager.find(Truck.class, id);
    }

    @Override
    public List<Truck> findAll() {

        return entityManager.createQuery("from Truck", Truck.class).getResultList();
    }

    @Override
    public void create(Truck truck) {
        entityManager.persist(truck);
    }

    @Override
    public Truck update(Truck truck) {
        return entityManager.merge(truck);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(Truck.class, id));
    }
}
