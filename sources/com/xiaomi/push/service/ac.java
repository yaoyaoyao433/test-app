package com.xiaomi.push.service;

import com.tencent.connect.common.Constants;
import com.xiaomi.push.ha;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.m;
import java.lang.ref.WeakReference;
/* loaded from: classes6.dex */
public final class ac extends m.a {
    private ia a;
    private WeakReference<XMPushService> b;
    private boolean c;

    public ac(ia iaVar, WeakReference<XMPushService> weakReference, boolean z) {
        this.c = false;
        this.a = iaVar;
        this.b = weakReference;
        this.c = z;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return Constants.VIA_REPORT_TYPE_DATALINE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XMPushService xMPushService;
        if (this.b == null || this.a == null || (xMPushService = this.b.get()) == null) {
            return;
        }
        this.a.c = ad.a();
        this.a.a(false);
        com.xiaomi.channel.commonutils.logger.c.c("MoleInfo aw_ping : send aw_Ping msg " + this.a.c);
        try {
            String str = this.a.i;
            xMPushService.a(str, ik.a(h.a(str, this.a.d, this.a, ha.Notification)), this.c);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.d("MoleInfo aw_ping : send help app ping error" + e.toString());
        }
    }
}
