package com.mi.sap.po.simulator.kpzt.out;

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
public class Item_out {

    @JsonProperty(value = "ZVBELN")
    private String ZVBELN;

    @JsonProperty(value = "ZWERKS")
    private String ZWERKS;

    @JsonProperty(value = "ZFKSTK")
    private String ZFKSTK;

    @JsonProperty(value = "ZERDAT")
    private String ZERDAT;

    @JsonProperty(value = "ZERZET")
    private String ZERZET;

}