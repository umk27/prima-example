package com.shannelservicedemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "Unit")
@NoArgsConstructor
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UnitID")
    private int unitID;

    @Column(name = "UnitNumber", length = 40)
    @Getter
    @Setter
    private String unitNumber;

    @Column(name = "UnitName ", length = 40)
    @Getter
    @Setter
    private String unitName;

    @OneToMany(cascade = CascadeType.ALL)
    @Getter
    @Setter
    private List<SCS> ListSCS;

    @Column(name = "UserArc", columnDefinition = "BIGINT")
    @Getter
    @Setter
    private long userArc;

    @Column(name = "DateArc", columnDefinition = "TIMESTAMPTZ")
    @Getter
    @Setter
    private ZonedDateTime DateArc;

}
