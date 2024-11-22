package me.dio.credit.applicatio.system.service

import me.dio.credit.applicatio.system.entity.Customer

interface ICustomerService {

    fun save(customer: Customer): Customer

    fun findById(id: Long): Customer

    fun delete(id: Long): Customer
}