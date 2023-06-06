package com.alipay.security.mobile.module.http.model;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static c a(DataReportResult dataReportResult) {
        c cVar = new c();
        if (dataReportResult == null) {
            return null;
        }
        cVar.a = dataReportResult.success;
        cVar.b = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            cVar.c = map.get("apdid");
            cVar.d = map.get("apdidToken");
            cVar.g = map.get("dynamicKey");
            cVar.h = map.get("timeInterval");
            cVar.i = map.get("webrtcUrl");
            cVar.j = "";
            String str = map.get("drmSwitch");
            if (com.alipay.security.mobile.module.a.a.b(str)) {
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.charAt(0));
                    cVar.e = sb.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(2));
                    cVar.f = sb2.toString();
                }
            }
            if (map.containsKey("apse_degrade")) {
                cVar.k = map.get("apse_degrade");
            }
        }
        return cVar;
    }
}
