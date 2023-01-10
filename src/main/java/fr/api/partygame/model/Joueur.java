package fr.api.partygame.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Joueur {

    private Long id;
    private String pseudo;
    private Role role;
}
