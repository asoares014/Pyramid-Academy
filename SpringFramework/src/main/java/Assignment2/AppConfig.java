package Assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig {
    @Bean
    public Phone phone1() {
        Phone phone = new Phone();
        phone.setMob("1234567890");
        return phone;
    }

    @Bean
    public Phone phone2() {
        Phone phone = new Phone();
        phone.setMob("0987654321");
        return phone;
    }

    @Bean
    public Address address() {
        Address address = new Address();
        address.setCity("Atlanta");
        address.setCountry("United States of America");
        address.setZipCode("30312");
        address.setState("Georgia");
        return address;
    }

    @Bean
    public Employee employee(Phone phone1, Phone phone2, Address address) {
        Employee employee = new Employee();
        employee.setAddress(address);
        employee.setName("Roy Woods");
        employee.setId(9);
        employee.setPhone(new ArrayList<Phone>());
        employee.getPhone().add(phone1);
        employee.getPhone().add(phone2);
        return employee;
    }
}
