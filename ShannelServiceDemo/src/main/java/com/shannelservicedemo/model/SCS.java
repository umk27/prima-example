package com.shannelservicedemo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;


@Entity
@Table(name = "SCS")
@NoArgsConstructor
public class SCS {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SCSID")
    private int SCSID;

    @Column(name = "SCSName", length = 40)
    @Getter
    @Setter
    private String SCSName;

    @Column(name = "Zone", length = 40)
    @Getter
    @Setter
    private String zone;

    @Column(name = "Latitude", columnDefinition = "DECIMAL")
    @Getter
    @Setter
    private double latitude;

    @Column(name = "Longitude", columnDefinition = "DECIMAL")
    @Getter
    @Setter
    private double longitude;

    @Column(name = "UserArc", columnDefinition = "BIGINT")
    @Getter
    @Setter
    private long userArc;

    @Column(name = "DateArc", columnDefinition = "TIMESTAMPTZ")
    @Getter
    @Setter
    private ZonedDateTime dateArc;
}
