package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BikeEntity {
    @Id
    @Column(name = "immat",length = 8)
    private String immatriculation;

    private int capacity;

    @Enumerated(EnumType.STRING)
    private CylinderNumber cylinderNumber;
    
    private boolean automatic;

    private boolean shifter;

    @Enumerated(EnumType.ORDINAL)
    private ShifterType shifterType;

    private Date circulationDate;
}
