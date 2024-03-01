package tn.esprit.projet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Matches implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate datematch;
    private String nameplayer1;
    private String nameplayer2;
    private Integer scoreplayer1;
    private Integer scoreplayer2;
    private String imageplayer1;
    private String imageplayer2;
    private Integer nbrparticipants;
    @ManyToMany(mappedBy = "matches")
    Set<User> users;
}
