package me.dio.credit.applicatio.system.service

import me.dio.credit.applicatio.system.entity.Credit
import java.util.UUID

interface ICreditService {

    fun save(credit: Credit): Credit

    fun findAllByCustomer(customerId: Long): List<Credit>

    fun findByCreditCode(creditCode: UUID): Credit


}