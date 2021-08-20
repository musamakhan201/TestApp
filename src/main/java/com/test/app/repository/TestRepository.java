package com.test.app.repository;

import com.test.app.domain.TestDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestDomain,Integer> {
}
