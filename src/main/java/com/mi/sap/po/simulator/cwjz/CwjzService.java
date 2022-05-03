package com.mi.sap.po.simulator.cwjz;

import java.util.List;

import com.google.gson.GsonBuilder;
import com.mi.sap.po.simulator.cwjz.in.FHXX_SAP;
import com.mi.sap.po.simulator.cwjz.out.GZZT_SAP;
import com.mi.sap.po.simulator.cwjz.out.IT_OUT;
import com.mi.sap.po.simulator.cwjz.out.Item_out;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CwjzService {

    final private static Logger log = LoggerFactory.getLogger(CwjzService.class);

    public GZZT_SAP serve(FHXX_SAP fhxx_sap) {

        log.info("received: \n{}", new GsonBuilder().setPrettyPrinting().create().toJson(fhxx_sap));

        Item_out item = Item_out.builder()
                .ZVBELN("0080158013")
                .ZWERKS("1008")
                .ZWBSTK("Y")
                .ZERDAT("2022-05-03")
                .ZERZET("22:09:46")
                .BUKRS("1001")
                .BELNR("1000023997")
                .GJAHR("2022")
                .build();

        IT_OUT it_out = IT_OUT.builder().item(List.of(item)).build();
        GZZT_SAP gzzt_sap = GZZT_SAP.builder()
                .EV_CODE(1)
                .EV_MESSAGE("过账成功")
                .IT_OUT(it_out)
                .build();

        log.info("replied: \n{}", new GsonBuilder().setPrettyPrinting().create().toJson(gzzt_sap));
        return gzzt_sap;
    }

}
