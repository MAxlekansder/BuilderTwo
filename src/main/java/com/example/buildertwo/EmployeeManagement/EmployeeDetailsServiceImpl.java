package com.example.buildertwo.EmployeeManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EmployeeDetailsServiceImpl implements UserDetailsService {

    private final static Logger LOG = LoggerFactory.getLogger(EmployeeDetailsServiceImpl.class);
    private EmployeeRepository employeeRepository;

    public EmployeeDetailsServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Optional<EmployeeModel> employee = employeeRepository.findEmployeeModelByEmployeeId(id);

        if (employee.isPresent()) {
            LOG.info("Employee {} logging in", employee.get().getName());
            return User.builder()
                    .username(employee.get().getName())
                    .password(employee.get().getPassword())
                    .roles(String.valueOf(employee.get().getEmployeeStatus()))  // see if this really works...
                    .build();
        }

        throw new UsernameNotFoundException("Username not found");
    }
}
