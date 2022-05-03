package com.sai.springdatajpalearn;

import com.sai.springdatajpalearn.entity.Address;
import com.sai.springdatajpalearn.entity.Employee;
import com.sai.springdatajpalearn.entity.Product;
import com.sai.springdatajpalearn.repository.AddressRepository;
import com.sai.springdatajpalearn.repository.EmployeeRepository;
import com.sai.springdatajpalearn.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;


@SpringBootTest
class SpringDataJpaLearnApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	AddressRepository addressRepository;

	@Test
	public void createProduct(){
		Employee employee = new Employee();
		employee.setEmployeeName("sai");
		employee.setSalary(100000d);
		Address add = new Address();
		add.setAddressName("ooty");
		add.setPincode(643001);
		employee.setAddress(add);



		Employee save = employeeRepository.save(employee);
		System.out.println("save = " + save);
	}


	@Test
	public void getEmployee(){
		Employee byId = employeeRepository.getById(1);
		System.out.println("byId = " + byId);
	}

	@Test
	public void getAddress(){
		Address byId = addressRepository.getById(1);
		System.out.println("byId = " + byId);
	}
}
