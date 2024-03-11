package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class BrandMiage {

    @Id
    @Length(max = 11)
    String siretNumber;

    String companyName;

    @Enumerated(value = EnumType.ORDINAL)
    BrandType type;

    @OneToMany(mappedBy = "brand")
    Set<ProductEntity> products;
}
