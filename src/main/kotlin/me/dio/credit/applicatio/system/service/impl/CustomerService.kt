package me.dio.credit.applicatio.system.service.impl

import me.dio.credit.applicatio.system.Repository.CustomerRepository
import me.dio.credit.applicatio.system.entity.Customer
import me.dio.credit.applicatio.system.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustomerService {

    override fun save(customer: Customer): Customer = this.customerRepository.save(customer)

    override fun findById(id: Long): Customer {
        return this.customerRepository.findById(id).orElseThrow{
            throw RuntimeException("ID $id not found")
        }
    }

    override fun delete(id: Long) {
        this.customerRepository.deleteById(id)
    }
}