package com.keepcoding.springboot.Repository;

import com.keepcoding.springboot.Model.Power;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PowerRepository extends JpaRepository<Power, Integer> {
}
