package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import tn.esprit.springproject.enumeration.TypeChambre;

import java.io.Serializable;

@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;
    long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;
}
