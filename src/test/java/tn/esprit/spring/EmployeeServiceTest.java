package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;
public class EmployeeServiceTest {

    // @RunWith(SpringRunner.class)
    // @SpringBootTest

    // @Autowired
    // IEmployeService employeService;

    // @Test
    // public void testContextLoads() {
    //     Employe e = new Employe("Achref", "Othmani", "achref.othmani@esprit.tn", "password", true, Role.INGENIEUR );
    //     this.employeService.addOrUpdateEmploye(e);
    //     assertThat(e.getNom()).isEqualTo("Achref");
    // }
	
}
