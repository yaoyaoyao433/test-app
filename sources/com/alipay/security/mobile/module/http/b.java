package com.alipay.security.mobile.module.http;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ DataReportRequest a;
    public final /* synthetic */ c b;

    public b(c cVar, DataReportRequest dataReportRequest) {
        this.b = cVar;
        this.a = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c.b = this.b.e.reportData(this.a);
        } catch (Throwable th) {
            c.b = new DataReportResult();
            c.b.success = false;
            DataReportResult dataReportResult = c.b;
            dataReportResult.resultCode = "static data rpc upload error, " + com.alipay.security.mobile.module.a.a.a(th);
            new StringBuilder("rpc failed:").append(com.alipay.security.mobile.module.a.a.a(th));
        }
    }
}
