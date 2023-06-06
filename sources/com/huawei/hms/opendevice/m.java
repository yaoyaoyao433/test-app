package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m extends Thread {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public m(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean b;
        boolean d;
        String c;
        if (p.a()) {
            b = n.b(this.a);
            if (b) {
                return;
            }
            String a = o.a(this.a);
            if (!TextUtils.isEmpty(a)) {
                d = n.d(this.a, a, this.b);
                if (!d) {
                    HMSLog.d("ReportAaidToken", "This time need not report.");
                    return;
                }
                String a2 = com.huawei.agconnect.config.a.a(this.a).a("region");
                if (TextUtils.isEmpty(a2)) {
                    HMSLog.i("ReportAaidToken", "The data storage region is empty.");
                    return;
                }
                String a3 = e.a(this.a, "com.huawei.hms.opendevicesdk", "ROOT", null, a2);
                if (TextUtils.isEmpty(a3)) {
                    return;
                }
                c = n.c(this.a, a, this.b);
                Context context = this.a;
                n.b(this.a, d.a(context, a3 + "/rest/appdata/v1/aaid/report", c, (Map<String, String>) null), a, this.b);
                return;
            }
            HMSLog.w("ReportAaidToken", "AAID is empty.");
            return;
        }
        HMSLog.d("ReportAaidToken", "Not HW Phone.");
    }
}
