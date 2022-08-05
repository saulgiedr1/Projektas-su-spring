package lt.namai.naujasprojektas.controller;

import lt.namai.naujasprojektas.model.entity.Receptas;
import lt.namai.naujasprojektas.model.repository.ReceptasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceptasController {

    @Autowired
    ReceptasRepository receptasRepository;


    @GetMapping("/test/greeting")
    String testinisEndpoint() {
        return "šis puslapis veikia";
    }
    @GetMapping("/receptas/gauti_pav")
    Receptas gautiPagalPavadinima(@RequestParam String pavadinimas) {
        return receptasRepository.findByPavadinimas(pavadinimas);
    }

}