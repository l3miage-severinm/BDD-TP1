package fr.uga.l3miage.tp1.exo3.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class ProductEntity {

    @Id
    @Length(max = 15)
    String barCodeNumber;

    String name;

    boolean consumable;

    @ManyToOne()
    BrandMiage brand;
}
