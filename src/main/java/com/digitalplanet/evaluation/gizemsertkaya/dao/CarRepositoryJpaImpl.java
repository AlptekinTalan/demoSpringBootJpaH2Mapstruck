package com.digitalplanet.evaluation.gizemsertkaya.dao;

import com.digitalplanet.evaluation.gizemsertkaya.mapper.VehicleMapper;
import com.digitalplanet.evaluation.gizemsertkaya.model.Car;
import com.digitalplanet.evaluation.gizemsertkaya.model.Truck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("carRepository")
public class CarRepositoryJpaImpl implements CarRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Car findById(Long id) {
        return entityManager.find(Car.class, id);
    }

    @Override
    public List<Car> findAll() {
        return entityManager.createQuery("from Car", Car.class).getResultList();
    }

    @Override
    public void create(Car car) {
        entityManager.persist(car);
    }

    @Override
    public Car update(Car car) {
        return entityManager.merge(car);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(Car.class, id));
    }
}
