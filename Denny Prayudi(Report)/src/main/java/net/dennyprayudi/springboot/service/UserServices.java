package net.dennyprayudi.springboot.service;

import java.util.List;

import javax.transaction.Transactional;

import net.dennyprayudi.springboot.model.Employee;
import net.dennyprayudi.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServices {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> listAll() {
        return repo.findAll(Sort.by("nomerRekening").ascending());
    }

}
