package com.mamoori.mamooriback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.mamoori.mamooriback.entity.Will;

@Repository
public interface WillRepository extends JpaRepository<Will,Long>, JpaSpecificationExecutor<Will> {
}
