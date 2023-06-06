package com.alipay.security.mobile.module.http;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.aa;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.w;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements a {
    public static c a;
    public static DataReportResult b;
    public w c;
    public BugTrackMessageService d;
    public DataReportService e;

    private c(Context context, String str) {
        this.c = null;
        this.d = null;
        this.e = null;
        aa aaVar = new aa();
        aaVar.a(str);
        h hVar = new h(context);
        this.c = hVar;
        this.d = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, aaVar);
        this.e = (DataReportService) this.c.a(DataReportService.class, aaVar);
    }

    public static synchronized c a(Context context, String str) {
        c cVar;
        synchronized (c.class) {
            if (a == null) {
                a = new c(context, str);
            }
            cVar = a;
        }
        return cVar;
    }

    @Override // com.alipay.security.mobile.module.http.a
    public final DataReportResult a(DataReportRequest dataReportRequest) {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.e != null) {
            b = null;
            new Thread(new b(this, dataReportRequest)).start();
            for (int i = 300000; b == null && i >= 0; i -= 50) {
                Thread.sleep(50L);
            }
        }
        return b;
    }

    @Override // com.alipay.security.mobile.module.http.a
    public final boolean a(String str) {
        BugTrackMessageService bugTrackMessageService;
        String str2;
        if (com.alipay.security.mobile.module.a.a.a(str) || (bugTrackMessageService = this.d) == null) {
            return false;
        }
        try {
            str2 = bugTrackMessageService.logCollect(com.alipay.security.mobile.module.a.a.f(str));
        } catch (Throwable unused) {
            str2 = null;
        }
        if (com.alipay.security.mobile.module.a.a.a(str2)) {
            return false;
        }
        return ((Boolean) new JSONObject(str2).get("success")).booleanValue();
    }
}
