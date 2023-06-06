package com.alipay.security.mobile.module.http.v2;

import android.content.Context;
import com.alipay.security.mobile.module.http.d;
import com.alipay.security.mobile.module.http.model.c;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements a {
    public static a a;
    public static com.alipay.security.mobile.module.http.a b;

    public static a a(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (a == null) {
            b = d.a(context, str);
            a = new b();
        }
        return a;
    }

    @Override // com.alipay.security.mobile.module.http.v2.a
    public final boolean a(String str) {
        return b.a(str);
    }

    @Override // com.alipay.security.mobile.module.http.v2.a
    public final c a(com.alipay.security.mobile.module.http.model.d dVar) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (dVar == null) {
            dataReportRequest = null;
        } else {
            dataReportRequest.os = dVar.a;
            dataReportRequest.rpcVersion = dVar.j;
            dataReportRequest.bizType = "1";
            HashMap hashMap = new HashMap();
            dataReportRequest.bizData = hashMap;
            hashMap.put("apdid", dVar.b);
            dataReportRequest.bizData.put("apdidToken", dVar.c);
            dataReportRequest.bizData.put("umidToken", dVar.d);
            dataReportRequest.bizData.put("dynamicKey", dVar.e);
            dataReportRequest.deviceData = dVar.f;
        }
        return com.alipay.security.mobile.module.http.model.b.a(b.a(dataReportRequest));
    }
}
