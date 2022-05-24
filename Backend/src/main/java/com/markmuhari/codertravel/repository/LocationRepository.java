package com.markmuhari.codertravel.repository;

import com.markmuhari.codertravel.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface LocationRepository extends JpaRepository<Location,Long> {
}
