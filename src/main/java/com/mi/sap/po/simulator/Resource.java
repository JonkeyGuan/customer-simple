package com.mi.sap.po.simulator;

import com.mi.sap.po.simulator.cwjz.CwjzService;
import com.mi.sap.po.simulator.cwjz.in.FHXX_SAP;
import com.mi.sap.po.simulator.cwjz.out.GZZT_SAP;
import com.mi.sap.po.simulator.kpzt.KpztService;
import com.mi.sap.po.simulator.kpzt.in.JHDBH_SAP;
import com.mi.sap.po.simulator.kpzt.out.KPZT_SAP;
import com.mi.sap.po.simulator.xdjc.XdjcService;
import com.mi.sap.po.simulator.xdjc.in.JHDSJ_SAP;
import com.mi.sap.po.simulator.xdjc.out.XDJCJG_SAP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@RequestMapping("/api")
public class Resource {

    @Autowired
    private XdjcService xdjcService;

    @Autowired
    private CwjzService cwjzService;

    @Autowired
    private KpztService kpztService;

    @PostMapping(path = "/xdjc", consumes = "application/json", produces = "application/json")
    public XDJCJG_SAP xdjc(@RequestBody JHDSJ_SAP jhdsj_sap) {
        return xdjcService.serve(jhdsj_sap);
    }

    @PostMapping(path = "/cwjz", consumes = "application/json", produces = "application/json")
    public GZZT_SAP cwjz(@RequestBody FHXX_SAP fhxx_sap) {
        return cwjzService.serve(fhxx_sap);
    }

    @PostMapping(path = "/kpzt", consumes = "application/json", produces = "application/json")
    public KPZT_SAP cwjz(@RequestBody JHDBH_SAP jhdbh_sap) {
        return kpztService.serve(jhdbh_sap);
    }
}
