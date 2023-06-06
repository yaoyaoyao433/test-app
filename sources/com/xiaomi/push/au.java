package com.xiaomi.push;

import android.content.Context;
/* loaded from: classes6.dex */
public final class au implements Runnable {
    public com.xiaomi.clientreport.processor.e a;
    public Context b;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a != null) {
                this.a.a();
            }
            com.xiaomi.channel.commonutils.logger.c.c("begin read and send perf / event");
            if (this.a instanceof com.xiaomi.clientreport.processor.a) {
                ay.a(this.b).a("sp_client_report_status", "event_last_upload_time", System.currentTimeMillis());
            } else if (this.a instanceof com.xiaomi.clientreport.processor.b) {
                ay.a(this.b).a("sp_client_report_status", "perf_last_upload_time", System.currentTimeMillis());
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
        }
    }
}
