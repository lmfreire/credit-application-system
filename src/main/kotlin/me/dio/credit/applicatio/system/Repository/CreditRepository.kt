package me.dio.credit.applicatio.system.Repository

import me.dio.credit.applicatio.system.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CreditRepository: JpaRepository<Credit, Long>