package com.mi.sap.po.simulator.kpzt;

import java.util.List;

import com.google.gson.GsonBuilder;
import com.mi.sap.po.simulator.kpzt.in.JHDBH_SAP;
import com.mi.sap.po.simulator.kpzt.out.IT_OUT;
import com.mi.sap.po.simulator.kpzt.out.Item_out;
import com.mi.sap.po.simulator.kpzt.out.KPZT_SAP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class KpztService {

    final private static Logger log = LoggerFactory.getLogger(KpztService.class);

    public KPZT_SAP serve(JHDBH_SAP jhdbh_sap) {

        log.info("received: \n{}", new GsonBuilder().setPrettyPrinting().create().toJson(jhdbh_sap));

        Item_out item = Item_out.builder()
                .ZVBELN("0080158013")
                .ZWERKS("1008")
                .ZFKSTK("Y")
                .ZERDAT("2022-05-03")
                .ZERZET("22:09:46")
                .build();

        IT_OUT it_out = IT_OUT.builder().item(List.of(item)).build();
        KPZT_SAP kpzt_sap = KPZT_SAP.builder()
                .EV_CODE(1)
                .EV_MESSAGE("执行成功")
                .IT_OUT(it_out)
                .build();

        log.info("replied: \n{}", new GsonBuilder().setPrettyPrinting().create().toJson(kpzt_sap));
        return kpzt_sap;
    }

}
