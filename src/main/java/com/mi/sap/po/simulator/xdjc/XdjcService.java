package com.mi.sap.po.simulator.xdjc;

import java.util.List;

import com.google.gson.GsonBuilder;
import com.mi.sap.po.simulator.xdjc.in.JHDSJ_SAP;
import com.mi.sap.po.simulator.xdjc.out.IT_OUT;
import com.mi.sap.po.simulator.xdjc.out.Item_out;
import com.mi.sap.po.simulator.xdjc.out.XDJCJG_SAP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class XdjcService {

    final private static Logger log = LoggerFactory.getLogger(XdjcService.class);

    public XDJCJG_SAP serve(JHDSJ_SAP jhdsj_sap) {

        log.info("received: \n{}", new GsonBuilder().setPrettyPrinting().create().toJson(jhdsj_sap));

        Item_out item = Item_out.builder()
                .ZVBELN("0080158013")
                .ZWERKS("1008")
                .ZXDJCJG("Y")
                .ZXDCE(0)
                .ZWAERK("")
                .ZERDAT("2022-05-03")
                .ZERZET("22:09:46")
                .build();

        IT_OUT it_out = IT_OUT.builder().item(List.of(item)).build();
        XDJCJG_SAP xdjcjg_sap = XDJCJG_SAP.builder()
                .EV_CODE(1)
                .EV_MESSAGE("信贷检查更新成功，请检查信贷结果")
                .IT_OUT(it_out)
                .build();

        log.info("replied: \n{}",  new GsonBuilder().setPrettyPrinting().create().toJson(xdjcjg_sap));
        return xdjcjg_sap;
    }

}
