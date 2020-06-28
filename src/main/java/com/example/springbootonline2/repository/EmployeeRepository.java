package com.example.springbootonline2.repository;

import com.example.springbootonline2.domain.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeRepository {

    @PersistenceContext// ใช้งานผ่านตัวนี้ คล้าย Autowired
    private EntityManager entityManager;

    @Transactional// ทำ transaction ใช้ lib จาก springframework
    public void save(Employee employee) {
        entityManager.persist(employee);
    }

    public List<Employee> listAll() {
        return entityManager.createQuery("select o from Employee o").getResultList(); // Employee คือชื่อ class, ภาษา JPA ไม่ใช่ SQL
        // หรือ entityManager.createQuery("from Employee").getResultList(); // Employee คือชื่อ class, ภาษา JPA ไม่ใช่ SQL
    }
}
