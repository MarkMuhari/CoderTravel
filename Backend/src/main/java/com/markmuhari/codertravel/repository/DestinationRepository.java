package com.markmuhari.codertravel.repository;

import com.markmuhari.codertravel.domain.Destination;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
