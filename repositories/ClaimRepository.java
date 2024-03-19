package com.insumanager.Insurance.Management.repositories;

import com.insumanager.Insurance.Management.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
}
