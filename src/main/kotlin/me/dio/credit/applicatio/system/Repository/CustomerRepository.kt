package me.dio.credit.applicatio.system.Repository

import me.dio.credit.applicatio.system.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long>