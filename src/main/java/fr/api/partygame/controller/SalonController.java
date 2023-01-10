package fr.api.partygame.controller;

import fr.api.partygame.model.EtatPartie;
import fr.api.partygame.model.Joueur;
import fr.api.partygame.model.Role;
import fr.api.partygame.model.Salon;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/salons")
public class SalonController {

    @PostMapping("/init")
    private void init() {

    }

    @GetMapping("/{id}")
    private Salon getSalon(@PathVariable("id") final Long id) {
        List<Joueur> listJoueurs1 = List.of(
                new Joueur(1L, "darkVad0r92", Role.HEBERGEUR),
                new Joueur(2L, "PlayerOne123", Role.INVITE),
                new Joueur(3L, "eric182", Role.INVITE)
        );

        List<Joueur> listJoueurs2 = List.of(
                new Joueur(4L, "hanouna", Role.HEBERGEUR),
                new Joueur(5L, "jean-bon", Role.INVITE),
                new Joueur(6L, "Popol", Role.INVITE)
        );

        Salon s1 = new Salon(1L, 811531L, "Salon 1", EtatPartie.EN_CREATION, listJoueurs1);
        Salon s2 = new Salon(2L, 469248L, "Salon 2", EtatPartie.EN_CREATION, listJoueurs2);
        List<Salon> listSalons = List.of(s1, s2);

        Salon salon = new Salon();
        for (Salon s : listSalons) {
            if (s.getId().equals(id))
                salon = s;
        }
        return salon;
    }

    @PostMapping
    private Salon createSalon(@RequestParam("libelle") final String libelle) {

        return Salon.builder()
                .id(100L)
                .code(985152L)
                .libelle(libelle)
                .joueurs(List.of())
                .etatPartie(EtatPartie.EN_CREATION)
                .build();
    }

}
