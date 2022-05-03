package com.mi.sap.po.simulator.xdjc.in;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Item_in {

    @JsonProperty(value = "ZVBELN")
    private String ZVBELN;

    @JsonProperty(value = "ZKUNAG")
    private String ZKUNAG;

    @JsonProperty(value = "ZDDYFP")
    private int ZDDYFP;

    @JsonProperty(value = "ZPOSNR")
    private int ZPOSNR;

    @JsonProperty(value = "ZWERKS")
    private String ZWERKS;

    @JsonProperty(value = "ZMATNR")
    private String ZMATNR;

    @JsonProperty(value = "ZLFIMM")
    private int ZLFIMM;

    @JsonProperty(value = "ZMEINS")
    private String ZMEINS;

    @JsonProperty(value = "ZNETWR")
    private int ZNETWR;

    @JsonProperty(value = "ZMWSBP")
    private int ZMWSBP;

    @JsonProperty(value = "ZWAERK")
    private String ZWAERK;

    @JsonProperty(value = "ZWHBS")
    private String ZWHBS;

    @JsonProperty(value = "ZERDAT")
    private String ZERDAT;

    @JsonProperty(value = "ZERZET")
    private String ZERZET;

}