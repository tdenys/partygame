package fr.api.partygame.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Salon {

    private Long id;

    private Long code;
    private String libelle;

    private EtatPartie etatPartie;
    private List<Joueur> joueurs;
}
