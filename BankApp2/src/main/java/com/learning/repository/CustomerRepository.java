/**
 * 
 */
package com.learning.repository;

import com.learning.entity.Customer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	public boolean existsById(long id);
	public Customer findById(long id);
	Boolean existsByUsername(String username);
	Optional<Customer> findByUsername(String username);
}
