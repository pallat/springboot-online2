package com.example.springbootonline2.repository;

import com.example.springbootonline2.domain.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class EmployeeRepository {

    @PersistenceContext// ใช้งานผ่านตัวนี้ คล้าย Autowired
    private EntityManager entityManager;

    @Transactional// ทำ transaction ใช้ lib จาก springframework
    public void save(Employee employee) {
        entityManager.persist(employee);
    }
}
