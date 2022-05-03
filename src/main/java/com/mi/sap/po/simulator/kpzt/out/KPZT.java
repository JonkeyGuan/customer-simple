package com.mi.sap.po.simulator.kpzt.out;

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
public class KPZT {

    private int fanHuiMa;
    private String fanHuiXinXi;
    private String jiaoHuoDan;
    private String gongChang;
    private String kaiPiaoZhuangTai;
    private String gengXinRiQi;
    private String gengXinShiJian;

}