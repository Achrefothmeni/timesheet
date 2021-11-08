package tn.esprit.spring;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.EntrepriseServiceImpl;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceTest {

    @Autowired
    IEntrepriseService iEntrepriseService;


    @Test
    public void testContextLoads() {
        Entreprise entreprise = new Entreprise();
        entreprise.setName("TestN");
        entreprise.setRaisonSocial("testRS");
        iEntrepriseService.ajouterEntreprise(entreprise);
        Assertions.assertEquals("TestN", entreprise.getName());
        Assertions.assertFalse(iEntrepriseService.findAll().isEmpty());
        Assertions.assertNotNull(iEntrepriseService.getEntrepriseById(entreprise.getId()));
    }




}
