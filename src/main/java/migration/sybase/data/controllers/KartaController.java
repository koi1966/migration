package migration.sybase.data.controllers;

import lombok.extern.slf4j.Slf4j;
import migration.sybase.data.models.KartaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j   // Causes lombok to generate a logger field.
@RestController
@RequestMapping("/karta")
public class KartaController {

    private final KartaRepository kartaRepository;

    public KartaController(KartaRepository kartaRepository) {
        this.kartaRepository = kartaRepository;
    }

    @PostMapping(value = "/migration", params = "action=search")
    public String kartaGetDataFromSybase() {
        log.info("GetMapping(.rubin.week.rubin-week-view)");

//        List<Karta> kartaList = kartaRepository.setListKarta("АМ3223ВА");

        return "karta/migration";
    }
}
