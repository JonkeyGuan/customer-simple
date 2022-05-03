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
public class KPZT_SAP {

    @JsonProperty(value = "EV_CODE")
    private int EV_CODE;

    @JsonProperty(value = "EV_MESSAGE")
    private String EV_MESSAGE;

    @JsonProperty(value = "IT_OUT")
    private IT_OUT IT_OUT;

}